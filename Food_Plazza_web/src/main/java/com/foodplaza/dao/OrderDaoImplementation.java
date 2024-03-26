package com.foodplaza.dao;

import java.sql.Connection;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.foodplaza.pojo.Orders;
import com.foodplaza.utility.Db_utility;

public class OrderDaoImplementation implements OrderDao {

	Connection con;
	PreparedStatement ps;
	ResultSet rs;
	String sql;
	int row;
	double TotalPrice=0;
	Orders order=new Orders();
	
	
	String date=new Date().toString();
	@Override
	public Orders PlacedOrder(String emailId) {
		try {
			con=Db_utility.getConnect();
			sql="select sum(TotalPrice) as total from Cart where emailId=?";
			ps=con.prepareStatement(sql);
			ps.setString(1, emailId);
			rs=ps.executeQuery();
					
			if(rs.next()) {
				TotalPrice=rs.getDouble("total");
//				System.out.println(TotalPrice);
			}
			if(TotalPrice>0) {
				sql="insert into Orders (OrderName,TotalPrice,Date) values(?,?,?)";
				ps=con.prepareStatement(sql);
				ps.setString(1, emailId);
				ps.setDouble(2, TotalPrice);
				ps.setString(3, date);
				row=ps.executeUpdate();
				
				if(row > 0) {
					sql="select * from Orders where OrderName=? and Date=?";
					ps=con.prepareStatement(sql);
					ps.setString(1, emailId);
					ps.setString(2,date);
					rs=ps.executeQuery();
					if(rs.next()) {
						order.setOrderId(rs.getInt(1));
						order.setOrderName(rs.getString(2));
						order.setTotalPrice(rs.getDouble(3));
						order.setDate(rs.getString(4));
					}
				}
			}
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return order;
	}

	@Override
	public List<Orders> ShowOrder() {
		List<Orders> li=new ArrayList<Orders>();
		try {
			con=Db_utility.getConnect();
			sql="select * from Orders";
			ps=con.prepareStatement(sql);
			rs=ps.executeQuery();
			
			while(rs.next()) {
				Orders orders=new Orders();
				orders.setOrderId(rs.getInt(1));
				orders.setOrderName(rs.getString(2));
				orders.setTotalPrice(rs.getDouble(3));
				orders.setDate(rs.getString(4));
				
				li.add(orders);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return li;
	}

}
