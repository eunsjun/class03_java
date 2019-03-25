package day05;

import java.util.*;
public class Test04_03 {
/*
 * 다섯자리 숫자를 입력받아 
 * 그 숫자가 회문수 인지 아닌지 판별하세요.
 * 
 * 회문수]
 * 			처음숫자에서 부터 맨 마지막 숫자에서 부터 
 * 			숫자를 비교해서
 * 			같은 숫자를 회문수라 한다.
 * 			예]
 * 				1234321
 * 				23632
 * 				1551
 * 				121
 * 
 * 숫자로 비교
 * 문자열로 비교
 * 
 * 
 */
	public static void main(String[] args) {
		// 1. 입력받을 준비하고
		Scanner sc = new Scanner(System.in);
		// 2. 메세지 출력하고 입력받고
		System.out.print("다섯자리 숫자 입력 : ");
		String sno = sc.next();
		// 3. 적당히 처리하고
		String str1 = "" + sno.charAt(0) + sno.charAt(1);
		String str2 = "" + sno.charAt(4) + sno.charAt(3);
		
		int no1 = Integer.parseInt(str1);
		int no2 = Integer.parseInt(str2);
		
		String msg = " 는 회문수가 아닙니다.";
		
		if(no1 == no2) {
			msg = " 는 회문수 입니다.";
		}
		
		/*
		 * if(str1.equals(str2)) { msg = " 는 회문수 입니다."; }
		 * 
		 */		// 4. 출력하고
		System.out.println("입력한 숫자 " + sno + msg);
	}

}
