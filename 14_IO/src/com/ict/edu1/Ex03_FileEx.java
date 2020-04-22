package com.ict.edu1;
/*
 * Stream : 데이터를 목적지까지 입/출력하는 방법
 *              스트림에 데이터를 쓰는 경우 => output stream(출력 스트림)
 *              스트림의 데이터를 읽는 경우 => input stream (입력 스트림)
 * 종류 : byte stream, character stream,byte- character stream chain(결합),  object stream(객체 스트림)
 * 		1. byte stream(기계 중심) : 모든 처리를 1byte씩 입출력 처리
 * 						바이트로 이루어진 모든 파일(영상, 소리, 사진, 문서 등 모든 파일이 가능)
 * 						최상위 클래스 : InputStream(입력), OutputStream( 출력)
 * 
 * 		2. Character Stream(사람 중심) : 모든 처리를 2byte씩 입출력 처리
 * 					세계 모든 언어로 구성된 문서 파일을 입출력하기 적합
 * 					최상의 클래스 : Reader(입력), Writer(출력)
 * 					
 * 		3. byte- character stream chain(결합) : 기계를 통해 입/출력 된 정보를 사람이 인식할 수 있도록 입/출력
 * 					해당 클래스 : InputStreamReader(입력), OutputStreamWriter(출력)
 * 		
 *  		4. Object Stream :  객체 직렬화 후 객체 단위로 입출력
 * 					해당 클래스 : ObjectInputStream(readObject() : 객체 역직렬화(deserializable object))
 * 							ObjectOuptputStream(writeObject() : 객체 직렬화(serializable object))
 */		
public class Ex03_FileEx {
	public static void main(String[] args) {
		
	}
}
