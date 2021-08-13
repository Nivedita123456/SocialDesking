package com.demo.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.demo.bean.Location;
import com.demo.bean.Product;

@Repository
public interface LocationDao extends JpaRepository<Location,Integer>{

	List<Location> findByName(String name);
	
}
