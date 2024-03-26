//add food validation
function addFoodValidation(e){
	Foodname=document.getElementById("FoodName").value;
	if(Foodname==""){
		document.getElementById("FoodNameerror").innerHTML="Please Enter Food Name";
		e.preventDefault();
		
	}
	else{
		document.getElementById("FoodNameerror").innerHTML="";
	}
	
	Foodcategory=document.getElementById("FoodCategory").value;
	if(Foodcategory==""){
		document.getElementById("FoodCategoryerror").innerHTML="Please Enter Food Category";
		e.preventDefault();
		
	}
	else{
		document.getElementById("FoodCategoryerror").innerHTML="";
	}
	
	Foodtype=document.getElementById("FoodType").value;
	if(Foodtype==""){
		document.getElementById("FoodTypeerror").innerHTML="Please Enter Food type";
		e.preventDefault();
		
	}
	else{
		document.getElementById("FoodTypeerror").innerHTML="";
	}
	
	Foodprice=document.getElementById("FoodPrice").value;
	if(Foodprice==""){
		document.getElementById("FoodPriceerror").innerHTML="Please Enter Food Price";
		e.preventDefault();
		
	}
	else{
		document.getElementById("FoodPriceerror").innerHTML="";
	}
}

//Update food Validation
function updateFoodValidation(e){
	Foodid=document.getElementById("FoodId").value;
	if(Foodid==""){
		document.getElementById("FoodIderror").innerHTML="Please Enter Food ID";
		e.preventDefault();
	}
	else{
		document.getElementById("FoodIderror").innerHTML="";
	}
	
	Foodname=document.getElementById("FoodName").value;
	if(Foodname==""){
		document.getElementById("FoodNameerror").innerHTML="Please Enter Food Name";
		e.preventDefault();
	}
	else{
		document.getElementById("FoodNameerror").innerHTML="";
	}
	
	Foodcategory=document.getElementById("FoodCategory").value;
	if(Foodcategory==""){
		document.getElementById("FoodCategoryerror").innerHTML="Please Enter Food Category";
		e.preventDefault();
		
	}
	else{
		document.getElementById("FoodCategoryerror").innerHTML="";
	}
	
	Foodtype=document.getElementById("FoodType").value;
	if(Foodtype==""){
		document.getElementById("FoodTypeerror").innerHTML="Please Enter Food type";
		e.preventDefault();
	}
	else{
		document.getElementById("FoodPriceerror").innerHTML="";
	}
	Foodprice=document.getElementById("FoodPrice").value;
	if(Foodprice==""){
		document.getElementById("FoodPriceerror").innerHTML="Please Enter Food Price";
		e.preventDefault();
	}
	else{
		document.getElementById("FoodPriceerror").innerHTML="";
	}
}

//add cutomer validation 
function addcustomerValidation(e){
	Customername=document.getElementById("CustomerName").value;
	if(Customername==""){
		document.getElementById("CustomerNameerror").innerHTML="Please Enter customer name";
		e.preventDefault();
	}
	else{
		document.getElementById("CustomerNameerror").innerHTML="";
	}
	
	CustomeremailID=document.getElementById("CustomerEmailID").value;
	if(CustomeremailID==""){
		document.getElementById("CustomerEmailIDerror").innerHTML="Please Enter Email ID";
		e.preventDefault();
	}
	else{
		document.getElementById("CustomerEmailIDerror").innerHTML="";
	}
	if((CustomeremailID.indexOf('@')<0) || (CustomeremailID.indexOf('.')<0)){
		
		document.getElementById("EmailIDerror").innerHTML="Please enter valid EmailID";
		e.preventDefault();
	}else{
		document.getElementById("EmailIDerror").innerHTML="";
	}
	
	password=document.getElementById("Password").value;
	if(password==""){
		document.getElementById("Passworderror").innerHTML="Please Enter password";
		e.preventDefault();
		
	}
	else{
		document.getElementById("Passworderror").innerHTML="";
	}
	
	Confirmpassword=document.getElementById("ConfirmPassword").value;
	if(Confirmpassword==""){
		document.getElementById("ConfirmPassworderror").innerHTML="Please Enter Food type";
		e.preventDefault();
	}
	else{
		document.getElementById("ConfirmPassworderror").innerHTML="";
	}
	if(Confirmpassword!=password){
		document.getElementById("ConfirmPassworderror").innerHTML="Password and confirm password not match";
		e.preventDefault();
	}else{
		document.getElementById("ConfirmPassworderror").innerHTML="";
	}
	
	
	Customeraddress=document.getElementById("CustomerAddress").value;
	if(Customeraddress==""){
		document.getElementById("CustomerAddresserror").innerHTML="Please Enter address";
		e.preventDefault();
	}
	else{
		document.getElementById("CustomerAddresserror").innerHTML="";
	}
	
	CustomercontactNo=document.getElementById("CustomerContactNo").value;
	if(CustomercontactNo==""){
		document.getElementById("CustomerContactNoerror").innerHTML="Please Enter address";
		e.preventDefault();
	}
	else{
		document.getElementById("CustomerContactNoerror").innerHTML="";
	}
}

//update customer validation

function updatecustomerValidation(e){
	Customername=document.getElementById("CustomerName").value;
	if(Customername==""){
		document.getElementById("CustomerNameerror").innerHTML="Please Enter customer name";
		e.preventDefault();
	}
	else{
		document.getElementById("CustomerNameerror").innerHTML="";
	}
	
	CustomeremailID=document.getElementById("CustomerEmailID").value;
	if(CustomeremailID==""){
		document.getElementById("CustomerEmailIDerror").innerHTML="Please Enter Email ID";
		e.preventDefault();
	}
	else{
		document.getElementById("CustomerEmailIDerror").innerHTML="";
	}
	if((CustomeremailID.indexOf('@')<0) || (CustomeremailID.indexOf('.')<0)){
		
		document.getElementById("EmailIDerror").innerHTML="Please enter valid EmailID";
		e.preventDefault();
	}else{
		document.getElementById("EmailIDerror").innerHTML="";
	}
	
	password=document.getElementById("Password").value;
	if(password==""){
		document.getElementById("Passworderror").innerHTML="Please Enter password";
		e.preventDefault();
		
	}
	else{
		document.getElementById("Passworderror").innerHTML="";
	}
	
	Confirmpassword=document.getElementById("ConfirmPassword").value;
	if(Confirmpassword==""){
		document.getElementById("ConfirmPassworderror").innerHTML="Please Enter Food type";
		e.preventDefault();
	}
	else{
		document.getElementById("ConfirmPassworderror").innerHTML="";
	}
	if(Confirmpassword!=password){
		document.getElementById("ConfirmPassworderror").innerHTML="Password and confirm password not match";
		e.preventDefault();
	}else{
		document.getElementById("ConfirmPassworderror").innerHTML="";
	}
	
	
	Customeraddress=document.getElementById("CustomerAddress").value;
	if(Customeraddress==""){
		document.getElementById("CustomerAddresserror").innerHTML="Please Enter address";
		e.preventDefault();
	}
	else{
		document.getElementById("CustomerAddresserror").innerHTML="";
	}
	
	CustomercontactNo=document.getElementById("CustomerContactNo").value;
	if(CustomercontactNo==""){
		document.getElementById("CustomerContactNoerror").innerHTML="Please Enter address";
		e.preventDefault();
	}
	else{
		document.getElementById("CustomerContactNoerror").innerHTML="";
	}
}

//add cart validation

function addcartValidation(e){
	Foodid=document.getElementById("FoodId").value;
	if(Foodid==""){
		document.getElementById("FoodIderror").innerHTML="Please Enter Food ID ";
		e.preventDefault();
	}
	else{
		document.getElementById("FoodIderror").innerHTML="";
	}
	
	Emailid=document.getElementById("EmailId").value;
	if(Emailid==""){
		document.getElementById("EmailIderror").innerHTML="Please Enter Email ID";
		e.preventDefault();
	}
	else{
		document.getElementById("EmailIderror").innerHTML="";
	}
	if((Emailid.indexOf('@')<0) || (Emailid.indexOf('.')<0)){
		
		document.getElementById("EmailIderror").innerHTML="Please enter valid EmailID";
		e.preventDefault();
	}else{
		document.getElementById("EmailIderror").innerHTML="";
	}
	
	Foodname=document.getElementById("FoodName").value;
	if(Foodname==""){
		document.getElementById("FoodNameerror").innerHTML="Please Enter Food Name";
		e.preventDefault();
	}
	else{
		document.getElementById("FoodNameerror").innerHTML="";
	}
	

	Foodprice=document.getElementById("FoodPrice").value;
	if(Foodprice==""){
		document.getElementById("FoodPriceerror").innerHTML="Please Enter Food Price";
		e.preventDefault();
	}
	else{
		document.getElementById("FoodPriceerror").innerHTML="";
	}
	
	quentity=document.getElementById("Quentity").value;
	if(quentity==""){
		document.getElementById("Quentityerror").innerHTML="Please Enter Quantity";
		e.preventDefault();
	}
	else{
		document.getElementById("Quentityerror").innerHTML="";
	}
}

//FeedBack Validation

function addfeedbackvalidation(e){
	Feedname=document.getElementById("FeedName").value;
	if(Feedname==""){
		document.getElementById("FeedNameerror").innerHTML="Please Enter Food ID ";
		e.preventDefault();
	}
	else{
		document.getElementById("FeedNameerror").innerHTML="";
	}
	
	FeedemailID=document.getElementById("FeedEmailID").value;
	if(FeedemailID==""){
		document.getElementById("FeedEmailIDerror").innerHTML="Please Enter Email ID";
		e.preventDefault();
	}
	else{
		document.getElementById("FeedEmailIDerror").innerHTML="";
	}
	if((FeedemailID.indexOf('@')<0) || (FeedemailID.indexOf('.')<0)){
		
		document.getElementById("FeedEmailIDerror").innerHTML="Please enter valid EmailID";
		e.preventDefault();
	}else{
		document.getElementById("FeedEmailIDerror").innerHTML="";
	}
	
	Feedrank=document.getElementById("FeedRank").value;
	if(Feedrank==""){
		document.getElementById("FeedRankerror").innerHTML="Please Enter Food Name";
		e.preventDefault();
	}
	else{
		document.getElementById("FeedRankerror").innerHTML="";
	}
	

	Feedreview=document.getElementById("FeedReview").value;
	if(Feedreview==""){
		document.getElementById("FeedReviewerror").innerHTML="Please Enter Food Price";
		e.preventDefault();
	}
	else{
		document.getElementById("FeedReviewerror").innerHTML="";
	}
	
	Feedsuggestion=document.getElementById("FeedSuggestion").value;
	if(Feedsuggestion==""){
		document.getElementById("FeedSuggestionerror").innerHTML="Please Enter Quantity";
		e.preventDefault();
	}
	else{
		document.getElementById("FeedSuggestionerror").innerHTML="";
	}
}

//Login Validation

function loginValidation(e){
	type=document.getElementById("type").value;
	if(type.selectedIndex<0){
		document.getElementById("typeerror").innerHTML="Please Select Type";
		e.preventDefault();
	}else{
		document.getElementById("typeerror").innerHTML="";
	}
	
	email=document.getElementById("EmailID").value;
	if(email==""){
		document.getElementById("EmailIDerror").innerHTML="Please Enter email ID";
		e.preventDefault();
	}else{
		document.getElementById("EmailIDerror").innerHTML="";
	}
	if(email.indexof('@')<0 || email.indexof('.')<0){
		document.getElementById("EmailIDerror").innerHTML="Please enter valid EmailID";
		e.preventDefault();
	}else{
		document.getElementById("EmailIDerror").innerHTML="";
	}
	
	pass=document.getElementById("Password").value;
	if(pass=""){
		document.getElementById("Passworderror").innerHTML="Please Enter password";
		e.preventDefault();
	}else{
		document.getElementById("Passworderror").innerHTML="";
	}
	if(pass<8 || pass>15){
		document.getElementById("Passworderror").innerHTML="Password length must be 8 to 15";
		e.preventDefault();
	}else{
		document.getElementById("Passworderror").innerHTML="";
	}	
}

//change password validation

function changepassValidation(e){
	type=document.getElementById("type").value;
	if(type.selectedIndex<0){
		document.getElementById("typeerror").innerHTML="Please Select Type";
		e.preventDefault();
	}else{
		document.getElementById("typeerror").innerHTML="";
	}
	
	email=document.getElementById("EmailID").value;
	if(email==""){
		document.getElementById("EmailIDerror").innerHTML="Please Enter email ID";
		e.preventDefault();
	}else{
		document.getElementById("EmailIDerror").innerHTML="";
	}
	if(email.indexof('@')<0 || email.indexof('.')<0){
		document.getElementById("EmailIDerror").innerHTML="Please enter valid EmailID";
		e.preventDefault();
	}else{
		document.getElementById("EmailIDerror").innerHTML="";
	}
	
	pass=document.getElementById("nPassword").value;
	if(pass=""){
		document.getElementById("nPassworderror").innerHTML="Please Enter password";
		e.preventDefault();
	}else{
		document.getElementById("nPassworderror").innerHTML="";
	}
	if(pass<8 || pass>15){
		document.getElementById("nPassworderror").innerHTML="Password length must be 8 to 15";
		e.preventDefault();
	}else{
		document.getElementById("nPassworderror").innerHTML="";
	}
	
	Confirmpassword=document.getElementById("cPassword").value;
	if(Confirmpassword==""){
		document.getElementById("cPassworderror").innerHTML="Please Enter Food type";
		e.preventDefault();
	}
	else{
		document.getElementById("cPassworderror").innerHTML="";
	}
	if(Confirmpassword!=pass){
		document.getElementById("cPassworderror").innerHTML="Password and confirm password not match";
		e.preventDefault();
	}else{
		document.getElementById("cPassworderror").innerHTML="";
	}	
}
