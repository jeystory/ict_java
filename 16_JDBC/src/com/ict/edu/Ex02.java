package com.ict.edu;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

// 1. 자바와 오라클을 연결하기 위한 라이브러리를 프로젝트에 등록하기
// => 프로젝트 마우스 오른쪽 - Build Path -> configuration build path - Libraries 선택
//       Add External and JARS .. 선택해서 ojdeb6.jar 파일 존재하는 위치 지정
//		프로젝트에 Referenced Libraries안에  ojdeb6.jar 존재
public class Ex02 {
	public static void main(String[] args) {
		//1. 자바를 오라클에 접속할 수 있도록 도와주는 클래스
		Connection conn = null;
		
		//2. SQL  작성, 구분 생성
		Statement stmt = null;
		
		//3. select 문을 사용할 때만 사용하는 클래스,
		//select의 결과는 항상 테이블(표)로 반환되고 나머지는 숫자로 받으면 된다.
		ResultSet rs = null;
		try {
			// 4. JDBC  driver loading : 모든 DBMS는 종류에 따라서 내용이 달라진다.
			Class.forName("oracle.jdbc.OracleDriver");
			
			//5. Oracle 접속 : ID, Password, URL 정보가 필요함
			String url = "jdbc:oracle:thin:@203.236.220.65:1521:xe";
			String user = "hr";
			String password = "1111";
			conn = DriverManager.getConnection(url, user, password);
						
			//6. SQL 작성, 구문 생성 
			//String sql = "SELECT * FROM EMPLOYEES";
			// 원하는 컬럼만 지정해서 보기
			String sql = "SELECT EMPLOYEE_ID, FIRST_NAME, JOB_ID FROM EMPLOYEES";
			
			
			//7. 오라클에 sql을 담아서 보내기 => 구분 생성해서 보내기
			stmt = conn.createStatement();
			
			// 8. 구분 보내고 결과 받기
			rs =  stmt.executeQuery(sql);
			
			// select가 아닐 때는  int로 결과받기
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
