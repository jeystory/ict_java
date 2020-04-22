package com.ict.edu;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Ex04 {
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
			
			//String sql = "insert into member(idx, id, pw, name, age,addr) " + 
			//				"values(4,'dddd','dddd1', '희동이', 3, '서울')";
			
			String sql = "insert into member values(6,'ffff','ffff1', '마이콜', null, null)";
			
			stmt = conn.createStatement();
			
			int res = stmt.executeUpdate(sql);
			if(res > 0) {
				System.out.println("삽입 성공");
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
				System.out.println("삽입 실패");
			}
		} catch (Exception e) {
			System.out.println("삽입 실패 2");
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
