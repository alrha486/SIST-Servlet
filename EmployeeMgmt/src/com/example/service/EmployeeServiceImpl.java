package com.example.service;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dao.EmployeeDao;
import com.example.vo.EmployeeVO;

@Service("empService")
public class EmployeeServiceImpl implements EmployeeService{
	@Autowired
	EmployeeDao empDao;
	
	@Override
	public void create(EmployeeVO empVo) {
		// TODO Auto-generated method stub

	}

	@Override
	public void read(Map map) {
		this.empDao.read(map);
	}

	@Override
	public void readAll(Map map) {
		this.empDao.readAll(map);
	}

	@Override
	public void update(EmployeeVO empVo) {
		
	}

	@Override
	public void delete(int empno) {
		// TODO Auto-generated method stub

	}

	@Override
	public void readByLoc(Map map) {
		this.empDao.readByLoc(map);
	}

}
