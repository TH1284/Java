<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
    /* form {
      width: 100%;
      padding: 10px;
      border: 1px solid #eee;
      margin: 10px auto;
      width: 95%;
    }
    form label {
      display: inline-block;
      width: 100%;
      padding: 8px 0px 0px 10px;
      background: #eee;
      border-radius: 5px 0px;
    }
    form input {
      width: 100%;
      display: inline-block;
      margin: 0px 0px 20px 0px;
      padding: 5px 0px;
    }
    form input[type="submit"] {
      width: 50%;
      display: block;
      margin: 10px auto;
      background: #aa9999;
      color: #fff;
      border: 0px;
      padding: 10px;
    }
    a {
      padding: 10px 30px;
      display: inline-block;
      margin: 5px;
      background: #99aaaa;
      color: #fff;
      border-radius: 5px;
      text-decoration: none;
      font-weight: bold;
    } */

  </style>
  <link href="${pageContext.request.contextPath}/resources/input.css"
	rel="stylesheet" />
</head>

<body>
  <a href="/test0527">목록으로</a>
  <form action="input_data" method="get">
    <label>이름</label>
    <input type="text" placeholder="이름입력" name="name"/>
    <label>주소</label>
    <input type="text" placeholder="주소입력" name="address"/>
    <label>생일</label>
    <select name = "birthday_month">
    <option value ="1">1월</option>
    <option value ="2">2월</option>
    <option value ="3">3월</option>
    <option value ="4">4월</option>
    <option value ="5">5월</option>
    <option value ="6">6월</option>
    <option value ="7">7월</option>
    <option value ="8">8월</option>
    <option value ="9">9월</option>
    <option value ="10">10월</option>
    <option value ="11">11월</option>
    <option value ="12">12월</option>
    </select>
    <select name = "birthday_day">
    <option value ="1">1일</option>
    <option value ="2">2일</option>
    <option value ="3">3일</option>
    <option value ="4">4일</option>
    <option value ="5">5일</option>
    <option value ="6">6일</option>
    <option value ="7">7일</option>
    <option value ="8">8일</option>
    <option value ="9">9일</option>
    <option value ="10">10일</option>
    <option value ="11">11일</option>
    <option value ="12">12일</option>
    <option value ="13">13일</option>
    <option value ="14">14일</option>
    <option value ="15">15일</option>
    <option value ="16">16일</option>
    <option value ="17">17일</option>
    <option value ="18">18일</option>
    <option value ="19">19일</option>
    <option value ="20">20일</option>
    <option value ="21">21일</option>
    <option value ="22">22일</option>
    <option value ="23">23일</option>
    <option value ="24">24일</option>
    <option value ="25">25일</option>
    <option value ="26">26일</option>
    <option value ="27">27일</option>
    <option value ="28">28일</option>
    <option value ="29">29일</option>
    <option value ="30">30일</option>
    <option value ="31">31일</option> 
    </select>
    <input type="text" placeholder="생일입력" name="birthday"/>
    <label>색상</label>
    <input type="text" placeholder="색상입력" name="favoriteColor"/>
    <input type="submit" value="입력 완료" />
  </form>
</body>

</html>
