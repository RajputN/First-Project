package com.example.product;

import java.util.List;

public interface ProductDao {
   public int add(Product obj);
   public int delete (int id );
   public int update(Product p);
   public List<Product> getProduct();
}
