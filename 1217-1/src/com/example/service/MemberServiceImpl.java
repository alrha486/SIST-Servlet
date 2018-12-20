package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dao.MemberDao;
import com.example.vo.MemberVO;

@Service("memberService")
public class MemberServiceImpl implements MemberService {
	@Autowired
	MemberDao memberDao;
	
	@Override
	public int create(MemberVO memberVo) {
		return this.memberDao.create(memberVo);
	}

	@Override
	public MemberVO read(String userid) {
		return this.memberDao.read(userid);
	}

	@Override
	public List<MemberVO> readAll() {
		return this.memberDao.readAll();
	}

	@Override
	public int update(MemberVO memberVo) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(String userid) {
		// TODO Auto-generated method stub
		return 0;
	}

}
