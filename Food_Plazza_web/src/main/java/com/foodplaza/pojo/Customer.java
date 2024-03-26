package com.foodplaza.pojo;

public class Customer {
	private String CustomerName;
	private String CustomerEmailID;
	private String Password;
	private String CustomerAddress;
	private long CustomerContactNo;
	
	public Customer(String customerName, String customerEmailID, String password, String customerAddress,long customerContactNo) {
		super();
		CustomerName = customerName;
		CustomerEmailID = customerEmailID;
		Password = password;
		CustomerAddress = customerAddress;
		CustomerContactNo = customerContactNo;
	}

	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getCustomerName() {
		return CustomerName;
	}

	public void setCustomerName(String customerName) {
		CustomerName = customerName;
	}

	public String getCustomerEmailID() {
		return CustomerEmailID;
	}

	public void setCustomerEmailID(String customerEmailID) {
		CustomerEmailID = customerEmailID;
	}

	public String getPassword() {
		return Password;
	}

	public void setPassword(String password) {
		Password = password;
	}

	public String getCustomerAddress() {
		return CustomerAddress;
	}

	public void setCustomerAddress(String customerAddress) {
		CustomerAddress = customerAddress;
	}

	public long getCustomerContactNo() {
		return CustomerContactNo;
	}

	public void setCustomerContactNo(long customerContactNo) {
		CustomerContactNo = customerContactNo;
	}

	@Override
	public String toString() {
		return "Customer [CustomerName=" + CustomerName + ", CustomerEmailID=" + CustomerEmailID + ", Password="
				+ Password + ", CustomerAddress=" + CustomerAddress + ", CustomerContactNo=" + CustomerContactNo + "]";
	}
	
}
