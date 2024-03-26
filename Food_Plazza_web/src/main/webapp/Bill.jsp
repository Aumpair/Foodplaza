<%@page import="com.foodplaza.pojo.Orders"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<jsp:include page="header.jsp"></jsp:include>

<form >
	<% Orders order=(Orders) session.getAttribute("order"); %>
	OrderId=<%= order.getOrderId() %>
	OrderName=<%= order.getOrderName() %>
	Totalprice=<%= order.getTotalPrice() %>
	Date=<%= order.getDate() %>

</form>

<jsp:include page="footer.jsp"></jsp:include>
</body>
</html>