<%@page import="com.foodplaza.pojo.Food"%>
<%@page import="com.foodplaza.dao.FoodDaoImplementation"%>
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
<script type="text/javascript">
	function total() {
		const quan=document.getElementById("Quentity").value;
		const price=document.getElementById("FoodPrice").value;
		const total =quan*price;
		document.getElementById("TotalPrice").value=total;
		
	}
</script>
<body>
<jsp:include page="header.jsp"></jsp:include>

<%
	FoodDaoImplementation fd=new FoodDaoImplementation();
	int foodId=Integer.parseInt(request.getParameter("foodId"));
	Food f=fd.searchById(foodId);
	String uemail=(String)session.getAttribute("uEmail");
%>

<form action="cart" method="post" onsubmit="addcartValidation(event)">
<table border="1" >
<caption>Add cart</caption>
<tr>
		<th>Enter Food Id</th>
		<th> <input type="text" name="FoodId" id="FoodId" value="<%= f.getFoodId() %>" placeholder="Enter Food ID" /></th>
		<th><span  id="FoodIderror" style="color:red" ></span></th>
</tr>

<tr>
		<th>Enter EmailID</th>
		<th> <input type="text" name="EmailId" id="EmailId" placeholder="Enter EmailID" /></th>
		<th><span id="EmailIderror" style="color:red" ></span></th>
</tr>

<tr>
		<th>Enter Food Name </th>
		<th> <input type="text" name="FoodName" id="FoodName" value="<%= f.getFoodName() %>" placeholder="Enter Food Name" /></th>
		<th><span id="FoodNameerror" style="color:red" ></span></th>
</tr>

<tr>
		<th>Enter Food Price</th>
		<th> <input type="text" name="FoodPrice" id="FoodPrice" value="<%= f.getFoodPrice() %>" placeholder="Enter Food Price" /></th>
		<th><span id="FoodPriceerror" style="color:red" ></span></th>
</tr>

<tr>
		<th>Enter Quentity</th>
		<th> <input type="text" name="Quentity" id="Quentity" placeholder="Enter Quentity" /></th>
		<th><span id="Quentityerror" style="color:red" ></span></th>
</tr>

<tr>
		<th> TotalPrice</th>
		<th> <input type="text" name="TotalPrice" id="TotalPrice" onclick="total()" placeholder=" TotalPrice" /></th>
		<th><span id="TotalPriceerror" style="color:red" ></span></th>
</tr>

</table>
<button type="submit" name="action" value="AddToCart" >Add to Cart</button>
<button type="reset" >Reset</button>
</form>

<jsp:include page="footer.jsp"></jsp:include>
</body>
</html>