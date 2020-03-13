package com.cts.product.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.cts.product.entity.Category;
import com.cts.product.entity.Product;
import com.cts.product.service.CategoryService;
import com.cts.product.service.ProductService;

@RestController
@RequestMapping("/api/products/v1")
@CrossOrigin
public class ProductController {
	
	
	@Autowired
	private ProductService ps;
	
	@Autowired
	private CategoryService cs;
	
	
	@GetMapping
	public List<Product> findAll(){
		return ps.findAll();
	}
	
	
	@GetMapping("/{name}")
	public List<Product> findProductsByName(@PathVariable("name") String productName){
		return ps.findProductByNameLike("%"+productName+"%");
	}
	
	@PostMapping("/save")
	public Product saveProduct(@RequestBody Product product)
	{
		product.setCategory((ps.getCatById(product.getCategory().getCategoryId()).get()));
		return ps.saveProduct(product);
	}
	
	@PostMapping("/saveCat")
	public Category saveCat(@RequestBody Category cat)
	{
		return ps.saveCat(cat);
	}
	
	@PutMapping("/updateProduct/{productId}")
	public Product updateProduct(@PathVariable("productId") int pId, @RequestParam("categoryId") int catId)
	{
		Product prod=ps.findById(pId).get();
		prod.setCategory(cs.FindById(catId).get());
		return ps.updateProduct(prod);
	
	
	}

}
