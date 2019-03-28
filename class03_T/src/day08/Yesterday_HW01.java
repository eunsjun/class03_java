package day08;

import java.util.*;
public class Yesterday_HW01 {
/*
		문제]
				사칙연산 식을 입력받아서( "12-5")
 				계산 결과를 출력하세요.
 */
	public static void main(String[] args) {
		// 입력받을 준비
		Scanner sc = new Scanner(System.in);
		// 입력받는다.
		System.out.print("연산식을 입력하세요 : ");
		String str = sc.next();
		
		char ch = ' ';
		int idx = 0;
/*		char ch1 = '';
		String str1 = ""; // 메모리에 공간 할당까지 된 상태...
		String str2 ; // 변수만 만들어 놓은 상태..
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
