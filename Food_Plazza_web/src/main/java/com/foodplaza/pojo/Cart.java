package com.foodplaza.pojo;

public class Cart {
	private int CartId;
	private int FoodId;
	private String EmailId;
	private String FoodName;
	private double FoodPrice;
	private int Quentity;
	private double TotalPrice;
	
	public Cart(int foodId, String emailId, String foodName, double foodPrice, int quentity,
			double totalPrice) {
		super();
		FoodId = foodId;
		EmailId = emailId;
		FoodName = foodName;
		FoodPrice = foodPrice;
		Quentity = quentity;
		TotalPrice = totalPrice;
	}

	public Cart() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getCartId() {
		return CartId;
	}

	public void setCartId(int cartId) {
		CartId = cartId;
	}

	public int getFoodId() {
		return FoodId;
	}

	public void setFoodId(int foodId) {
		FoodId = foodId;
	}

	public String getEmailId() {
		return EmailId;
	}

	public void setEmailId(String emailId) {
		this.EmailId = emailId;
	}

	public String getFoodName() {
		return FoodName;
	}

	public void setFoodName(String foodName) {
		FoodName = foodName;
	}

	public double getFoodPrice() {
		return FoodPrice;
	}

	public void setFoodPrice(double foodPrice) {
		FoodPrice = foodPrice;
	}

	public int getQuentity() {
		return Quentity;
	}

	public void setQuentity(int quentity) {
		Quentity = quentity;
	}

	public double getTotalPrice() {
		return TotalPrice;
	}

	public void setTotalPrice(double totalPrice) {
		TotalPrice = totalPrice;
	}

	@Override
	public String toString() {
		return "Cart [CartId=" + CartId + ", FoodId=" + FoodId + ", emailId=" + EmailId + ", FoodName=" + FoodName
				+ ", FoodPrice=" + FoodPrice + ", Quentity=" + Quentity + ", TotalPrice=" + TotalPrice + "]";
	}
	
	
}
