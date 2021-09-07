package com.kh.chap03_map.part01_hashMap.run;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

import com.kh.chap03_map.part01_hashMap.model.vo.Snack;

public class MapRun {

	public static void main(String[] args) {

		HashMap<String,Snack> hm = new HashMap<>();
		
		// 계층구조
		// List계열, Set계열 클래스들은 Collection을 구현한 클래스다. (Collection이 부모메소드)
		// => 객체를 추가하고자 할 때 공통적으로 add메소드를 이용한다! (Collection에 add메소드가 있음)
		
		// 하지만, Map계열은 Collection을 구현한 클래스가 아님!
		// => 추가하고자 할 때 put메소드를 이용한다. (이 때 키+밸류 세트로 담아야함!)
		
		// 1. put(K key, V value): 컬렉션에 키 밸류 세트로 추가시켜주는 메소드
		hm.put("다이제", new Snack("초코맛",1500));
		hm.put("칸초", new Snack("단맛", 600));
		hm.put("새우깡", new Snack("짠맛", 500));
		
		hm.put("포테이토칩", new Snack("짠맛", 500));
		
		System.out.println(hm); // {키=밸류, 키=밸류, ...}
		// 저장되는 순서 유지 안됨! value값이 중복돼도 키값이 중복 안 되면 잘 저장됨!
		
		hm.put("새우깡", new Snack("매운맛", 700));
		// 동일한 키값으로 다시 추가하는 경우 value값이 덮어씌워짐!! (중복된 키값은 공존할 수 없음! 키값이 식별자와 같은 역할을 함!)
		System.out.println(hm);
		
		// 2. get(Object key): V 	=> 컬렉션에서 해당 키값을 가지는 Value값을 반환시켜주는 메소드
		Snack s = /*(Snack)*/hm.get("다이제");
		System.out.println(s);
		
		// 3. size(): 컬렉션에 담겨있는 객체들의 갯수 반환
		System.out.println("몇개: " + hm.size());
		
		// 4. replace(K key, V value) => 컬렉션에서 해당 키 값 찾아서 다시 전달한 Value값으로 수정시켜주는 메소드
		hm.replace("포테이토칩", new Snack("겁나 짠맛", 1000));
		System.out.println(hm);
		
		// 5. remove(Object key) => 컬렉션에서 해당 키값 찾아서 그 키밸류 세트를 삭제시켜주는 메소드
		hm.remove("포테이토칩");
		System.out.println(hm);
		
		// map 공간에 담긴 모든 키값과 밸류값 다 출력하고자 할 때
		// for each문 안됨!
		/*
		for( : hm) {
		
		}
		 */
		// ArrayList로도 안 됨!
		//ArrayList list = new ArrayList(hm);
		
		// Iterator 반복자를 이용하는 방법밖에 없음!
		//Iterator it = hm.iterator(); // 곧바로 iterator() 호출 못함! 왜? iterator()는 List계열 또는 Set계열에서만 쓸 수 있는 메소드!
		
		// Map을 Set로 바꿔주는 메소드 제공함 (게다가 2개나!)
		// Map => Set계열 => Iterator
		
		// 1. keySet() 이용하는 방법
		// 1) hm에 있는 키들만 Set에 담기 (키들의 집합 형태)
		// 	  hm.keySet() : Set 반환
		Set<String> keySet = hm.keySet();
		
		// 2) 1번 과정에서 작업된 keySet을 Iterator에 담기
		//	  keySet.iterator(): Iterator
		Iterator<String> itKey = keySet.iterator();
		
		// 3) 반목문을 통해서 뽑기
		while(itKey.hasNext()) {
			String key = /*(String)*/itKey.next();
			Snack value = /*(Snack)*/hm.get(key);
			System.out.println(key + "=" + value);
		}
		
		System.out.println("==========================================");
		
		
		// 2. entrySet() 이용하는 방법
		// 1) hm.entrySet(): Set
		Set<Entry<String, Snack>> entrySet = hm.entrySet(); // 키 + 밸류 세트의 집합
		
		// 2) entrySet.iterator(): Iterator
		Iterator<Entry<String, Snack>> itEntry = entrySet.iterator();
		
		// 3) 반복문을 통해 가져오기
		while(itEntry.hasNext()) {
			Entry<String, Snack> entry = /*(Entry)*/itEntry.next();// 이 안에 key, value값 다 담겨있음!
			
			String key = /*(String)*/entry.getKey();
			Snack value = /*(Snack)*/entry.getValue();
			
			System.out.println(key + "=" + value);
		}
		
		
		
		
		
	}

}
