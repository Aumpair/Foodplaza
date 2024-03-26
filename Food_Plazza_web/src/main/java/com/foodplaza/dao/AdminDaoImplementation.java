package com.foodplaza.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.foodplaza.utility.Db_utility;

public class AdminDaoImplementation implements AdminDao {

	Connection con;
	PreparedStatement ps;
	ResultSet rs;
	String sql;
	int row;
	
	String dbpassword;
	
	@Override
	public boolean userLogin(String emailId, String Password) {
		
		try {
			con=Db_utility.getConnect();
			sql="select Password from customer where CustomerEmailID=?";
			ps=con.prepareStatement(sql);
			ps.setString(1, emailId);
			rs=ps.executeQuery();
			
			if (rs.next()) {
				dbpassword=rs.getString(1);
			}
			else {
				return false;
			}
			
			if (dbpassword.equals(Password)) {
				return true;
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		return false;
	}

	@Override
	public boolean userChangePassword(String emailId, String newPassword) {
		try {
			con=Db_utility.getConnect();
			sql="update Customer set Password=? where CustomerEmailID=?";
			ps=con.prepareStatement(sql);
			ps.setString(1, newPassword);
			ps.setString(2, emailId);
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
	public boolean adminLogin(String adminemailId, String adminPassword) {
		try {
			con=Db_utility.getConnect();
			sql="select Password from Admin where EmailId=?";
			ps=con.prepareStatement(sql);
			ps.setString(1, adminemailId);
			rs=ps.executeQuery();
			if(rs.next()) {
				dbpassword=rs.getString(1);
			}
			if(dbpassword.equals(adminPassword)) {
				return true;
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public boolean adminChangePassword(String adminemailId, String adminnewPassword) {
		try {
			
			con=Db_utility.getConnect();
			sql="update admin set Password=? where EmailId=?";
			ps=con.prepareStatement(sql);
			ps.setString(1, adminnewPassword);
			ps.setString(2, adminemailId);
			
			row=ps.executeUpdate();
			if (row>0) {
				return true;
			}
			else {
				return false;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}

	
//	public static void main(String[] args) {
//		boolean value=new AdminDaoImplementation().userLogin("priyaj", "680");
//		System.out.println(value);
//	}
}
