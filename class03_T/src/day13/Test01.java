package day13;

public class Test01 {

	public Test01() {
		// 다른 클래스의 멤버를 불러오는 방법
		//		해당 클래스 타입의 변수를 만들고 인스턴스를 만들어서 대입한다.
		Test01_1 test = new Test01_1();
		// 이제 test 변수에 입력된  인스턴스의 멤버들을 모두 사용 가능하다.
//		int no1 = test.no1;
		int no2 = test.no2;	// 동일한 패키지 내에서는 어디서든지 가능...
		int no3 = test.no3 ; // 상속받은 클래스내 그리고 같은 패키지 내에서는 가능
		int no4 = test.no4;		// 어디서든지 접근 가능...
		
	}

	public static void main(String[] args) {
		new Test01();
	}
}

class Test01_1 {
	/*
	 * 		변수 생성 형식]
	 * 			[접근지정자]	[속성]		데이터타입		변수이름 ;
	 */
	private int no1 = 10;
	int no2 = 20;
	protected int no3 = 30;
	public int no4 = 40 ;
	
	/*
	 * toString() Overriding : toString() 는 Objet 클래스가 가지고 있는 함수이고
	 * 							우리가 만드는 모든 클래스의 최상위클래스는 Object 클래스이므로
	 * 							이경우 함수를 오버라이딩 하는 경우에 해당한다.
	 * public String toString() {
	 * 
	 * return ""; }
	 */
}
