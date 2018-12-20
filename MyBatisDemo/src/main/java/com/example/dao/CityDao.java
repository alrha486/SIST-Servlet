package com.example.dao;

import java.util.List;
import java.util.Map;

import com.example.vo.CityVO;

public interface CityDao {
	CityVO read(String name);
	List<CityVO> readAll();
}
