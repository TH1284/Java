<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="login" method="get">
   		<label>아이디 : </label><input type="text" name="id" value="${id}"/>
    	<label>비밀번호 : </label><input type="password" name="password" value="${password}"/><br>
    	<input type="submit" value="로그인"/><div href="/test0610">회원가입</div>
    </form>
</body>
</html>