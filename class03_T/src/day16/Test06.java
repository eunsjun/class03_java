package day16;

import java.math.*;
public class Test06 {
/*
		BigDecimal
		==> 정수로 표현할 수 없는 숫자를 사용하기 위한 클래스
		
			주로 데이터베이스와 연동할 때 사용하는데
			오라클의 경우 NUMBER 타입은
			38자리까지 사용할 수 있다.
			
			이런 데이터는 자바에서 처리할 수 없으므로
			이런 유형의 데이터를 처리하기 위해 만들어진 클래스
			
			예]
				BigDecimal big = new BigDecimal("12345678901234567890");
				
				
		숙제]
			BigDecimal 소속 함수를 3개 조사하세요.
			방법은 동일...
 */
	public Test06() {
		BigDecimal big = new BigDecimal("12345678901234567890");
		System.out.println(big);
	}
	
	public static void main(String[] args) {
		new Test06();
	}
}
