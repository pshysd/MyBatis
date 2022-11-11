<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
    .login-area a {
        text-decoration: none;
        color:black;
        font-size: 12px;
    }

    .nav-area{

        background-color: black;
        color: white;
        height: 50px;
    }

    .menu {
        display:table-cell;
        width: 250px;
        height: 50px;
        vertical-align: middle;
        font-size: 20px;
        font-weight: bold;
    }

    .menu:hover {
        background-color: darkgrey;
        cursor: pointer;
    }

    /* menubar.jsp에 스타일을 단 한번만 정의하고 다 include 해서 쓸 것 */
    .outer {
        background-color: black;
        color: white;
        width: 900px;
        height: 600px;
        margin: auto;
        margin-top: 50px;
    }
</style>
</head>
<body>

    <h1 align="center">Welcome to MyBatis World</h1>

    <br>
    
    <div class="login-area" align="right">
    <c:choose>
        <c:when test="${empty loginUser}">
            <!-- 로그인 전에 보여지는 로그인 폼 -->
            <!-- 
            	현재 나의 url: http://localhost:8888/my/
            	로그인 요청시 보낼 url : http://localhost:8888/my/login.me
            	
            	절대경로: /my/login.me
            	상대경로: login.me
            -->
            <form action="login.me" method="post">
            <table>
                <tr>
                    <td>아이디</td>
                    <td><input type="text" name="userId" required> </td>
                    <td rowspan="2">
                        <button type="submit" style="height:50px">로그인</button>
                    </td>
                </tr>
                <tr>
                    <td>비밀번호</td>
                    <td><input type="text" name="userPwd" required></td>
                </tr>
                <tr>
                    <td colspan="3" align="center">
                        <a href="enrollForm.me">회원가입</a> |
                        <a href="">ID / 비밀번호 찾기</a>
                    </td>
                </tr>
            </table>
            </form>
        </div>
        </c:when>
        <c:otherwise>
            <!-- 로그인 후에 보여지는 프로필 화면 -->
            <div>
                <table>
                    <tr>
                        <td colspan="2">
                            <h3>${loginUser.userName}님 환영합니다.</h3>
                        </td>
                    </tr>
                    <tr>
                        <td><a href="">마이페이지</a></td>
                        <td><a href="">로그아웃</a></td>
                    </tr>
                </table>
            </div>
        </c:otherwise>
    </c:choose>
    <br>
    
    <div class="nav-area" align="center">
       <div class="menu">HOME</div>
       <div class="menu">공지사항</div>
       <div class="menu" onclick="location.href='list.bo?currentPage=1';">게시판</div>
       <div class="menu">ETC</div>
    </div>
</body>
</html>