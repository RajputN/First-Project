package com.example.Category;

import java.util.List;

public interface CategoryDao {
	       public int add(Category obj);
	       public int delete(int obj);
	       public List<Category> getAll();
	      

}
