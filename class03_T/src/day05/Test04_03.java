package day05;

import java.util.*;
public class Test04_03 {
/*
 * �ټ��ڸ� ���ڸ� �Է¹޾� 
 * �� ���ڰ� ȸ���� ���� �ƴ��� �Ǻ��ϼ���.
 * 
 * ȸ����]
 * 			ó�����ڿ��� ���� �� ������ ���ڿ��� ���� 
 * 			���ڸ� ���ؼ�
 * 			���� ���ڸ� ȸ������ �Ѵ�.
 * 			��]
 * 				1234321
 * 				23632
 * 				1551
 * 				121
 * 
 * ���ڷ� ��
 * ���ڿ��� ��
 * 
 * 
 */
	public static void main(String[] args) {
		// 1. �Է¹��� �غ��ϰ�
		Scanner sc = new Scanner(System.in);
		// 2. �޼��� ����ϰ� �Է¹ް�
		System.out.print("�ټ��ڸ� ���� �Է� : ");
		String sno = sc.next();
		// 3. ������ ó���ϰ�
		String str1 = "" + sno.charAt(0) + sno.charAt(1);
		String str2 = "" + sno.charAt(4) + sno.charAt(3);
		
		int no1 = Integer.parseInt(str1);
		int no2 = Integer.parseInt(str2);
		
		String msg = " �� ȸ������ �ƴմϴ�.";
		
		if(no1 == no2) {
			msg = " �� ȸ���� �Դϴ�.";
		}
		
		/*
		 * if(str1.equals(str2)) { msg = " �� ȸ���� �Դϴ�."; }
		 * 
		 */		// 4. ����ϰ�
		System.out.println("�Է��� ���� " + sno + msg);
	}

}
