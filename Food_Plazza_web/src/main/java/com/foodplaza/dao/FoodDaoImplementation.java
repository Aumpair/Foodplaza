package com.foodplaza.dao;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import com.foodplaza.pojo.Food;
import com.foodplaza.utility.Db_utility;

public class FoodDaoImplementation implements FoodDao {

	Connection con;
	PreparedStatement ps;
	ResultSet rs;
	String sql;
	int row;
	
	@Override
	public boolean addFood(Food food) {
		try {
			con=Db_utility.getConnect();
			sql="insert into Food(FoodName,FoodCategory,FoodType,FoodPrice) values(?,?,?,?)";
			ps=con.prepareStatement(sql);
			ps.setString(1, food.getFoodName());
			ps.setString(2, food.getFoodCategory());
			ps.setString(3, food.getFoodType());
			ps.setDouble(4, food.getFoodPrice());
			row= ps.executeUpdate();
			
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
	public boolean updateFoodById(Food food) {
		try {
			con=Db_utility.getConnect();
			sql="update Food set FoodName=?,FoodCategory=?,FoodType=?,FoodPrice=? where FoodId=?";
			ps=con.prepareStatement(sql);
			ps.setString(1,food.getFoodName());
			ps.setString(2, food.getFoodCategory());
			ps.setString(3, food.getFoodType());
			ps.setDouble(4, food.getFoodPrice());
			ps.setInt(5, food.getFoodId());
			
			row= ps.executeUpdate();
			
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
	public boolean deleteFoodById(int foodId) {
		try {
			con=Db_utility.getConnect();
			sql="delete from Food where FoodId=?";
			ps=con.prepareStatement(sql);
			ps.setInt(1,foodId);
		 
			row= ps.executeUpdate();
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
	public Food searchById(int foodId) {
		Food food=new Food();
		try {
			
			con=Db_utility.getConnect();
			sql="select * from Food where FoodId=?";
			ps=con.prepareStatement(sql);
			ps.setInt(1, foodId);
			rs= ps.executeQuery();
			
			if (rs.next()) {
//				food=new Food(rs.getString("FoodName"),rs.getString("FoodCategory"),rs.getString("FoodType"),rs.getInt("FoodPrice"));
				
				food.setFoodId(rs.getInt("FoodId"));
				food.setFoodName(rs.getString("FoodName"));
				food.setFoodCategory(rs.getString("FoodCategory"));
				food.setFoodType(rs.getString("FoodType"));
				food.setFoodPrice(rs.getInt("FoodPrice"));
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return food;
	}

	@Override
	public List<Food> getAllFood() {
		List<Food> li=new ArrayList<Food>();
		try {
			con=Db_utility.getConnect();
			sql="select * from Food ";
			ps=con.prepareStatement(sql);
			rs=ps.executeQuery();
			
			while(rs.next()) {
				Food food=new Food();
				food.setFoodId(rs.getInt("FoodId"));
				food.setFoodName(rs.getString("FoodName"));
				food.setFoodCategory(rs.getString("FoodCategory"));
				food.setFoodType(rs.getString("FoodType"));
				food.setFoodPrice(rs.getInt("FoodPrice"));
				li.add(food);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return li;
	}

}
