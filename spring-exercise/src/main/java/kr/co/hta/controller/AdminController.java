package kr.co.hta.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/admin")
public class AdminController {

	@RequestMapping("/events.do")
	public String event(Model model) {
		return "admin/events";
	}
	@RequestMapping("/notices.do")
	public String notices(Model model) {
		return "admin/notices";
	}
	@RequestMapping("/products.do")
	public String products(Model model) {
		return "admin/products";
	}

}
