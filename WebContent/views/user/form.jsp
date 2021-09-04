<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h3>User Edition</h3>
	<form action="/Lab4/user.php" method="post">
		${message}<br>
		Username: <input name="username" value="${form.username}"><br> 
		Password: <input name="password" value="${form.password}"><br> 
		<input name="remember"	type="checkbox" ${form.remmember?'checked':''}> Remember me? <br>
		<button>Create</button>
	</form>
</body>
</html>