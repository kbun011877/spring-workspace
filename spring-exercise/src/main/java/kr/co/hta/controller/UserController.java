package kr.co.hta.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import kr.co.hta.form.UserForm;
import kr.co.hta.service.UserService;
import kr.co.hta.vo.User;

@Controller
public class UserController {

	@Autowired
	private UserService userService;
	
	@RequestMapping("/registerform.do")
	public String form() {
		return "user/form";
	}
	
	@RequestMapping("/register.do")
	public String register(UserForm userForm) {
		User user = new User();
		BeanUtils.copyProperties(userForm, user);
		
		boolean isSuccess = userService.register(user);
		if (isSuccess) {
			return "redirect:complete.do";
		} else {
			return "redirect:registerform.do?fail=dup";
		}
	}
	
	@RequestMapping("/complete.do")
	public String complete() {
		return "user/complete";
	}

	@RequestMapping("/loginform.do")
	public String loginform() {
		return "user/loginform";
	}
	
	@RequestMapping("/login.do")
	public String login(String id, String password, HttpSession session) {
		User user = userService.login(id, password);
		if (user == null) {
			return "redirect:loginform.do?fail=invalid";
		}
		
		session.setAttribute("LOGIN_USER", user);
		return "redirect:/home.do";
	}
	
	@RequestMapping("/logout.do")
	public String logout(HttpSession session) {
		session.invalidate();
		return "redirect:/home.do";
	}
}
