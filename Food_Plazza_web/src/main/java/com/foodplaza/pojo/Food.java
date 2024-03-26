package com.foodplaza.pojo;

public class Food {
	private int FoodId;
	private String FoodName;
	private String FoodCategory;
	private String FoodType;
	private double FoodPrice;
	public Food(String foodName, String foodCategory, String foodType, double foodPrice) {
		super();
		
		FoodName = foodName;
		FoodCategory = foodCategory;
		FoodType = foodType;
		FoodPrice = foodPrice;
	}
	public Food() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getFoodId() {
		return FoodId;
	}
	public void setFoodId(int foodId) {
		FoodId = foodId;
	}
	public String getFoodName() {
		return FoodName;
	}
	
	public void setFoodName(String foodName) {
		FoodName = foodName;
	}
	public String getFoodCategory() {
		return FoodCategory;
	}
	public void setFoodCategory(String foodCategory) {
		FoodCategory = foodCategory;
	}
	public String getFoodType() {
		return FoodType;
	}
	public void setFoodType(String foodType) {
		FoodType = foodType;
	}
	public double getFoodPrice() {
		return FoodPrice;
	}
	public void setFoodPrice(double foodPrice) {
		FoodPrice = foodPrice;
	}

	@Override
	public String toString() {
		return "Food [FoodId=" + FoodId + ", FoodName=" + FoodName + ", FoodCategory=" + FoodCategory + ", FoodType="
				+ FoodType + ", FoodPrice=" + FoodPrice + "]";
	}
}
