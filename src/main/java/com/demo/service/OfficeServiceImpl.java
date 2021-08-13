package com.demo.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.bean.Office;
import com.demo.dao.OfficeDao;
@Service
@Transactional
public class OfficeServiceImpl implements OfficeService{
@Autowired
OfficeDao officeDao;
	@Override
	public List<Office> getAllOffice() {
		return  officeDao.findAll();
	}
	@Override
	public Office getByName(String name) {
		return officeDao.findByName(name);
	}

}
