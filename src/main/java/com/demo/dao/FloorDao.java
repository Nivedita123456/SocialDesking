package com.demo.dao;

import java.util.List;

import org.jboss.logging.Param;
import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.EntityGraph.EntityGraphType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.demo.bean.Floor;
import com.demo.bean.Office;
import com.demo.bean.Product;

@Repository
public interface FloorDao extends JpaRepository<Floor,String>{
	 
	
	
   

public List<Floor> findByOfficeId(String officeId);
	
	   
}
