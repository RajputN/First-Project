package com.example.product;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.example.project.ConnectionProvider;


public class ProductDaoImpl implements ProductDao {
	 private Connection con;
	   private PreparedStatement ps;
	   private String insertquery="insert into Product  values(?,?,?,?,?,?,?)";
	   int res;
	
	   private List<Product> list;
	@Override
	public int add(Product obj) {
		   
		    try {
		    	 con=ConnectionProvider.getConnection();
				ps=con.prepareStatement(insertquery);
				ps.setInt(1, obj.getId());
				ps.setString(2, obj.getName());
				ps.setString(3, obj.getUrl());
				ps.setInt(4, obj.getCategoryid());
				ps.setString(5,obj.getDescription());
				ps.setInt(6, obj.getPrice());
				ps.setInt(7, obj.getQuantity());
				
				res=ps.executeUpdate();
		} catch (SQLException e) {
				e.printStackTrace();
			}
		    return res;
	}
	
	
	
	
	
	@Override
	public int delete(Product obj1) {
		
		return 0;
	}
	
	
	
	
	@Override
	public List<Product> update() {
	 
	  try {
		  list= new ArrayList<Product>();
		  con=ConnectionProvider.getConnection();
		ps=con.prepareStatement("Select * from Product");
		  ResultSet res= ps.executeQuery();
		  while(res.next()) {
			  Product pod= new Product();
			  pod.setId(res.getInt(1));
			  pod.setName(res.getString(2));
              pod.setUrl(res.getString(3));
              pod.setCategoryid(res.getInt(4));
              pod.setDesciption(res.getString(5));
              pod.setPrice(res.getInt(6));
              pod.setQuantity(res.getInt(7));
			  
			list.add(pod);	
			}
	} catch (SQLException e) {
		
		e.printStackTrace();
	}
		return list;
	}

	
	
	
	@Override
	public List<Product> getProduct() {
		
      try {	
		  list=new ArrayList<Product>();
   	   con=ConnectionProvider.getConnection();
		ps=con.prepareStatement("Select * from Product ");
		ResultSet rs= ps.executeQuery();
		while(rs.next()) {
                 Product pd= new Product();
                 pd.setId(rs.getInt(1));
                 pd.setName(rs.getString(2));
                 pd.setUrl(rs.getString(3));
                 pd.setCategoryid(rs.getInt(4));
                 pd.setDesciption(rs.getString(5));
                 pd.setPrice(rs.getInt(6));
                 pd.setQuantity(rs.getInt(7));
               
                list.add(pd);
    }     
		}catch(Exception e)
      {
			e.printStackTrace();
      }
		    return list;
	}

}
