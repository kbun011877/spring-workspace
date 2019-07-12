package kr.co.hta.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.ibatis.SqlMapClientTemplate;
import org.springframework.stereotype.Repository;

import kr.co.hta.vo.Notice;

@Repository
public class NoticeDaoEmpl implements NoticeDao{

	@Autowired
	private SqlMapClientTemplate template;
	
	@Override
	public List<Notice> getRandomNotice() {
		return template.queryForList("Notice.getRandomNotice");
	}
	
	@Override
	public List<Notice> getAllNotice() {
		return template.queryForList("Notice.getAllNotice");
	}
}
