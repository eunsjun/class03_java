package day09;

import java.util.*;
public class Test01 {
	static double phi = Math.PI;
	static int num = (int)(Math.random()*10);
	
	public Test01() {
		// 이것은 Test01 클래스의 기본 생성자 함수
		// 생성자함수의 역할 - 클래스가 객체가 되었을 때 초기값을 가져야 되는 것들의 초기값을 셋팅하는 역할...
		
		Test01_01 t01 = new Test01_01();
		System.out.println(t01.num);
		
		// 조건문의 중첩
		
		// 정수 45를 저장할 변수
//		int no1 = 45 ; // 변수 선언과 변수 초기화까지 하는 명령...
		int no1 ;	// 변수선언. 4바이트의 정수를 기억할 공간을 주세요. 이름은 no1입니다. 아직 공간은 할당받않은 상태...
//		System.out.println(no1); // 아직 데이터가 들어갈 공간을 할당받지 못했고, 데이터도 물론 아무것도 결정되지 않은 상태...
		no1 = 45 ;	// no1 변수에 정수 45을 대입한다.
//		System.out.println(no1);
		
		/*
		 		... 조건문의 중첩 ...
		 */
		// if ~ else if 문은 여러조건중에 하나만 실행하는 조건문이다.
		if(no1 < 50) { // 50 보다 작은 경우 모두를 포함을 한다.
			// 조건문 내부의 조건문의 조건은 상위 조건에 종속이 된다.
			if(no1 < 75) { // 논리적 오류 
				
			}
			
			if(no1 < 30) {
				// no1 < 30
			} else if(no1 < 45) {
				// no1 >= 30 & no1 < 45 
			} else {
				// no1 >= 45 & no1 < 50
			}
		} else if(no1 < 100) { // 50 <= no1 && no1 < 100
			
		} else { // no1 >= 100
			
		}
		
		
		/*
		 		... 반복 명령 중첩 ...
		 */
		// 1
		for(int i = 0 /* 카운터변수 선언 초기화 */; i < 10 /* 반복문이 실행될 조건절 */ ; i++ /* 카운터변수 증감식 */ ) {
			// 반복 되어야 할 명령들을 기술...
			// 반복 되어야 할 명령들은 블럭({}) 안에 기술된 코드가 위에서 부터 아래로 실행이 된다.
			// 블럭안에 명령이 완료가 안되면 다름회차로 넘어가지 않는다...
			System.out.println("*");
			System.out.println("#");
			System.out.println("@");
			String sno ;
			// 2 반복명령 중첩 
			for(int j = 0 ; j < 1 ; j++) {
				Scanner sc = new Scanner(System.in);
				System.out.println("숫자를 입력하세요.");
				sno = sc.next();
				// 만약 숫자형태의 문자가 아닌것이 입력이 되었다면 다시 반복하자.
				// 3
				for(int k = 0 ; k < sno.length(); k++ ) {
					char ch = sno.charAt(i);
					if(ch < '0' || ch > '9') {
						j--;
						break;
					}
				}
			}

		}
	}
	
	public static void main(String[] args) { 
		// 프로그램이 실행이 되면 맨먼저 호출되는 함수....
		// (jvm이 제일먼저 검사하고 있으면 실행하는 함수...)
		new Test01();
	}
	
	static void abcd() {
		System.out.println("*****");
	}
}

class Test01_01{
	int num = 100;
	// 전역변수는 다른곳에서도 사용할 수 있다.
}
