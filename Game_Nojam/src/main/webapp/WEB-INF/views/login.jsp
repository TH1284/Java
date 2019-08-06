<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<title>로그인 페이지</title>
<meta charset="utf-8" />
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/input.css" />
</head>

<body>
  <div class="wrap">
    <div class="login_content">
      <div class="logo_sec">
        <h3>로그인</h3>
      </div>
      <form class="login_sec" action="/nojam/doSignIn">
        <input type="text" placeholder="이름을 입력해주세요" class="login_input" required="required" name="name" />
        <input type="submit" class="login_btn" value="확인" />
         <a href = "/nojam/newplayer">회원가입</a>
      </form>
    </div>
  </div>
</body>
</html>