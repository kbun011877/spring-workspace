package kr.co.hta.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import kr.co.hta.service.CartService;
import kr.co.hta.vo.User;

@Controller
public class ProductController {

	@Autowired
	private CartService cartservice;
	
	@RequestMapping("/category.do")
	public String category(Model model) {
		
		return "product/category";
	}
	
	@RequestMapping("/cart.do")
	public String cartList(Model model, HttpSession session) {
		User user = (User) session.getAttribute("LOGIN_USER");
		model.addAttribute("carts", cartservice.getCart(user.getId()));
		return "product/cart";
	}
	
	@RequestMapping("/deleteCartProduct.do")
	public String deleteCart(Model model, @RequestParam("no") int no) {
		cartservice.deleteCart(no);
		return "redirect:cart.do";
	}
	
}
