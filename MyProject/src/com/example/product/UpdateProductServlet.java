package com.example.product;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class UpdateProductServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	                    int id=Integer.parseInt(request.getParameter("pid"));
	                    String name= request.getParameter("pname");
	                    String url= request.getParameter("url");
	                    int categoryid=Integer.parseInt(request.getParameter("cate")) ;
	                    String description= request.getParameter("des");
	                    int price= Integer.parseInt(request.getParameter("price"));
	                    int quantity= Integer.parseInt(request.getParameter("quant"));
	                    
	                    Product pod= new Product();
	                    pod.setId(id);
	                    pod.setName(name);
	                    pod.setUrl(url);
	                    pod.setCategoryid(categoryid);
	                    pod.setDesciption(description);
	                    pod.setPrice(price);
	                    pod.setQuantity(quantity);
	                    
	                    
	}

}
