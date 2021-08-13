package com.demo.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.demo.bean.Office;
import com.demo.bean.Product;

@Repository
public interface OfficeDao extends JpaRepository<Office,String>{

	Office findByName(String name);
	
}
