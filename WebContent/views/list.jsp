<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jstl/fmt_rt" prefix="fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<c:forEach var="item" items="${items}">
		<div style="width: 300px;height: 300px; border:1px solid;">
			${item.name}<br>
			<strike>${item.price}</strike><br>
			${item.price*(1-item.discount)}
		</div>
	</c:forEach>
</body>
</html>