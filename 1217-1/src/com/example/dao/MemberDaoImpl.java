package com.example.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.vo.MemberVO;

@Repository("memberDao")
public class MemberDaoImpl implements MemberDao {
	@Autowired
	SqlSession sqlSession;

	@Override
	public int create(MemberVO memberVo) {
		return this.sqlSession.insert("Member.insert", memberVo);
	}

	@Override
	public MemberVO read(String userid) {
		return this.sqlSession.selectOne("Member.selectOne", userid);
	}

	@Override
	public List<MemberVO> readAll() {
		return this.sqlSession.selectList("Member.selectAll");
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
