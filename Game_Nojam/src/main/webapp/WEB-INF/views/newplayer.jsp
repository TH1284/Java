<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/input.css" />

<title>Insert title here</title>
</head>
<body>
<form action="/nojam/input_data" method="get">
    <label>이름</label>
    <input type="text" placeholder="이름입력" name="name" />
    <label>공격력 입력</label>
    <input type="text" placeholder="공격력 입력" name="attackPower" />
    <label>방어력 입력</label>
    <input type="text" placeholder="방어력 입력" name="defencePower" />
    <label>공격 확률 입력</label>
    <input type="text" placeholder="공격 확률 입력" name="attackRate" />
    <label>방어 확률 입력</label>
    <input type="text" placeholder="방어 확률 입력" name="defenceRate" />
    <label>HP(50~100사이의 값을 입력하세요.)</label>
    <input type="text" placeholder="HP" name="HP" />
    <input type="submit" value="입력 완료" />
  </form>
</body>
</html>