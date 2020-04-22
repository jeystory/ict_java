package com.ict.edu;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

// Map 인터페이스 : key와 value가 1:1 매칭
// key를 호출하면 value가 나온다.
// 구현 클래스 : HaspMap: value 와 key가 null로 한번 허용
// key는 중복을 허용하지 않음
// key를 보통 set에서 별도로 관리한다. = > keySet()
// get(key)를 하면 value가 나온다.
// add()로 추가나 삽입을 할 수 없다.
// put(key, value)로 삽입한다.

//Map를 구현한 클래스 : HashMap
public class Ex09 {
	public static void main(String[] args) {
		// Map 생성
		HashMap<Integer, String> map1 = new HashMap<Integer, String>();
		// 추가
		// 사용하기 쉽게 key를  Integer에 순서대로 넣었다.
		map1.put(0, "한국");
		map1.put(1, "미국");
		map1.put(2, "중국");
		map1.put(3, "일본");
		map1.put(4, "한국");    // value는 중복 가능
		map1.put(3, "영국");    // 키 중복 안됨, 덮어쓰기가 됨(즉, 일본이 없어지고 영국이 남음)
		
	
		System.out.println(map1);
		System.out.println("=========================");
		
		// 호출방법
		System.out.println(map1.get(4));
		System.out.println(map1.get("한국"));	//  "한국" 이라는 키가 없기 때문에 -> null 출력
		
		// 일부러 key를 0부터 순서대로 만들었기 때문에 for문 사용하기 편함
		System.out.println("=========================");
		for (int i = 0; i < map1.size(); i++) {
			System.out.println(map1.get(i));
		}
		System.out.println("=========================");
		
		// key => Integer
		for (Integer k : map1.keySet()) {
			System.out.println(map1.get(k));
		}
		
		System.out.println("=========================");
		// key => Integer
		Iterator<Integer> it = map1.keySet().iterator();
		while (it.hasNext()) {
			Integer k = it.next();
			System.out.println(map1.get(k));
		}
		 System.out.println("==========================");
		
		// 일반적으로 사용하는 Map
		 HashMap<String, String> map2 = new HashMap<String, String>();
		 map2.put("이름", "고길동");
		 map2.put("나이", "38");
		 map2.put("주소", "서울시 마포구 서교동");
		 map2.put("성별", "남성");
		 
		 System.out.println(map2.get("이름"));
		 System.out.println(map2.get("나이"));
		 System.out.println(map2.get("주소"));
		 System.out.println(map2.get("성별"));
		 System.out.println("==========================");
		 
		 for (String k : map2.keySet()) {
			System.out.println(k + ":" + map2.get(k));
		}
		System.out.println("==========================");
		
	
		 Iterator<String> it2 = map2.keySet().iterator();
		 while (it2.hasNext()) {
			String k= it2.next();
			System.out.println(k + ":" + map2.get(k));
		}

		 System.out.println("==========================");
		// key값만 가지고 있음
		 Set<String> set1 =  map2.keySet();
		 System.out.println(set1);
		 //value값만 가지고 있음
		 Collection<String> set2 =  map2.values();
		 System.out.println(set2);
	}
}
