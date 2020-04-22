package com.ict.edu;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class Ex08 {
	public static void main(String[] args) {
		JSONObject obj = new JSONObject();
		obj.put("이름","덩치");
		obj.put("거주지","서울");
		
		String data = obj.toString();
		System.out.println(data);
		
		String data2 = (String) obj.get("이름");
        System.out.println(data2);
        
     //////////////////////////////////////
     // 중괄호에 들어갈 속성 정의 { "a" : "1", "b" : "2" }
        JSONObject jsonObject1 = new JSONObject(); 
     // 대괄호 정의 [{ "a" : "1", "b" : "2" }]
        JSONArray jsonArray1 = new JSONArray();
     // 중괄호로 감싸 대괄호의 이름을 정의함 { "c" : [{  "a" : "1", "b" : "2" }] }
        JSONObject finalJsonObject1 = new JSONObject(); 
 
        jsonObject1.put("이름", "잠자리");
        jsonObject1.put("다리갯수", "6");
        jsonArray1.add(jsonObject1);
 
        jsonObject1 = new JSONObject();
        jsonObject1.put("이름", "사슴벌레");
        jsonObject1.put("다리갯수", "6");
        jsonArray1.add(jsonObject1);
        
        finalJsonObject1.put("곤충", jsonArray1);
 
        finalJsonObject1.put("동물", "코끼리");
        finalJsonObject1.put("식물", "무궁화");
        
        System.out.println(finalJsonObject1);

	}
}
