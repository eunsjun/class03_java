package day09;

import java.util.*;
public class Test02 {

	public static void main(String[] args) {
		// 키보드 입력받기
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자 두개를 공백을 두고 입력하세요.");
		String sno = sc.next();
		/*
		 		next() : 공백과 엔터 키를 같이 취급한다.
		 				공백이 들어갈 경우 공백 전의 문자열만 꺼내
		 				공백을 포함해서 나머지 문자열은 메모리에 그냥 둔다.
		 */
		System.out.println("sno 1st : " + sno);
		
		System.out.println("숫자 두개를 공백을 두고 입력하세요.");
		sno = sc.nextLine(); // next()에서 "20" 만 꺼냈고 나머지 " 20" 남겨뒀는데
							// nextLine()에서 나머지 문자열을 모두 꺼냈다.(" 20")
		/*
		 * 	nextLine() : 엔터키는 인식을 한다.
		 * 				버퍼 메모리에 저장되어있는 내용(공백 포함)을 문자열로 꺼내는 함수..
		 */
		System.out.println("sno 2nd : " + sno);
	}

}
