<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

<link href="${pageContext.request.contextPath}/resources/list.css"
	rel="stylesheet" />
</head>

<body>
	<a href="/nojam/newplayer">데이터 입력하기</a>

	<table>
		<tr>

			<th>idx</th>
			<th>이름</th>
			<th>공격력</th>
			<th>방어력</th>
			<th>공격확률</th>
			<th>방어확률</th>
			<th>HP</th>
			<th>1플레이어 선택</th>
		</tr>
		${select_result}
		
	</table>




</body>

</html>
