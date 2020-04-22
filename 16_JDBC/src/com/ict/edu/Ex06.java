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
			
			// idx = 5�� ����� ���̸� 24 �� �ּҸ� ��������
			//String sql = "update  member set age = 10 , addr = '�ϱ�' where idx =4";
			String sql = "update  member set age = 10  where idx =4";
			//String sql = "update member set age=24, addr='����' where idx =5";
			//String sql = "update  member set addr = '��⵵' where name = '������'";
			stmt = conn.createStatement();
			
			int res = stmt.executeUpdate(sql);
			if(res > 0) {
				System.out.println("������Ʈ ����");
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
				System.out.println("������Ʈ ����");	// ���ǿ� �´� �����Ͱ� ���� ���
			}
		} catch (Exception e) {
			System.out.println("������Ʈ ���� 2");
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
