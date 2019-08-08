<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>연습입니다.</title>
</head>
<body>
	<a href="/tt/input">데이터 입력하기</a>
	
	<table>
		<tr>
			<th>idx</th>
			<th>이름</th>
			<th>색깔</th>
			<th>주소</th>
			<th>수정하기</th>
			<th>삭제하기</th>
		</tr>
		${select_result}
	</table>
</body>
</html>