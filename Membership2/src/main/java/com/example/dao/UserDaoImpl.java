package com.example.dao;

import java.io.IOException;
import java.io.Reader;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.springframework.stereotype.Repository;

import com.example.vo.UserVO;

@Repository("userDao")
public class UserDaoImpl implements UserDao {

	@Override
	public int create(UserVO user) {
		Reader rd = null;
		SqlSession session = null;
		int row = -1;
		try {
			rd = Resources.getResourceAsReader("mybatis-config.xml");
			session = new SqlSessionFactoryBuilder().build(rd).openSession();
			row = session.insert("insert", user);
			session.commit();
		}catch(IOException ex) {
			System.out.println(ex);
		}
		return row;
	}

	@Override
	public UserVO read(String userid) {
		Reader rd = null;
		SqlSession session = null;
		UserVO user = null;
		try {
			rd = Resources.getResourceAsReader("mybatis-config.xml");
			session = new SqlSessionFactoryBuilder().build(rd).openSession();
			user = (UserVO)session.selectOne("read", userid);
		} catch (IOException e) {
			System.out.println(e);
		}
		return user;
	}

	@Override
	public List<UserVO> readAll() {
		Reader rd = null;
		SqlSession session = null;
		List<UserVO> list = null;
		try {
			rd = Resources.getResourceAsReader("mybatis-config.xml");
			session = new SqlSessionFactoryBuilder().build(rd).openSession();
			list = session.selectList("readAll");
		} catch (IOException e) {
			System.out.println(e);
		}
		return list;
	}

	@Override
	public int update(UserVO user) { 
		Reader rd = null;
		SqlSession session = null;
		int row = -1;
		try {
			rd = Resources.getResourceAsReader("mybatis-config.xml");
			session = new SqlSessionFactoryBuilder().build(rd).openSession();
			row = session.update("update", user);
			session.commit();
		}catch(IOException ex) {
			System.out.println(ex);
			session.rollback();
		}
		return row;
	}

	@Override
	public void delete(String userid) {
		Reader rd = null;
		SqlSession session = null;
		try {
			rd = Resources.getResourceAsReader("mybatis-config.xml");
			session = new SqlSessionFactoryBuilder().build(rd).openSession();
			session.delete("delete", userid);
			session.commit();
		}catch(IOException ex) {
			System.out.println(ex);
			session.rollback();
		}
	}

}
