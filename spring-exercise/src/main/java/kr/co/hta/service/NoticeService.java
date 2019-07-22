package kr.co.hta.service;

import java.util.List;

import kr.co.hta.vo.Notice;

public interface NoticeService {

	List<Notice> getNewNotices();
	List<Notice> getAllNotices();
}
