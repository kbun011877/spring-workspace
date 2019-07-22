package kr.co.hta.service;

import java.util.List;

import kr.co.hta.vo.Event;

public interface EventService {

	List<Event> getNewEvents();
	List<Event> getAllEvents();
}
