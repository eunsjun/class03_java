package day11;


import java.util.*;

import day11.test.StaticTest;
public class Test03 {
/*
		static �Ӽ�
			: static ������ ��������� ������ �Լ� �� ���̴� �Ӽ�
			
			
			����]
				Ŭ����, �Լ�, ���� �� ���鶧 �Ӽ��� ������ �� �ִ�.
				��]
					Ŭ���� 	: [����������]	[�Ӽ�]		class 	Ŭ�����̸�{}
					
					�Լ�	: [����������]	[�Ӽ�]		��ȯ��Ÿ��/����		�Լ��̸�(�Ű���������Ʈ){}
					
					����	: [����������]	[�Ӽ�]		������Ÿ��		�����̸�;
					
					
			static ������ Ư¡
				1. 	���α׷��� ����Ǳ� ���� JVM�� �ε��Ǵ� ���� ������ ����� ����
					����ڰ� �䱸���� �ʾƵ� �ڵ����� ����� �����̴�.
				
				***
				2. 	�ѹ� ���� ������ �Լ��� �ι� �ٽ� ������ �ʴ´�.
				
		static ����
			==> 	static ������ ����� ����
					
					����]
						[����������] static ������Ÿ�� �����̸�;
			
		static �Լ�
			==> static ������ ����� �Լ�
 */
	public Test03() {
//		Scanner sc = new Scanner(System.in);
		
		String str1 = "abcd";
		String str2 = "abcd";
		
		System.out.println("str1 == str2 : " + (str1 == str2));
		
		int no = StaticTest.num2;
		
		StaticTest test = new StaticTest();
		int no2 = test.num1;
		
		System.out.println("num1 : " + no2);
		System.out.println("num2 : " + no);
		
	}

	public static void main(String[] args) {
		new Test03();
	}

}
