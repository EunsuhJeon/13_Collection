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
	public int hashCode() {
		final int prime = 31; // result = 31 * 1 + 20 = 51
		int result = 1;
		result = prime * result + age;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + score;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		
		// this vs obj
		
		if (this == obj) // 현 객체와 비교대상 객체의 주소값이 일치할 경우 (같은 곳을 참조할것임 == 필드 값이 일치할 것임) 각 필드들 일일이 비교할 필요 없이 그냥 true 반환
			return true;
		if (obj == null) // 비교대상이 null일 경우 비교할 가치도 없이 false 반환
			return false;
		if (getClass() != obj.getClass()) // 현 객체의 클래스 타입과 비교대상 객체의 클래스 타입이 다를 경우 비교할 가치도 없이 false 반환
			return false;
		
		// 각 객체의 주소값이 다르고, 비교대상 객체가 null이 아니고(정상적인 객체), 두 객체의 클래스타입이 일치할 경우 => 본격적으로 각 필드값을 비교!
		Student other = (Student) obj;
		if (age != other.age) // 현 객체의 age 필드와 전달 받은 객체의 age 필드가 다를 경우 false 반환
			return false;
		if (name == null) { // 현 객체의 name 필드가 null일 경우 
			if (other.name != null) // 전달받은 객체의 name 필드가 null이 아닐 경우 false 반환
				return false;
		} else if (!name.equals(other.name))// 현 객체의 name필드가 null이 아니고 그 문자열과 전달받은 객체의 name필드 문자열이 일치하지 않을 경우
			return false;
		if (score != other.score) // 현 객체의 score 필드와 전달받은 객체의 score 필드가 다를 경우 false 반환
			return false;
		return true;
	}
	
	/*
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
	*/
	
	
	
	
	
	
	
}
