<%@page import="java.io.PrintWriter"%>
<%@page import="java.util.Iterator"%>
<%@page import="com.foodplaza.pojo.Customer"%>
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
	List<Customer> l=(List)session.getAttribute("customerlist");
	if(l!=null){
%>
<form >
	<table>
		<caption>Customer list</caption>
		<tr>
		<th>Name</th>
		<th>Email</th>
		<th>Password</th>
		<th>contact</th>
		<th>Address</th>
		<th colspan="2" >Action</th>
		</tr>
		
		<% Iterator<Customer>itr=l.iterator();
			while(itr.hasNext()){
				Customer cs=itr.next();%>
				<tr>
					<td><%=cs.getCustomerName() %></td>
					<td><%=cs.getCustomerEmailID() %></td>
					<td><%=cs.getPassword() %></td>
					<td><%=cs.getCustomerContactNo() %></td>
					<td><%=cs.getCustomerAddress() %></td>
					<td>
						<a href="updatecustomer.jsp?email=<%=cs.getCustomerEmailID() %>" >Update</a>
						<a href="customer?action=delete&email=<%= cs.getCustomerEmailID() %>" >Delete</a>
					</td>
				</tr>
		<%} %>		
	</table>
</form>
<%} 
	else{
		response.sendRedirect("login.jsp");
	}
%>

<jsp:include page="footer.jsp"></jsp:include>
</body>
</html>