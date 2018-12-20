package com.example.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dao.MemberDao;
import com.example.vo.MemberVO;

@Service("memberService")
public class MemberServiceImpl implements MemberService {
	@Autowired
	MemberDao memberDao;

	@Override
	public MemberVO selectMember(String userid) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<MemberVO> select() {
		return this.memberDao.readAll();
	}

}
