package kr.co.hta.dao;

import java.util.List;

import kr.co.hta.vo.Event;

public interface EventDao {

	List<Event> getRandomEvent();
	List<Event> getAllEvent();
	
}
