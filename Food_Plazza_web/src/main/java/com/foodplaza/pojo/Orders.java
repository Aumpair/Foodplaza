package com.foodplaza.pojo;


public class Orders {
	private int OrderId;
	private String OrderName;
	private double TotalPrice;
	private String Date;
	public Orders(int orderId, String orderName, double totalPrice, String date) {
		super();
		OrderId = orderId;
		OrderName = orderName;
		TotalPrice = totalPrice;
		Date = date;
	}
	public Orders() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getOrderId() {
		return OrderId;
	}
	public void setOrderId(int orderId) {
		OrderId = orderId;
	}
	public String getOrderName() {
		return OrderName;
	}
	public void setOrderName(String orderName) {
		OrderName = orderName;
	}
	public double getTotalPrice() {
		return TotalPrice;
	}
	public void setTotalPrice(double totalPrice) {
		TotalPrice = totalPrice;
	}
	public String getDate() {
		return Date;
	}
	public void setDate(String date) {
		Date = date;
	}
	@Override
	public String toString() {
		return "Orders [OrderId=" + OrderId + ", OrderName=" + OrderName + ", TotalPrice=" + TotalPrice + ", Date="
				+ Date + "]";
	}
	
	
	
}
