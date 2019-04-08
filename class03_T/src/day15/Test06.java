package day15;

public class Test06 {
/*
		레퍼클래스(Wrapper Class)
			==> 자바에서 기본 데이터 타입의 변수는 레퍼런스변수가 아니다.
				다시말해서 객체가 아니다.
				이말은 객체처럼 사용해야할 때 문제가 될수 있다는 것이고
				이것을 해결하기위해서 만든 클래스를
				레퍼클래스라 한다.
				예를 들자면 int 를 객체처럼 다루고 싶다면??? ==> Integer
				
			참고]
				자바는 Object 시점으로 계층구조화해서
				클래스를 이용하도록 만드는 객체지향언어이다.
				
				하지만 기본데이터타입 만큼은 객체지향원리를 사용하지 않는다.
				==> 다형성 구현에 문제가 발생할 수 있다.
				
				
			***
			Boxing & Unboxing
				Boxing : 기본데이터타입(value Type)을 객체로(주소타입으로) 변환하는 것.
						예]
							int -> Integer
							
				Unboxing : Heap 영역에 있는 데이터(주소타입, 레퍼런스타입)를 다시 기본데이터 타입으로 변환하는 것..
						예]
							Integer -> int
							
							
		결론]
			레퍼클래스는 Boxing & Unboxing 을 해주기 위한 클래스
			
		참고]
			몰라도 된다.
			왜?
				자바 1.4 부터는 자동으로 Boxing, Unboxing 되니까....
				
				
		***
		Integer.parseInt() 같은 함수들은 래퍼클래스안에 아직 있고
		아직 빈번히 사용되기 때문에...
 */
	public Test06() {
		// Boxing - heap 영역의 박스에 데이터 넣기
		Integer num = 10;
		Integer no1 = new Integer(10);
		
		int bunho = num;	// Unboxing - heap 박스에서 데이터를 기본타입으로 꺼내는 작업
		
		System.out.println(Integer.compare(10, 5));
		System.out.println(Integer.compare(5, 5));
		System.out.println(Integer.compare(5, 6));
		
		System.out.println("Integer equals : " + num.equals(10));
		
		System.out.println("Intege.reverse() : " + Integer.reverse(12));
	}

	public static void main(String[] args) {
		new Test06();
	}

}
