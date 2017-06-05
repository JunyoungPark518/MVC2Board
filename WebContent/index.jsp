<%@ page language="java" contentType="text/html; charset=UTF-8"    pageEncoding="UTF-8"%>
<!doctype html>
<html lang="en">
<head>
	<meta charset="UTF-8" />
	<title>Document</title>
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap-theme.min.css" integrity="sha384-rHyoN1iRsVXV4nD0JutlnGaslCJuC7uwjduW9SVrLvRYooPp2bWYgmgJQIXwl/Sp" crossorigin="anonymous">
	<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js" integrity="sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa" crossorigin="anonymous"></script>
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
</head>
<body>
<div style="padding: 50px"></div>
<div style="width:100%">
<div style="margin: 0 auto; text-align:center; width: 700px">
	<table class="table table-hover"> 
		<tr>
			<td>Seq</td>
			<td>사용자 ID</td>
			<td>제목</td>
			<td>작성일</td>
			<td>카운트</td>
		</tr>
		<tr>
			<td>1</td>
			<td>babungv</td>
			<td><a id="detail" href="javascript:void(0)">title1</a></td>
			<td>2017-06-05</td>
			<td>0</td>
		</tr>
		<tr>
			<td>2</td>
			<td>babungv</td>
			<td>title2</td>
			<td>2017-06-05</td>
			<td>0</td>
		</tr>
		<tr>
			<td>3</td>
			<td>babungv</td>
			<td>title3</td>
			<td>2017-06-05</td>
			<td>0</td>
		</tr>
	</table>
</div>

</div>
</body>
<script>
$(function(){
	$('#detail').on('click',function(){
		alert('jQuery Check');
	});
});
</script>
</html>