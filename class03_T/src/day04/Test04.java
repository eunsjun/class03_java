package day04;


import java.util.*;
public class Test04 {

	public static void main(String[] args) {
		/*
		 * 단항 연산지 : 피 연산자가 하나인 연산자( ++, -- )
		 * 이항 연산자 : 피 연산자 2개인 연산자
		 * 
		 * 삼항 연산자 : 피 연산자가 3개인 연산자.
		 * 
		 * 		조건연산자 - 조건에 따라서 입력되는 값이 결정되는 연산자.
		 * 			형식]
		 * 				(조건식) ? (참일때 값) : (거짓일 때 값);
		 * 	
		 */
		
		// 입력 받을 준비
		Scanner sc = new Scanner(System.in);
		// 입력받고 저장하고
		// 첫번째 숫자 입력받고 저장
		System.out.print("첫번째 숫자 : ");
		String str = sc.next();
		int no1 = Integer.parseInt(str);
		System.out.println(); // 줄바꿈...
		// 두번째 숫자 입력받고 저장
		System.out.print("두번째 숫자 : ");
		str = sc.next();
		int no2 = Integer.parseInt(str);
		System.out.println();
		// 데이터 비교하고 출력메세지 입력...
		String msg = (no1 > no2) ? ("no1이 큽니다.") : ("no! no2가 더커...!");
		// 출력한다.
		System.out.println(msg);
	}

}
