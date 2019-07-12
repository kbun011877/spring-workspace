package kr.co.hta.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.co.hta.dao.NoticeDao;
import kr.co.hta.vo.Notice;

@Service
public class NoticeServiceImpl implements NoticeService{

	@Autowired
	private NoticeDao noticeDao;
	
	@Override
	public List<Notice> noticeRandom() {
		return noticeDao.getRandomNotice();
	}
	
	@Override
	public List<Notice> getAllNotice() {
		return noticeDao.getAllNotice();
	}
	
}
