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
	public int hashCode() { // ��� �ʵ忡 ��� ���� ��ġ�ϸ� ������ hashCode ��ȯ�ϵ���
		String str = name + age + score; // "����43100"/ "�踻��2640"/ "ȫ�浿2420"/ "����43100"
		return str.hashCode();
	}
	
	// Student��ü.equals(Student��ü) �̷������� ȣ��� ��
	@Override
	public boolean equals(Object obj) { // ���簴ü�� ���޹��� ��ü�� �� �ʵ尪���� ��� ��ġ�ϸ� true/ �ϳ��� ��ġ���� ������ false ��ȯ
		
		//		this(�� ��ü) vs obj(���޹��� ��ü)
		//		StudentŸ��		ObjectŸ��
		
		Student other = (Student)obj;
		
		//		this(�� ��ü) vs Other(���޹��� ��ü)
		// 	this.name �� oter.name ��ġ�ϴ��� ��
		// 	this.age  �� other.age ��ġ�ϴ��� ��
		//	this.score�� other.score ��ġ�ϴ��� ��
		if(this.name.equals(other.name) && this.age == other.age && this.score == other.score){
			return true;
		}else {
			return false;
		}
		
	}
	
	
	
	
	
	
}
