package com.ict.edu;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

// 1. �ڹٿ� ����Ŭ�� �����ϱ� ���� ���̺귯���� ������Ʈ�� ����ϱ�
// => ������Ʈ ���콺 ������ - Build Path -> configuration build path - Libraries ����
//       Add External and JARS .. �����ؼ� ojdeb6.jar ���� �����ϴ� ��ġ ����
//		������Ʈ�� Referenced Libraries�ȿ�  ojdeb6.jar ����
public class Ex02 {
	public static void main(String[] args) {
		//1. �ڹٸ� ����Ŭ�� ������ �� �ֵ��� �����ִ� Ŭ����
		Connection conn = null;
		
		//2. SQL  �ۼ�, ���� ����
		Statement stmt = null;
		
		//3. select ���� ����� ���� ����ϴ� Ŭ����,
		//select�� ����� �׻� ���̺�(ǥ)�� ��ȯ�ǰ� �������� ���ڷ� ������ �ȴ�.
		ResultSet rs = null;
		try {
			// 4. JDBC  driver loading : ��� DBMS�� ������ ���� ������ �޶�����.
			Class.forName("oracle.jdbc.OracleDriver");
			
			//5. Oracle ���� : ID, Password, URL ������ �ʿ���
			String url = "jdbc:oracle:thin:@203.236.220.65:1521:xe";
			String user = "hr";
			String password = "1111";
			conn = DriverManager.getConnection(url, user, password);
						
			//6. SQL �ۼ�, ���� ���� 
			//String sql = "SELECT * FROM EMPLOYEES";
			// ���ϴ� �÷��� �����ؼ� ����
			String sql = "SELECT EMPLOYEE_ID, FIRST_NAME, JOB_ID FROM EMPLOYEES";
			
			
			//7. ����Ŭ�� sql�� ��Ƽ� ������ => ���� �����ؼ� ������
			stmt = conn.createStatement();
			
			// 8. ���� ������ ��� �ޱ�
			rs =  stmt.executeQuery(sql);
			
			// select�� �ƴ� ����  int�� ����ޱ�
			//int res = stmt.execute(sql);
			
			while(rs.next()) {
				System.out.print(rs.getString("employee_id") + "\t" );
				System.out.print(rs.getString("first_name") + "\t" );
				System.out.print(rs.getString("job_id") + "\n" );
			}
			
		} catch (Exception e) {
			System.out.println(e);
		} finally {
			try {
				rs.close();
				stmt.close();
				conn.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
	}
}
