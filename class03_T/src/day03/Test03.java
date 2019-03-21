package day03;


/*
 *  문제]
 *  	원의 넓이를 구하는데
 *  	파이값을 저장할 상수를 만들어서 계산하세요.
 */
public class Test03 {
	public static void main(String[] args) {
		final float PHI = 3.14F ;	
		// 실수의 기본 입력 타입은 double 이다. 
		// float 타입으로 변수에 입력해야 될 경우는 리터럴 형변환이 필요하다.
		// 상수는 이름을 대문자로 만들어야 한다.

		// PHI = 3.141592F;
		// 	이렇게 상수에 데이터를 입력하면 안된다.
		//	왜??? 상수는 한번 입력된 데이터는 수정이 불가능하니까...
		
		int rad = 5 ;
		float area = rad * rad * PHI ;
		
		
		System.out.println("반지름이 " + rad + " 인 원의 넓이는 " + area + " 입니다.");
	}
}
