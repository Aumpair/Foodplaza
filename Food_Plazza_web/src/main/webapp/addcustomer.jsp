<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link href="alignadd.css" rel="stylesheet" type="text/css" />
<script type="text/javascript" src="validation.js" ></script>
</head>
<body>
<jsp:include page="header.jsp"></jsp:include>
<form action="customer" method="post" onsubmit="addcustomerValidation(event)">
<table >
<tr>
		<th>Enter Customer Name</th>
		<th> <input type="text" name="CustomerName" id="CustomerName" placeholder="Enter Customer Name" /></th>
		<th><span  id="CustomerNameerror" style="color:red" ></span></th>
</tr>

<tr>
		<th>Enter Customer EmailID</th>
		<th> <input type="text" name="CustomerEmailID" id="CustomerEmailID" placeholder="Enter Customer EmailID" /></th>
		<th><span id="CustomerEmailIDerror" style="color:red" ></span></th>
</tr>

<tr>
		<th>Enter Password </th>
		<th> <input type="text" name="Password" id="Password" placeholder="Enter Password" /></th>
		<th><span id="Passworderror" style="color:red" ></span></th>
</tr>

<tr>
		<th>Enter confirm Password</th>
		<th> <input type="text" name="ConfirmPassword" id="ConfirmPassword" placeholder="Enter Confirm Password" /></th>
		<th><span id="ConfirmPassworderror" style="color:red" ></span></th>
</tr>

<tr>
		<th>Enter Customer Address</th>
		<th> <input type="text" name="CustomerAddress" id="CustomerAddress" placeholder="Enter Customer Address" /></th>
		<th><span id="CustomerAddresserror" style="color:red" ></span></th>
</tr>

<tr>
		<th>Enter Customer Contact Number</th>
		<th> <input type="text" name="CustomerContactNo" id="CustomerContactNo" placeholder="Enter Customer Contact Number" /></th>
		<th><span id="CustomerContactNoerror" style="color:red" ></span></th>
</tr>

</table>
<button type="submit" name="action" value="Addcustomer" >Add food</button>
<button type="reset" >Reset</button>
</form>
<jsp:include page="footer.jsp"></jsp:include>
</body>
</html>