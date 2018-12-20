package com.example.dao;

import java.util.List;

import com.example.vo.UserVO;

public interface UserDao {
	int create(UserVO user);
	UserVO read(String userid);
	List<UserVO> readAll();
	int update(UserVO user);
	void delete(String userid);
}
