package com.sample.portal.controller;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.FileCopyUtils;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.sample.portal.exception.AlreadyUsedIdException;
import com.sample.portal.exception.LoginFailureException;
import com.sample.portal.form.UserForm;
import com.sample.portal.service.UserService;
import com.sample.portal.vo.User;

@Controller
@RequestMapping("/user")
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
	
	@RequestMapping(value="/register.do", method=RequestMethod.GET)
	public String registerform(Model model) {
		model.addAttribute("userForm", new UserForm());
		return "user/form";
	}
	
	@RequestMapping(value="/register.do", method=RequestMethod.POST)
	public String register(@ModelAttribute("userForm") @Valid UserForm userForm, BindingResult errors) throws Exception{
		
		System.out.println(errors);
		if (errors.hasErrors()) {
			System.out.println("유효성 체크 통과하지 못함");
			return "user/form"; // 입력폼으로 다시보냄
		}
		
		User user = new User();
		BeanUtils.copyProperties(userForm, user);
		
		MultipartFile mf = userForm.getPhotofile();
		if(!mf.isEmpty()) {
			
			final long maxFilSize = 1024*1024;
			long filesize = mf.getSize();
			
			if(filesize > maxFilSize) {
				errors.rejectValue("photofile",null,"첨부파일의 최대용량을 초과하였습니다.");
				return "user/form";
			}
			
			String filename = mf.getOriginalFilename();
			FileCopyUtils.copy(mf.getBytes(), new File(profileImageSaveDirectory, filename));
			user.setProfile(filename);
		}
		
		userService.registerUser(user);
		
		return "redirect:complete.do";
	}
	
	@RequestMapping("/complete.do")
	public String complete() {
		return "user/completed";
	}
	
	@RequestMapping(value="/login.do", method=RequestMethod.GET)
	public String loginform() {
		return "user/loginform";
	}
	
	@RequestMapping(value="/login.do", method=RequestMethod.POST)
	public String login(@RequestParam("id") String id, 
						@RequestParam("password") String password,
						HttpSession session) {
		User user = userService.login(id, password);
		
		session.setAttribute("LOGIN_USER", user);
		
		String returnUrl = (String) session.getAttribute("returnUrl");
		String queryString = (String) session.getAttribute("queryString");
		session.removeAttribute("returnUrl");
		session.removeAttribute("queryString");
		
		String path = "redirect:/home.do";
		if(returnUrl != null) {
			path = "redirect:" + returnUrl;
		}
		if(queryString != null) {
			path += "?" + queryString;
		}
		
		return path;
	}
	
	@RequestMapping("/logout.do")
	public String logout(HttpSession session) {
		session.invalidate();
		return "redirect:/home.do";
	}
	
	@RequestMapping("/getUser.do")
	@ResponseBody
	public List<User> getUser(String name) {
		 List<User> users = userService.getUserByName(name);
		 return users;
	}
	
	@InitBinder
	public void initBinder(WebDataBinder binder) {
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		binder.registerCustomEditor(Date.class, new CustomDateEditor(dateFormat, true));
	}
	
	
}
