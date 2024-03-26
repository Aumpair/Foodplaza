package com.controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.io.PrintWriter;

import com.foodplaza.dao.CartDaoImplementation;
import com.foodplaza.dao.OrderDaoImplementation;
import com.foodplaza.pojo.Orders;

@WebServlet("/order")
public class Orderservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    OrderDaoImplementation od=new OrderDaoImplementation();
    CartDaoImplementation cd=new CartDaoImplementation();

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session =request.getSession();
		String action=request.getParameter("action");
		
		if( action!=null && action.equals("placeOrder")) {
		String email=(String)session.getAttribute("uEmail");
		Orders o=od.PlacedOrder(email);
			if(o!=null) {
				boolean b=cd.clearCart(email);
				if(b) {
					session.setAttribute("order", o);
					request.getRequestDispatcher("Bill.jsp").forward(request, response);
				}
			}
			else {
				response.sendRedirect("failed.jsp");
			}
		}
	}
}
