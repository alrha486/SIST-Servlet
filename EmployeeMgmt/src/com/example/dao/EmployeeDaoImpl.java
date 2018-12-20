package com.example.dao;

import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.vo.EmployeeVO;

@Repository("empDao")
public class EmployeeDaoImpl implements EmployeeDao {
	@Autowired
	SqlSession sqlSession;

	@Override
	public void create(EmployeeVO empVo) {
		// TODO Auto-generated method stub

	}

	@Override
	public void read(Map map) {
		this.sqlSession.selectOne("Employee.selectOne", map);
	}

	@Override
	public void readAll(Map map) {
		this.sqlSession.selectList("Employee.selectAll", map);
	}

	@Override
	public void update(EmployeeVO empVo) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(int empno) {
		// TODO Auto-generated method stub

	}

	@Override
	public void readByLoc(Map map) {
		this.sqlSession.selectList("Employee.selectByLoc", map);
	}

}
