package com.example.project;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class DaoImpl  implements UserDao {
   private Connection con;
   private PreparedStatement ps;
   private String insertquery="insert into Customer values(?,?,?,?)";
   int res;
   boolean b=false;
   private List<UserFields> list;
	
	
	@Override
	public int register(UserFields obj) {
		
		try {
      con=ConnectionProvider.getConnection();		
	 ps=con.prepareStatement(insertquery);
	ps.setString(1,obj.getName());
	ps.setString(2, obj.getPassword());
	ps.setLong(3, obj.getContact());
	ps.setString(4,obj.getEmail());
	
			 	 res=ps.executeUpdate();
		}catch(Exception e) {
			System.out.println(e);
			System.out.println("Error in Dao");
		}
	    	return res;
	}


	@Override
	public boolean login(UserFields obj) {
	       try {
	    	   con=ConnectionProvider.getConnection();		 
			ps=con.prepareStatement("select * from customer where uname=? and pass=?");
		
			ps.setString(1, obj.getName());
			ps.setString(2,obj.getPassword());
			
		 ResultSet rs= ps.executeQuery();	  
	       if( rs.next())
	       {
	    	   b=true;
	        }
		} catch (SQLException e) {
				e.printStackTrace();
		}
            return b;
	}

	@Override
	public int update(UserFields obj1) {
	        	int res=0;
		try {
		      con=ConnectionProvider.getConnection();		
			 ps=con.prepareStatement("Update Customer  set  pass=?, contact=?, email=? where uname=?");
			ps.setString(1,obj1.getPassword());
			ps.setLong(2, obj1.getContact());
			ps.setString(3, obj1.getEmail());
			ps.setString(4,obj1.getName());
			
					res=ps.executeUpdate();
				}catch(Exception e) {
					System.out.println(e);
					
				}
			    return res;
	}


	@Override
	public int delete(String username) {
		int res=0;
		try {
			con=ConnectionProvider.getConnection();
			ps=con.prepareStatement("Delete from Customer where uname=?");
			System.out.print(username);
			ps.setString(1, username);
			
			res=ps.executeUpdate();
			} catch (SQLException e) {
		      e.printStackTrace();
		}
		return res;
		}


	@Override
	public List<UserFields> getAll() {
	       
	       try {
	    	   list=new ArrayList<UserFields>();
	    	   con=ConnectionProvider.getConnection();
			ps=con.prepareStatement("Select * from Customer ");
			ResultSet rs= ps.executeQuery();
			while(rs.next()) {
                      UserFields uf= new UserFields();
                      uf.setName(rs.getString(1));
                      uf.setPassword(rs.getString(2));
                      uf.setContact(rs.getLong(3));
                      uf.setEmail(rs.getString(4));
                      
                      list.add(uf);
                      
                      
			}
		} catch (SQLException e) {
		
			e.printStackTrace();
		}
		return list ;
	}


	

	

	

	
	

	
	}

