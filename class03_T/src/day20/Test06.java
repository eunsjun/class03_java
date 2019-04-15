package day20;

import java.util.*;
import java.io.*;
public class Test06 {
/*
	Properties �� Map �����͸� ����ϰ� ���Ͽ� ��������.
 */
	public Test06() {
		Properties prop = new Properties();
		prop.put("name", "������");
		prop.put("age", "24");
		prop.put("tel", "010-1111-1111");
		prop.put("addr", "���� ���Ǳ� �Ÿ���");
		
		// ���� ���Ϸ� ������ �غ���.
		FileOutputStream fout;
		try {
			fout = new FileOutputStream("src/etc/Result.txt");
			prop.store(fout, "�ּ��� ����� ������ ����");
			System.out.println("���� �Ϸ�!");
		} catch(Exception e) {
			System.out.println("���� ����...");
		}
	}

	public static void main(String[] args) {
		new Test06();
	}

}
