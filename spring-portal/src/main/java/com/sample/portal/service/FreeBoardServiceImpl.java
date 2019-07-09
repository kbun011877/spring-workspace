package com.sample.portal.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sample.portal.dao.FreeBoardDao;
import com.sample.portal.vo.FreeBoard;
import com.sample.portal.vo.FreeBoardComment;

@Service
public class FreeBoardServiceImpl implements FreeBoardService{

	@Autowired
	private FreeBoardDao freeboardDao;
	
	@Override
	public void addNewFreeBoard(FreeBoard freeboard) {
		freeboardDao.addFreeBoard(freeboard);
	}
	
	@Override
	public List<FreeBoard> getAllFreeBoards() {
		return freeboardDao.getAllFreeBoard();
	}
	
	@Override
	public FreeBoard getFreeBoardDetail(int boardNo) {
		return freeboardDao.getFreeBoardByNo(boardNo);
	}
	
	@Override
	public void addNewFreeBoardComment(FreeBoardComment comment) {
		freeboardDao.addComment(comment);
	}
	
	@Override
	public List<FreeBoardComment> getFreeBoardComments(int boardNo) {
		return freeboardDao.getCommentByBoardNo(boardNo);
	}
	
}
