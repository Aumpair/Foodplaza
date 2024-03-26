<%@page import="java.util.Iterator"%>
<%@page import="com.foodplaza.pojo.Feedback"%>
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
<% List<Feedback> l=(List)session.getAttribute("feedbacklist"); 
	if(l!=null){
%>
<form >
	<table>
		<caption>FeedBack list</caption>
		<tr>
		<th>Name</th>
		<th>Email</th>
		<th>Rank</th>
		<th>Review</th>
		<th>Suggestion</th>
		</tr>
		
		<% Iterator<Feedback>itr=l.iterator();
			while(itr.hasNext()){
				Feedback fb=itr.next();%>
				<tr>
					<td><%=fb.getName() %></td>
					<td><%=fb.getEmailid()%></td>
					<td><%=fb.getRank() %></td>
					<td><%=fb.getReview() %></td>
					<td><%=fb.getSuggestion() %></td>
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