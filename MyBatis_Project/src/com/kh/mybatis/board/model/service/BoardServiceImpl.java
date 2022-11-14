package com.kh.mybatis.board.model.service;

import static com.kh.mybatis.common.template.Template.getSqlSession;

import java.util.ArrayList;

import org.apache.ibatis.session.SqlSession;

import com.kh.mybatis.board.model.dao.BoardDao;
import com.kh.mybatis.board.model.vo.Board;
import com.kh.mybatis.board.model.vo.Reply;
import com.kh.mybatis.common.model.vo.PageInfo;

public class BoardServiceImpl implements BoardService {

	private BoardDao boardDao = new BoardDao();
	
	@Override
	public int selectListCount() {
		
		SqlSession sqlSession = getSqlSession();
		
		int listCount = boardDao.selectListCount(sqlSession);
		
		sqlSession.close();
		
		return listCount;
	}

	@Override
	public ArrayList<Board> selectList(PageInfo pi) {
		
		SqlSession sqlSession = getSqlSession();
		
		ArrayList<Board> list = boardDao.selectList(sqlSession, pi);
		
		sqlSession.close();
		
		return list;
	}

	@Override
	public int increaseCount(int boardNo) {
		
		SqlSession sqlSession = getSqlSession();
		
		int result = boardDao.increaseCount(sqlSession, boardNo);
		
		if (result > 0) {
			sqlSession.commit();
		}else {
			sqlSession.rollback();
		}
		
		sqlSession.close();
		
		return result;
	}

	@Override
	public Board selectBoard(int boardNo) {

		SqlSession sqlSession = getSqlSession();
		
		Board b = boardDao.selectBoard(sqlSession, boardNo);
		
		sqlSession.close();
		
		return b;
	}

	@Override
	public int insertBoard(Board b) {
		return 0;
	}

	@Override
	public int updateBoard(Board b) {
		return 0;
	}
	
	@Override
	public ArrayList<Reply> selectReplyList(int boardNo){
		SqlSession sqlSession = getSqlSession();
		
		ArrayList<Reply> list = boardDao.selectReplyList(sqlSession, boardNo);
		
		sqlSession.close();
		
		return list;
	}
}
