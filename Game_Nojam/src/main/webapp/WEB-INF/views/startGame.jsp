<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">


<title>대전 결과</title>

<link href="${pageContext.request.contextPath}/resources/list.css"
	rel="stylesheet" />
</head>
<body>

	<table>
		<tr>
			<th>플레이어</th>
			<th>vs</th>		
			<th>컴퓨터</th>
		</tr>
		<tr>
			<th>${select_result_person} </th>
			<th>vs</th>
			<th>${select_result_com}</th>
		</tr>		
	</table>



</body>
</html>