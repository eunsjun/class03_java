package day03;

/*
 * 숫자를 입력받아서
 * 		1. 사각형의 넓이를 구하세요.
 * 		2. 삼각형의 넓이를 구하세요.
 * 		3. 원의 넓이를 구하세요.
 */

import java.util.*;
public class Test06 {
	public static void main(String[] args) {
		/*
		 * int num = 10;
		 * int calc = 2*num;
		 */
		
		final float PHI = 3.14f;
		
		// 1. 입력받을 준비
		Scanner sc = new Scanner(System.in);
		
		// 2. 메세지 출력하고
		System.out.println("1. 첫번째 숫자 : ");
		String snum = sc.next();
		int num1 = Integer.parseInt(snum);
		System.out.println("2. 두번째 숫자 : ");
		snum = sc.next();
		float num2 = Integer.parseInt(snum); // int 타입이 float 타입으로 자동형변환된다.
		
		
		// 3. 계산하고
		float samgak = num1 * num2 / 2 ;
		
		int sagak = num1 * (int)num2 ;
		
		float won1 = num1 * num1 * PHI ;
		
		float won2 = num2 * num2 * PHI ;
		
		// 4. 출력하고
		System.out.println("삼각형의 넓이 : " + samgak);
		System.out.println("사각형의 넓이 : " + sagak);
		System.out.println("첫번째 원의 넓이 : " + won1);
		System.out.println("두번째 원의 넓이 : " + won2);
		/* int - 기본 자료형 (객체가 아니다.)
		 		int 자료형처럼 객체가 될수 없는 타입을 
		 		객체로 만들수 있도록 만들어 놓은 클래스가 
		 		Wrapper 클래스이다.
				int ==> Integer
		
		Integer i1 = new Integer("33");
		int no1 = i1.intValue();
		System.out.println(no1);
		 */
		
		
	}
}
