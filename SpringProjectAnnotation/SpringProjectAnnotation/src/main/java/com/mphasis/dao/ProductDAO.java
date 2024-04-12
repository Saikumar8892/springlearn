package com.mphasis.dao;

import java.util.List;

import com.mphasis.domain.Product;

public interface ProductDAO {
	
 public int insert(Product product);
 public int update(Product product);
 public List<Product> getAllProducts();
 public int delete(int id);
 public Product getProductById(int id);
}
