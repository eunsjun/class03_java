package day15;

import java.util.Arrays;

public class Test01 {
/*
		Object Ŭ����
			==> �ڹٷ� ���� ��� Ŭ������ �ֻ��� Ŭ���� ������ ����Ѵ�.
				������ ����
				�ϴ����� ���� ����
				�ڹٿ��� ��Ӱ��踦 ��Ȯ�ϰ� �ϱ� ���� ������ �ַ� �����Ѵ�.
				
				==> ��� Ŭ������ �ν��Ͻ��� ������ ������ �ִ�.
					����]
						����Ҷ��� �ݵ�� ��Ȯ�� ���·� ����ȯ�ؼ� ����ؾ� �Ѵ�.
						
					EX]
						Object obj = 10;
						Object obj1 = 2;
						
						int no = obj + obj1; ==> X ���� ����ȯ����� �ȴ�.
						
		1. equals()		==> == �����ڿ� ���� ���...
			==> ���Լ�
				***
				�����͸� ���ϴ� �Լ��� �ƴϰ� �ּҸ� ���ϴ� �Լ��̴�.
				
				����]
					String �� equals() �� Object Ŭ������ equals()�� �������̵� �� �Լ��̴�.
					���� Object Ŭ������ ��ɰ��� ���̰� �ִ�.
					
					����
					�츮�� ���� Ŭ������ ���� �񱳸� �ϴ� ����� �ʿ��ϴٸ�
					�� equals()�� �������̵� �ϸ� �ȴ�.
		
 */
	public Test01() {
/*
		Grand g = new Son();
//		g.xyz(); 	// Grand Ŭ�������� xyz() ��� ������.
		g.abc();
		
		Father f = new Son();
//		g = f;
		f.abc();
		f.xyz();
*/
		Object obj1 = 10;
		Object obj2 = 2;
		
		/*
		int num = obj1 + obj2;
			obj1, obj2 �� Integer���� ������ ���� Ŭ�����̰�
			+ ���� ����� ���⶧���� ������ �ȵȴ�.
		*/
		
		int num = (int)obj1 + (int)obj2;
		
		System.out.println("obj1 + obj2 : " + num);
		System.out.println(obj1.toString());
		
		Object[] ostr = {1234, "1234", '1', 10};
		
		int num1 = (int)ostr[0] + (int)ostr[3];
		System.out.println("result : " + num1);
		System.out.println(ostr.toString());
	}

	public static void main(String[] args) {
		new Test01();
	}

}

class Grand {
	void abc() {
		System.out.println("*** ����� �Ҿƹ��� abc() ");
	}
}

class Father extends Grand {
	void abc() {	// �������̵�
		System.out.println("### ����� �ƹ��� abc() ");
	}
	
	void xyz() {
		System.out.println("*** ����� �ƹ��� xyz() ");
	}
}

class Son extends Father {
	void xyz() {
		System.out.println("### ����� �Ƶ� xyz() ");
	}
}
