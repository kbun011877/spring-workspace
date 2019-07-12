package kr.co.hta.dao;

import java.util.List;

import kr.co.hta.vo.Notice;

public interface NoticeDao {

	List<Notice> getRandomNotice();
	List<Notice> getAllNotice();
}
