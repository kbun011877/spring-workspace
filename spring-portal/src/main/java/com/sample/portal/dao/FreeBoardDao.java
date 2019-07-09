package com.sample.portal.dao;

import java.util.List;

import com.sample.portal.vo.FreeBoard;
import com.sample.portal.vo.FreeBoardComment;

public interface FreeBoardDao {

	void addFreeBoard(FreeBoard freeBoard);
	List<FreeBoard> getAllFreeBoard();
	FreeBoard getFreeBoardByNo(int boardNo);
	
	void addComment(FreeBoardComment comment);
	List<FreeBoardComment> getCommentByBoardNo(int boardNo);
	
}
