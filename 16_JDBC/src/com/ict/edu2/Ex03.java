package com.ict.edu2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Ex03 {
	public static void main(String[] args) {
        Connection conn = null;
        // 동적바인딩을 이용한 구문 생성
        PreparedStatement pstm = null;
        ResultSet rs = null;
        int result = 0 ; // insert 결과 받는 변수
		try {
			// 드라이버 로딩
			Class.forName("oracle.jdbc.OracleDriver");
			// 접속정보
			String url = "jdbc:oracle:thin:@203.236.220.65:1521:xe";
			String user = "hr";
			String password = "1111";
			conn = DriverManager.getConnection(url, user, password);
			
			String sql = "insert into member(idx,id,pw,name,age,addr) "+
						 "values(?,?,?,?,?,?)";
			pstm = conn.prepareStatement(sql);
			
			pstm.setString(1, "1");
			pstm.setString(2, "aaaa");
			pstm.setString(3, "1111");
			pstm.setString(4, "홍길동");
			pstm.setString(5, "24");
			pstm.setString(6, "서울");
		   
			result = pstm.executeUpdate();
			
			if(result>=1) {
				System.out.println("삽입 성공");
				
				sql = "select * from member order by idx";
				pstm = conn.prepareStatement(sql);
				rs = pstm.executeQuery();
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
			System.out.println("삽입 실패2");
			System.out.println(e);
		} finally {
			try {
				rs.close();
				pstm.close();
				conn.close();
			} catch (Exception e2) {
			}
		}
	}
}
