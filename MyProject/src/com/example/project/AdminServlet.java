package com.example.project;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(description = "AdminLogin", urlPatterns = { "/AdminServlet" })
public class AdminServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		                                  String name= request.getParameter("username");
		                                  String password= request.getParameter("password");
		                                  
		                               
		                                   
		                               if(name.equals("admin") && password.equals("admin12")){
		                            	   RequestDispatcher  rd= request.getRequestDispatcher("/AdminHome.jsp");
		                              	   rd.forward(request, response);
		                              	   
		                               }  else 
		                               {
		                            	   response.getWriter().print("Incorrect Name or Password");
		                            	   RequestDispatcher  rd= request.getRequestDispatcher("/admin.html");
		                              	   rd.forward(request, response);
		                               }
		                               
	}

}
