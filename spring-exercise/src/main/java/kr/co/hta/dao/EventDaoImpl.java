package kr.co.hta.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.ibatis.SqlMapClientTemplate;
import org.springframework.stereotype.Repository;

import kr.co.hta.vo.Event;

@Repository
public class EventDaoImpl implements EventDao {

	@Autowired
	private SqlMapClientTemplate template;
	
	@Override
	public List<Event> getNewEvents() {
		return template.queryForList("event.getNewEvents");
	}
	
	@Override
	public List<Event> getAllEvents() {
		return template.queryForList("event.getAllEvents");
	}
}
