package day14;

public class Test02 {
/*
		내부클래스( Inner Class )
		==> 클래스 내부에 클래스를 만들 수 있다.
		
		 종류]
		 	1. Top Level Inner Class
		 	==> 형식은 내부 클래스이지만 독립적으로 활동하는 클래스
		 		
		 		형식]
		 			static class 클래스이름 {}
		 			==> 내부에 만들면서 static 속성을 가지면 Top Level 이 된다.
		 			
		 		접근방법]
		 			바깥클래스.내부클래스
		 			
		 
		 ***
		 2. 전역 Inner Class
		 ==> 일반 클래스를 내부 클래스로 만들어 놓은 것.
		 	
		 	형식]
		 		class 클래스이름 {
		 		}
		 		
		 	특징]
		 		a. 바깥 클래스의 모든 멤버는 저절로 사용 가능 하다.
		 		b. 반드시 바깥클래스가 인스턴스가 된 이후 인스턴스를 생성할 수 있다.
		 			(바깥 클래스가 객체가 된후에 전역 내부 클스는 객체가 될 수 있다.)
		 			
		 			형식]
		 				new 바깥클래스().new 전역내부클래스();
		 				
		 		c. 바깥 클래스는 안쪽 클래스의 멤버를 사용 할 수 없고
		 			사용을 원할 경우 객체로 만든후(new 시킨 후) 사용해야 한다.
		 			
		 	## 주로 바깥 클래스와 연관된 기능을 가진 클래스를 만들고 싶을 때 많이 사용하는 기법...
		 
		 
		 3. 지역 Inner Class
		 	==> 내부 클래스를 만드는 위치가 바깥 클래스의 함수 안에서 만들어 진 것.
		 		
		 		예]
		 			class Test {
		 				int a;
		 				
		 				class Inner(){
		 				}
		 				
		 				void abc(){
		 					int no;
		 					
		 					class Inner2{
		 						
		 					}
		 				}
		 			}
		 			
		 	특징]
		 		a.	전역 내부 클래스와 마찬가지로 바깥 클래스의 멤버를 모두 사용할 수 있다.
		 		b.	이 클래스는 다른 곳에서  new 시킬 수 없다.
		 			오직 내포된 함수 안에서만 new 시킬 수 있다.
		 			
		 			
		4. 무명(익명) Inner Class
			==> 문자 그대로 이름이 없는 클래스를 말한다.
				
				우리가 프로그램을 만들다 보면 클래스의 기능 수정을 위해서
				오버라이드를 해야 하는 경우가 발생하는데....
				
				이때 원칙적으로는 
				다른 클래스를 만들고 상속 받아서 오버라이드를 해야하는데...
				
				이때 간단한 오버라이드를 해야 하는 경우
				그 기능하나 때문에 클래스를 따로 만들어야 하는 불편함이 있다.
				
				이런 불편함을 해결하기 위한 우회 방법이
				무명 내부 클래스이다.
				
				형식]
					new 클래스이름(){}
		 		
 */
	public Test02() {
		Test02_01.Soo01.abc();
		Test02_01 soo = new Test02_01();
		Test02_01.Soo02 soo2 = soo.new Soo02();
		Test02_01.Soo02 soo3 = new Test02_01().new Soo02();
		
		Test02_01 s1 = new Test02_01();
		
		Test02_01.Soo02 soo00 = s1.soo7;
		
		// 전역 Inner Class 변수 사용
		System.out.println(soo00.no1);
		
		
		
	}

	public static void main(String[] args) {
		new Test02();
	}

}

class Test02_01{
	int num = 10;
	Soo02 soo7;
	
	public Test02_01() {
		soo7 = new Soo02();
	}
	
	static class Soo01{
		static void abc() {};
	}
	
	class Soo02{
		int no1 = 100;
		void abc() {
			System.out.println(num);
		}
	}
}
