package com.example.project;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.websocket.Session;

@WebServlet(description = "Updating", urlPatterns = { "/UpdateServlet" })
public class UpdateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		         String name=request.getParameter("username");
		         String email= request.getParameter("email");
		         String pass= request.getParameter("pass");
		         Long  conn=Long.parseLong(request.getParameter("con"));
		         
		         
		         UserFields ob1= new UserFields();
		         ob1.setName(name);
		         ob1.setEmail(email);
		         ob1.setPassword(pass);
		         ob1.setContact(conn);
		         
		         UserDao ud= new DaoImpl();
		         int val=ud.update(ob1);
		         
		         if( val>0)   {
		        	 String msg="Details are updated Successfully!!!!";
		        	    request.setAttribute("key", msg);
		        	    
		        	    
		        			 
		        	 RequestDispatcher rq= request.getRequestDispatcher("/index.html");
		        	 rq.forward(request, response);
		          }
		         else {
		         PrintWriter out= response.getWriter();
		           out.print("Something went wrong");
		         }
		         
	}

}
