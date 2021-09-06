package com.kh.chap02_set.part01_hashSet.model.vo;

public class Student {

	private String name;
	private int age;
	private int score;
	
	public Student() {}

	public Student(String name, int age, int score) {
		super();
		this.name = name;
		this.age = age;
		this.score = score;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", score=" + score + "]";
	}
	
	@Override
	public int hashCode() { // 모든 필드에 담긴 값이 일치하면 동일한 hashCode 반환하도록
		String str = name + age + score; // "공유43100"/ "김말똥2640"/ "홍길동2420"/ "공유43100"
		return str.hashCode();
	}
	
	// Student객체.equals(Student객체) 이런식으로 호출될 것
	@Override
	public boolean equals(Object obj) { // 현재객체와 전달받은 객체의 각 필드값들이 모두 일치하면 true/ 하나라도 일치하지 않으면 false 반환
		
		//		this(현 객체) vs obj(전달받은 객체)
		//		Student타입		Object타입
		
		Student other = (Student)obj;
		
		//		this(현 객체) vs Other(전달받은 객체)
		// 	this.name 과 oter.name 일치하는지 비교
		// 	this.age  와 other.age 일치하는지 비교
		//	this.score과 other.score 일치하는지 비교
		if(this.name.equals(other.name) && this.age == other.age && this.score == other.score){
			return true;
		}else {
			return false;
		}
		
	}
	
	
	
	
	
	
}
