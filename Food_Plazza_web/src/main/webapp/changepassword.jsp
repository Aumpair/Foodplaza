<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link href="alignadd.css" rel="stylesheet" type="text/css" />
<script type="text/javascript" src="validation.js"></script>
</head>
<body>
<jsp:include page="header.jsp"></jsp:include>
<form action="login" method="post" onsubmit="changepassValidation(event)" >
<table>
	<caption>change password page</caption>
	<%
	 String userEmail=(String)session.getAttribute("uEmail");
	 String adminEmail=(String)session.getAttribute("aEmail");
	%>
	<tr>
	
		<th>
		<span>Who are you :</span>
			<select name="type" id="type">
			<% if(userEmail==null && adminEmail==null){ %>
			<option value="user">user</option>
			<option value="admin" >Admin</option>
			<%} %>
			<% if(userEmail==null && adminEmail!=null){ %>
			<option value="user">user</option>
			<option value="admin" >Admin</option>
			<%} %>
			<% if(userEmail!=null && adminEmail==null){ %>
			<option value="user">user</option>
			<%} %>
			</select>
		</th>
		<th><span id="typeerror" style="color:red" ></span></th>
	</tr>
	<tr><% if(userEmail==null && adminEmail==null){ %></tr>
	<tr>
		<th>Enter EmailID</th>
		<th> <input type="text" name="EmailID" id="EmailID"  placeholder="Enter emailID " /></th>
		<th><span id="EmailIDerror" style="color:red" ></span></th>
	</tr>
	<tr><%} %></tr>
	
	<tr><% if(userEmail==null && adminEmail!=null){ %></tr>
	<tr>
		<th>Enter EmailID</th>
		<th> <input type="text" name="EmailID" id="EmailID" value="<%=adminEmail %>" /></th>
		<th><span id="EmailIDerror" style="color:red" ></span></th>
	</tr>
	<tr><%} %></tr>
	<tr><% if(userEmail!=null && adminEmail==null){ %></tr>
	<tr>
		<th>Enter EmailID</th>
		<th> <input type="text" name="EmailID" id="EmailID" value="<%=userEmail %>" /></th>
		<th><span id="EmailIDerror" style="color:red" ></span></th>
	</tr>
	<tr><%} %></tr>
	<tr>
		<th>Enter old Password </th>
		<th> <input type="text" name="oPassword" id="oPassword" placeholder="Enter old Password" /></th>
		<th><span id="oPassworderror" style="color:red" ></span></th>
	</tr>
	
	<tr>
		<th>Enter new Password </th>
		<th> <input type="text" name="nPassword" id="nPassword" placeholder="Enter new Password" /></th>
		<th><span id="nPassworderror" style="color:red" ></span></th>
	</tr>
	
	<tr>
		<th>Enter confirm Password </th>
		<th> <input type="text" name="cPassword" id="cPassword" placeholder="Enter new Password" /></th>
		<th><span id="cPassworderror" style="color:red" ></span></th>
	</tr>
	
</table>
<a href="login.jsp" >Login</a>
<button name="action" value="ChangePassword" type="submit" >Change Password</button>
</form> 
<jsp:include page="footer.jsp"></jsp:include>
</body>
</html>