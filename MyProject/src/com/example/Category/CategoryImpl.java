package com.example.Category;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import com.example.project.ConnectionProvider;



public class CategoryImpl implements  CategoryDao {
	private Connection con;
	private PreparedStatement ps;
	private int res;
   
	@Override
	public int add(Category obj) {
       
       try {
    	con =ConnectionProvider.getConnection(); 
		ps=con.prepareStatement("insert into category where (?,?)");
		ps.setInt(1, obj.getCategoryid());
		ps.setString(2, obj.getCategoryname() );
		
		res=ps.executeUpdate();
	
	} catch (SQLException e) {
		
		e.printStackTrace();
	}
       
		return res;
	}

	@Override
	public int delete(int obj) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<Category> getAll() {
		// TODO Auto-generated method stub
		return null;
	}
              
}
