package com.kh.chap02_set.part01_hashSet.run;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

import com.kh.chap02_set.part01_hashSet.model.vo.Student;

public class SetRun {

	public static void main(String[] args) {

		// Object�� equals()		=> �� ��ü�� �ּҰ��� ����ؼ� ��ġ�ϸ� true/ ��ġ���� ������  false ��ȯ
		// Object�� hashCode()	=> �ش� ��ü�� '�ּҰ�'�� ������ 10������ ���·� ���� ��ȯ
		
		
		HashSet<String> hs1 = new HashSet<String>();
		
		hs1.add("�ݰ����ϴ�." );
		hs1.add(new String("�ݰ����ϴ�."));
		hs1.add(new String("������"));
		hs1.add(new String("�ȳ��ϼ���"));
		hs1.add(new String("������"));
		
		// String Ŭ������ hashCode() �������̵��Ǿ����� => '���� ��� ���ڿ�'�� ������ 10������ ���·� ���� ��ȯ
		
		System.out.println(hs1); // ����Ǵ� ���� ���� �ȵ�!!(�ε��� ���� ����!) // �ߺ��� ������(���ϰ�ü) ���� �Ұ�
		
		HashSet<Student> hs2 = new HashSet<Student>();
		
		hs2.add(new Student("����",43,100));
		hs2.add(new Student("�踻��", 26, 40));
		hs2.add(new Student("ȫ�浿", 24, 20));
		hs2.add(new Student("����", 43, 100));
		
		System.out.println(hs2); // ���� ���� ���� �ȵ�/ �ߺ� ����X => ��? ���ϰ�ü�� �Ǵ��� ���� �ʰ� �־!
		
		// HashSet�̶�� ������ ��ü�� �߰��� ������ ���ϰ�ü���� ��!
		// ���ϰ�ü: �� ��ü���� hashCode() ȣ�� ����� ��ġ�ϰ�, equals�޼ҵ�� �� �� true�� ��� ���ϰ�ü��� �Ǵ�
		
		// Student�� equals() �������̵� => '���� �� �ʵ忡 ��� ������'���� �� ��ġ�ϸ� true/ ��ġ���� ������ false ��ȯ
		// Student�� hashCode() �������̵� => '���� �� �ʵ忡 ��� ������'���� ��ġ�ϸ� ������ 10���� ��ȯ
		/*
		System.out.println(new Student("����", 43, 100).hashCode());
		System.out.println(new Student("����", 43, 100).hashCode());
		System.out.println(new Student("����", 43, 100).equals(new Student("����", 43, 100)));
		*/
		
		//hs2.get(2); // hashCode�� �ε����� ���䵵 ���� get�޼ҵ� ��ü�� ���ǵǾ����� ����! (�� ��ü�� �̾ƿ� �� ����)
		
		// HashSet�� ��� ��� ��ü�鿡 ���������� ���� ����
		// 1. for�� ��� ����! (��, for each������ ����!)
		for(Object s : hs2) {
			System.out.println(s);
		}
		
		System.out.println("=================================");
		
		// 2. ArrayList�� ����� ���� �� ArrayList�� �ݺ��� �������� ����
		// ArrayList�� ��� ù ��° ���: ArrayList ���� �� addAll�޼ҵ� �̿��ؼ� ��°�� �߰��ϱ�
		ArrayList<Student> list = new ArrayList<Student>();
		list.addAll(hs2);
		
		// ArrayList�� ��� �� ��° ���: ArrayList ������ ���ÿ� ��°�� �߰��ϱ�
		ArrayList<Student> list2 = new ArrayList<Student>(hs2);
		
		for(int i=0; i<list2.size(); i++) {
			System.out.println(list2.get(i));
		}
		
		System.out.println("-------------------------------");
		
		// 3. Iterator �ݺ��ڸ� �̿��ؼ� ���������� ����
		Iterator<Student> it = hs2.iterator(); // hs2�� ����ִ� ��ü���� => Iterator(�ݺ���)�� ��� ����
		
		while(it.hasNext()) {
			Student s = it.next();
			System.out.println(s);
		}
		// StringTokinizer�� ����� ����
		
		//it.next(); // NoSuchElementException
		
		
		
		
		
	}

}
