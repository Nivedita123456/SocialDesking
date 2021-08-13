package com.demo.service;

import java.util.List;
import java.util.Optional;

import com.demo.bean.Product;

public interface ProductService {

	void addProduct(Product p);

	List<Product> getAllProduct();

	Optional<Product> getProductById(int id);

	void deleteProductById(int id);

	int updateProductById(Product p);

}
