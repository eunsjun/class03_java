package day11;

public class Test02 {
/*
		this	:	교과서적인 의미로는 현재 실행중인 객체의 주소를 기억하는 약속된 변수 ( 예약어 )
		
		this 는 JVM이 클래스를 처리하기 위해서 JVM 이 사용하는 변수이다.
		다시말해서 개발자가 사용하는 경우는 드물다.
		
		규칙]
			1. 	모든 멤버는 사용할 때 반드시 앞에 주소가 있어야 한다.
				멤버는 클래스 안에 만들어진 변수나 함수를 부르는 말이다.
				
				그래서 new  시키는 순간 그 주소를 기억해 놓았다가
				그 주소를 사용하는 것이다.
				
			2. 	만약 주소가 없으면 JVM이 자동으로 this 를 붙여준다.
			
			3. 	멤버 함수를 호출할 경우에는 무조건 주소값을 함수에게 알려주도록 약속했고
				함수는 this를 준비한 후
				함수를 호출할 때 알려준 주소를 기억하게 된다.
				
		참고]
			하지만 딱 한 경우에 한해서 개발자가 this를 사용해야 되는 경우가 있는데
			
			지역변수와 멤버변수의 이름이 동일한 경우는
			우선하는 변수는 지역변수이므로(현재위치에서 가장 가까운 변수)
			멤버변수에 접근을 하려면 멤버변수임을 꼭 밝혀야 하는데
			이때 this. 을 사용한다.
			
 */
	
	String name;
	
	public Test02() {
		name = "전영수"; // this.name 이라고 JVM 이 자동적으로 붙여준다.
	}
	
	public Test02(String name) {
		
		this.name = name;	
		/* 	여기서 this는 Test02 객체 자신을 이야기 한다.
		 	따라서 객체가 가지고 있는 멤버변수는 
		 			this.변수이름  
		 	으로 사용해야 한다.
		 */
	}
	
	public void toPrint() {
		System.out.println("### 이름 : " + name);
	}

	public static void main(String[] args) {
		Test02 test = new Test02();
		test.name = "전영수";
		test.toPrint();
		
		Test02 test1 = new Test02("김태형");
		test1.toPrint();
		
	}

}
