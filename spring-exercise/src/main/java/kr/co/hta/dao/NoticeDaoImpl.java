package kr.co.hta.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.ibatis.SqlMapClientTemplate;
import org.springframework.stereotype.Repository;

import kr.co.hta.vo.Notice;

@Repository
public class NoticeDaoImpl implements NoticeDao {

	@Autowired
	private SqlMapClientTemplate template;
	
	@Override
	public List<Notice> getNewNotices() {
		return template.queryForList("notice.getNewNotices");
	}
	
	@Override
	public List<Notice> getAllNotices() {
		return template.queryForList("notice.getAllNotices");
	}
}
