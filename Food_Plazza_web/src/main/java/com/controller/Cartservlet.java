package com.controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.util.List;

import com.foodplaza.dao.CartDaoImplementation;
import com.foodplaza.pojo.Cart;

@WebServlet("/cart")
public class Cartservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       CartDaoImplementation cd=new CartDaoImplementation();
    

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("type/html");
	    HttpSession session=request.getSession();
	    String action=request.getParameter("action");
	    String email=(String) session.getAttribute("uEmail");
	    if(action!=null && action.equals("delete")){
	    	int cid = Integer.parseInt(request.getParameter("cartid"));
		   	
		   	boolean b= cd.deleteCart(cid);
		   	if(b) {
		   		response.sendRedirect("cart");
		   	}
		   	else {
		   		response.sendRedirect("failed.jsp");
		   	}
	 }
	    else {
	    	String aemail=(String)session.getAttribute("aEmail");
	    	String uemail=(String)session.getAttribute("uEmail");
	    	
	    	if(aemail==null && uemail!=null) {
	    		List<Cart> list=cd.showCart(email);
		    	if(list!=null && !list.isEmpty()) {
		    		session.setAttribute("cartlist", list);
		    		response.sendRedirect("cartlist.jsp");
		    	}
		    	else {
		    		response.sendRedirect("failed.jsp");
		    	}
	    	}else {
	    		response.sendRedirect("login.jsp");
	    	}
	    }

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("type/html");
		String action = request.getParameter("action");
		
		
		if(action!=null && action.equals("AddToCart")) {
			int cid= Integer.parseInt(request.getParameter("FoodId"));
			String cname=request.getParameter("FoodName");
			String cemail =request.getParameter("EmailId");
			int cquantity=Integer.parseInt(request.getParameter("Quentity"));
			Float cprice=Float.parseFloat(request.getParameter("FoodPrice"));
			Float tprice=Float.parseFloat(request.getParameter("TotalPrice"));
			
			boolean b= cd.addtoCart(new Cart(cid,cemail,cname,cprice,cquantity,tprice));
			if(b) {
				response.sendRedirect("success.jsp");
			}
			else {
				response.sendRedirect("failed.jsp");
			}
		}

	
	}

}
