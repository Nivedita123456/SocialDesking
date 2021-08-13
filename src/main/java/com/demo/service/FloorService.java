package com.demo.service;

import java.util.List;
import java.util.Optional;

import com.demo.bean.Floor;
import com.demo.bean.Office;

public interface FloorService {

	//Optional<Floor> getById(String id);
List<Floor> getFloorById(String id);
}
