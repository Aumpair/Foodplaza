package com.foodplaza.dao;

import java.util.List;

import com.foodplaza.pojo.Orders;

//import com.mysql.cj.x.protobuf.MysqlxCrud.Order;

public interface OrderDao {
	Orders PlacedOrder(String emailId);
	List<Orders> ShowOrder();
}
