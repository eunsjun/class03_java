package day03;


/*
 * 이미 만들어진 클래스를 사용하는 방법
 * 		import 패키지이름.클래스이름;
 * 
 *		import 패키지이름.*; ==> 만약 이렇게 임포트를 한다면 해당패키지의 소속된 클래스를 모두 사용할 수 있다.
 *								모두 가져오는 것은 아니다.
 *								패키지 내의 클래스를 사용하는 순간 해당 클래스만 임포트 한다는 의미이다.
 */

// import day02.Test07; ==> Test07만 임포트
// import day02.*;	// ==> day02 패키지에 소속된 자식 클래스들을 모두 사용 가능 하다는 의미....

import java.util.*;
public class Test05 {

	public static void main(String[] args) {
		// 데이터를 입력받아서(콘솔에서) 사용하는 방법
		Scanner sc = new Scanner(System.in); // 참조형 변수 - 여기서 new 는 객체를 만드는 명령어
		System.out.print("숫자를 입력하세요! : ");
		String str = sc.next(); // ==> 숫자형식이 아닌 데이터를 입력을 하면 Integer.parseInt()에서 에러가 발생한다.
		// 콘솔창에서 입력한 문자열을 문자열 변수 str에 입력하는 명령;
		
		// str에는 문자열이 담겨 있으므로 숫자로 변환시켜줘야 한다.
		// 그런데 이때 사용하는 함수가 있는데
		// 그것은 Integer 클래스에 소속된 함수이다. 
		// 			Integer.parseInt(문자열); ==> 문자열을 정수로 변환시켜준다.
		
		
		// 메모리에 저장된 데이터를 읽는 방법은 
		// 자바에서는 직접 접근은 못한다.
		// 따라서 메모리에 저장된 데이터의 주소를 기억할 변수를 사용해서 처리를 한다.
		
		/*
		 *  "10" ==> 10
		 */
		
		
		int garo = Integer.parseInt(str); 
		// 정수형식의 문자열을 정수로 변환시켜주는 함수 : Integer.parseInt(문자열);
		System.out.print("세로를 입력하세요! : ");
		str = sc.next();
		int sero = Integer.parseInt(str);
		
		// 사각형의 넓이를 구해서 출력하세요.
		int 넓이 = garo * sero ; // 한글도 가능하지만 쓰지맙시다.
		int area = garo * sero ;
		System.out.println("### 가로 : " + garo);
		System.out.println("### 세로 : " + sero);
		System.out.println("### 넓이 : " + 넓이);	// 한글변수이름도 인식합니다.
		System.out.println("### 넓이 : " + area);
		
		
		/*
		 * 숫자를 입력받아 
		 */
	}

}
