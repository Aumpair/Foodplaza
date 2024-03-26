<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link href="alignadd.css" rel="stylesheet" type="text/css" />
<script type="text/javascript" src="no-validation.js"></script>
</head>
<body>
<jsp:include page="header.jsp"></jsp:include>
<form action="login" method="post" onsubmit="loginValidation(event)" >
<table>
	<caption>login page</caption>
	<tr>
	
		<th>
		<span>Who are you :</span>
			<select name="type" id="type">
			<option>select</option>
			<option value="user">user</option>
			<option value="admin" >Admin</option>
			</select>
		</th>
		<th><span id="typeerror" style="color:red" ></span></th>
	</tr>
	
	<tr>
		<th>Enter Customer EmailID</th>
		<th> <input type="text" name="EmailID" id="EmailID" placeholder="Enter  EmailID" /></th>
		<th><span id="EmailIDerror" style="color:red" ></span></th>
	</tr>

	<tr>
		<th>Enter Password </th>
		<th> <input type="text" name="Password" id="Password" placeholder="Enter Password" /></th>
		<th><span id="Passworderror" style="color:red" ></span></th>
	</tr>
	
</table>
<a href="changepassword.jsp" >Forget Password</a>
<button name="action" value="login" type="submit" >login</button>
</form>
<jsp:include page="footer.jsp"></jsp:include>
</body>
</html>