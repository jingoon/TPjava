package com.naver;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class MenuDAO {
	private static final String DRIVER = "oracle.jdbc.OracleDriver";
	private static final String URL ="jdbc:oracle:thin:@localhost:1521:xe";
	private static final String USER = "ezen";
	private static final String PASSWORD = "ezen";
	
	public MenuDAO() {
		try {
			Class.forName(DRIVER);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}	
	}
	
	public List<String> select() {
		List<String> list = new ArrayList<String>();
		Connection conn = null;
		PreparedStatement pstmt = null;
		String sql="select * from menu";
		ResultSet rs=null;
		try {
			conn=DriverManager.getConnection(URL, USER, PASSWORD);
			pstmt =conn.prepareStatement(sql);
			
			rs=pstmt.executeQuery();
			while(rs.next()) {
				String fullname=rs.getString(1);
				list.add(fullname);
			}
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if (rs != null) {
					rs.close();
				}
				if (pstmt != null) {
					pstmt.close();
				}
				if (conn != null) {
					conn.close();
				}
				
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		
		
		return list;
				
	}
}
