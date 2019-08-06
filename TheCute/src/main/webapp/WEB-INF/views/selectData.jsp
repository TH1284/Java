<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

<head>
	<meta charset="UTF-8">
	<title>어디로 갈까?</title>
	<link href="/selectData.css" rel="stylesheet" />
</head>
<body>
	<a href="/thecute/">목록으로</a>
	<form action="showChart" method="POST" name='form' onsubmit="return check()">
		직업 :
		<select name="jobgroup">
	      <option value="1" ${jobgroup_1}>대학생</option>
	      <option value="2" ${jobgroup_2}>직장인</option>
	      <option value="3" ${jobgroup_3}>무직</option>
	      <option value="4" ${jobgroup_4}>군인</option>
	      <option value="999" ${jobgroup_999}>기타</option>
	    </select><br/>
    	당일/숙박여행 :
	    <select name="q010000">
	      <option value="1" ${q010000_1}>당일여행</option>
	      <option value="2" ${q010000_2}>숙박여행</option>
	    </select><br/>
	   	 하루 지출  :
	    <select name="q07grade">
	      <option value="1" ${q07grade_1}>3만원 이하</option>
	      <option value="2" ${q07grade_2}>6만원 이하</option>
	      <option value="3" ${q07grade_3}>10만원 이하</option>
	      <option value="4" ${q07grade_4}>20만원 이하</option>
	      <option value="5" ${q07grade_5}>20만원 초과</option>
	    </select><br />
		<input type="submit" value="입력 완료" />
	</form>
	<div id="donutchart" style="width: 900px; height: 500px;"></div>
</body>
<script type="text/javascript" src="https://www.gstatic.com/charts/loader.js"></script>
<script type="text/javascript">
  google.charts.load("current", {packages:["corechart"]});
  google.charts.setOnLoadCallback(drawChart);
  function drawChart() {
 	var data = google.visualization.arrayToDataTable([
 	  ['Task', 'Hours per Day'],
      ['자연 및 풍경 감상', ${q060601}],
      ['음식관광', ${q060602}],
      ['야외 위락/스포츠 활동', ${q060603}],
      ['역사유적지 방문', ${q060604}],
      ['테마파크/놀이시설', ${q060605}],
      ['휴식/휴양', ${q060606}],
      ['온천/휴양', ${q060607}],
      ['쇼핑', ${q060608}],
      ['문화예술/공연/전시시설', ${q060609}],
      ['스포츠 경기 관람', ${q060610}],
      ['축제/이벤트', ${q060611}],
      ['교육/체험 프로그램', ${q060612}],
      ['종교/성지순례', ${q060613}],
      ['갬블링', ${q060614}],
      ['시티투어', ${q060615}],
      ['드라마 촬영지', ${q060616}],
      ['가족/친지/친구', ${q060617}],
      ['회의참가/시찰', ${q060618}],
      ['교육/훈련/연수', ${q060619}],
      ['유흥/오락', ${q060620}],
      ['기타', ${q060621}]
    ]);

    var options = {
      title: '여행지에서의 활동',
      is3D: true,
      slices: {  0: {offset: 0.1},
    	  		 1: {offset: 0.1},
    	  		 2: {offset: 0.1},
		         3: {offset: 0.1},
		         4: {offset: 0.1},
		         5: {offset: 0.1},
		         6: {offset: 0.1},
		         7: {offset: 0.1},
		         8: {offset: 0.1},
		         9: {offset: 0.1},
		         10: {offset: 0.1},
		         11: {offset: 0.1},
		         12: {offset: 0.1},
		         13: {offset: 0.1},
		         14: {offset: 0.1},
		         15: {offset: 0.1},
		         16: {offset: 0.1},
		         17: {offset: 0.1},
		         18: {offset: 0.1},
		         19: {offset: 0.1},
		         20: {offset: 0.1},
		         21: {offset: 0.1}
			  }
    };

    var chart = new google.visualization.PieChart(document.getElementById('donutchart'));
    chart.draw(data, options);
  }
  
</script>

</html>
