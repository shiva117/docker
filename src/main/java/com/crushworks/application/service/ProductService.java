package com.crushworks.application.service;

import com.crushworks.application.domain.Product;

public interface ProductService {
	
	Iterable<Product> listAllProducts();

	Product getProductById(Integer id);

	Product saveProduct(Product product);
}
