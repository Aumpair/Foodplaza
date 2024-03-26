package com.foodplaza.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.foodplaza.pojo.Customer;
import com.foodplaza.utility.Db_utility;

public class CustomerDaoImplementation implements CustomerDao {

	Connection con;
	PreparedStatement ps;
	ResultSet rs;
	int row;
	String sql;
	
	@Override
	public boolean addCustomer(Customer customer) {
		try {
		con=Db_utility.getConnect();
		sql="insert into Customer (CustomerName,CustomerEmailID,Password,CustomerAddress,CustomerContactNo) values(?,?,?,?,?)";
		ps=con.prepareStatement(sql);
		ps.setString(1, customer.getCustomerName());
		ps.setString(2, customer.getCustomerEmailID());
		ps.setString(3, customer.getPassword());
		ps.setString(4, customer.getCustomerAddress());
		ps.setLong(5, customer.getCustomerContactNo());
		
		row=ps.executeUpdate();
		
		if (row > 0) {
			return true;
		}else {
			return false;
		}
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public boolean updateCustomerByEmailId(Customer customer) {
		try {
			con=Db_utility.getConnect();
			sql="update Customer set CustomerName=?,Password=?,CustomerAddress=?,CustomerContactNo=? where CustomerEmailID=?";
			ps=con.prepareStatement(sql);
			ps.setString(1, customer.getCustomerName());
			ps.setString(2, customer.getPassword());
			ps.setString(3, customer.getCustomerAddress());
			ps.setLong(4, customer.getCustomerContactNo());
			ps.setString(5, customer.getCustomerEmailID());
			
			row=ps.executeUpdate();
			if(row>0) {
				return true;
			}else {
				return false;
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public boolean DeleteCustomerByEmailId(String customerEmailId) {
		
		try {
			con=Db_utility.getConnect();
			sql="delete from Customer where CustomerEmailID=?";
			ps=con.prepareStatement(sql);
			ps.setString(1, customerEmailId);
			row=ps.executeUpdate();
			
			if (row>0) {
				return true;
			}else {
				return false;
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return false;
	}

	@Override
	public Customer SearchCustomerByEmailId(String customerEmailId) {
		Customer customer=new Customer();
		try {
			con=Db_utility.getConnect();
			sql="select * from Customer where CustomerEmailID=?";
			ps=con.prepareStatement(sql);
			ps.setString(1, customerEmailId);
			
			rs=ps.executeQuery();
			if(rs.next()) {
				customer.setCustomerName(rs.getString("CustomerName"));
				customer.setCustomerEmailID(rs.getString("CustomerEmailID"));
				customer.setPassword(rs.getString("Password"));
				customer.setCustomerAddress(rs.getString("CustomerAddress"));
				customer.setCustomerContactNo(rs.getLong("CustomerContactNo"));
				
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return customer;
	}

	@Override
	public List<Customer> getAllCustomer() {
		
		List<Customer> li=new ArrayList<Customer>();
		try {
			
			con=Db_utility.getConnect();
			sql="select * from Customer";
			ps=con.prepareStatement(sql);
			rs=ps.executeQuery();
			
			while(rs.next()) {
				Customer customer=new Customer();
				customer.setCustomerName(rs.getString("CustomerName"));
				customer.setCustomerEmailID(rs.getString("CustomerEmailID"));
				customer.setPassword(rs.getString("Password"));
				customer.setCustomerAddress(rs.getString("CustomerAddress"));
				customer.setCustomerContactNo(rs.getLong("CustomerContactNo"));
				li.add(customer);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return li;
	}

}
