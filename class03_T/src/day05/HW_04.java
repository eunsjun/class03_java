package day05;

import java.util.*;
public class HW_04 {
/*
 * 		다섯자리 숫자를 입력받아
		회문수인지 아닌지를 반복문으로 처리하세요.
 */
	public static void main(String[] args) {
		// 입력받을 준비
		Scanner sc = new Scanner(System.in);
		// 메세지 출력하고 입력받고
		System.out.println("다섯자리 숫자를 입력하세요!");
		String str = sc.next();
		// 처리하고
		String msg = str + " 숫자는 회문수 입니다.";
		for(int i = 0 ; i < 2 ; i++) {
			char ch1 = str.charAt(i);
			char ch2 = str.charAt(4 - i);
			if(ch1 != ch2) {
				msg = str + " 숫자는 회문수가 아닙니다.";
			}
		}
		// 출력하고
		System.out.println(msg);
	}
}
