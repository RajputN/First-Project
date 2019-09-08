package com.example.product;

import java.util.List;

public interface ProductDao {
   public int add(Product obj);
   public int delete (Product obj1);
   public List<Product> update();
   public List<Product> getProduct();
}
