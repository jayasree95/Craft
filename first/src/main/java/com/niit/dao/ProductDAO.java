package com.niit.dao;

import java.util.List;

import com.niit.model.Product;

public interface ProductDAO {
	public Product addProduct(Product product);
	public List<Product>getAllProduct();
	public void updateProduct(Product product);
	public void deleteProduct(int id);
	public Product selectProducts(int id);

}
