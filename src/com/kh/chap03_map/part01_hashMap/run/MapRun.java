package com.kh.chap03_map.part01_hashMap.run;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

import com.kh.chap03_map.part01_hashMap.model.vo.Snack;

public class MapRun {

	public static void main(String[] args) {

		HashMap<String,Snack> hm = new HashMap<>();
		
		// ��������
		// List�迭, Set�迭 Ŭ�������� Collection�� ������ Ŭ������. (Collection�� �θ�޼ҵ�)
		// => ��ü�� �߰��ϰ��� �� �� ���������� add�޼ҵ带 �̿��Ѵ�! (Collection�� add�޼ҵ尡 ����)
		
		// ������, Map�迭�� Collection�� ������ Ŭ������ �ƴ�!
		// => �߰��ϰ��� �� �� put�޼ҵ带 �̿��Ѵ�. (�� �� Ű+��� ��Ʈ�� ��ƾ���!)
		
		// 1. put(K key, V value): �÷��ǿ� Ű ��� ��Ʈ�� �߰������ִ� �޼ҵ�
		hm.put("������", new Snack("���ڸ�",1500));
		hm.put("ĭ��", new Snack("�ܸ�", 600));
		hm.put("�����", new Snack("§��", 500));
		
		hm.put("��������Ĩ", new Snack("§��", 500));
		
		System.out.println(hm); // {Ű=���, Ű=���, ...}
		// ����Ǵ� ���� ���� �ȵ�! value���� �ߺ��ŵ� Ű���� �ߺ� �� �Ǹ� �� �����!
		
		hm.put("�����", new Snack("�ſ��", 700));
		// ������ Ű������ �ٽ� �߰��ϴ� ��� value���� �������!! (�ߺ��� Ű���� ������ �� ����! Ű���� �ĺ��ڿ� ���� ������ ��!)
		System.out.println(hm);
		
		// 2. get(Object key): V 	=> �÷��ǿ��� �ش� Ű���� ������ Value���� ��ȯ�����ִ� �޼ҵ�
		Snack s = /*(Snack)*/hm.get("������");
		System.out.println(s);
		
		// 3. size(): �÷��ǿ� ����ִ� ��ü���� ���� ��ȯ
		System.out.println("�: " + hm.size());
		
		// 4. replace(K key, V value) => �÷��ǿ��� �ش� Ű �� ã�Ƽ� �ٽ� ������ Value������ ���������ִ� �޼ҵ�
		hm.replace("��������Ĩ", new Snack("�̳� §��", 1000));
		System.out.println(hm);
		
		// 5. remove(Object key) => �÷��ǿ��� �ش� Ű�� ã�Ƽ� �� Ű��� ��Ʈ�� ���������ִ� �޼ҵ�
		hm.remove("��������Ĩ");
		System.out.println(hm);
		
		// map ������ ��� ��� Ű���� ����� �� ����ϰ��� �� ��
		// for each�� �ȵ�!
		/*
		for( : hm) {
		
		}
		 */
		// ArrayList�ε� �� ��!
		//ArrayList list = new ArrayList(hm);
		
		// Iterator �ݺ��ڸ� �̿��ϴ� ����ۿ� ����!
		//Iterator it = hm.iterator(); // ��ٷ� iterator() ȣ�� ����! ��? iterator()�� List�迭 �Ǵ� Set�迭������ �� �� �ִ� �޼ҵ�!
		
		// Map�� Set�� �ٲ��ִ� �޼ҵ� ������ (�Դٰ� 2����!)
		// Map => Set�迭 => Iterator
		
		// 1. keySet() �̿��ϴ� ���
		// 1) hm�� �ִ� Ű�鸸 Set�� ��� (Ű���� ���� ����)
		// 	  hm.keySet() : Set ��ȯ
		Set<String> keySet = hm.keySet();
		
		// 2) 1�� �������� �۾��� keySet�� Iterator�� ���
		//	  keySet.iterator(): Iterator
		Iterator<String> itKey = keySet.iterator();
		
		// 3) �ݸ��� ���ؼ� �̱�
		while(itKey.hasNext()) {
			String key = /*(String)*/itKey.next();
			Snack value = /*(Snack)*/hm.get(key);
			System.out.println(key + "=" + value);
		}
		
		System.out.println("==========================================");
		
		
		// 2. entrySet() �̿��ϴ� ���
		// 1) hm.entrySet(): Set
		Set<Entry<String, Snack>> entrySet = hm.entrySet(); // Ű + ��� ��Ʈ�� ����
		
		// 2) entrySet.iterator(): Iterator
		Iterator<Entry<String, Snack>> itEntry = entrySet.iterator();
		
		// 3) �ݺ����� ���� ��������
		while(itEntry.hasNext()) {
			Entry<String, Snack> entry = /*(Entry)*/itEntry.next();// �� �ȿ� key, value�� �� �������!
			
			String key = /*(String)*/entry.getKey();
			Snack value = /*(Snack)*/entry.getValue();
			
			System.out.println(key + "=" + value);
		}
		
		
		
		
		
	}

}
