package com.kh.chap03_map.part02_properties.run;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import com.kh.chap03_map.part01_hashMap.model.vo.Snack;

public class PropertiesRun1 {

	public static void main(String[] args) {

		// Properties: Map계열의  컬렉션 => 키+밸류 세트로 저장해야함
		// HashMap과의 차이점: Properties에는 키값도 String, 밸류값도 String으로 담음!
		
		Properties prop = new Properties();
		/*
		// Map 계열이기 때문에 put 메소드 이용해서 키+밸류 세트 담기 가능!
		prop.put("다이제", new Snack("초코맛", 1500));
		prop.put("새우깡", new Snack("짠맛", 700));
		
		System.out.println(prop);
		System.out.println(prop.get("다이제")); // get메소드 이용가능!
		
		// 하지만 properties 사용하는 경우는 주로 Properties에 담긴 것들을 파일로 출력 또는 입력받아 올 때 사용함!
		// 즉, Properties에서 제공하는 store(), load() 메소드를 사용하기 위해서
		
		try {
			prop.store(new FileOutputStream("test.properties"), "propertiesTest"); 
			// ClassCastException // 클래스의 형변환에서 예외 발생
			// 내부적으로 store메소드 실행 시 Properties에 담겨있는 키+밸류 세트들을 String으로 형변환해서 출력함!
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		*/
		
		// Properties 키+밸류 세트로 추가할 때
		// 1. setProperty(String key, String value)
		prop.setProperty("List", "ArrayList");
		prop.setProperty("Set", "HashSet");
		prop.setProperty("Map", "HashMap");
		prop.setProperty("Map", "Properties");
		
		System.out.println(prop); // 저장 순서 유지 안됨, key값 중복 시 덮어씌워짐
		
		// 2. getProperty
		System.out.println(prop.getProperty("List"));
		System.out.println(prop.getProperty("새우깡")); // null값 반환. 예외 발생하지 않음
		
		try {
			// 3. store(OutputStream os, String comments): Properties에 담겨있는 key-value 값들을 파일로 출력(내부적으로 다 String으로 변환)
			prop.store(new FileOutputStream("test.properties"), "propertiesTest");
			
			// 4. storeToXML(OutputStream os, String comments)
			prop.storeToXML(new FileOutputStream("test.xml"), "propertiesTest");
			
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		
	}

}
