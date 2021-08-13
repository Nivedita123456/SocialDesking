package com.demo.service;

import java.util.List;

import com.demo.bean.Office;

public interface OfficeService {
List<Office> getAllOffice();

Office getByName(String name);
}
