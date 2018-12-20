package com.example.dao;

import java.util.List;

import com.example.vo.MemberVO;

public interface MemberDao {
	MemberVO read(String userid);
	List<MemberVO> readAll();
}
