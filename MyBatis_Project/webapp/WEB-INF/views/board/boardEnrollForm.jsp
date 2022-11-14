<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
	#enroll-form>table{
		border : 1px solid white;
	}
	
	#enroll-form>table input, #enroll-form>table textarea {
	width: 100%;
	box-sizing: border-box;
}
</style>
</head>
<body>
<jsp:include page="../common/menubar.jsp" />

	<div class="outer">
		<br>
		<h2 align="center">게시글 작성</h2>
		<br>

		<form id="enroll-form" action="insert.bo" method="post">
			<!-- 
			카테고리, 제목, 내용, 첨부파일을 입력받고
			작성자의 회원번호는 hidden으로 넘긴다.
			 -->
			<input type="hidden" name="userNo" value="${loginUser.userNo}">
			<table align="center">
				<tr>
					<th>제목</th>
					<td><input type="text" name="boardTitle" size="30" required placeholder="제목을 입력해주세요."></td>
				</tr>
				<tr>
					<th>내용</th>
					<td><textarea name="boardContent" rows="10" cols="40" required style="resize:none;" placeholder="내용을 입력해주세요."></textarea></td>
				</tr>
			</table>

			<br>

			<div align="center">
				<button type="submit">작성하기</button>
				<button type="reset">취소하기</button>
			</div>
		</form>
	</div>
</body>
</html>