package day12;

public class Test03 extends Test01_01{
/*
		접근 지정자
		==> 내용을 누구까지(어느 클래스까지) 사용할 수 있게 하는지를 
		 	지정하는 예약된 용어
		 	
		 	즉,
		 	우리가 클래스를 만든다고 해서
		 	그 클래스가 모든 사람에게 공개되는 것은 아니다.
		 	클래스를 제작하는 사람이 그 사용범위를 지정할 수 있다.
		 	
		 	예]
		 		class 는 누구까지 이 클래스를 사용하도록 할 것인가?
		 		new 시킬수 있도록 할 것인가?
		 		
		 		함수는 누구까지 호출하도록 할 것인가??
		 		
		 		변수는 누구까지 데이터를 읽거나 수정하도록 할 것인가??
		
		종류]
			1. public
				==> 모든 곳에서 사용가능
			
			2. protected
				==> 상속받은 하위클래스 + 동일 패키지 소속의 클래스에서만 사용가능
				
			3. 생략
				==> 같은 패키지 소속의 클래스에서만 상용 가능
				
			4. private
				==> 절대로 다른 클래스에서는 사용할 수 없고
					오직 자기 자신의 클래스에서만 사용 가능
					
					
		주의]
			클래스에는 public 아니면 생략만 사용할 수 있다.
			
		참고]
			클래스의 접근지정자의 의미는
			클래스 자체를 사용할지의 여부를 결정하는 것이고
			생성자 함수의 접근지정의 의미는 new 시킬수 있는지 여부를 지정하는 것...
					
		
 */
	public Test03() {
		
		
	}
	
	public void toPrint() {
		Test01_01 t = new Test01_01();
//		System.out.println(t.pstr); // private 는 클래스 내에서만 사용가능
		
		System.out.println(t.dstr);
		System.out.println(t.str1);
		System.out.println(t.str2);
	}
}


class Test01_01{
	private String pstr = "private";
	String dstr = "생략 된 경우";
	protected String str1 = "이것은 프로택티드";
	public String str2 = "얘는 공개된 애";
	
	public void toPrint() {
		System.out.println(pstr);
		System.out.println(dstr);
		System.out.println(str1);
		System.out.println(str2);
	}
}
