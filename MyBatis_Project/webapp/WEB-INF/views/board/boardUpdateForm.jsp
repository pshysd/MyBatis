<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
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
		<h2 align="center">게시글 수정</h2>
		<br>

		<form id="update-form" action="update.bo" method="post">
			<input type="hidden" name="boardNo" value="${b.boardNo}">
			<table align="center">
				<tr>
					<th>제목</th>
					<td><input type="text" name="boardTitle" size="30" required value="${b.boardTitle}"></td>
				</tr>
				<tr>
					<th>내용</th>
					<td><textarea name="boardContent" rows="10" cols="40" required style="resize:none;">${b.boardContent}</textarea></td>
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