package day08;

import java.util.*;
public class Yesterday_HW01 {
/*
		����]
				��Ģ���� ���� �Է¹޾Ƽ�( "12-5")
 				��� ����� ����ϼ���.
 */
	public static void main(String[] args) {
		// �Է¹��� �غ�
		Scanner sc = new Scanner(System.in);
		// �Է¹޴´�.
		System.out.print("������� �Է��ϼ��� : ");
		String str = sc.next();
		
		char ch = ' ';
		int idx = 0;
/*		char ch1 = '';
		String str1 = ""; // �޸𸮿� ���� �Ҵ���� �� ����...
		String str2 ; // ������ ����� ���� ����..
*/
		for(int i = 0 ; i < str.length(); i++ ) {
			if(str.charAt(i) < '0' || str.charAt(i) > '9') {
				ch = str.charAt(i);
				idx = i ;
			}
		}
		
		/*
		String sno1 = str.substring(0, idx);
		String sno2 = str.substring(idx+1);
		*/
		int num1 = Integer.parseInt(str.substring(0, idx));
		int num2 = Integer.parseInt(str.substring(idx+1));
		
		int gap = 0;
		
		switch (ch) {
		case '+':
			gap = num1 + num2;
			break;
		case '-':
			gap = num1 - num2;
			break;
		case '*':
			gap = num1 * num2;
			break;
		case '/':
			gap = num1 / num2;
			break;
		case '%':
			gap = num1 % num2;
			break;
		}
		
		System.out.printf("%5d %c %5d = %10d", num1, ch, num2, gap);
	}

}
