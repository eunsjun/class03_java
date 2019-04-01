package day10;

import java.util.Arrays;

public class Test01 {
	/*
	 * 객체지향언어( Object Oriented Programming ) : ==> 클래스를 이용해서 프로그램을 만들어가는 언어....
	 * 
	 * 클래스란?? ==> 하나의 목적을 달성하기 위해서 필요한 기능을 모아놓은 프로그램의 가장 큰 단위...
	 * 
	 * 예] 문자열을 관리해야겠다... ==> String
	 * 
	 * 여러개의 동일한 타입의 데이터를 관리해야겠다.. ==> Arrays
	 * 
	 * 클래스의 구성 요소 1. 변수 -- 필요한 데이터를 보관하는 것 2. 함수 -- 필요한 기능을 구현해 놓은 것 ##### 이 둘을 합쳐서
	 * 멤버라한다.
	 * 
	 * 클래스를 만드는 방법
	 * 
	 * [접근지정자] [속성] class 클래스이름 { 변수1; 변수2;
	 * 
	 * 함수1(){} 함수2(){} ... } ==> 변수1, 변수2, 함수1, 함수2 를 멤버라 한다.
	 *****
	 * 
	 * 주의할 점은 클래스는 설계도에 불과하다. 한마디로 틀로 생각하면 되겠다. 클래스를 가지고 있다고 해서 실행되는 것은 아니고 반드시 클래스가
	 * 실행 가능한 물건으로 탄생되어야 한다.
	 * 
	 * 이처럼 클래스를 실행 가능한 물건으로 만든 것(메모리에 올려진 것)을 "Object" 라 한다.
	 * 
	 * 결론] 객체지향언어란 클래스를 기반으로 만들어진 Object에 의해서 원하는 프로그램을 만들어가는 언어(기법)
	 * 
	 * ==> 클래스는 설계도 이므로 이것을 적절한 위치에 조립해서 원하는 프로그램을 만들어가는 언어(기법)...
	 ***
	 * 
	 * 객체를 만드는 방법
	 * 
	 * ==> 객체는 JVM (자바 가상 머신)이 만들어 준다. 다만 개발자는 필요한 부품을 만들어 달라고 명령만 내리면 된다.
	 * 
	 * new : 인스턴스(Instance) 만드는 명령( ==> 메모리에 올리는 명령 )
	 * 
	 * 클래스이름 변수; ==> 변수 선언(참조형 변수) 변수 = new 클래스이름(); 참고] 클래스이름() ==> 생성자함수 생성자 함수의
	 * 역할은 멤버변수의 초기화....
	 * 
	 * 클래스이름 변수 = new 클래스이름(); ==================== --------------------- 레펀런스 +
	 * Instance ==> Object
	 * 
	 * 
	 * 
	 * 예] Test라는 클래스가 존재한다면...
	 * 
	 * Test t; ==> 레퍼런스 변수 선언, t 의 heap 타입은 Test이다. t = new Test(); ==> new 명령으로
	 * Instance 가 만들어지는데...
	 * 
	 * ==> t 와 new 로 만들어진 인스턴스를 합쳐서 Object라 한다. 왜?? 인스턴스는 메모리에 저장이 될거고 메모리에 저장된 모든
	 * 것은 주소를 모르면 사용할 수 없기 때문에...
	 * 
	 * 
	 * 예] class Test { int a; float f; char c;
	 * 
	 * void abc(){}
	 * 
	 * void xyz(){}
	 * 
	 * }
	 * 
	 * class Exam{ public Exam(){ Test t = new Test(); // t의 heap 타입은 Test이고 t는 new
	 * Test()의 레퍼런스 변수이다. int no = t.a; // t의 변수는 .변수이름으로 사용 // 이때 a 는 Test의 멤버변수
	 * t.abc(); // abc()는 Test의 멤버함수... 이렇게 사용가능하다. } }
	 * 
	 * 
	 * 객체의 사용 방법 ==> 객체를 사용한다는 것은 그 목적을 달성하기 위해서 필요한 데이터를 기억하던지... 필요한 기능을(함수)
	 * 실행하던지...
	 * 
	 * 사용방법] 변수이름.멤버 로 사용한다.
	 **
	 * 
	 * 인스턴스는 여러개 만들어도 상관 없다. 단 인스턴스를 여러개 만들경우 각 인스턴스는 heap에 독립적으로 저장이 된다. 따라서 문자열의
	 * 경우 데이터를 동등비교연산자로 비교하게되면 같은 문자열이라도 다르다는 결과가 나온다. 이럴때 사용하는 함수는 equals 함수이다.
	 * 
	 * 
	 * 
	 * 변수] 지역변수 : 함수내부에서 만들어진 변수 함수 실행이 종료되면 사라지는 변수 객체를 만들었을때 접근이 불가능하다.
	 * 
	 * 전역변수 : 클래스(블럭{}) 내부에서 만들어진 변수 클래스 내부 어디서든지 사용가능하다. 객체를 만들게되면 접근이 가능하다. 생성시기는
	 * new 명령으로 인스턴스가 만들어질 때... 사라지는 시점은 프로그램이 종료될 때...
	 * 
	 * 
	 */
	public Test01() {
		// Test00에서 만든 프로그램을 실행해보자..
		Test00 t = new Test00();
		
		 int r = t.getRadius(); 
		 double[] data = t.getCalc(r); 
		 t.toPrint2(r, data[0], data[1]);
		 
		 System.out.println("data : " + Arrays.toString(data));
	}

	public static void main(String[] args) {
		new Test01();
	}

}
