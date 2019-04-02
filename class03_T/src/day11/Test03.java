package day11;


import java.util.*;

import day11.test.StaticTest;
public class Test03 {
/*
		static 속성
			: static 영역에 만들어지는 변수나 함수 에 붙이는 속성
			
			
			참고]
				클래스, 함수, 변수 를 만들때 속성을 지정할 수 있다.
				예]
					클래스 	: [접근지정자]	[속성]		class 	클래스이름{}
					
					함수	: [접근지정자]	[속성]		반환값타입/유형		함수이름(매개변수리스트){}
					
					변수	: [접근지정자]	[속성]		데이터타입		변수이름;
					
					
			static 영역의 특징
				1. 	프로그램이 실행되기 위해 JVM이 로딩되는 순간 저절로 생기는 영역
					사용자가 요구하지 않아도 자동으로 생기는 영역이다.
				
				***
				2. 	한번 생긴 변수나 함수는 두번 다시 생기지 않는다.
				
		static 변수
			==> 	static 영역에 생기는 변수
					
					형식]
						[접근지정자] static 데이터타입 변수이름;
			
		static 함수
			==> static 영역에 생기는 함수
 */
	public Test03() {
//		Scanner sc = new Scanner(System.in);
		
		String str1 = "abcd";
		String str2 = "abcd";
		
		System.out.println("str1 == str2 : " + (str1 == str2));
		
		int no = StaticTest.num2;
		
		StaticTest test = new StaticTest();
		int no2 = test.num1;
		
		System.out.println("num1 : " + no2);
		System.out.println("num2 : " + no);
		
	}

	public static void main(String[] args) {
		new Test03();
	}

}
