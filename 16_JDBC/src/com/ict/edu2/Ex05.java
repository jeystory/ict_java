package com.ict.edu2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Ex05 {
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
			
			// 주소가 서울인 사람들의 주소를 경기도로 변경하자  
			String sql = "update member set addr = ? where addr = ? ";
			pstm = conn.prepareStatement(sql);
			pstm.setString(1, "북극");
			pstm.setString(2, "경기도");
		   
			result = pstm.executeUpdate();
			if(result>=1) {
				System.out.println("갱신 성공");
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
				System.out.println("갱신 실패");
			}
		} catch (Exception e) {
			System.out.println("갱신실패2");
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
