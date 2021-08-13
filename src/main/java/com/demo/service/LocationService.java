package com.demo.service;

import java.util.List;

import com.demo.bean.Location;

public interface LocationService {
List<Location> getAllLocation();

List<Location> getByName(String name);
}
