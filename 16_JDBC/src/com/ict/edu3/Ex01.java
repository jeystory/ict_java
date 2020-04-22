package com.ict.edu3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class Ex01 {
	public static void main(String[] args) {
		Connection conn = null;
		//동적 바인딩을 이용한 구문 생성
		PreparedStatement pstm = null;
		ResultSet rs = null;
		
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			
			String url ="jdbc:oracle:thin:@203.236.220.65:1521:xe";
			String user = "hr";
			String password = "1111";
			
			conn = DriverManager.getConnection(url,user, password);
			
			String sql = "select * from member where id=? and pw=? ";
			pstm = conn.prepareStatement(sql);
			pstm.setString(1,  "aaaa");
			pstm.setString(2,  "1111");
			rs = pstm.executeQuery();
			
			// VO가 여러개 일수 있으므로 ArrayList<VO> list를 생성
			ArrayList<VO> list = new ArrayList<VO>();
			while(rs.next()) {
				VO vo= new VO();
				vo.setIdx(rs.getString(1));
				vo.setId(rs.getString(2));
				vo.setPw(rs.getString(3));
				vo.setName(rs.getString(4));
				vo.setAge(rs.getString(5));
				vo.setAddr(rs.getString(6));
				list.add(vo);
			}
			System.out.println("총 " + list.size() + "명");
			
		} catch (Exception e) {
			System.out.println(e);
		} finally {
			try {
				rs.close();
				pstm.close();
				conn.close();
			} catch (Exception e2) {
				System.out.println(e2);
			}
		}
	}
}
