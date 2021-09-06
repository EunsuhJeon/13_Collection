package com.kh.chap02_set.part01_hashSet.run;

import java.util.HashSet;

import com.kh.chap02_set.part01_hashSet.model.vo.Student;

public class SetRun {

	public static void main(String[] args) {

		// Object�� equals()		=> �� ��ü�� �ּҰ��� ����ؼ� ��ġ�ϸ� true/ ��ġ���� ������  false ��ȯ
		// Object�� hashCode()	=> �ش� ��ü�� '�ּҰ�'�� ������ 10������ ���·� ���� ��ȯ
		
		
		HashSet hs1 = new HashSet();
		
		hs1.add("�ݰ����ϴ�." );
		hs1.add(new String("�ݰ����ϴ�."));
		hs1.add(new String("������"));
		hs1.add(new String("�ȳ��ϼ���"));
		hs1.add(new String("������"));
		
		// String Ŭ������ hashCode() �������̵��Ǿ����� => '���� ��� ���ڿ�'�� ������ 10������ ���·� ���� ��ȯ
		
		System.out.println(hs1); // ����Ǵ� ���� ���� �ȵ�!!(�ε��� ���� ����!) // �ߺ��� ������(���ϰ�ü) ���� �Ұ�
		
		HashSet hs2 = new HashSet();
		
		hs2.add(new Student("����",43,100));
		hs2.add(new Student("�踻��", 26, 40));
		hs2.add(new Student("ȫ�浿", 24, 20));
		hs2.add(new Student("����", 43, 100));
		
		System.out.println(hs2); // ���� ���� ���� �ȵ�/ �ߺ� ����X => ��? ���ϰ�ü�� �Ǵ��� ���� �ʰ� �־!
		
		// HashSet�̶�� ������ ��ü�� �߰��� ������ ���ϰ�ü���� ��!
		// ���ϰ�ü: �� ��ü���� hashCode() ȣ�� ����� ��ġ�ϰ�, equals�޼ҵ�� �� �� true�� ��� ���ϰ�ü��� �Ǵ�
		
		// Student�� equals() �������̵� => '���� �� �ʵ忡 ��� ������'���� �� ��ġ�ϸ� true/ ��ġ���� �������� false ��ȯ
		// Student�� hashCode() �������̵� => '���� �� �ʵ忡 ��� ������'���� ��ġ�ϸ� ������ 10���� ��ȯ
		System.out.println(new Student("����", 43, 100).hashCode());
		System.out.println(new Student("����", 43, 100).hashCode());
		System.out.println(new Student("����", 43, 100).equals(new Student("����", 43, 100)));
		
	}

}
