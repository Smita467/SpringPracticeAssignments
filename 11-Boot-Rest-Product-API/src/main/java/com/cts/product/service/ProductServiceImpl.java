package com.cts.product.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cts.product.dao.CategoryDao;
import com.cts.product.dao.ProductDao;
import com.cts.product.entity.Category;
import com.cts.product.entity.Product;

@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
	private ProductDao prodDao;
	
	@Autowired
	private CategoryDao catDao; 

	@Override
	public List<Product> findAll() {
		return prodDao.findAll();
	}

	@Override
	public List<Product> findProductByNameLike(String productName) {
		// TODO Auto-generated method stub
		return prodDao.findProductByNameLike(productName);
	}

	@Override
	public Product saveProduct(Product prod) {
		
		return prodDao.save(prod);
		
	}

	@Override
	public Optional<Category> getCatById(int id) {
		// TODO Auto-generated method stub
		return catDao.findById(id);
	}

	@Override
	public Category saveCat(Category cat) {
		// TODO Auto-generated method stub
		return catDao.save(cat);
	}

	@Override
	public Product updateProduct(Product product) {
		// TODO Auto-generated method stub
		return prodDao.save(product);
	}

	@Override
	public Optional<Product> findById(int pId) {
		// TODO Auto-generated method stub
		return prodDao.findById(pId);
	}

	
	
		
	

}
