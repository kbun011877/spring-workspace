package kr.co.hta.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import kr.co.hta.service.NoticeService;
import kr.co.hta.vo.Notice;

@Controller
public class NoticeController {

	@Autowired
	private NoticeService noticeService;
	
	@RequestMapping("/notices.do")
	public String notices(Model model) {
		List<Notice> notices = noticeService.getAllNotice();
		model.addAttribute("notices", notices);
		return "notices";
	}
	
}
