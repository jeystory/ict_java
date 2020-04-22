package com.ict.edu;

public class Ex01 {
	/*
	 * Database : 조직에서 필요한 데이터를 모아서 통합하고, 공유할 목적으로 구축된 정보의 모임
	 * DSMD(database management system)
	 * 	- 데이터베이스를 효율적으로 관리할 수 있는 시스템
	 * DBMS 의 종류 : 계층형, 네트워크형, 릴레이션형(RDBMS) (주류)
	 * 	- 릴레이션형(RDBMS) 가 주류	
	 *		- RDBMS : 테이블형태로 구성
	 *
	 * RDBMS의 용어
	 * 	- 행 : 튜플, row, 레코드
	 * 	- 열 : 속성, column, 필드
	 * 	
	 *     - 기본키(Primary Key) : 테이블의 각 행을 다른 행과 구분해주는 역활을 하는 컬럼을 말함.
	 *      		- 조건 : 유일함(unique), 값이 존재(Not null)
	 *     
	 *     - 외래키(foreign key) :테이블 내에서는 한 컬럼인 동시에 다른 테이블에서 기본키인 컬럼.
	 *     
	 *     -SQL(Standard Query Language) : 표준 질의어
	 *     	- RDBMS의 표준 질의어
	 *     	- 종류 : DDL(데이터정의어) 
	 *     				- CREATE : db 객체 생성
	 *     				- DROP : db 객체 삭제
	 *     				- ALTER : db 객체를 재정의할 때. 또는 구조를 변경
	 *     			 DML(데이터 조작어)
	 *     				- INSERT : db에 객체에 데이터를 삽입
	 *     				- UPDATE : db에 객체에 데이터를 수정
	 *     				- DELECT : db에 객체에 데이터를 삭제
	 *     				- SELECT : db에 객체에 데이터를 검색
	 *     				- COMMIT : 현재 상태를 저장할 때
	 *     				- ROLLBACK : 이전 상태로 복구할 때 사용
	 *     			DCL( 데이터 제어어)
	 *     				- GRANT : 데이터베이스 객체의 권한을 부여
	 *     				- REVOKE : 이미 주어진 db 객체의 권한을 취소할 때 사용
	 *     ***************************************************
	 *    SELECT  * |  컬럼명,
	     FROM 테이블명
	     *[WHERE 조건 ]
	     [GROUP BY 컬럼명 ]
	     [HAVING 조건 ]
	     *[ORDER BY 컬럼명 [ASC,DESC]]
	     
	     INSERT INTO 테이블명
	     VALUES(값,값,.....);
	     ** 반드시 모든 컬럼에 값이 들어가야 한다.
	     
	     INSERT INTO 테이블명(컬럼명1, 컬럼명2)
	     VALUES(값1,값2);
	     ** 컬럼명 과 값을 1:1 대응해야 됨
	     ** 반드시 집어넣어야 되는 컬럼명은 빠질 수 없다.
	     ** 컬럼 속성이 NOTNULL 이면 반드시 넣어줘야 한다.
	   
	     UPDATE 테이블명
	     SET 컬럼1=값, 컬럼2=값
	     WHERE 조건
	     
	     DELETE
	     FROM 테이블명
	     WHERE 조건
	     =============================================
	     1. 사원 테이블의 모든 정보
	     SELECT * FROM  사원;
	     
	     2. 사원 테이블에서 사번, 이름, 부서코드 컬럼만 보기
	     SELECT 사번, 이름, 부서코드 FROM 사원;
	     
	     3. 사원 테이블에서 부서코드가 300인 사원의 정보만 보고 싶을 때
	     SELECT * FROM 사원 WHERE 부서코드 = 300;
	     
	 */
	
	
}
