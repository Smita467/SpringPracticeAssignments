package com.cts.product.service;

import java.util.List;
import java.util.Optional;

import com.cts.product.entity.Category;
import com.cts.product.entity.Product;

public interface ProductService {

	List<Product> findAll();

	public List<Product> findProductByNameLike(String productName);

	Product saveProduct(Product product);
	
	Optional<Category> getCatById(int id);
	
	Category saveCat(Category cat);
	
	Product updateProduct(Product prod);
	
	Optional<Product> findById(int pId);

}