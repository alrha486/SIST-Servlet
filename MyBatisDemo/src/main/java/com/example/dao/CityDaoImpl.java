package com.example.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.vo.CityVO;

@Repository("cityDao")
public class CityDaoImpl implements CityDao {
	@Autowired
	SqlSession sqlSession;
	
	@Override
	public CityVO read(String name) {
		return (CityVO)this.sqlSession.selectOne("City.selectOne", name);
	}

	@Override
	public List<CityVO> readAll() {
		return this.sqlSession.selectList("City.selectAll");
	}

}
