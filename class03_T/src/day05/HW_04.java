package day05;

import java.util.*;
public class HW_04 {
/*
 * 		�ټ��ڸ� ���ڸ� �Է¹޾�
		ȸ�������� �ƴ����� �ݺ������� ó���ϼ���.
 */
	public static void main(String[] args) {
		// �Է¹��� �غ�
		Scanner sc = new Scanner(System.in);
		// �޼��� ����ϰ� �Է¹ް�
		System.out.println("�ټ��ڸ� ���ڸ� �Է��ϼ���!");
		String str = sc.next();
		// ó���ϰ�
		String msg = str + " ���ڴ� ȸ���� �Դϴ�.";
		for(int i = 0 ; i < 2 ; i++) {
			char ch1 = str.charAt(i);
			char ch2 = str.charAt(4 - i);
			if(ch1 != ch2) {
				msg = str + " ���ڴ� ȸ������ �ƴմϴ�.";
			}
		}
		// ����ϰ�
		System.out.println(msg);
	}
}
