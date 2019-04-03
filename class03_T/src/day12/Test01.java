package day12;




import static java.lang.Math.*;

public class Test01 {
/*
		package & import
			1. package
				==> 자바로 만든 프로그램 소스가 들어있는 폴더를 자바에서 지칭하는 단어
					
					자바는 오픈소스이다.
					모든 사람이 자신이 만든 프로그램을 제공할 수 있고
					그것을 모든 사람이 사용할 수 있는 프로그램이다.
					
					그러다보니 문제가 발생하는데
						==> 클래스이름이 충돌이 날 수 있다.
					이런문제를 해결하기 위해서 만든어 놓은 정책이 패키지 이다.
					
					즉, 소스를 만드는 사람이 
					그 프로그램이 포함되는 폴더 이름까지 정해서 
					프로그램을 제작하도록 하는 것.
					
					결론]
						자바 프로그램을 만들때는 반드시 
						이 프로그램 어떤 폴더에 저장되었는지를 알려주도록 해 놓았다.
						
					명령 형식]
						package		폴더이름;
						
			참고]
				패키지 이름 만드는 권장 사항
					==> 자신이 사용하는 도메인을 역순으로 쓴 후 
					다시 폴더이름을 붙인다.
					
					예]
						도메인이 increpas.com 이라면
						==> com.increpas.폴더이름;
						
		======================================================================
		import ???
			==> 사용할 클래스가 어떤 패키지에 소속되어있는 클래스인지 밝혀주는 명령
				예]
					Test.class 클래스를 SAMPLE 패키지에 만들고
					또 test 라는 패키지에 Test.class 라고 다시 프로그램을 만들었다면
					
					나중에 Test.class 라는 클래스를 사용해야 할 경우
					
					어떤 패키지에 있는 Test.class 인지를 밝혀줘야 정확한 기능을 사용할 수 있을것이다.
					
					따라서
					SAMPLE 패키지에 있는 Test.class 를 사용해야 할 경우라면
					==> import  SAMPLE.Test;	라고 밝혀줘야 한다.
					
					
			형식]
				1. import 	패키지경로.클래스이름;
					==> 패키지경로의 클래스이름의 클래스를 사용할 예정임을 밝히는 것
				2. import	패키지경로.*;
					==> 패키지경로의 모든 클래스를 사용할 예정임을 밝히는 것
					
					
				만약
					1, 2 을 모두 사용하는 경우
					1 을 우선시 한다.
					
			
			참고]
				import 하지 않아도
				명시적으로 클래스이름 앞에 패키지 이름을 붙여서 사용 할 수도 있다.
				
				예]
					Sample	Test.class
					Test	Test.class
					
					Test.Test t = new Test.Test();
					
			참고]
				import 를 하게 되면 
				해당 패키지(폴더) 내의  클래스만 사용하게 된다.
				(하위폴더내의 클래스는 제외)
				
				
	static import
	==> static 멤버는 원칙적으로 클래스이름.멤버로 사용한다.
		
		Math.PI	==> 3.141592...
		Math.random()
		
		이때 멤버 앞의 클래스이름도 생략할 수 있다.
		
		static 멤버를 사용할 때
		소속 클래스이름을 생략하도록 하는 방법이 
				static import
		이다.
		
		형식]
			import		static 		패키지이름.클래스이름.*;
					
 */
	float phy = (float)PI;
	public Test01() {
		for(int i = 0 ; i < 10 ; i++ ) {
			int no = (int)(random()*51 + 50);
			System.out.println("영수씨 점수들 : " + no);
		}
		
		System.out.println("파이 값 : " + phy);
	}
	
	public static void main(String[] args) {
		new Test01();
	}

}
