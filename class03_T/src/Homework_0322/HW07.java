package Homework_0322;

import java.util.*;
public class HW07 {

	public static void main(String[] args) {
		// 다섯 자리 숫자를 입력받아서
		// 각 자리 숫자의 합을 구해서 출력하세요...
		// "12345" ==> 1+2+3+4+5
		
		// 1. 입력 받을 준비하고
		Scanner sc = new Scanner(System.in);
		// 2. 입력받고
		System.out.println("다섯자리 숫자를 입력하세요! : ");
		String str = sc.next();
		sc.close();
		
		// 3. 입력받은값 변수에 저장하고
		char ch1 = str.charAt(0);
		char ch2 = str.charAt(1);
		char ch3 = str.charAt(2);
		char ch4 = str.charAt(3);
		char ch5 = str.charAt(4);
		
		// 문자열로 바꿔준다.
		String sno1 = ch1 + "" ;
		String sno2 = ch2 + "" ;
		String sno3 = ch3 + "" ;
		String sno4 = ch4 + "" ;
		String sno5 = ch5 + "" ;
		
		// 숫자로 바꿔준다.
		int no1 = Integer.parseInt(sno1);
		int no2 = Integer.parseInt(sno2);
		int no3 = Integer.parseInt(sno3);
		int no4 = Integer.parseInt(sno4);
		int no5 = Integer.parseInt(sno5);
		
		// 4. 계산하고
		int sum = no1 + no2 + no3 + no4 + no5;
		// 5. 출력하고
		System.out.println("입력받은 숫자 " + str + " 의 각자리수의 합은 " + sum + " 입니다.");
	}

}
