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



@WebServlet(description = "SignIn", urlPatterns = { "/LoginServlet" })

public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
     private String name;
     private String pass;
     private Long cont;
     private String email;
     
    public String msg="";
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
            		   name=request.getParameter("username");
            		   email=request.getParameter("email");
            		   pass=request.getParameter("pass");
		              cont=Long.parseLong(request.getParameter("con"));
		
		              PrintWriter out = response.getWriter();
		              
		              UserFields fields = new UserFields();
		              fields.setName(name);
		              fields.setEmail(email);
		              fields.setPassword(pass);
		              fields.setContact(cont);
		              
		              UserDao dbj= new DaoImpl();
		              
		              int st= dbj.register(fields);
		              
		              if(st>0) {
		            	 RequestDispatcher  rd= request.getRequestDispatcher("/index.html");
		            	   rd.forward(request, response);
		            	 
		              }
		              else {
		            	 out.print("Something went wrong");
		              }		 
	   
		               
	}
                  
	   
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response ) throws ServletException, IOException {
	      response.setContentType("text/html");
	      
	    
		String n= request.getParameter("username");
		String p= request.getParameter("password");
		
		
		
		UserFields pojo=new  UserFields();
		pojo.setName(n);
		pojo.setPassword(p);
	
		DaoImpl obj = new DaoImpl();
		
		boolean b1=obj.login(pojo);
		     if(b1==true) 
		     {
		    	 HttpSession ss= request.getSession();
		    	 ss.setAttribute("ky" ,n);
		    	 RequestDispatcher  rd= request.getRequestDispatcher("/Welcome.jsp");
          	   rd.forward(request, response);
		     }else
		     {
		    	 response.getWriter().println("Wrong Details");
		    	 RequestDispatcher  rd= request.getRequestDispatcher("/index.html");
	          	   rd.include(request, response);
		     }
		     
		
	}

}
 