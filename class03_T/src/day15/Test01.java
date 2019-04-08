package day15;

import java.util.Arrays;

public class Test01 {
/*
		Object 클래스
			==> 자바로 만든 모든 클래스의 최상위 클래스 역할을 담당한다.
				솔직히 말해
				하는일은 별로 없고
				자바에서 상속관계를 명확하게 하기 위한 역할을 주로 많이한다.
				
				==> 모든 클래스이 인스턴스를 변수에 담을수 있다.
					주의]
						사용할때는 반드시 정확한 형태로 형변환해서 사용해야 한다.
						
					EX]
						Object obj = 10;
						Object obj1 = 2;
						
						int no = obj + obj1; ==> X 강제 형변환해줘야 된다.
						
		1. equals()		==> == 연산자와 같은 기능...
			==> 비교함수
				***
				데이터를 비교하는 함수가 아니고 주소를 비교하는 함수이다.
				
				참고]
					String 의 equals() 는 Object 클래스의 equals()를 오버라이딩 한 함수이다.
					따라서 Object 클래스의 기능과는 차이가 있다.
					
					만약
					우리가 만든 클래스가 내용 비교를 하는 기능이 필요하다면
					이 equals()를 오버라이드 하면 된다.
		
 */
	public Test01() {
/*
		Grand g = new Son();
//		g.xyz(); 	// Grand 클래스에는 xyz() 없어서 못쓴다.
		g.abc();
		
		Father f = new Son();
//		g = f;
		f.abc();
		f.xyz();
*/
		Object obj1 = 10;
		Object obj2 = 2;
		
		/*
		int num = obj1 + obj2;
			obj1, obj2 는 Integer보다 범위가 넓은 클래스이고
			+ 연산 기능은 없기때문에 연산이 안된다.
		*/
		
		int num = (int)obj1 + (int)obj2;
		
		System.out.println("obj1 + obj2 : " + num);
		System.out.println(obj1.toString());
		
		Object[] ostr = {1234, "1234", '1', 10};
		
		int num1 = (int)ostr[0] + (int)ostr[3];
		System.out.println("result : " + num1);
		System.out.println(ostr.toString());
	}

	public static void main(String[] args) {
		new Test01();
	}

}

class Grand {
	void abc() {
		System.out.println("*** 여기는 할아버지 abc() ");
	}
}

class Father extends Grand {
	void abc() {	// 오버라이드
		System.out.println("### 여기는 아버지 abc() ");
	}
	
	void xyz() {
		System.out.println("*** 여기는 아버지 xyz() ");
	}
}

class Son extends Father {
	void xyz() {
		System.out.println("### 여기는 아들 xyz() ");
	}
}
