package day13;

public class Test02 {
/*
	**********
	다형성
		: 하나의 변수를 이용해서 여러형태의 클래스를 사용하도록 하는 기법
	
	
		주소의 형변환( Casting )
		==> 원칙적으로 주소는 다른 형태로 형 변환이 불가능하다.
			즉, 주소는 Heap 타입에 따라 주소가 결정되므로
			Heap 타입이 다르면 주소를 기억할 수 없다.
			
			예]
				int[] a = new float[5];	==> X
				Test t = new Calc();	==> X
				
			***
			그러나 딱 한가지 경우에 한해서는 주소의 형변환이 가능 하다.
			***
			상속 관계에 있는 클래스 끼리는 형변환이 가능하다.
			
			왜???
				: is a 관계이기 때문에.....
				
				자동형변환
					하위클래스의 인스턴스는 상위클래스의 변수에 기억되는 것은 
					자동적으로 형변환을 해준다.
					
				강제형변환
					상위클래스의 인스턴스는 하위클래스의 변수에 기억되는것은
					원칙적으로는 불가능하며
					다만 강제적으로 형변환을 해 주어야 한다.
					
					예]
						class Grand{}
						class Father extends Grand {}
						class Son extends Father {}
						
						Son s = new Son();
						Father f = s;
						Grand g = s;
						==> 자동 형변환
						
						Grand g = new Grand();
						Father f = g; 			==> X
						Father f = (Father) g; 	==> O
						Son s = g;				==> X
						Son s = (Son) g ;		==> O
						==> 강제형변환(단, 상속관계에 있는 경우에 한해서만...)
						
			다형성이란?
				주소의 형변환 이론을 기반으로 하여
				상위 클래스의 주소를 이용해서 하위 클래스를 이용할 수 있으며
				상위 클래스의 주소를 이용하면
				여러 하위 클래스들을 다룰 수 있다.
				
		***
		클래스의 크기비교는 멤버(변수+함수)로 해주자.
		
		
		개발자 입장에서의 다형성
			상위 클래스의 변수를 사용하면 하위클래스의 인스턴스를 사용할 수 있다.
				Grand g = new Son();
				g = new Father();
			상위 클래스의 변수를 이용해서 하위클래스의 각 인스턴스를 받아서 사용하면 된다.
			
			
		참고]
			개발자 입장에서 다형성 사용방법
				1. 어떤 함수가 상위 클래스를 매개변수로 가지고 있다면
					하위 클래스를 주어도 상관 없다.
					
					예]
						void xyz(double d){}
						
						==> xyz(3.14f);
							xyz(10);
						
						
						void abc(Grand g){
						}
						
						==> abc(new Son());
							abc(new Father());
						
					따라서 어떤 함수가 매개변수에 Object 로 선언되어있다면
					모든 데이터를 사용해서 그 함수를 실행 시킬수 있다.
					
						
				2. 	어떤 함수가 하위클래스를 반환값으로 가지고 있으면
					반드시 원하는 하위클래스 형태로 형변환해서 사용해야 한다.
					
					예]
						Son soo(){
							Father f = ...;
							return (Son) f;
						}
						
						String soo2(Object o){
							
							return (String) o;
						}

 */
	public Test02() {
		Grand g = new Grand();
		g = new Father();
		g = new Son();
		
	}

}

class Grand{
	
}
class Father extends Grand{
	
}
class Son extends Father{
	
}
