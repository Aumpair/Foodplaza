<%@page import="java.util.Iterator"%>
<%@page import="com.foodplaza.pojo.Cart"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link href="alignadd.css" rel="stylesheet" type="text/css" />
</head>
<body>
<jsp:include page="header.jsp"></jsp:include>
<%
	List<Cart> l=(List)session.getAttribute("cartlist");
	if(l!=null){
%>
<form action="order" method="post" >
	<table>
		<caption>cart list</caption>
		<tr>
		<th>CartID</th>
		<th>FoodID</th>
		<th>EmailID</th>
		<th>FoodName</th>
		<th>FoodPrice</th>
		<th>Quentity</th>
		<th>TotalPrice</th>
		<th colspan="1" >Action</th>
		</tr>
		
		<% Iterator<Cart>itr=l.iterator();
			while(itr.hasNext()){
				Cart cr=itr.next();%>
				<tr>
					<td><%=cr.getCartId() %></td>
					<td><%=cr.getFoodId() %></td>
					<td><%=cr.getEmailId() %></td>
					<td><%=cr.getFoodName() %></td>
					<td><%=cr.getFoodPrice() %></td>
					<td><%=cr.getQuentity() %></td>
					<td><%=cr.getTotalPrice() %></td>
					<td><a href="cart?action=delete&cartid=<%= cr.getCartId() %>" >Delete</a></td>
				</tr>
		<%} %>		
	</table>
	<button type="submit" name="action" value="placeOrder" >PlaceOrder</button>
</form>
<%}
	else{
		response.sendRedirect("login.jsp");
	}
%>
<jsp:include page="footer.jsp"></jsp:include>
</body>
</html>