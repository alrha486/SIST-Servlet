package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dao.UserDao;
import com.example.vo.UserVO;

@Service("userService")
public class UserServiceImpl implements UserService {
	@Autowired
	UserDao userDao;
	
	@Override
	public int create(UserVO user) {
		return this.userDao.create(user);
	}

	@Override
	public UserVO read(String userid) {
		return this.userDao.read(userid);
	}

	@Override
	public List<UserVO> readAll() {
		return this.userDao.readAll();
	}

	@Override
	public int update(UserVO user) {
		return this.userDao.update(user);
	}

	@Override
	public void delete(String userid) {
		this.userDao.delete(userid);
	}

}
