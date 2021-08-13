package com.demo.service;

import java.util.List;
import java.util.Optional;
import java.util.Scanner;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.bean.Product;
import com.demo.dao.ProductDao;
import com.demo.excpetion.ResourceNotFoundException;

@Service
@Transactional
public class ProductServiceImpl implements ProductService{
	@Autowired
	ProductDao productDao;

	@Override
	public void addProduct(Product p) {
		
		productDao.save(p);
	}

	
	public List<Product> getAllProduct() {
		return productDao.findAll();
	}


	public Optional<Product> getProductById(int id) {
		Optional<Product> p=productDao.findById(id);
		if(p.isPresent()) {
		  System.out.println(p);
		}else {
			throw new ResourceNotFoundException("Product","pid",id);
		}
		return p.get();
	}


	public void deleteProductById(int id) {
		 productDao.deleteById(id);
		
	}

	
	public int updateProductById(Product p) {
		Optional<Product> p1=productDao.findById(p.getPid());
		if(p1.isPresent()) {
			p1.get().setPrice(p.getPrice());
			productDao.save(p1.get());
		}
		return 1;
	}


	
}
