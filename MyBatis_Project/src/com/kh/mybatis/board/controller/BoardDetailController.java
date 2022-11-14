package com.kh.mybatis.board.controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.kh.mybatis.board.model.service.BoardService;
import com.kh.mybatis.board.model.service.BoardServiceImpl;
import com.kh.mybatis.board.model.vo.Board;
import com.kh.mybatis.board.model.vo.Reply;

/**
 * Servlet implementation class BoardDetailController
 */
@WebServlet("/detail.bo")
public class BoardDetailController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public BoardDetailController() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		// 글번호 가져오기
		int boardNo = Integer.parseInt(request.getParameter("bno"));
		
		// 다형성 적용
		BoardService boardService = new BoardServiceImpl();
		
		// 조회수 증가
		int result = boardService.increaseCount(boardNo);
		
		if(result > 0) { // 조회수 증가에 성공했을 경우
			
//			게시글 상세조회 서비스 요청
			Board b = boardService.selectBoard(boardNo);
			
//			댓글 조회 서비스 요청
			ArrayList<Reply> list = boardService.selectReplyList(boardNo);
			
			request.setAttribute("list", list);
			request.setAttribute("b", b);
			request.getRequestDispatcher("WEB-INF/views/board/boardDetailView.jsp").forward(request, response);
		}else { // 실패
			request.setAttribute("errorMsg", "상세조회 처리중 문제 발생.");
			request.getRequestDispatcher("WEB-INF/views/common/errorPage.jsp");
		}
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
