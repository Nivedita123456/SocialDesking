package com.demo.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.bean.Location;
import com.demo.dao.LocationDao;

@Service
@Transactional
public class LocationServiceImpl implements LocationService{
@Autowired
LocationDao locationDao;
	@Override
	public List<Location> getAllLocation() {
		return locationDao.findAll();
	}
	@Override
	public List<Location> getByName(String name) {
		return locationDao.findByName(name);
	}

}
