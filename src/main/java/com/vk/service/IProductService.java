package com.vk.service;

import java.util.List;

import com.vk.model.Product;

public interface IProductService {
	
	Integer saveProduct(Product p);
	
	Integer updateProduct(Product p);
	
	void deleteProduct(Integer id);
	
	Product getOneProduct(Integer id);
	
	List<Product> getAll();

	void updateProduct();


}
