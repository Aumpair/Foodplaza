<%@page import="com.foodplaza.pojo.Food"%>
<%@page import="com.foodplaza.dao.FoodDaoImplementation"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Update food</title>
<script type="text/javascript" src="validation.js" ></script>
</head>
<body>
<jsp:include page="header.jsp"></jsp:include>
<%
	FoodDaoImplementation fd=new FoodDaoImplementation();
	int foodId=Integer.parseInt(request.getParameter("foodId"));
	Food f=fd.searchById(foodId);
%>

<form action="food" method="post" onsubmit="updateFoodValidation()">
<table border="1" >
<caption>update Food</caption>
<tr>
		<th>Enter food ID</th>
		<th> <input type="text" name="FoodId" id="FoodId" value="<%=f.getFoodId() %>" /></th>
		<th><span  id="FoodIderror" style="color:red" ></span></th>
</tr>

<tr>
		<th>Enter food Name</th>
		<th> <input type="text" name="FoodName" id="FoodName" value="<%=f.getFoodName() %>" /></th>
		<th><span  id="FoodNameerror" style="color:red" ></span></th>
</tr>

<tr>
		<th>Enter food Category</th>
		<th> <input type="text" name="FoodCategory" id="FoodCategory" value="<%=f.getFoodCategory() %>"  /></th>
		<th><span id="FoodCategoryerror" style="color:red" ></span></th>
</tr>
<tr>
		<th>Enter food Type</th>
		<th> <input type="text" name="FoodType" id="FoodType" value="<%=f.getFoodType() %>"  /></th>
		<th><span id="FoodTypeerror" style="color:red" ></span></th>
</tr>

<tr>
		<th>Enter food price</th>
		<th> <input type="text" name="FoodPrice" id="FoodPrice" value="<%=f.getFoodPrice() %>"  /></th>
		<th><span id="FoodPriceerror" style="color:red" ></span></th>
</tr>

</table>
<button type="submit" name="action" value="UpdateFood" >update food</button>
<button type="reset" >Reset</button>
</form>
<jsp:include page="footer.jsp"></jsp:include>
</body>
</html>