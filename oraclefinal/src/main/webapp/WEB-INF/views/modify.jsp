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
	<form action="update_data" method="get">
		<input type="hidden" name="idx" value="${idx_value}" />
		<label>이름</label> <input type="text" placeholder="이름입력" name="name" value="${name_value}" />
		<label>좋아하는 색상</label> <input type="text" placeholder="좋아하는 색상" name="favoriteColor" value="${color_value}" />
		<label>주소</label> <input type="text" placeholder="주소" name="address" value="${address_value}" />
		<input type="submit" value="입력 완료" />
	</form>
</body>
</html>