package kr.co.hta.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ProductController {

	@RequestMapping("/category.do")
	public String category(Model model) {
		
		return "product/category";
	}
	
	@RequestMapping("/cart.do")
	public String cart(Model model) {
		
		return "product/cart";
	}
}
