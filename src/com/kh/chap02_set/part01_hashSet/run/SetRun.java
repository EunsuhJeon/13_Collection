package com.kh.chap02_set.part01_hashSet.run;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

import com.kh.chap02_set.part01_hashSet.model.vo.Student;

public class SetRun {

	public static void main(String[] args) {

		// Object에 equals()		=> 두 객체의 주소값을 비고해서 일치하면 true/ 일치하지 않으면  false 반환
		// Object에 hashCode()	=> 해당 객체의 '주소값'을 가지고 10진수의 형태로 만들어서 반환
		
		
		HashSet<String> hs1 = new HashSet<String>();
		
		hs1.add("반갑습니다." );
		hs1.add(new String("반갑습니다."));
		hs1.add(new String("여러분"));
		hs1.add(new String("안녕하세요"));
		hs1.add(new String("여러분"));
		
		// String 클래스에 hashCode() 오버라이딩되어있음 => '실제 담긴 문자열'을 가지고 10진수의 형태로 만들어서 반환
		
		System.out.println(hs1); // 저장되는 순서 유지 안됨!!(인덱스 개념 없음!) // 중복된 데이터(동일객체) 보관 불가
		
		HashSet<Student> hs2 = new HashSet<Student>();
		
		hs2.add(new Student("공유",43,100));
		hs2.add(new Student("김말똥", 26, 40));
		hs2.add(new Student("홍길동", 24, 20));
		hs2.add(new Student("공유", 43, 100));
		
		System.out.println(hs2); // 저장 순서 유지 안됨/ 중복 제거X => 왜? 동일객체로 판단이 되지 않고 있어서!
		
		// HashSet이라는 공간에 객체가 추가될 때마다 동일객체인지 비교!
		// 동일객체: 각 객체마다 hashCode() 호출 결과가 일치하고, equals메소드로 비교 시 true일 경우 동일객체라고 판단
		
		// Student에 equals() 오버라이딩 => '실제 각 필드에 담긴 데이터'들이 다 일치하면 true/ 일치하지 않으면 false 반환
		// Student에 hashCode() 오버라이딩 => '실제 각 필드에 담긴 데이터'들이 일치하면 동일한 10진수 반환
		/*
		System.out.println(new Student("공유", 43, 100).hashCode());
		System.out.println(new Student("공유", 43, 100).hashCode());
		System.out.println(new Student("공유", 43, 100).equals(new Student("공유", 43, 100)));
		*/
		
		//hs2.get(2); // hashCode는 인덱스의 개념도 없고 get메소드 자체가 정의되어있지 않음! (한 객체만 뽑아올 수 없음)
		
		// HashSet에 담긴 모든 객체들에 순차적으로 접근 가능
		// 1. for문 사용 가능! (단, for each문으로 가능!)
		for(Object s : hs2) {
			System.out.println(s);
		}
		
		System.out.println("=================================");
		
		// 2. ArrayList에 담아준 다음 그 ArrayList를 반복문 돌려가며 접근
		// ArrayList에 담는 첫 번째 방법: ArrayList 생성 후 addAll메소드 이용해서 통째로 추가하기
		ArrayList<Student> list = new ArrayList<Student>();
		list.addAll(hs2);
		
		// ArrayList에 담는 두 번째 방법: ArrayList 생성과 동시에 통째로 추가하기
		ArrayList<Student> list2 = new ArrayList<Student>(hs2);
		
		for(int i=0; i<list2.size(); i++) {
			System.out.println(list2.get(i));
		}
		
		System.out.println("-------------------------------");
		
		// 3. Iterator 반복자를 이용해서 순차적으로 접근
		Iterator<Student> it = hs2.iterator(); // hs2에 담겨있는 객체들을 => Iterator(반복자)에 담는 과정
		
		while(it.hasNext()) {
			Student s = it.next();
			System.out.println(s);
		}
		// StringTokinizer와 비슷한 개념
		
		//it.next(); // NoSuchElementException
		
		
		
		
		
	}

}
