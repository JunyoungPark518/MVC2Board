<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<c:set var="context" value="<%=application.getContextPath() %>"/>
<jsp:include page="../common/header.jsp"/>
<body>
<div style="padding: 50px"></div>
<div style="width:100%">
<div style="margin: 0 auto; text-align:center; width: 700px">
	<table class="table table-hover"> 
		<%-- <tr>
			<td colspan="5">총 게시글 수 : ${requestScope.count}건</td>
		</tr> --%>
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
		<tr>
			<td>4</td>
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