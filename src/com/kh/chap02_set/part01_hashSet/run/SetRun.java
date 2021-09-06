package com.kh.chap02_set.part01_hashSet.run;

import java.util.HashSet;

import com.kh.chap02_set.part01_hashSet.model.vo.Student;

public class SetRun {

	public static void main(String[] args) {

		// Object에 equals()		=> 두 객체의 주소값을 비고해서 일치하면 true/ 일치하지 않으면  false 반환
		// Object에 hashCode()	=> 해당 객체의 '주소값'을 가지고 10진수의 형태로 만들어서 반환
		
		
		HashSet hs1 = new HashSet();
		
		hs1.add("반갑습니다." );
		hs1.add(new String("반갑습니다."));
		hs1.add(new String("여러분"));
		hs1.add(new String("안녕하세요"));
		hs1.add(new String("여러분"));
		
		// String 클래스에 hashCode() 오버라이딩되어있음 => '실제 담긴 문자열'을 가지고 10진수의 형태로 만들어서 반환
		
		System.out.println(hs1); // 저장되는 순서 유지 안됨!!(인덱스 개념 없음!) // 중복된 데이터(동일객체) 보관 불가
		
		HashSet hs2 = new HashSet();
		
		hs2.add(new Student("공유",43,100));
		hs2.add(new Student("김말똥", 26, 40));
		hs2.add(new Student("홍길동", 24, 20));
		hs2.add(new Student("공유", 43, 100));
		
		System.out.println(hs2); // 저장 순서 유지 안됨/ 중복 제거X => 왜? 동일객체로 판단이 되지 않고 있어서!
		
		// HashSet이라는 공간에 객체가 추가될 때마다 동일객체인지 비교!
		// 동일객체: 각 객체마다 hashCode() 호출 결과가 일치하고, equals메소드로 비교 시 true일 경우 동일객체라고 판단
		
		// Student에 equals() 오버라이딩 => '실제 각 필드에 담긴 데이터'들이 다 일치하면 true/ 일치하지 ㅇ낳으면 false 반환
		// Student에 hashCode() 오버라이딩 => '실제 각 필드에 담긴 데이터'들이 일치하면 동일한 10진수 반환
		System.out.println(new Student("공유", 43, 100).hashCode());
		System.out.println(new Student("공유", 43, 100).hashCode());
		System.out.println(new Student("공유", 43, 100).equals(new Student("공유", 43, 100)));
		
	}

}
