<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
<body>
</body>
<script>
$(function(){
	location.href = "${context}/board.do?action=list&page=list";
});
</script>
</html>