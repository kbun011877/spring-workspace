package kr.co.hta.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import kr.co.hta.service.ProductService;
import kr.co.hta.vo.User;

@Controller
public class ProductController {

	@Autowired
	private ProductService productService;
	
	@RequestMapping("/category.do")
	public String category(@RequestParam(value="opt", required=false, defaultValue="type") String opt,
							@RequestParam(value="keyword", required=false, defaultValue="NEW") String keyword, 
							Model model) {
		model.addAttribute("categories", productService.getAllCategories());
		model.addAttribute("products", productService.getProductsByCategory(opt, keyword));
		
		return "product/category";
	}
	
	@RequestMapping("/addcart.do")
	public String addCart(@RequestParam(value="no") int productNo, HttpSession session) {
		User user = (User) session.getAttribute("LOGIN_USER"); 
		if (user == null) {
			return "redirect:/loginform.do?fail=deny";
		}
		
		productService.addCart(productNo, user.getId());
		
		return "redirect:cart.do";
	}
	
	@RequestMapping("/cart.do")
	public String cart(HttpSession session, Model model) {
		User user = (User) session.getAttribute("LOGIN_USER"); 
		if (user == null) {
			return "redirect:/loginform.do?fail=deny";
		}
		
		model.addAttribute("carts", productService.getCartsByUserId(user.getId()));
		
		return "product/cart";
	}
	
	@RequestMapping("/deletecart.do")
	public String deleteCart(@RequestParam("no") int cartNo, HttpSession session) {
		if (session.getAttribute("LOGIN_USER") == null) {
			return "redirect:/loginform.do?fail=deny";
		}
		
		productService.deleteCart(cartNo);
		
		return "redirect:cart.do";
	}
}
