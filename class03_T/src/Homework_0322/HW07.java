package Homework_0322;

import java.util.*;
public class HW07 {

	public static void main(String[] args) {
		// �ټ� �ڸ� ���ڸ� �Է¹޾Ƽ�
		// �� �ڸ� ������ ���� ���ؼ� ����ϼ���...
		// "12345" ==> 1+2+3+4+5
		
		// 1. �Է� ���� �غ��ϰ�
		Scanner sc = new Scanner(System.in);
		// 2. �Է¹ް�
		System.out.println("�ټ��ڸ� ���ڸ� �Է��ϼ���! : ");
		String str = sc.next();
		sc.close();
		
		// 3. �Է¹����� ������ �����ϰ�
		char ch1 = str.charAt(0);
		char ch2 = str.charAt(1);
		char ch3 = str.charAt(2);
		char ch4 = str.charAt(3);
		char ch5 = str.charAt(4);
		
		// ���ڿ��� �ٲ��ش�.
		String sno1 = ch1 + "" ;
		String sno2 = ch2 + "" ;
		String sno3 = ch3 + "" ;
		String sno4 = ch4 + "" ;
		String sno5 = ch5 + "" ;
		
		// ���ڷ� �ٲ��ش�.
		int no1 = Integer.parseInt(sno1);
		int no2 = Integer.parseInt(sno2);
		int no3 = Integer.parseInt(sno3);
		int no4 = Integer.parseInt(sno4);
		int no5 = Integer.parseInt(sno5);
		
		// 4. ����ϰ�
		int sum = no1 + no2 + no3 + no4 + no5;
		// 5. ����ϰ�
		System.out.println("�Է¹��� ���� " + str + " �� ���ڸ����� ���� " + sum + " �Դϴ�.");
	}

}
