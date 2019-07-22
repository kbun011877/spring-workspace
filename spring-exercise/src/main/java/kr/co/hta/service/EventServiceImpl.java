package kr.co.hta.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.co.hta.dao.EventDao;
import kr.co.hta.vo.Event;

@Service
public class EventServiceImpl implements EventService {

	@Autowired
	private EventDao eventDao;
	
	@Override
	public List<Event> getNewEvents() {
		return eventDao.getNewEvents();
	}
	
	@Override
	public List<Event> getAllEvents() {
		return eventDao.getAllEvents();
	}
}
