package com.sample.portal.controller;

import java.io.File;
import java.io.IOException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.FileCopyUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.sample.portal.form.Noticeform;
import com.sample.portal.service.NoticeService;
import com.sample.portal.view.FileDownloadView;
import com.sample.portal.vo.Notice;

@Controller
@RequestMapping("/notice")
public class NoticeController {

	private static final Logger logger = LoggerFactory.getLogger(NoticeController.class); 
	
	@Value("${dir.file.attachment}")
	private String attachmentFileSaveDirectory;
	
	@Autowired
	private FileDownloadView filedownloadView;
	
	@Autowired
	private NoticeService noticeService;
	
	@RequestMapping("/form.do")
	public String form() {
		
		logger.debug("form() 실행됨");
		logger.info("공지사항 등록폼 요청 접수");
		logger.debug("form() 종료됨");
		return "notice/form";
	}
	
	@RequestMapping("/add.do")
	public String add(Noticeform noticeform) throws IOException {
		logger.debug("add() 실행됨"); 
		logger.info("공지사힝 제목-" + noticeform.getTitle()); 
		logger.info("공지사항 내용-" + noticeform.getContents()); 
		
		Notice notice = new Notice();
		BeanUtils.copyProperties(noticeform, notice);
		
		if(!noticeform.getAttachmentfile().isEmpty()) {
			MultipartFile mf = noticeform.getAttachmentfile();
			String filename = mf.getOriginalFilename();
			filename = System.currentTimeMillis() + filename;
			
			FileCopyUtils.copy(mf.getBytes(), new File(attachmentFileSaveDirectory, filename));
			notice.setAttachment(filename);
		}
		noticeService.addNotice(notice);
		
		return "redirect:list.do";
	}
	
	@RequestMapping("/list.do")
	public String list(Model model) {
		model.addAttribute("notices", noticeService.getAllNoties());
		return"notice/list";
	}
	
	@RequestMapping("/download.do")
	public ModelAndView download(@RequestParam("no") int noticeNo) {
		
		Notice notice = noticeService.getNoticeByNo(noticeNo);
		
		ModelAndView mav = new ModelAndView();
		
		mav.addObject("directory", attachmentFileSaveDirectory);
		mav.addObject("filename", notice.getAttachment());
		
		mav.setView(filedownloadView);
		
		return mav;
		
	}
}
