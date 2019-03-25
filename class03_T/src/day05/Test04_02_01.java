package day05;

import java.util.*;
public class Test04_02_01 {
/*
 * Bonus]
 * 		�Խù��� ����ϴµ�
 * 		���������� 15���� ����� �� �ִ�.
 * 		���Ƿ� ���ڸ� �Է��ؼ�
 * 		�� �������� �ʿ����� ����ؼ� ����ϼ���.
 * 
 * 		��]
 * 			�Խñ��� ������ 31 ���� �Խ����� 
 * 			3�������� �ʿ��մϴ�.
 * 
 * 		1. 0 �� ���
 * 		2. 0�� �ƴϰ� 15�� ������ �������� ���
 * 		3. 0�� �ƴϰ� 15�� ������ �������� �ʴ� ���
 * 
 * ��]
 * 		0 �ΰ�� ��� 1�������� �ʿ��ϴ�.
 * 		15�� ������ �������� ���.. == > �ѱۼ� / 15 ==> 30 /15 ==> 2
 * 		31 ���� �� �ۼ� / 15 + 1  ==> 31 / 15 + 1
 * 
 */
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		// �޼��� ����ϰ�
		System.out.print("�Խù� ���� �Է��ϼ���! : ");
		String str = sc.next();
		
		int num = Integer.parseInt(str);
		int page = 0;
		
		if(num == 0) {
			page = 1;
		} else {
			if(num % 15 == 0) {
				page = num / 15;
			} else {
				page = num / 15 + 1 ;
			}
		}
		
		System.out.println("�Էµ� �Խñ� �� " + num + " �� " + page + " �������� �ʿ��մϴ�.");
	}

}
