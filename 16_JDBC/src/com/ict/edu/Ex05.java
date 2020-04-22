package com.ict.edu;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Ex05 {
	public static void main(String[] args) {
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			
			String url ="jdbc:oracle:thin:@203.236.220.65:1521:xe";
			String user = "hr";
			String password = "1111";
			
			conn = DriverManager.getConnection(url,user, password);
			
			// 나이가 1000 살 이상이고 주소가 서울인 사람 삭제
			String sql = "delete from member where age >= 1000 and addr = '서울'";
			
			stmt = conn.createStatement();
			
			int res = stmt.executeUpdate(sql);
			if(res > 0) {
				System.out.println("삭제 성공");
				sql = "select * from member order by idx";
				rs =  stmt.executeQuery(sql);
				while(rs.next()) {
					System.out.print(rs.getString(1)+"\t");
					System.out.print(rs.getString(2)+"\t");
					System.out.print(rs.getString(3)+"\t");
					System.out.print(rs.getString(4)+"\t");
					System.out.print(rs.getString(5)+"\t");
					System.out.print(rs.getString(6)+"\n");
				}
			}else {
				System.out.println("삭제 실패");	// 조건에 맞는 데이터가 없는 경우
			}
		} catch (Exception e) {
			System.out.println("삭제 실패 2");
		} finally {
			try {
				stmt.close();
				conn.close();
			} catch (Exception e2) {
				System.out.println(e2);
			}
		}
	}
}
