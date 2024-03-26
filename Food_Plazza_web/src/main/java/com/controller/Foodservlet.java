package com.controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.util.List;

import com.foodplaza.dao.FoodDaoImplementation;
import com.foodplaza.pojo.Food;
import com.mysql.cj.Session;

/**
 * Servlet implementation class Foodservlet
 */
@WebServlet("/food")
public class Foodservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
     
    FoodDaoImplementation fd=new FoodDaoImplementation();

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("type/html");
		HttpSession session=request.getSession();
		String action=request.getParameter("action");
		if(action !=null && action.equals("delete")) {
			int fid=Integer.parseInt(request.getParameter("foodId"));

			boolean b=fd.deleteFoodById(fid);
			if(b) {
				response.sendRedirect("food");
			}else {
				response.sendRedirect("failed.jsp");
			}
		}else {
			List<Food> list=fd.getAllFood();
			if(list!=null && !list.isEmpty()) {
				session.setAttribute("foodlist", list);
				response.sendRedirect("foodlist.jsp");
			}else {
				response.sendRedirect("failed.jsp");
			}
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("type/html");
		HttpSession session=request.getSession();
		String action=request.getParameter("action");
		String FoodName=request.getParameter("FoodName");
		String FoodCategory=request.getParameter("FoodCategory");
		String FoodType =request.getParameter("FoodType");
		Float FoodPrice=(Float)Float.parseFloat(request.getParameter("FoodPrice"));
		
		if(action!=null && action.equals("Addfood")) {
			boolean b=fd.addFood(new Food(FoodName, FoodCategory, FoodType, FoodPrice));
			if(b) {
				response.sendRedirect("success.jsp");
			}else {
				response.sendRedirect("failed.jsp");
			}
		}
		
		if(action!=null && action.equals("UpdateFood")) {
			int fid=Integer.parseInt(request.getParameter("FoodId"));
			Food f=new Food(FoodName, FoodCategory, FoodType, FoodPrice);
				f.setFoodId(fid);
				boolean b=fd.updateFoodById(f);
				if(b) {
					response.sendRedirect("success.jsp");
				}else {
					response.sendRedirect("failed.jsp");
				}
		}
	}

}
