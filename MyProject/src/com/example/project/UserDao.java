package com.example.project;

import java.util.List;

public interface  UserDao {
	 public boolean  login(UserFields obj);
	 public  int  register( UserFields obj);
	 public int update(UserFields obj1);
	 public int delete(String  username);
	 public List <UserFields> getAll();
	 
       
		
	    

}
