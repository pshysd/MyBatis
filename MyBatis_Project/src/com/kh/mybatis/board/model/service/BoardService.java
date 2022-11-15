package com.kh.mybatis.board.model.service;

import java.util.ArrayList;
import java.util.HashMap;

import com.kh.mybatis.board.model.vo.Board;
import com.kh.mybatis.board.model.vo.Reply;
import com.kh.mybatis.common.model.vo.PageInfo;

public interface BoardService {

//	게시글 리스트 조회
	int selectListCount(); // 전체 게시글 수

	ArrayList<Board> selectList(PageInfo pi);

//	게시글 상세조회
	int increaseCount(int boardNo);

	Board selectBoard(int boardNo);

//	댓글 조회
	ArrayList<Reply> selectReplyList(int boardNo);
	
//	게시글 작성
	int insertBoard(Board b);

//	게시글 수정
	int updateBoard(Board b);
	
//	
	public ArrayList<Board> selectSearchList(HashMap<String, String> map, PageInfo pi);
	
//	
	public int selectSearchCount(HashMap<String, String> map);
}
