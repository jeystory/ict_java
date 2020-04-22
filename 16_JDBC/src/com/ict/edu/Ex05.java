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
			
			// ���̰� 1000 �� �̻��̰� �ּҰ� ������ ��� ����
			String sql = "delete from member where age >= 1000 and addr = '����'";
			
			stmt = conn.createStatement();
			
			int res = stmt.executeUpdate(sql);
			if(res > 0) {
				System.out.println("���� ����");
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
				System.out.println("���� ����");	// ���ǿ� �´� �����Ͱ� ���� ���
			}
		} catch (Exception e) {
			System.out.println("���� ���� 2");
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