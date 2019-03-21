package day02;

public class Test09 {

	public static void main(String[] args) {
		/*
		 * 변수를 만들고
		 *    변수에 원의 반지름을 입력한 후
		 *    원의 둘레와 넓이를 구하는 변수를 만들어서
		 *    계산하고 출력하세요. 
		 *    둘레와 넓이의 데이터 타입은 float으로 하세요.
		 *    
		 *    원둘레(around) 구하는 공식
		 *    		2 * 반지름 * 3.14
		 *    원 넓이(area) 를 구하는 공식
		 *    		반지름 * 반지름 * 3.14
		 */
		
		int rad = 23;
		float py = 3.14f;
		
		// 원 둘레 구하기
		float around = 2 * rad * py;
		float area = rad * rad * py;
		
		System.out.println("### 원의 둘레 : " + around);
		System.out.println("*** 원의 넓이 : " + area);
		
		
		/*
		 * 문자열 + 숫자데이터 ==> 문자열
		 * 문자열 + 문자 ==> 문자열
		 * 
		 * 변수도 산술 연산에 사용 될 수 있다.
		 * 
		 */
		
		
		/*
		 * 참고]
		 * 		
		 */
	}

}
