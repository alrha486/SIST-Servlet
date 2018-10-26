package com.example.libs.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;

public class SawonDAO {
	public static int insert(SawonDTO sawon) throws SQLException{
		Connection conn = DBConnection.getConnection();
		String sql = "INSERT INTO Sawon VALUES(?,?,?,?,?,?)";
		PreparedStatement pstmt = conn.prepareStatement(sql);
		pstmt.setString(1, sawon.getSabun());
		pstmt.setInt(2, sawon.getHobong());
		pstmt.setInt(3, sawon.getNtime());
		pstmt.setInt(4, sawon.getFamily());
		int row = pstmt.executeUpdate();
		DBClose.close(conn);
		return row;
	}
	
	public static Vector<SawonDTO> selectAll() throws SQLException{
		Connection conn = DBConnection.getConnection();
		Statement stmt = conn.createStatement();
		String sql = "SELECT sabun, buseo, gibon, jikmu, nsudang, fsudang, total, so, sil FROM Sawon " +
		                  "ORDER BY sil DESC";
		ResultSet rs = stmt.executeQuery(sql);
		Vector<SawonDTO> vector = new Vector<SawonDTO>(1,1);
		if(!rs.next()) {  //학생 데이터가 한 개도 없다면
			vector = null;
		}else {   //한 명이라도 있다면
			do {
				SawonDTO s = new SawonDTO(rs.getString("sabun"), 
						rs.getString("buseo"), rs.getInt("gibon"), rs.getInt("jikmu"),
						rs.getInt("nsudang"), rs.getInt("fsudang"), rs.getInt("total")
						, rs.getInt("so"), rs.getInt("sil"));
				vector.addElement(s);
			}while(rs.next());
		}
		DBClose.close(conn);
		return vector;
	}
	
	
	
	
	
}
