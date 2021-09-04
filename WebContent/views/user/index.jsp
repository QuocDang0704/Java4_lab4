<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>User Management</h2>
	<jsp:include page="form.jsp">
		<jsp:param value="${message}" name="message"/>
		<jsp:param value="${form.username}" name="username"/>
		<jsp:param value="${form.password}" name="password"/>
		<jsp:param value="${form}" name="form"/>
	</jsp:include>
	<hr>
	<hr>
	<jsp:include page="tableUser.jsp">
		<jsp:param value="${items}" name="items"/>
	</jsp:include>
</body>
</html>