<%@page import="java.util.Iterator"%>
<%@page import="com.foodplaza.pojo.Food"%>
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
	String uemail= (String) session.getAttribute("uEmail");
	String aemail=(String)session.getAttribute("aEmail");
	//String aemail="saurabh@gmail.com";
	List<Food>l=(List)session.getAttribute("foodlist");
%>
<form>
	<table>
		<caption>Food List</caption>
		<tr>
			<th>Food ID</th>
			<th>Food Name</th>
			<th>Food Category</th>
			<th>Food Type</th>
			<th>Food Price</th>
			<% if(uemail==null && aemail!=null){ %>
			<th colspan="2" >Action</th>
			<%} %>
			<% if(uemail!=null && aemail==null){ %>
			<th>Action</th>
			<%} %>
		</tr>
		
		<%Iterator<Food>itr=l.iterator();
			while(itr.hasNext()){
				Food f=itr.next();%>
				<tr>
					<td><%= f.getFoodId() %></td>
					<td><%= f.getFoodName() %></td>
					<td><%= f.getFoodCategory() %></td>
					<td><%= f.getFoodType() %></td>
					<td><%= f.getFoodPrice() %></td>
					<% if(uemail==null && aemail!=null){ %>
					<td>
						<a href="updatefood.jsp?foodId=<%=f.getFoodId() %>" >Update</a>
						<a href="food?action=delete&foodId=<%= f.getFoodId() %>" >Delete</a>
					</td>
					<%} %>
					<% if(uemail!=null && aemail==null){ %>
					<td>
						<a href="addcart.jsp?foodId=<%=f.getFoodId() %>" >Add to Cart</a>
					</td>
					<%} %>
				</tr>
			<%} %>
	</table>
</form>
<jsp:include page="footer.jsp"></jsp:include>
</body>
</html>