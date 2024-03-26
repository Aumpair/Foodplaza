package com.controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.util.List;

import com.foodplaza.dao.CustomerDaoImplementation;
import com.foodplaza.pojo.Customer;

/**
 * Servlet implementation class Customerservlert
 */
@WebServlet("/customer")
public class Customerservlert extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
	CustomerDaoImplementation cd=new CustomerDaoImplementation();
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("type/html");
		HttpSession session=request.getSession();	
		String action=request.getParameter("action");
		if(action !=null && action.equals("delete")) {
			String cemailid=request.getParameter("email");
			
			boolean b=cd.DeleteCustomerByEmailId(cemailid);
			if(b) {
				response.sendRedirect("customer");
			}else {
				response.sendRedirect("failed.jsp");
			}
		}else {
			String aemail=(String)session.getAttribute("aEmail");
			String uemail=(String)session.getAttribute("uEmail");
			List<Customer> list=cd.getAllCustomer();
			if (aemail!=null && uemail==null) {
				if(list!=null && !list.isEmpty() ) {
					session.setAttribute("customerlist", list);
					response.sendRedirect("customerlist.jsp");
				}else {
					response.sendRedirect("failed.jsp");
				}
			}else {
				response.sendRedirect("login.jsp");
			}
		}
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("type/html");
		String action=request.getParameter("action");
		String CustomerName=request.getParameter("CustomerName");
		String CustomerEmailID=request.getParameter("CustomerEmailID");
	//	String Password=request.getParameter("Password");
		String ConfirmPassword=request.getParameter("ConfirmPassword");
		String CustomerAddress=request.getParameter("CustomerAddress");
		int CustomerContactNo=Integer.parseInt(request.getParameter("CustomerContactNo"));
		
		if(action!=null && action.equals("Addcustomer")) {
			boolean b=cd.addCustomer(new Customer(CustomerName, CustomerEmailID, ConfirmPassword, CustomerAddress, CustomerContactNo));
			if(b) {
				response.sendRedirect("success.jsp");
			}else {
				response.sendRedirect("failed.jsp");
			}
		}
		if(action!=null && action.equals("Updatecustomer")) {
//			String cemailid=request.getParameter("email");
			Customer c=new Customer(CustomerName, CustomerEmailID, ConfirmPassword, CustomerAddress, CustomerContactNo);
//			c.setCustomerEmailID(cemailid);
			boolean b=cd.updateCustomerByEmailId(c);
			if(b) {
				response.sendRedirect("success.jsp");
			}else {
				response.sendRedirect("failed.jsp");
			}
		}
	}

}
