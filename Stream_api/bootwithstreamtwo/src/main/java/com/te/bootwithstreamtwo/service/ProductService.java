package com.te.bootwithstreamtwo.service;

import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import com.te.bootwithstreamtwo.entity.Product;

public interface ProductService {
	
	public Product addProduct(Product product);
	

	public List<Product> productListwithDiscount(String category,Double percentage);
	
	public List<Product> categoryWithPrice(String category, Double price);
	
	public Optional<Product> getProductsLowest(String category);
	
	public DoubleSummaryStatistics obtainStatistics(String category);
	
	public Map<String, List<String>> listCategory();
	
	public Map<String, Optional<Product>> mostExpensive();
}
