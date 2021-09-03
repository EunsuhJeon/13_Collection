package com.kh.chap01_list.part01_basic.run;

import java.util.ArrayList;

import com.kh.chap01_list.part01_basic.model.vo.Music;

public class ListRun {
	/*
	 * * 컬렉션이란?
	 * 	  자료구조 개념이 내장되어있는 클래스로 자바에서 제공하는 '자료구조'를 담당하는 '프레임워크'이다.
	 * 
	 * 	 - 자료구조: 방대한 데이터를 보다 효율적으로 관리 (조회, 정렬, 추가, 수정, 삭제)할 수 있도록 도와주는 개념
	 * 	 - 프레임워크: 이미 만들어져있는 틀 (뼈대)
	 * 
	 * * 배열의 단점과 컬렉션의 장점
	 * > 배열의 단점
	 * 	 1. 배열은 우선 크기를 지정해야했음! 한 번 지정된 크기를 변경할 수 없음!
	 * 	       새로운 값을 더 추가하고자 한다면 새로운 크기의 배열을 만들고 기존것을 복사하는 코드를 직접 기술
	 * 	
	 * 	 2. 배열 중간 위치에 추가한다거나 삭제하는 경우 값을 매번 앞으로 땡겨와주는 복잡한 알고리즘을 직접 기술해야함.
	 * 	    
	 * 	 3. 한 공간에 한 타입의 데이터들만 저장 가능하다.
	 * 
	 * 
	 * 
	 * > 컬렉션의 장점
	 * 	 1. 크기 지정해줄 필요 없음! 만일 지정했다고 해도 더 많은 데이터들이 들어오면 알아서 사이즈를 늘려줌
	 * 	 	크기의 제약이 없다.
	 * 
	 * 	 2. 중간에 값을 추가한다거나 삭제하는 경우 값을 앞으로 땡겨주는 작업(알고리즘)을 직접 기술할 필요 없음!!
	 * 		단지 메소드 호출만으로 알아서 내부적으로 진행될 것임.
	 * 
	 * 	 3. 한 공간에 여러 타입의 데이터들을 저장할 수 있다! (단, 객체만 저장 가능)
	 * 		한 타입만 담기도록 제한을 둘 수도 있음
	 * 
	 * * 방대한 데이터를 단지 보관만 해두고 조회만 할 경우 배열을 많이 사용
	 * 	  방대한 데이터들을 보관, 추가, 삭제 등등의 과정들을 빈번히 진행할 경우 컬렉션을 많이 사용
	 * 
	 * 
	 */

	public static void main(String[] args) {

		ArrayList list = new ArrayList(3); // 크기 지정할 수도 있고 안할 수도 있음!!
		
		System.out.println(list); // 안에 아무것도 없음!! (비어있는 상태)
		
		// E --> Element: 리스트에 담길 데이터들 (요소)
		
		// 1. add(E e): 리스트공간 끝에 전달된 데이터를 추가시켜주는 메소드
		list.add(new Music("Good Bye", "박효신"));
		list.add(new Music("이 밤", "양다일"));
		list.add(new Music("잊혀지다", "정키"));
		list.add("끝");
		
		// 지정된 크기보다 더 많이 넣어도 오류 안 남 	=> 장점1: 크기의 제약 업음
		// 다양한 타입의 데이터 담을 수 있음		=> 장점3: 여러 타입 보관 가능
		
		System.out.println(list); // list의 특징: 순서 유지하면서 담김 (0번 인덱스부터 차곡차곡)
		
		// 2. add(int index, E e): 직접 인덱스를 지정해서 해당 인덱스 위치에 데이터를 추가시켜주는 메소드
		list.add(1, new Music("진심이 담긴 노래", "케이시"));
		
		// 중간 위치에 데이터 추가 시 복잡한 알고리즘 직접 구현 안 함 => 장점2
		
		System.out.println(list);
		
		// 3. remove(int index): 해당 인덱스 위치의 데이터를 삭제시켜주는 메소드
		list.remove(1);
		
		System.out.println(list);
		
		// 4. set(int index, E e)
		list.set(0, new Music("술이 달다", "에픽하이"));
		
		System.out.println(list);
		
		// 5. size(): 리스트의 사이즈 반환시켜주는 메소드 (즉, 몇 개의 데이터가 담겨있는지)
		System.out.println("리스트의 사이즈: " + list.size());  // 배열과 비교해보자면 length같은 느낌
		
		// 6. get(int index): 해당 인덱스 위치의 객체를 반환시켜주는 메소드
		Music m = (Music)list.get(0);
		String s = (String)list.get(3);
		
		System.out.println(m);
		System.out.println(s);
		
		
	}

}
