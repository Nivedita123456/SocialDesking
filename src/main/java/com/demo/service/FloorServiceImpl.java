package com.demo.service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.bean.Floor;
import com.demo.bean.Office;
import com.demo.dao.FloorDao;
@Service
@Transactional
public class FloorServiceImpl implements FloorService{
@Autowired
FloorDao floorDao;


@Override
public List<Floor> getFloorById(String id){
	return floorDao.findByOfficeId(id);
}
}
