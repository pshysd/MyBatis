<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" import="java.util.ArrayList, com.kh.mybatis.board.model.vo.Board"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%ArrayList<Board> list = (ArrayList<Board>)request.getAttribute("list"); %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<jsp:include page="../common/menubar.jsp" />


	<div class="outer">
		<br>
		<h1 align="center">게시판</h1>
		<br>
		<table align="center" border="1">
			<thead>
				<tr>
					<th>글번호</th>
					<th>제목</th>
					<th>작성자</th>
					<th>조회수</th>
					<th>작성일</th>
				</tr>
			</thead>
			<tbody>
			<c:forEach var="b" items="${list}">
			<tr>
				<td>${b.boardNo}</td>
				<td><a href="detail.bo?bno=${b.boardNo}">${b.boardTitle}</a></td>
				<td>${b.boardWriter}</td>
				<td>${b.count}</td>
				<td>${b.createDate}</td>
			</c:forEach>
			</tbody>
		</table>
	</div>

</body>
</html>