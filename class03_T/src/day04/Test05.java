package day04;

import java.util.*;
public class Test05 {
	/*
	 * 문제] 하나의 문자를 입력 받아서
	 * 		 그 문자가 대문자인지, 소문자 인지, 아니면 다른문자인지
	 * 		 출력해 보세요.
	 * 		삼항연산자를 사용해서 처리하세요.
	 * 
	 * 	()?( ()? () : ()) : ();
	 */
	public static void main(String[] args) {
		/*
		char ch = 'Z';
		int num = ch;
		
		char ch1 = 'A';
		char ch2 = 'c';
		
		System.out.println("ch1 > ch2 : " +(ch1 > ch2));
		*/
		
		// 입력받을 준비하고
		Scanner sc = new Scanner(System.in);
		// 메세지 출력하고 입력받고
		System.out.println("문자를 입력하세요 : ");
		String str = sc.next();
		char ch = str.charAt(0);
		int no = ch;
		// 데이터 비교해서 메세지 저장하고
		String msg = (no >= 'A' && no <= 'Z') ? 
				("입력한 문자 " + ch + " 는 대문자 입니다.") 
				: (
						(no >= 'a' && no <= 'z') ? 
												("입력한 문자 " + ch + " 는 소문자 입니다.") 
												: ("입력한 문자 " + ch + " 는 영문자가 아닙니다.")
					);
		
		// 출력하고
		System.out.println(msg);
	}
	
	/*
		String str = "Hello World";
		
		  charAt(인덱스) ==> 문자열의 인덱스에 해당하는 문자를 반환
		  
		  		문자열.charAt(숫자)
		  
		  참고]
		  		모든 프로그래밍 언어는 순서가 0부터 시작한다.
		 
		System.out.println("다섯번째 문자 : " + str.charAt(4));
	 * 
	 */

}
