package kr.co.hta.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import kr.co.hta.exception.AlreadyUsedIdException;
import kr.co.hta.exception.LoginFailureException;
import kr.co.hta.form.Userform;
import kr.co.hta.service.UserService;
import kr.co.hta.vo.User;

@Controller
public class UserController {

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
	
	@RequestMapping("/registerform.do")
	public String form() {
		return "user/form";
	}
	@RequestMapping(value="/register.do")
	public String register(Userform userform) {
		User user = new User();
		BeanUtils.copyProperties(userform, user);
		
		userService.registerUser(user);
		
		return "redirect:home.do";
	}
	
	@RequestMapping("/logout.do")
	public String logout(HttpSession session) {
		session.invalidate();
		return "redirect:home.do";
	}
	
	@RequestMapping("/loginform.do")
	public String loginform() {
		return "user/loginform";
	}
	
	@RequestMapping("/login.do")
	public String login(@RequestParam("id") String id,
						HttpSession session) {
				
		User user = userService.login(id);
		session.setAttribute("LOGIN_USER", user);
		
		return "redirect:home.do";
	}
	
}
