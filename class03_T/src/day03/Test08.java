package day03;

public class Test08 {
	public static void main(String[] args) {
		/*
		 * 대입연산자 : 변수에 데이터를 입력할 때 사용하는 연산자...
		 * 형식]
		 * 		변수 = 데이터;
		 * 		
		 * 		변수 = 변수 + 5;
		 * 		변수 += 5 ;
		 * 		변수 -= 5 ; ==> 변수 = 변수 - 5 ;
		 * 		변수 *= 5 ; ==> 변수 = 변수 * 5 ;
		 */
		
		/*
		 * 사칙연산자 중 + 연산자
		 * 		만약 다른 데이터 타입과 문자열을 더하는 경우는 문자열이 된다.
		 *      오라클의 || 연산자와 같은 기능을 한다.
		 *      
		 *      사칙연산의 순서는 수학 연산자 순서와 같다.
		 *      만일 먼저 해야될 연산이 있다면 () 로 해주면 된다.
		 *      
		 *      3 * (2 + 7)
		 */
		
		System.out.println("더하기 결과 : " + 5 + 1);
		System.out.println("더하기 결과 : " + 5 * 2);
		
		int no1 = 10 ;
		int no2 = 5 ;
		no1 += 33;
		no2 *= 2;
		
		System.out.println("no1 : " + no1);
		System.out.println("no2 : " + no2);
		
		no2 /= 2;
		System.out.println("no2 : " + no2);
		
		no2 %= 3; // 퀴즈 ] 오라클에서 나머지를 구하는 함수이름은??? mod()
		System.out.println("no2 : " + no2);
		
	}
}
