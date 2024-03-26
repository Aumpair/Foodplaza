package com.foodplaza.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.foodplaza.pojo.Cart;
import com.foodplaza.utility.Db_utility;

public class CartDaoImplementation implements CartDao {
	
	Connection con;
	PreparedStatement ps;
	ResultSet rs;
	String sql;
	int row;

	@Override
	public boolean addtoCart(Cart cart) {
		try {
			con=Db_utility.getConnect();
			sql="insert into Cart (FoodId,emailId,FoodName,FoodPrice,Quentity,TotalPrice) values(?,?,?,?,?,?)";
			ps=con.prepareStatement(sql);
			ps.setInt(1,cart.getFoodId());
			ps.setString(2, cart.getEmailId());
			ps.setString(3, cart.getFoodName());
			ps.setDouble(4, cart.getFoodPrice());
			ps.setInt(5, cart.getQuentity());
			ps.setDouble(6, cart.getTotalPrice());
			
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
	public boolean deleteCart(int cartId) {
		try {
			con=Db_utility.getConnect();
			sql="delete from Cart where CartId=?";
			ps=con.prepareStatement(sql);
			ps.setInt(1, cartId);
			
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
	public List<Cart> showCart(String emailId) {
		
		List<Cart> li=new ArrayList<Cart>();
		try {
			con=Db_utility.getConnect();
			sql="select * from Cart where emailId=?";
			ps=con.prepareStatement(sql);
			ps.setString(1, emailId);
			rs=ps.executeQuery();
			
			while(rs.next()) {
				Cart cart=new Cart();
				cart.setCartId(rs.getInt("CartId"));
				cart.setFoodId(rs.getInt("FoodId"));
				cart.setEmailId(rs.getString("emailId"));
				cart.setFoodName(rs.getString("FoodName"));
				cart.setFoodPrice(rs.getDouble("FoodPrice"));
				cart.setQuentity(rs.getInt("Quentity"));
				cart.setTotalPrice(rs.getDouble("TotalPrice"));
				li.add(cart);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return li;
	}

	@Override
	public Boolean clearCart(String emailId) {
		try {
			con=Db_utility.getConnect();
			sql="delete from Cart where emailId=?";
			ps=con.prepareStatement(sql);
			ps.setString(1, emailId);
			
			row=ps.executeUpdate();
			if (row>0) {
				return true;
			}else {
				return false;
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

}
