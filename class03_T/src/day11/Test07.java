package day11;

public class Test07 extends Test07_01{
/*
	*****
	함수의 오버라이딩( Overriding : 함수의 재정의 )
		==> 상속 관계에 있는 하위 클래스에서
			상위 클래스가 가진 함수의 기능을 수정하는 행위
			
		방법]
			1. 상위 클래스가 가진 함수의 원형과 동일한 형태로 만들어야 한다.
					참고로 함수의 원형(Prototype)
						반환값	+ 함수이름 + 매개변수리스트
						
			2. 접근지정자는 이후 설명
			3. 예외처리는	역시 이후 설명
			
		이렇게 오버라이딩을 하면
		내부적으로  super의 함수는 숨겨지고 재정의한 함수 사용이 된다.
		
		super : 상속해준 클래스를 가리키는 예약어
				반드시 상위클래스 소속임을 밝혀될 경우 사용
		
		만약 오버라이딩 이전의 함수의 기능을 사용하고자 하면
			super.함수이름();
			
			예]
				class Father {
					int abc(int a){
						return a + 1;
					}
				}
				class Son extends Father {
					
					Son(){
						int a = abc();
						int b = super.abc();
					}
					
					int abc(int a){
						return a * 2 ;
					}
					
				}
				
				
 */
	public Test07() {
		int no1 = abc(10);
		System.out.println("abc() : " + no1);
		
		// 상위클래스의 abc() 함수를 사용하고자할 경우
		int no2 = super.abc(10);
		System.out.println("super.abc() : " + no2);
	}
	
	public int abc(int a) {
		return a * 2;
	}
	
	public static void main(String[] args) {
		new Test07();
	}

}

class Test07_01{
	public int abc(int a) {
		return a + 1;
	}
}
