package day04;

import java.util.*;
public class Test05 {
	/*
	 * ����] �ϳ��� ���ڸ� �Է� �޾Ƽ�
	 * 		 �� ���ڰ� �빮������, �ҹ��� ����, �ƴϸ� �ٸ���������
	 * 		 ����� ������.
	 * 		���׿����ڸ� ����ؼ� ó���ϼ���.
	 * 
	 * 	()?( ()? () : ()) : ();
	 */
	public static void main(String[] args) {
		/*
		char ch = 'Z';
		int num = ch;
		
		char ch1 = 'A';
		char ch2 = 'c';
		
		System.out.println("ch1 > ch2 : " +(ch1 > ch2));
		*/
		
		// �Է¹��� �غ��ϰ�
		Scanner sc = new Scanner(System.in);
		// �޼��� ����ϰ� �Է¹ް�
		System.out.println("���ڸ� �Է��ϼ��� : ");
		String str = sc.next();
		char ch = str.charAt(0);
		int no = ch;
		// ������ ���ؼ� �޼��� �����ϰ�
		String msg = (no >= 'A' && no <= 'Z') ? 
				("�Է��� ���� " + ch + " �� �빮�� �Դϴ�.") 
				: (
						(no >= 'a' && no <= 'z') ? 
												("�Է��� ���� " + ch + " �� �ҹ��� �Դϴ�.") 
												: ("�Է��� ���� " + ch + " �� �����ڰ� �ƴմϴ�.")
					);
		
		// ����ϰ�
		System.out.println(msg);
	}
	
	/*
		String str = "Hello World";
		
		  charAt(�ε���) ==> ���ڿ��� �ε����� �ش��ϴ� ���ڸ� ��ȯ
		  
		  		���ڿ�.charAt(����)
		  
		  ����]
		  		��� ���α׷��� ���� ������ 0���� �����Ѵ�.
		 
		System.out.println("�ټ���° ���� : " + str.charAt(4));
	 * 
	 */

}
