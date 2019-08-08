<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<a href="/tt">목록으로</a>
	<form action="input_data" method="get">
		<label>이름</label> <input type="text" placeholder="이름입력" name="name"/>
		<label>좋아하는 색깔</label> <input type="text" placeholder="좋아하는 색깔" name="favoriteColor"/>
		<label>주소</label> <input type="text" placeholder="주소" name="address"/>
		<input type="submit" value="입력 완료"/>
	</form>
</body>
</html>