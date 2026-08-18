package com.wipro.product.service;

import java.util.List;

import com.wipro.product.entity.Product;

public interface ProductService {
	
	Product addProduct(Product product);

    List<Product> findAllProduct();

    Product findProductById(Long id);

}
