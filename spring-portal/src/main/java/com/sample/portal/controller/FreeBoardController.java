package com.sample.portal.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.sample.portal.service.FreeBoardService;
import com.sample.portal.vo.FreeBoardComment;
import com.sample.portal.vo.User;


@Controller
@RequestMapping("/free")
public class FreeBoardController {

	@Autowired
	private FreeBoardService freeBoardService;
	
	@RequestMapping("/list.do")
	public String list(Model model) {
		model.addAttribute("boards", freeBoardService.getAllFreeBoards());
		
		return("free/list");
	}
	
	@RequestMapping("/detail.do")
	public String detail(@RequestParam("no") int boardNo, Model model) {
		model.addAttribute("board", freeBoardService.getFreeBoardDetail(boardNo));
		model.addAttribute("comments", freeBoardService.getFreeBoardComments(boardNo));
		
		return "free/detail";
	}
	
	@RequestMapping("/addcomment.do")
	public @ResponseBody List<FreeBoardComment> addcomment(HttpSession session, @RequestParam("contents") String contents,  @RequestParam("no") int boardNo) {
		
		User user = (User) session.getAttribute("LOGIN_USER");
		
		FreeBoardComment comment = new FreeBoardComment();
		comment.setWriter(user.getName());
		comment.setContents(contents);
		comment.setBoardNo(boardNo);
		freeBoardService.addNewFreeBoardComment(comment);
		
		List<FreeBoardComment> comments = freeBoardService.getFreeBoardComments(boardNo);
		
		return comments;
	}
	
}
