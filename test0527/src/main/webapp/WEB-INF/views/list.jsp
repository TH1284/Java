<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

<head>
  <meta charset="UTF-8">
  <title>Insert title here</title>
  <style>
    /* table {
      width: 100%;
    }

    th {
      background: #eee;
      padding: 5px;
    }

    td {
      text-align: center;
      padding: 5px;
    }

    th,
    td {
      border: 1px solid #eee;
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
<link href="${pageContext.request.contextPath}/resources/list.css"
	rel="stylesheet" />
</head>

<body>
  <a href="/test0527/input">데이터 입력하기</a>

  <table>
    <tr>
      <th>
        idx
      </th>
      <th>
        이름
      </th>
      <th>
        주소
      </th>
      <th>
        생일
      </th>
      <th>
        색상
      </th>
       <th> 
      </th>
      <th> 
      </th>
    </tr>
    ${select_result}
  </table>
  	<p>서울 거주민 : ${seoul_count}명</p>
  	<p>경기도 거주민 : ${gyeonggido_count}명</p>
</body>

</html>
