package kr.co.hta.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.ibatis.SqlMapClientTemplate;
import org.springframework.stereotype.Repository;

import kr.co.hta.vo.Event;

@Repository
public class EventDaoEmpl implements EventDao{

	@Autowired
	private SqlMapClientTemplate template;
	
	@Override
	public List<Event> getRandomEvent() {
		return template.queryForList("Event.getRandomEvent");
	}
	
	@Override
	public List<Event> getAllEvent() {
		return template.queryForList("Event.getAllEvent");
	}
}
