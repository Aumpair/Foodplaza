<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Add food</title>
<link href="alignadd.css" rel="stylesheet" type="text/css" />
<script type="text/javascript" src="validation.js"></script>

</head>
<body>
<jsp:include page="header.jsp"></jsp:include>
<% 
	String aemail=(String)session.getAttribute("aEmail");
	String uemail=(String)session.getAttribute("uEmail");
	if(aemail!=null && uemail==null){
%>
<form action="food" method="post" onsubmit="addFoodValidation(event)">
<table >
<caption><h2>Add Food</h2></caption>
<tr>
		<th>Enter food Name:</th>
		<th> <input type="text" name="FoodName" id="FoodName" placeholder="Enter Food Name" /></th>
		<th><span  id="FoodNameerror" style="color:red" ></span></th>
</tr>

<tr>
		<th>Enter food Category:</th>
		<th> <input type="text" name="FoodCategory" id="FoodCategory" placeholder="Enter Food Category" /></th>
		<th><span id="FoodCategoryerror" style="color:red" ></span></th>
</tr>
<tr>
		<th>Enter food Type:</th>
		<th> <input type="text" name="FoodType" id="FoodType" placeholder="Enter Food Type" /></th>
		<th><span id="FoodTypeerror" style="color:red" ></span></th>
</tr>

<tr>
		<th>Enter food price:</th>
		<th> <input type="text" name="FoodPrice" id="FoodPrice" placeholder="Enter Food Price" /></th>
		<th><span id="FoodPriceerror" style="color:red" ></span></th>
</tr>

</table>
<button type="submit" name="action" value="Addfood" >Add food</button>
<button type="reset" >Reset</button>
</form>
<%}
	else{
		response.sendRedirect("login.jsp");
	}
%>
<jsp:include page="footer.jsp"></jsp:include>
</body>
</html>