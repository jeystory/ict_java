package com.ict.edu;

public class Ex01_CollectionEx {
	/* 제너닉과 컬렉션(자료구조)
 	제너닉 : 컬렉션이 어떤 객체들로 이루어졌는지를 표시하는 객체 타입을 말한다. ex) <객체타입>
 	컬렉션 : 객체들을 모아서 관리(제어)하는 인터페이스들을 말한다.
 	API에서 표현 : <T> => 객체 타입, <E> -> 요소, 컬렉션 안에 존재하는 객체 하나를 뜻한다.
 				<K,V> -> 맵형식에서 나오는 표현. K-> key, V->Value, key와 Value는 1:1 대응. 
 				*** key를 호출하면 value가 나옴. (web에서 가장 많이 사용하는 형태)
 	자료형 변수 = 데이터 , 자료형[] 변수 = {데이터, 데이터,.....};
 	형식 : 컬렉션<제너닉=객체타입> -> 객체들을 모아놓은 것
 	최상위 컬렉션 : Collection<E> : Set<E>, List<E>,  Queue<E>, Map<K, V>
 	
 	Collection 주요메소드 
 			- add(E e) : boolean -> 해당 컬렉션에 객체 추가, 성공하면 true 반환
 			- addAll(Collection<? extends E> c) => 특정 컬렉션에 있는 모든 요소들을 다른 컬렉션에 추가
 			- clear() => 모든 요소(객체)를 삭제
 			- remove(Object o) => 인지로 받은 특정 객체를 현재 컬렉션에서 삭제
 			- contains(Object o) => 인자로 받은 특정 객체가 현재 컬렉션에 존재하면 true
 			- isEmptry() => 해당 컬렉션이 비어 있으면 true
			- size() => 해당 컬렉션에 존재하는 객체들의 수(반복문에서 사용)
			- toArray() => 해당 컬렉션을 배열로 만듦.
			- iterator() => 해당 컬렉션 안에 존재하는 객체들을 순서대로 접근하기 위한 Iterator(반복자) 객체를 반환
								하나씩 꺼내기 위해서 필요
	 */
}
