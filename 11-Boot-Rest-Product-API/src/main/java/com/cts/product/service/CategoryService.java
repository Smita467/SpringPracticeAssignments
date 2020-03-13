package com.cts.product.service;

import java.util.Optional;

import com.cts.product.entity.Category;

public interface CategoryService {
	
	Optional<Category> FindById(int CatId);

}
