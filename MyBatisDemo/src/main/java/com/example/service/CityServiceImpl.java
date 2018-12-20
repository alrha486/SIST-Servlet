package com.example.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dao.CityDao;
import com.example.vo.CityVO;

@Service("cityService")
public class CityServiceImpl implements CityService {
	@Autowired
	CityDao cityDao;
	
	@Override
	public CityVO read(String name) {
		return this.cityDao.read(name);
	}

	@Override
	public List<CityVO> readAll() {
		return this.cityDao.readAll();
	}
}
