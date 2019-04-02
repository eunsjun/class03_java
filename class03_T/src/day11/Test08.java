package day11;

public class Test08 {
/*
	Object 클래스
		==> 자바로 만들어진 클래스의 최상위 super 클래스
			따라서 자바로 만들어진 모든 클래스는 
			Object 클래스가 가지고 있는 모든 멤버를 가지고 있다.
			모든 기능(멤버 : 변수, 함수)를 자동적으로 사용할 수 있다.
			
		참고]
			이렇게 최상위 클래스를 만든 이유는???
				계층추적을 원활히 하도록 하기위한 조치....
				즉, 각각의 클래스의 족보를 정확하게 따질 수 있도록 하기 위해서...
				
		참고]
			자바로 만든 모든 클래스는 반드시 상위 클래스가 존재한다.
			이제까지 만든 클래스들 역시 상위 클래스를 가지고 있다.
			만약 강제로 상위 클래스를 지정하지 않으면(extends 클래스이름)
			암묵적으로 Object 라는 클래스를 상속 받아서 만들어진다.
	
	***
	instance of
		==> 특정 클래스를 new 시키면 인스턴스가 만들어지고 주소도 만들어지는데
			이 주소가 어떤 클래스 소속인지 알아내는 연산자...
			연산의 결과는 true 아니면 false 로 반환이 된다.
			
			형식]
				변수	instanceof 클래스이름
			의미]
				변수에 담긴 주소의 인스턴스가 클래스이름의 소속이냐???
				
			참고]
				소속의 개념은 is a 관계를 따진다는 의미
				즉, 상속관계를 따진다는 의미...
				
				
 */
	public Test08() {
		Object[] obj = {"전영수", 80, 'B'};
		
		junsuk(obj[0]);
		junsuk(obj[1]);
		junsuk(obj[2]);
	}
	
	// 데이터 타입을 출력해주는 함수
	public void junsuk(Object o) {
		String str = "";
		String name = "";
		int n = 0;
		char c = ' ';
		if(o instanceof Integer) {
			n = (int) o;
			str = "int type 입니다.";
		} else if(o instanceof String) {
			name = (String) o;
			str = "String type 입니다.";
		} else if(o instanceof Character) {
			c = (char) o;
			str = "char type 입니다.";
		}
		System.out.println(o + " 는 " + str);
		System.out.printf("%s 는 %s\r\n" , o, str);
	}
	
	public static void main(String[] args) {
		new Test08();
	}

}
