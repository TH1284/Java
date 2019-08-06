<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<table>
        <tr>
          <th>idx</th>
          <th>이름</th>
          <th>중간고사성적</th>
          <th>기말고사성적</th>
          <th></th>
        </tr>
        <tr>
          ${select_result}
        </tr>
    </table>
</body>
</html>