<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jstl/core_rt"  %>>
<%@taglib prefix="fmt" uri="http://java.sun.com/jstl/fmt_rt"%>>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	Tên sản phẩm: ${item.name}<br>
	Giá gốc: <strike>${item.price}</strike><br>
	Giá mới: 
		<c:set var= "newprice" value="${item.price*(1-item.discount)}"/>
		<fmt:formatNumber value= "${newprice}" />
		<c:choose>
			<c:when test="${newprice < 10}">Giá thấp</c:when>
			<c:when test="${newprice > 100}">Giá cao</c:when>
			<c:otherwise>Bình thường</c:otherwise>
</c:choose>
</body>
</html>