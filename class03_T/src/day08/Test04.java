package day08;

/*
 * EXAMPLE]
 * 		두수와 연산기호를 입력받아
 * 		연산기호에 맞는 연산을 해서
 * 		결과를 반환해주는 함수를 작성하고
 * 		실행해서 출력하세요.
 */

import java.util.*;
public class Test04 {
	
	public Test04() {
		int num1, num2, gap;
		char ch;
		
		//abc();
		
		// 입력받을 준비
		Scanner sc = new Scanner(System.in);
		// 메세지 그리고 저장
		/*
		boolean bool = true;
		while(bool){
			// 입력받고
			System.out.print("첫번째 숫자를 입력하세요 : ");
			String str = sc.next();
			int sno = checkNo(str);
			if(sno == -1) {
				System.out.println("숫자가 아닌 문자가 입력되었습니다.");
			} else {
				bool = false;
				num1 = Integer.parseInt(str);
			}
		}
		
		bool = true;
		while(bool){
			// 입력받고
			System.out.print("첫번째 숫자를 입력하세요 : ");
			String str = sc.next();
			int sno = checkNo(str);
			if(sno == -1) {
				System.out.println("숫자가 아닌 문자가 입력되었습니다.");
			} else {
				bool = false;
				num2 = Integer.parseInt(str);
			}
		}
		 */
		num1 = outNo(sc);
		System.out.println("첫번째 숫자가 저장되었습니다.");
		num2 = outNo(sc);
		System.out.println("두번째 숫자가 저장되었습니다.");
		// 연산기호검사
		for(; ;) {
			System.out.print("어떤 연산을 할 예정인가요?? : ");
			String sym = sc.next();
			if(sym.length() > 1 || sym.length() == 0) {
				continue;
			}
			// 문자 뽑고
			ch = sym.charAt(0);
			if(ch != '+' & ch != '-' & ch != '*' & ch != '/' & ch != '%') {
				System.out.println("연산기호가 잘못 입력되었습니다.");
				continue;
			}
			break;
		}
		
		gap = calc01(num1, num2, ch);
		System.out.println(num1 + " " + ch + " " + num2 + " = " + gap);
	}
	
	public static void main(String[] args) {
		new Test04();
	}
	/*
	void abc() {
		System.out.println("Hello!!!");
	}
	*/
	
	public int outNo(Scanner s) {
		int no = 0 ;
		
		boolean bool = true;
		while(bool){
			// 입력받고
			System.out.print("숫자를 입력하세요 : ");
			String str = s.next();
			int sno = checkNo(str);
			if(sno == -1) {
				System.out.println("숫자가 아닌 문자가 입력되었습니다.");
			} else {
				bool = false;
				no = Integer.parseInt(str);
			}
		}		
		return no;
	}
	
	// 계산해주고 반환해주는 함수
	public int calc01(int no1, int no2, char c) {
		int result = 0;
		
		switch(c) {
		case '+':
			result = no1 + no2;
			break;
		case '-':
			result = no1 - no2;
			break;
		case '*':
			result = no1 * no2;
			break;
		case '/':
			result = no1 / no2;
			break;
		case '%':
			result = no1 % no2;
			break;
		}
		
		return result;
	}
	
	// 문자열에 숫자가아닌 문자가 폼함되었는지 검사해주는 함수
	public int checkNo(String s) {
		int check = 1 ;
		
		// 하나씩 뽑아서 검사하고...
		for(int i = 0 ; i < s.length() ; i++ ) {
			char ch1 = s.charAt(i);
			if(ch1 < '0' || ch1 > '9' ) {
				check = -1;
			}
		}
		
		// 데이터 넘겨주고
		return check;
	}
	
}
