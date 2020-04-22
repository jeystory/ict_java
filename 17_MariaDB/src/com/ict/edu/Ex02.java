package com.ict.edu;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class Ex02 {
	public static void main(String[] args) {
		Connection conn = null;
		//���� ���ε��� �̿��� ���� ����
		PreparedStatement pstm = null;
		ResultSet rs = null;
		int result =0;
		
		try {
			Class.forName("org.mariadb.jdbc.Driver");
			
			String url = "jdbc:mariadb://203.236.220.65:3306/exam?autoReconnect=true";
			//String url = "jdbc:mariadb://localhost:3306/exam?autoReconnect=true";
			String user = "limhw";
			String password = "1111";
			
			conn = DriverManager.getConnection(url,user, password);
			
			String sql = "insert into member(idx,id,pw,name,age,addr) "+
					 "values(?,?,?,?,?,?)";
			pstm = conn.prepareStatement(sql);
		
			pstm.setString(1, "2");
			pstm.setString(2, "bbb");
			pstm.setString(3, "1111");
			pstm.setString(4, "ȫ�浿");
			pstm.setString(5, "24");
			pstm.setString(6, "����");
	   
			result = pstm.executeUpdate();
			
			if(result>=1) {
				System.out.println("���� ����");
				
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
				System.out.println("���� ����");
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
