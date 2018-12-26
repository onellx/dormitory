<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>josn test</title>
<script type="text/javascript" src="${pageContext.request.contextPath}/bootstrap/js/jQuery.js"></script>
<script type="text/javascript">

function responseJson() {
	$.ajax({
		type:'post',
		url:'${pageContext.request.contextPath}/app/studentInfoApp/stUpdate.action',
		data:'identifying=2017040500117&stappInfo=%7B%22studentAppPasswd%22%3A%2225f9e794323b453885f5181f1b624d0b%22%7D',
		success:function(data){
			console.log(data);
			alert(data.identifying);
		}
		
	});
}

</script>
</head>
<body>

<input type="button" onclick="responseJson()" value="请求key/value,接收json"/>

<form action="${pageContext.request.contextPath}/app/studentInfoApp/stUpdate.action" enctype="multipart/form-data" method="post">
	<input type="hidden" name="identifying" value="2017040500117"/>
	<input type="hidden" name="stappInfo" value="%7B%22studentAppPasswd%22%3A%2225f9e794323b453885f5181f1b624d0b%22%7D">
	<input type="file" name="file" />
	<input type="submit" value="tijiao" />
</form>

</body>
</html>