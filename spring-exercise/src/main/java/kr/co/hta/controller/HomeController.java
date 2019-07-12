package kr.co.hta.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import kr.co.hta.service.EventService;
import kr.co.hta.service.NoticeService;
import kr.co.hta.service.ProductService;

@Controller
public class HomeController {
	
	@Autowired
	private EventService eventService;
	@Autowired
	private NoticeService noticeService;
	@Autowired
	private ProductService productService;
	
	@RequestMapping("/home.do")
	public String home(Model model) {
		model.addAttribute("events", eventService.eventRandom());
		model.addAttribute("notices", noticeService.noticeRandom());
		
		model.addAttribute("nproducts", productService.getProductByTypeOfNew());
		model.addAttribute("rproducts", productService.getProductByTypeOfRecommend());
		
		return "home";
	}
	
	
	
}
