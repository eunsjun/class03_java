package day05;

import java.util.*;
public class Test06 {
/*
 * switch case
 * 		: if else if else 문과 비슷한 조건처리문
 * 
 * 		형식]
 * 			switch (연산식){
 * 			case 값1:
 * 				실행문1;
 * 				break;
 * 			case 값2:
 * 				실행문2;
 * 				break;
 * 			...
 * 			case 값n:
 * 				실행문n;
 * 				break;
 * 			default
 * 				값이 없는 경우 처리명령;
 * 			}
 * 
 * 			break 명령이 없을 경우는 switch case 문장이 끝날때까지 다 읽으므로 제대로된 값을 얻지 못한다.
 * 
 * 
 * 		***
 * 		break 명령은 switch case 문 과 반복문의 종료를 알려주는 명령어이다.
 */
	public static void main(String[] args) {
		/*
		 *  예제]
		 *  	dno 가 10 인 경우는 회계부
		 *  			20인 경우는 영업부
		 *  			30인 경우는 연구부
		 *  			나머지 경우는 총무부로 
		 *  		부서를 구분하세요.
		 */
		
		// 입력받을 준비
		Scanner sc = new Scanner(System.in);
		// 메세지 출력하고 입력받고
		System.out.print("부서번호를 입력하세요! : ");
		int dno = sc.nextInt();
		String dname ;

		switch (dno) {
		case 10:
			dname = "회계부";
			break;
		case 20:
			dname = "영업부";
			break;
		case 30:
			dname = "연구부";
			break;
		default :
			dname = "총무부";
		}
/*
 * ### 이렇게(break 없이) 사용하면 절대 안된다.
		switch (dno) {
		case 10:
			dname = "회계부";
		case 20:
			dname = "영업부";
		case 30:
			dname = "연구부";
		default :
			dname = "총무부";
		}
 */
		
		
		// 출력하고
		System.out.println("입력한 부서번호 " + dno + " 는 " + dname + " 입니다.");
	}
}
