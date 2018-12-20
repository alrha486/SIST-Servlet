package com.example.dao;

import java.util.Map;

import com.example.vo.EmployeeVO;

public interface EmployeeDao {
	void create(EmployeeVO empVo);
	void read(Map map);
	void readByLoc(Map map);
	void readAll(Map map);
	void update(EmployeeVO empVo);
	void delete(int empno);
}
