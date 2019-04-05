package day14;

/*
		문제]
			String[] str = {"123", "456", "789", ...};
			배열에 들어갈 문자열은 랜덤하게 만드세요...
			
			가 있는 경우
			이것의 합과 평균을 구하는 프로그램을 작성하세요.
			
			단, 발생할 수 있는 예외를 가정하여 모두 처리하세요.
				1. 배열의 범위를 벗어난 경우
				2. 숫자로 반환이 불가능한 경우
				3. 평균을 계산하는데 0으로 나눠지는 경우....
				
				 추가작업]
				 	a. 배열길이도 랜덤하게...
				 	b. 문자열길이도 랜덤하게...
 */

import static java.lang.Math.*;
import java.util.*;
public class HW00 {
	String[] num;
	
	public HW00() {
		/*
		 * String str = 'A' + ""; String str1 = '9' + ""; String str2 = "2" + '5';
		 * 
		 * StringBuffer buff = new StringBuffer(); buff.append('3');
		 * 
		 * String s = buff.toString();
		 */
		int len = (int)(Math.random()*6 + 5);
		num = new String[len];
		
		Scanner sc = new Scanner(System.in);
		
		StringBuffer buff = new StringBuffer();
		for(int i = 0 ; i < len ; i++ ) {
			char ch = ' ';
			for(int j = 0 ; j < 3 ; j++ ) {
				ch = (char)(random()*10 + '0');
				buff.append(ch);
			}
			try{
				num[i] = buff.toString();
			} catch(IndexOutOfBoundsException e) {
				break;
			}
			buff.delete(0, buff.length()-1);
		}
	}
	
	// 숫자타입의 문자열배열 만드는 함수 
	public void setSArray(Scanner s) throws IndexOutOfBoundsException {
		for(int i = 0 ; i < num.length ; i++ ) {
			System.out.println("세자리 숫자를 입력하세요!");
			String sno = s.nextLine();
			try{
				if(sno.length() != 3) {
					throw new NumberFormatException();
				}
			} catch(NumberFormatException e) {
				--i;
				continue;
			}
			for(int j = 0 ; j < sno.length() ; j++ ) {
				
			}
			num[i] = sno;
		}
	}
	
	// 배열의 각 방의 데이터를 숫자로 변환하는 함수
	
	
	// 숫자배열의 평균을 규하는 함수
	

	public static void main(String[] args) {

	}

}
