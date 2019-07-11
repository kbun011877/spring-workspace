package kr.co.hta.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserController {

	@RequestMapping("/registerform.do")
	public String form() {
		return "user/form";
	}

	@RequestMapping("/loginform.do")
	public String loginform() {
		return "user/loginform";
	}
}
