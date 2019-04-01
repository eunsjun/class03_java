package day10;

/*
	반지름 하나를 랜덤하게 입력한 후
	원의 넓이와 둘레를 계산하여 출력하는 프로그램을 작성하세요
	단, 입력, 넓이계산, 둘레계산, 출력은 함수로 처리하세요.
 */
import java.util.*;
public class Test00 {
	Scanner sc = new Scanner(System.in);
	// 전역변수... - 클래스 블럭내의 어느곳에서든지 사용가능...
	int r = 0;
	public Test00() {
		/*
		 * Scanner sc = new Scanner(System.in);
		 * ==> 지역변수 : 소속된 함수내에서 실행되고 함수실행이 종료되면 사라지는 변수
		 */
		int rad = getRadius();
		
		// 원둘레 구하기...
		// 원둘레를 구하려면 반지름이 필요하다.
		
		// 둘레와 면적 받기
		double arround = getArround(rad);
		double area = getArea(rad);
		
		// 둘레와 면적 한꺼번에 받기
		double[] data = getCalc(rad);
		double arround1 = data[0];
		double area1 = data[1];
		
		// 출력하기
//		toPrint(rad);
		toPrint1(rad);
	}
	
	// 원의 반지름을 입력받아 둘레를 계산해주는 함수
	public double getArround(int r) {
		/*
		 *  전역변수와 매개변수의 이름이 동일한 경우는
		 *  사용위치에서 가까운 변수를 사용한다. 
		 */
		double dulrae = 2 * r * 3.14;
		return dulrae;
	}
	
	// 반지름을 입력받아 면적을 계산해주는 함수
	public double getArea(int r) {
		/*
		 * double calcArea = r * r * 3.14; return calcArea;
		 */
		return (r * r * 3.14);
	}
	
	public double[] getCalc(int r) {
		double calcArround = getArround(r);
		double calcArea = getArea(r);
		
		double[] data = {calcArround, calcArea};
		
		return data;
	}
	
	// 문자열로 계산된 값을 반환해주는 함수
	public String getString(int r) {
		double calcArround = getArround(r);
		double calcArea = getArea(r);
		
		return calcArround + "|" + calcArea;
	}
	
	// 출력해주는 함수
	public void toPrint(int r) {
		double[] data = getCalc(r);
		// 반지름을 r, 둘레는 data[0], 면적은 data[1]
		System.out.printf("반지름이  %2d 인 원의 둘레는 %.2f  이고 면적은 %.2f 입니다.", r, data[0], data[1]);
	}
	
	public void toPrint1(int r) {
		String str = getString(r);
		int idx = 0 ;
		
		for(int i = 0 ; i < str.length(); i++ ) {
			/*
			 * if(str.charAt(i) < '0' || str.charAt(i) > '9') { idx = i; break; }
			 */
			if(str.charAt(i) == '|') {
				idx = i ;
			}
		}
		
		String sArround = str.substring(0, str.indexOf('|'));
		/*
		 * 		문자열.indexOf(문자);
		 * 				문자열에 포함된 문자의 인덱스를 반환해준다.
		 */
		String sArea = str.substring(str.indexOf('|') + 1);
		System.out.printf("반지름이  %2d 인 원의 둘레는 %s 이고 면적은 %s 입니다.", r, sArround, sArea);
	}
	
	public static void main(String[] args) {
		new Test00();
	}
	
	public int getRadius() {
		int r = 0;
		
		inchar:
		while(true) {
			System.out.print("*** 반지름을 입력하세요! : ");
			String sno = sc.next();
			
			// 문자열 검사
			for(int i = 0 ; i < sno.length(); i++ ) {
				if(sno.charAt(i) < '0' || sno.charAt(i) > '9') {
					System.out.println("입력문자가 잘못됬었습니다.");
					continue inchar;
				}
			}
			
			// 여기 문장이 실행되는 경우는 for 반복문에서 검사에 통과한 경우이다.
			// 이제  입력받은 문자를 정수로 변환해주자.
			r = Integer.parseInt(sno);
			// 이제 반복문 종료...
			break;
		}
		return r;
	}
}
