package com.sample.portal.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.ibatis.SqlMapClientTemplate;
import org.springframework.stereotype.Repository;

import com.sample.portal.vo.FreeBoard;
import com.sample.portal.vo.FreeBoardComment;

 @Repository
public class FreeBoardDaoImpl implements FreeBoardDao{

	@Autowired
	private SqlMapClientTemplate template;
	
	@Override
	public void addFreeBoard(FreeBoard freeBoard) {
		template.insert("freeBoard.addFreeBoard", freeBoard);
	}
	
	@Override
	public List<FreeBoard> getAllFreeBoard() {
		return template.queryForList("freeBoard.getAllFreeBoard");
	}
	
	@Override
	public FreeBoard getFreeBoardByNo(int boardNo) {
		return (FreeBoard) template.queryForObject("freeBoard.getFreeBoardByNo", boardNo);
	}
	
	
	@Override
	public void addComment(FreeBoardComment comment) {
		template.insert("freeBoard.addComment", comment);
	}
	
	@Override
	public List<FreeBoardComment> getCommentByBoardNo(int boardNo) {
		return template.queryForList("freeBoard.getCommentByBoardNo", boardNo);
	}
	
	
	
	
	
	
}
