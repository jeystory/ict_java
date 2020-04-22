package com.ict.edu2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Ex02 {
	public static void main(String[] args) {
		Connection conn = null;
		//���� ���ε��� �̿��� ���� ����
		PreparedStatement pstm = null;
		ResultSet rs = null;
		
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			
			String url ="jdbc:oracle:thin:@203.236.220.65:1521:xe";
			String user = "hr";
			String password = "1111";
			
			conn = DriverManager.getConnection(url,user, password);
			
			//String sql = "select * from member order by idx ";
			//String sql = "select * from member where idx = ?";
			//String sql = "select * from member where employee_id >= 108 and employee_id <= 121";
			//String sql = "select * from member where last_name = 'King'";
			
			// �α����� ��� id , password ��� �˻�
			String sql = "select * from member where id =? and pw =?";
			pstm = conn.prepareStatement(sql);
			pstm.setString(1,"dddd");
			pstm.setString(2, "dddd1");
			
			rs = pstm.executeQuery();
			/*
			while(rs.next()) {
				System.out.print(rs.getString(1) + " \t");
				System.out.print(rs.getString(2) + " \t");
				System.out.print(rs.getString(3) + " \t");
				System.out.print(rs.getString(4) + " \t");
				System.out.print(rs.getString(5) + " \t");
				System.out.print(rs.getString(6) + " \n");
			}*/
			if(rs.next()) {
				System.out.println("�α��� ����");
				//�Ʒ� ���� ��� �ȵ� - Ŀ���� ��ġ�� �Ʒ��� �̵�
				/*
				while(rs.next()) {
					System.out.print(rs.getString(1) + " \t");
					System.out.print(rs.getString(2) + " \t");
					System.out.print(rs.getString(3) + " \t");
					System.out.print(rs.getString(4) + " \t");
					System.out.print(rs.getString(5) + " \t");
					System.out.print(rs.getString(6) + " \n");
				}
				*/
					
			}else {
				System.out.println("�α��� ����");
			}
			
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
