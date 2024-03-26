<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>Tea and Meal - Free CSS Template</title>
<meta name="keywords" content="" />
<meta name="description" content="" />
<link href="templatemo_style.css" rel="stylesheet" type="text/css" />
</head>
<body>
	<%
	String uemail= (String) session.getAttribute("uEmail");
	String aemail=(String)session.getAttribute("aEmail");
	%>
	<div id="templatemo_container">
		<div id="templatemo_header">
			<div id="site_title"></div>
		</div>
		<!-- end of header -->

		<div id="templatemo_menu">
			<ul>
			<%if(uemail==null && aemail==null){%>
				<li class="current"><a href="index.jsp"><b>Home</b></a></li>
				<li><a href="food"><b>Food List</b></a></li>
				<li><a href="login.jsp"><b>Login</b></a></li>
				<li><a href="addcustomer.jsp"><b>Register Customer</b></a></li>
				<li><a href="contactus.jsp"><b>Contact</b></a></li>
			<%} %>
			
			<%if(uemail==null && aemail!=null){%>
				<li class="current"><a href="addfood.jsp"><b>Add Food</b></a></li>
				<li><a href="food"><b>Food List</b></a></li>
				<li><a href="customer"><b>Customer List</b></a></li>
				<li><a href="feedback"><b>FeedBack List</b></a></li>
				<li><a href="changepassword.jsp"><b>Change Password</b></a></li>
				<li><a href="login"><b>Logout</b></a></li>
			<%} %>
			
			<%if(uemail!=null && aemail==null){%>
				<li class="current"><a href="food"><b>Food list</b></a></li>
				<li><a href="cart"><b>Cart List</b></a></li>
				<li><a href="addfeedback.jsp"><b>Add FeedBack</b></a></li>
				<li><a href="changepassword.jsp"><b>Change Password</b></a></li>
				<li><a href="updatecustomer.jsp?emailId=<%=uemail%>"><b>Edit Profile </b></a></li>
				<li><a href="login"><b>Logout</b></a></li>
			<%} %>
			</ul>
		</div>
</body>
</html>