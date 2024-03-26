package com.controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;

import com.foodplaza.dao.AdminDaoImplementation;

/**
 * Servlet implementation class Loginervlet
 */
@WebServlet("/login")
public class Loginervlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	AdminDaoImplementation ad=new AdminDaoImplementation();
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session=request.getSession();
		session.invalidate();
		response.sendRedirect("index.jsp");
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session=request.getSession();
		String type=request.getParameter("type");
		String email=request.getParameter("EmailID");
		String pass=request.getParameter("Password");
		String action=request.getParameter("action");
		
		if (action!=null && action.equals("login")) {
			if(type.equals("admin")) {
				boolean b=ad.adminLogin(email, pass);
				if(b) {
					session.setAttribute("aEmail", email);
					session.setAttribute("uEmail", null);
					response.sendRedirect("index.jsp");
				}else {
					response.sendRedirect("failed.jsp");
				}
			}
			if(type.equals("user")) {
				boolean b=ad.userLogin(email, pass);
				if(b) {
					session.setAttribute("uEmail", email);
					session.setAttribute("aEmail", null);
					response.sendRedirect("index.jsp");
				}else {
					response.sendRedirect("failed.jsp");
				}
			}
		}
		else if(action!=null && action.equals("ChangePassword")) {
			String npass=request.getParameter("cPassword");
			
			if(type.equals("admin")) {
				boolean b=ad.adminChangePassword(email, npass);
				if(b) {
					
					response.sendRedirect("success.jsp");
				}else {
					response.sendRedirect("failed.jsp");
				}
			}
			if(type.equals("user")) {
				boolean b=ad.userChangePassword(email, npass);
				if(b) {
					response.sendRedirect("success.jsp");
				}else {
					response.sendRedirect("failed.jsp");
				}
			}
		}
	}

}
