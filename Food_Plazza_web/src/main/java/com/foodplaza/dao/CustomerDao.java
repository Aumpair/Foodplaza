package com.foodplaza.dao;

import java.util.List;

import com.foodplaza.pojo.Customer;

public interface CustomerDao {
	boolean addCustomer(Customer customer);
	boolean updateCustomerByEmailId(Customer customer);
	boolean DeleteCustomerByEmailId(String customerEmailId);
	Customer SearchCustomerByEmailId(String customerEmailId);
	
	List<Customer> getAllCustomer();	
}
