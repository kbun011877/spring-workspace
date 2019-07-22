package kr.co.hta.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.co.hta.dao.NoticeDao;
import kr.co.hta.vo.Notice;

@Service
public class NoticeServiceImpl implements NoticeService {

	@Autowired
	private NoticeDao noticeDao;
	
	public List<Notice> getNewNotices() {
		return noticeDao.getNewNotices();
	}
	
	@Override
	public List<Notice> getAllNotices() {
		return noticeDao.getAllNotices();
	}
}
