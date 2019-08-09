<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>데이터 추가하기</title>
</head>
<body>
	<a href="/seasonality">목록으로</a>
	<form action="input_data" method="get">
		<label>REGIONSEG1</label> <input type="text" placeholder="REGIONSEG1" name="REGIONSEG1" />
		<label>REGIONSEG2</label> <input type="text" placeholder="REGIONSEG2" name="REGIONSEG2" />
		<label>REGIONSEG3</label> <input type="text" placeholder="REGIONSEG3" name="REGIONSEG3" />
		<label>PRODUCTSEG3</label> <input type="text" placeholder="PRODUCTSEG3" name="PRODUCTSEG3" />
		<label>YEARWEEK</label> <input type="text" placeholder="YEARWEEK" name="YEARWEEK" />
		<label>YEAR</label> <input type="text" placeholder="YEAR" name="YEAR" />
		<label>WEEK</label> <input type="text" placeholder="WEEK" name="WEEK" />
		<label>QTY</label> <input type="text" placeholder="QTY" name="QTY" />
		<label>MA</label> <input type="text" placeholder="MA" name="MA" />
		<label>SEASONALITY</label> <input type="text" placeholder="SEASONALITY" name="SEASONALITY" />
		<label>FCST</label> <input type="text" placeholder="FCST" name="FCST" />
		<label>NEW_SEASONALITY</label> <input type="text" placeholder="NEW_SEASONALITY" name="NEW_SEASONALITY" />
		<label>NEW_FCST</label> <input type="text" placeholder="NEW_FCST" name="NEW_FCST" />
		<input type="submit" value="입력 완료" />
		
	</form>
</body>
</html>