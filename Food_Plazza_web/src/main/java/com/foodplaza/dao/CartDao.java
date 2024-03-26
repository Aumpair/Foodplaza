package com.foodplaza.dao;

import java.util.List;

import com.foodplaza.pojo.Cart;

public interface CartDao {
	boolean addtoCart(Cart cart);
	boolean deleteCart(int cartId);
	List<Cart> showCart(String emailId);
	Boolean clearCart(String emailId);
}
