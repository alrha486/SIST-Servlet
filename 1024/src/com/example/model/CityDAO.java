package com.example.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;

public class CityDAO {
	public static Vector<CityVO> select(String countryCode) throws SQLException{
		Connection conn = DBConnection.getConnection();
		StringBuffer sb = new StringBuffer("SELECT id,name,countrycode, ");
		sb.append("district, population FROM city WHERE countrycode = ?");
		PreparedStatement pstmt = conn.prepareStatement(sb.toString());
		pstmt.setString(1, countryCode);
		ResultSet rs = pstmt.executeQuery();
		Vector<CityVO> vector = new Vector<CityVO>(1,1);
		while(rs.next()) {
			CityVO city = new CityVO(rs.getInt("id"), rs.getString("name"), 
					                 rs.getString("countrycode"), rs.getString("district"),
					                 rs.getInt("population"));
			vector.addElement(city);
		}
		DBClose.close(conn);
		return vector;
	}
}





