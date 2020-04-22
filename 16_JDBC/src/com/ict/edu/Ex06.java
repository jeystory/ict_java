package com.ict.edu;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Ex06 {
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
			
			// idx = 5인 사람의 나이를 24 살 주소를 남극으로
			//String sql = "update  member set age = 10 , addr = '북극' where idx =4";
			String sql = "update  member set age = 10  where idx =4";
			//String sql = "update member set age=24, addr='남극' where idx =5";
			//String sql = "update  member set addr = '경기도' where name = '마이콜'";
			stmt = conn.createStatement();
			
			int res = stmt.executeUpdate(sql);
			if(res > 0) {
				System.out.println("업데이트 성공");
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
				System.out.println("업데이트 실패");	// 조건에 맞는 데이터가 없는 경우
			}
		} catch (Exception e) {
			System.out.println("업데이트 실패 2");
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
