package com.controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.util.List;

import com.foodplaza.dao.FeedbackDaoImplementation;
import com.foodplaza.pojo.Feedback;
import com.mysql.cj.Session;

/**
 * Servlet implementation class Feedabackservlet
 */
@WebServlet("/feedback")
public class Feedabackservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       FeedbackDaoImplementation fd=new FeedbackDaoImplementation();
    
       protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
   		response.setContentType("type/html");
   		HttpSession session =request.getSession();
   	    List<Feedback> cl=fd.getAllFeedback();
   	    String aemail=(String)session.getAttribute("aEmail");
		String uemail=(String)session.getAttribute("uEmail");
		if(aemail!=null && uemail==null) {
			if(cl!=null && !cl.isEmpty()) {
	   	    	session.setAttribute("feedbacklist", cl);
	   	    	response.sendRedirect("feedbacklist.jsp");
	   	    }
	   	    else {
	   	    	response.sendRedirect("failed.jsp");
	   	    }
		}
   		
   	}

   	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
   		String action=request.getParameter("action");
   		if(action!=null && action.equals("Aaddfeedback")) {
   			String name=request.getParameter("FeedName");
   			String email =request.getParameter("FeedEmailID");
   			int ranks =Integer.parseInt(request.getParameter("FeedRank"));
   			String review =request.getParameter("FeedReview");
   			String suggestion=request.getParameter("FeedSuggestion");
   			
   			boolean b = fd.addfeedback(new Feedback(name, email, ranks, review, suggestion));
   			if(b) {
   				response.sendRedirect("success.jsp");
   			}
   			else {
   				response.sendRedirect("failed.jsp");
   			}
   		}
   	}
}
