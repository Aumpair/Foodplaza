<%@page import="com.foodplaza.pojo.Customer"%>
<%@page import="com.foodplaza.dao.CustomerDaoImplementation"%>
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

<% 
	CustomerDaoImplementation cd=new CustomerDaoImplementation();
	String customerEmailID=(String) session.getAttribute("uEmail");
	Customer c=cd.SearchCustomerByEmailId(customerEmailID);
%>


<form action="customer" method="post" onsubmit="updatecustomerValidation(event)">
<table border="1" >
<tr>
		<th>Enter Customer Name</th>
		<th> <input type="text" name="CustomerName" id="CustomerName" value="<%= c.getCustomerName() %>" /></th>
		<th><span  id="CustomerNameerror" style="color:red" ></span></th>
</tr>

<tr>
		<th>Enter Customer EmailID</th>
		<th> <input type="text" name="CustomerEmailID" id="CustomerEmailID" value="<%= c.getCustomerEmailID() %>" /></th>
		<th><span id="CustomerEmailIDerror" style="color:red" ></span></th>
</tr>

<tr>
		<th>Enter Password </th>
		<th> <input type="text" name="Password" id="Password" value="<%= c.getPassword() %>" /></th>
		<th><span id="Passworderror" style="color:red" ></span></th>
</tr>

<tr>
		<th>Enter confirm Password</th>
		<th> <input type="text" name="ConfirmPassword" id="ConfirmPassword" value="<%= c.getPassword()%>" /></th>
		<th><span id="ConfirmPassworderror" style="color:red" ></span></th>
</tr>

<tr>
		<th>Enter Customer Address</th>
		<th> <input type="text" name="CustomerAddress" id="CustomerAddress" value="<%= c.getCustomerAddress() %>" /></th>
		<th><span id="CustomerAddresserror" style="color:red" ></span></th>
</tr>

<tr>
		<th>Enter Customer Contact Number</th>
		<th> <input type="number" name="CustomerContactNo" id="CustomerContactNo" value="<%= c.getCustomerContactNo() %>" /></th>
		<th><span id="CustomerContactNoerror" style="color:red" ></span></th>
</tr>

</table>
<button type="submit" name="action" value="Updatecustomer" >UpdateCustomer</button>
<button type="reset" >Reset</button>
</form>
<jsp:include page="footer.jsp"></jsp:include>
</body>
</html>