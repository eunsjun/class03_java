package day14;


import java.util.*;
import java.io.*;
public class Test08 {
/*
	예외 전이
		==> 함수는 가장 작은 프로그램단위이다.
			한가지 작업을 위해서 만든것이다.
			함수안에서 작업을 하다가
			예외가 발생하면
			그 함수는 더이상 실행할 필요가 없는 경우가 많다.
			따라서 그 함수는 예외를 전이 하도록 해 놓은 경우가 많다.
			
			형식]
				void abc() throws 예외1, 예외2, ... {
				
				}
				
			의미]
				이 함수를 실행하다가 기술된 예외가 발생하면 실행을 중지한다.
				
			**********
			예외가 전이된 함수는 
			그 함수를 호출한 곳에서 반드시 예외 처리를 해 주어야 한다.
			
			
		참고]
			==> 비록 어떤 함수가 예외를 전이한 함수라도
				예외 처리를 해주지 않아도 되는 경우가 있다.
				
				전이하는 예외가 RuntimeException 소속인 예외는 
				예외처리를 해도 그만, 안해도 그만이기 이기 때문에 안해도 되는데...
				되도록이면 해주는 것이 좋다.
				( 이런 함수들은 java.lang 패키지 소속의 클래스에 있는 함수들이
					이렇게 예외처리를 해놓은 경우가 많다.)
				
 */
	
/*
	문자열을 입력하는데
	문자열의 길이가 3자리 이하이거나 7자리 초과 되는 경우는 다시 입력 받도록 
	예외로 처리하세요.
 */


	public Test08() {
		String id = "";
		Scanner sc = new Scanner(System.in);
		while(true) {
			try{
				id = getSid(sc);
				break;
			} catch(EOFException e) {
				System.out.println("아이디 길이가 맞지 않습니다.");
			}
		}
		sc.close();
		System.out.println("입력하신 아이디는 " + id + " 입니다.");
	}
	
	public String getSid(Scanner s) throws EOFException {
		String sid = "";
		System.out.println("아이디를 입력하세요!");
		sid = s.nextLine();
		s.reset();
		if(sid.length() <= 3 || sid.length() > 7) {
			throw new EOFException();
		}
		return sid;
	}
	
	public static void main(String[] args) {
		new Test08();
	}

}
