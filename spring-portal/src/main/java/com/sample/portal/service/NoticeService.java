package com.sample.portal.service;

import java.util.List;

import com.sample.portal.vo.Notice;

public interface NoticeService {

	void addNotice(Notice notice);
	List<Notice> getAllNoties();
	Notice getNoticeByNo(int noticeNo);
}
