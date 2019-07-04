package com.sample.portal.controller;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.http.HttpSession;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.util.FileCopyUtils;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.sample.portal.exception.AlreadyUsedIdException;
import com.sample.portal.exception.LoginFailureException;
import com.sample.portal.form.UserForm;
import com.sample.portal.service.UserService;
import com.sample.portal.vo.User;

@Controller
@RequestMapping("/user/")
public class UserController {

	@Value("${dir.image.profile}")
	private String profileImageSaveDirectory;

	@Autowired
	private UserService userService;
	
	@ExceptionHandler(AlreadyUsedIdException.class)
	public String alreadyUsedIbExceptionHandler(AlreadyUsedIdException ex) {
		 return "error/user/registerfail";
	}
	
	@ExceptionHandler(LoginFailureException.class)
	public String LoginFailureExceptionHandler(LoginFailureException ex) {
		return "error/user/registerfail";
	}
	
	@RequestMapping(value="register.do", method=RequestMethod.GET)
	public String registerform() {
		return "user/form";
	}
	
	@RequestMapping(value="register.do", method=RequestMethod.POST)
	public String register(UserForm userForm) throws Exception{
		
		User user = new User();
		BeanUtils.copyProperties(userForm, user);
		MultipartFile mf = userForm.getPhotofile();
		if(!mf.isEmpty()) {
			String filename = mf.getOriginalFilename();
			
			FileCopyUtils.copy(mf.getBytes(), new File(profileImageSaveDirectory, filename));
			user.setProfile(filename);
		}
		
		userService.registerUser(user);
		
		return "redirect:complete.do";
	}
	
	@RequestMapping("complete.do")
	public String complete() {
		return "user/completed";
	}
	
	@RequestMapping(value="login.do", method=RequestMethod.GET)
	public String loginform() {
		return "user/loginform";
	}
	
	@RequestMapping(value="login.do", method=RequestMethod.POST)
	public String login(@RequestParam("id") String id, 
						@RequestParam("password") String password,
						HttpSession session) {
		User user = userService.login(id, password);
		
		session.setAttribute("LOGIN_USER", user);
		
		return "redirect:/home.do";
	}
	
	@RequestMapping("logout.do")
	public String logout(HttpSession session) {
		session.invalidate();
		return "redirect:/home.do";
	}
	
	@InitBinder
	public void initBinder(WebDataBinder binder) {
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		binder.registerCustomEditor(Date.class, new CustomDateEditor(dateFormat, true));
	}
	
	
}
