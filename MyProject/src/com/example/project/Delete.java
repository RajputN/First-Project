package com.example.project;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/Delete")
public class Delete extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	    ;
	       
	       HttpSession ss=request.getSession();
	         String nm=(String)ss.getAttribute("ky");
	       
	           
	       
	         
	         UserDao ud= new DaoImpl();
	         int val=ud.delete(nm);
	         
	         if( val>0)   {
	        	 PrintWriter out= response.getWriter();
	        	 out.println("Values are Successfully Deleted");
	         }
	         else {
	         RequestDispatcher rq= request.getRequestDispatcher("/UserSignUp.html");
	        	 rq.forward(request, response);
	 }
  }
}
