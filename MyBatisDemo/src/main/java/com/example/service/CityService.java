package com.example.service;

import java.util.List;
import java.util.Map;

import com.example.vo.CityVO;

public interface CityService {
	CityVO read(String name);
	List<CityVO> readAll();
}
