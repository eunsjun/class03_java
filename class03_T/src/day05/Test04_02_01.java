package day05;

import java.util.*;
public class Test04_02_01 {
/*
 * Bonus]
 * 		게시물을 출력하는데
 * 		한페이지에 15개씩 출력할 수 있다.
 * 		임의로 숫자를 입력해서
 * 		몇 페이지가 필요한지 계산해서 출력하세요.
 * 
 * 		예]
 * 			게시글의 갯수가 31 개인 게시판은 
 * 			3페이지가 필요합니다.
 * 
 * 		1. 0 인 경우
 * 		2. 0이 아니고 15로 나누어 떨어지는 경우
 * 		3. 0이 아니고 15로 나누어 떨어지지 않는 경우
 * 
 * 예]
 * 		0 인경우 적어도 1페이지는 필요하다.
 * 		15로 나누어 떨어지는 경우.. == > 총글수 / 15 ==> 30 /15 ==> 2
 * 		31 경우는 총 글수 / 15 + 1  ==> 31 / 15 + 1
 * 
 */
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		// 메세지 출력하고
		System.out.print("게시물 수를 입력하세요! : ");
		String str = sc.next();
		
		int num = Integer.parseInt(str);
		int page = 0;
		
		if(num == 0) {
			page = 1;
		} else {
			if(num % 15 == 0) {
				page = num / 15;
			} else {
				page = num / 15 + 1 ;
			}
		}
		
		System.out.println("입력된 게시글 수 " + num + " 는 " + page + " 페이지가 필요합니다.");
	}

}
