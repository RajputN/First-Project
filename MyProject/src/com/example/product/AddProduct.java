package com.example.product;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(description = "Adding Products", urlPatterns = { "/AddProduct" })
public class AddProduct extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private int id;
	private String name;
	private String url;
   private int category;
   private String description;
   private int price;
  private int  quantity;
		protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		   
			id=Integer.parseInt(request.getParameter("pid"));
			name=request.getParameter("pname");
			url= request.getParameter("url");
			category=Integer.parseInt( request.getParameter("cate"));
			description= request.getParameter("des");
			price=Integer.parseInt(request.getParameter("price")) ;
		 quantity= Integer.parseInt(request.getParameter("quant"));
		 
		   Product pod= new Product();
		   pod.setId(id);
		   pod.setName(name);
		   pod.setUrl("Images\\ProductImg\\"+url);
		   pod.setCategoryid(category);
		   pod.setDesciption(description);
		   pod.setPrice(price);
		   pod.setQuantity(quantity);
		   ProductDao pdao=new ProductDaoImpl();
		   if(pdao.add(pod)==1)
		   {
            RequestDispatcher rd= request.getRequestDispatcher("GetProductsServlet");
		     rd.forward(request, response);
		   }
		   else
		   {
			    RequestDispatcher rd= request.getRequestDispatcher("/AddProduct.jsp") ;
			     rd.forward(request, response);
		   }
	}

}
