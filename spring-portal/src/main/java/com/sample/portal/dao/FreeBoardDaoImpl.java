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
		template.insert("freeboard.addFreeBoard", freeBoard);
	}
	
	@Override
	public List<FreeBoard> getAllFreeBoard() {
		return template.queryForList("freeboard.getAllFreeBoard");
	}
	
	@Override
	public FreeBoard getFreeBoardByNo(int boardNo) {
		return (FreeBoard) template.queryForObject("freeboard.getFreeBoardByNo", boardNo);
	}
	
	
	@Override
	public void addComment(FreeBoardComment comment) {
		template.insert("addComment", comment);
	}
	
	@Override
	public List<FreeBoardComment> getCommentByBoardNo(int boardNo) {
		return template.queryForList("getCommentByBoardNo", boardNo);
	}
	
}
