package kr.co.hta.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.co.hta.dao.EventDao;
import kr.co.hta.vo.Event;

@Service
public class EventServiceEmpl implements EventService{

	@Autowired
	private EventDao eventDao;
	
	@Override
	public List<Event> eventRandom() {
		return eventDao.getRandomEvent();
	}
	
	@Override
	public List<Event> allEvent() {
		return eventDao.getAllEvent();
	}
}
