package day14;


/*
	문자열을 입력하는데
	문자열의 길이가 3자리 이하이거나 7자리 초과 되는 경우는 다시 입력 받도록 
	예외로 처리하세요.
 */

import java.util.*;
public class Test07 {
	// 입력받을 준비
//	Scanner sc ;
//	String str = "";
	public Test07() {
		Scanner sc = new Scanner(System.in);
		String str = getStr(sc);
		System.out.println("입력하신 아이디는 " + str + "입니다.");
	}
	
	public String getStr(Scanner s) {
		String sid = "";
		while(true) {
			System.out.println("아이디를 입력하세요! : ");
			sid = s.nextLine();
			try {
				if(sid.length() <= 3 || sid.length() > 7 ) {
					throw new IndexOutOfBoundsException();
				}
				s.close();
				break;
			} catch(NumberFormatException e) {
				System.out.println("숫자 포멧이 잘못되었습니다.");
			} catch(IndexOutOfBoundsException e) {
				System.out.println("길이가 잘못되었습니다.");
			}
		}
		
		return sid;
	}
	
	public static void main(String[] args) {
		new Test07();
	}

}
