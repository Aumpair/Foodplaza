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
<%
	CustomerDaoImplementation cd=new CustomerDaoImplementation();
	String customerEmailId=(String) session.getAttribute("uEmail");
	Customer c=cd.SearchCustomerByEmailId(customerEmailId);
%>
<jsp:include page="header.jsp"></jsp:include>
<form action="feedback" method="post" onsubmit="addfeedbackvalidation(event)">
<table border="1">
	<caption>Add FeedBack</caption>
	<tr>
		<th>Enter Name</th>
		<th> <input type="text" name="FeedName" id="FeedName" value="<%=c.getCustomerName() %>" /></th>
		<th><span  id="FeedNameerror" style="color:red" ></span></th>
	</tr>

	<tr>
		<th>Enter EmailID</th>
		<th> <input type="text" name="FeedEmailID" id="FeedEmailID" value="<%= c.getCustomerEmailID() %>" /></th>
		<th><span id="FeedEmailIDerror" style="color:red" ></span></th>
	</tr>

	<tr>
		<th>Enter Rank </th>
		<th> <input type="number" name="FeedRank" id="FeedRank" placeholder="Enter Rank" /></th>
		<th><span id="FeedRankerror" style="color:red" ></span></th>
	</tr>

	<tr>
		<th>Enter Review</th>
		<th> <input type="text" name="FeedReview" id="FeedReview" placeholder="Enter Review" /></th>
		<th><span id="FeedReviewerror" style="color:red" ></span></th>
	</tr>

	<tr>
		<th>Enter Suggestion</th>
		<th> <input type="text" name="FeedSuggestion" id="FeedSuggestion" placeholder="Enter Suggestion" /></th>
		<th><span id="FeedSuggestionerror" style="color:red" ></span></th>
	</tr>

</table>
<button type="submit" value="Aaddfeedback" name="action" >Add Feedback</button>
<button type="reset" >Reset</button>
</form>
<jsp:include page="footer.jsp"></jsp:include>
</body>
</html>