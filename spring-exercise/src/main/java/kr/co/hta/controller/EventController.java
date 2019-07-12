package kr.co.hta.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import kr.co.hta.service.EventService;
import kr.co.hta.vo.Event;

@Controller
public class EventController {

	@Autowired
	private EventService eventService;
	
	
	@RequestMapping("/events.do")
	public String events(Model model) {
		List<Event> events = eventService.allEvent();
		model.addAttribute("events", events);
		return "events";
	}
	
	
}
