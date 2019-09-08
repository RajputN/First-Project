package com.example.project;

import java.sql.*;

public class ConnectionProvider {
	   static Connection con=null;
	    public static  Connection getConnection() {
	    	  try{
	    		       Class.forName("org.h2.Driver");
	    		          con=DriverManager.getConnection("jdbc:h2:tcp://localhost/~/test","sa","project");
	    	  }catch(Exception  e) {
	    		  e.printStackTrace();  
	    	  }
                 return con;
	    }
	    
   } 	  
	    	
	    


