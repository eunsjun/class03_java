package day17;

import java.util.*;
public class Test10 {
/*
		�پ��� Ÿ���� �����͸� �Է��� ����.
 */
	public Test10() {
		// ���͸� �����.
		Vector vec = new Vector();
		
		// ������ �Է�
		vec.add("������");	// String
		vec.add(24);		// Integer
		vec.add(Calendar.getInstance());	// Calendar
		vec.add(3.14f);		// Float
		vec.add(false);		// Boolean
		/*
			�÷��� �� ������ �Է��Լ��� �Ű����� Ÿ���� Object �� �Ǿ� �־
			��� ������ Ÿ���� ��� ���� �� �� �ִ�.
			��? ��� Ŭ������ ������ Object �̹Ƿ�...
		 */
		
		String name = (String) vec.get(0);
		System.out.println("Name : " + name);
		
		for(Object o : vec) {
			System.out.println("### " + o);
		}
		
	}

	public static void main(String[] args) {
		new Test10();
	}

}
