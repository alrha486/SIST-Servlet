package com.example.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.example.vo.MemberVO;

@Repository("memberDao")
public class MemberDaoImpl implements MemberDao {
	@Autowired
	JdbcTemplate jdbcTemplate;

	@Override
	public MemberVO read(String userid) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<MemberVO> readAll() {
		return this.jdbcTemplate.query(
				"SELECT * FROM Member ORDER BY userid DESC", 
			new RowMapper<MemberVO>() {
				@Override
				public MemberVO mapRow(ResultSet rs, int rowNum) throws SQLException {
					MemberVO memberVo = new MemberVO();
					memberVo.setUserid(rs.getString("userid"));
					memberVo.setName(rs.getString("name"));
					memberVo.setAge(rs.getInt("age"));
					memberVo.setGender(rs.getString("gender"));
					memberVo.setCity(rs.getString("city"));
					return memberVo;
				}
			}
		);
	}
}
