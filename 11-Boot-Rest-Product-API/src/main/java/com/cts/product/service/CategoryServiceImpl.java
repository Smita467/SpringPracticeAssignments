package com.cts.product.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cts.product.dao.CategoryDao;
import com.cts.product.entity.Category;

@Service
public class CategoryServiceImpl implements CategoryService {

	
	@Autowired
	private CategoryDao catDao;
	
	@Override
	public Optional<Category> FindById(int id) {
		// TODO Auto-generated method stub
		return catDao.findById(id);
	}
	

}
