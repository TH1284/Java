<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="http://code.jquery.com/jquery-latest.min.js"></script>
<style>
	form {margin: 0 auto; padding: 10px; background: #eee;}
	label {display: inline-block; width: 200px; text-align: center;}
	input {display: inline-block; width: 300px;}
	form span {display: block' padding: 10px'}
	input[type="submit"] {display: inline=block; margin: 5px 0px 0px 140px;"}
</style>

</head>
<body>
	<form action="/test/input" method="get" id="name">
		<span><label>이름</label><input type="text" name="name" id="name"/></span><br>
		<span><label>중간고사점수</label><input type="number"  name="middle_score" id="middle"/></span><br> 
		<span><label>기말고사점수</label><input type="number" name="final_score" id="Final" /></span><br>
		<input type="submit" value="데이터 전송" id="b"/><br>
		<span id="a">${query_result}</span>
	</form>
</body>
	<script src="http://code.jquery.com/jquery-latest.min.js"></script>
	    <script type="text/javascript">
	   	 $("b").click(function() {
	    	var name = $("name").val();
	    	var middle = $("middle").val();
	    	var Final = $("Final").val();
	    	$("#a").append(name);
	    	$("#a").append(middle);
	    	$("#a").append(Final);
	    	}
	  
		</script>
</html>