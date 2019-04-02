package day11;


import java.util.*;

import day11.test.*;
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
				
		static 변수(정적변수)
			==> 	static 영역에 생기는 변수
					
					형식]
						[접근지정자] static 데이터타입 변수이름;
						
					특징]
						1. 여러 오브젝트가 공동으로 사용하는 변수가 된다.
							왜???
								<== 객체 100개를 만들어도 static 변수는 오직 한개이므로....
							따라서 한 객체가 데이터를 바꾸게되면
							다른 객체에도 영향을 받는다.
							
							그러므로 결국 static 변수는 객체의 의미가 없다.
							더군다나 객체화 되지 않아도 사용할 수 있다.
						
						2. new 시키지 않아도 사용할 수 있는 변수이다.
							<== 이미 메모리에 올려져 있으니까....
							
		사용문법]
				클래스이름.변수이름
				
		
		static 함수(정적함수)
			==> static 영역에 생기는 함수
				==> new 시키지 않아도(Instance를 만들지 않아도) 사용 할 수 있다.
				
			사용문법]
				
				클래스이름.함수이름();
				
			***
			특징]
				===> this 를 사용할 수 없다.
				
		결론]
			static 함수 안에서는 static 멤버만 사용할 수 있다.(메모리에 올려진 아이들...)
			일반함수 안에서는 일반멤버와 static 멤버를 모두 사용할 수 있다.
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
	
	public void toPrint() {
		
	}
	
	public static void main(String[] args) {
		Test03 test = new Test03();
		
		test.toPrint();
	}

}
