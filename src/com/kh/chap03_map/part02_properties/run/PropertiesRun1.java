package com.kh.chap03_map.part02_properties.run;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import com.kh.chap03_map.part01_hashMap.model.vo.Snack;

public class PropertiesRun1 {

	public static void main(String[] args) {

		// Properties: Map�迭��  �÷��� => Ű+��� ��Ʈ�� �����ؾ���
		// HashMap���� ������: Properties���� Ű���� String, ������� String���� ����!
		
		Properties prop = new Properties();
		/*
		// Map �迭�̱� ������ put �޼ҵ� �̿��ؼ� Ű+��� ��Ʈ ��� ����!
		prop.put("������", new Snack("���ڸ�", 1500));
		prop.put("�����", new Snack("§��", 700));
		
		System.out.println(prop);
		System.out.println(prop.get("������")); // get�޼ҵ� �̿밡��!
		
		// ������ properties ����ϴ� ���� �ַ� Properties�� ��� �͵��� ���Ϸ� ��� �Ǵ� �Է¹޾� �� �� �����!
		// ��, Properties���� �����ϴ� store(), load() �޼ҵ带 ����ϱ� ���ؼ�
		
		try {
			prop.store(new FileOutputStream("test.properties"), "propertiesTest"); 
			// ClassCastException // Ŭ������ ����ȯ���� ���� �߻�
			// ���������� store�޼ҵ� ���� �� Properties�� ����ִ� Ű+��� ��Ʈ���� String���� ����ȯ�ؼ� �����!
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		*/
		
		// Properties Ű+��� ��Ʈ�� �߰��� ��
		// 1. setProperty(String key, String value)
		prop.setProperty("List", "ArrayList");
		prop.setProperty("Set", "HashSet");
		prop.setProperty("Map", "HashMap");
		prop.setProperty("Map", "Properties");
		
		System.out.println(prop); // ���� ���� ���� �ȵ�, key�� �ߺ� �� �������
		
		// 2. getProperty
		System.out.println(prop.getProperty("List"));
		System.out.println(prop.getProperty("�����")); // null�� ��ȯ. ���� �߻����� ����
		
		try {
			// 3. store(OutputStream os, String comments): Properties�� ����ִ� key-value ������ ���Ϸ� ���(���������� �� String���� ��ȯ)
			prop.store(new FileOutputStream("test.properties"), "propertiesTest");
			
			// 4. storeToXML(OutputStream os, String comments)
			prop.storeToXML(new FileOutputStream("test.xml"), "propertiesTest");
			
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		
	}

}
