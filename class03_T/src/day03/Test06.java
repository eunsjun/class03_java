package day03;

/*
 * ���ڸ� �Է¹޾Ƽ�
 * 		1. �簢���� ���̸� ���ϼ���.
 * 		2. �ﰢ���� ���̸� ���ϼ���.
 * 		3. ���� ���̸� ���ϼ���.
 */

import java.util.*;
public class Test06 {
	public static void main(String[] args) {
		/*
		 * int num = 10;
		 * int calc = 2*num;
		 */
		
		final float PHI = 3.14f;
		
		// 1. �Է¹��� �غ�
		Scanner sc = new Scanner(System.in);
		
		// 2. �޼��� ����ϰ�
		System.out.println("1. ù��° ���� : ");
		String snum = sc.next();
		int num1 = Integer.parseInt(snum);
		System.out.println("2. �ι�° ���� : ");
		snum = sc.next();
		float num2 = Integer.parseInt(snum); // int Ÿ���� float Ÿ������ �ڵ�����ȯ�ȴ�.
		
		
		// 3. ����ϰ�
		float samgak = num1 * num2 / 2 ;
		
		int sagak = num1 * (int)num2 ;
		
		float won1 = num1 * num1 * PHI ;
		
		float won2 = num2 * num2 * PHI ;
		
		// 4. ����ϰ�
		System.out.println("�ﰢ���� ���� : " + samgak);
		System.out.println("�簢���� ���� : " + sagak);
		System.out.println("ù��° ���� ���� : " + won1);
		System.out.println("�ι�° ���� ���� : " + won2);
		/* int - �⺻ �ڷ��� (��ü�� �ƴϴ�.)
		 		int �ڷ���ó�� ��ü�� �ɼ� ���� Ÿ���� 
		 		��ü�� ����� �ֵ��� ����� ���� Ŭ������ 
		 		Wrapper Ŭ�����̴�.
				int ==> Integer
		
		Integer i1 = new Integer("33");
		int no1 = i1.intValue();
		System.out.println(no1);
		 */
		
		
	}
}
