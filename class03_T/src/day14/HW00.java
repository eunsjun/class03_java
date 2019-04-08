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
		
		/*
		Scanner sc = new Scanner(System.in);
		try{
			setSArray(sc);
		} catch(IndexOutOfBoundsException e) {
			System.out.println("배열 인덱스 에러...");
		}
		*/
		this.getRndmArr();
		
		// 평균 출력하기
		float avg = 0.f;
		try {
			avg = getAvg(toNum());
			System.out.println("*** 배열 num[] 을 숫자로 바꿔 계산한 평균 : " + avg );
		} catch (NumberFormatException e) {
			System.out.println("배열에 담긴 내용이 숫자 형식이 아닙니다.");
		} catch (IndexOutOfBoundsException e) {
			System.out.println("배열에 담긴 내용을 초과한 인덱스를 찾아 종료합니다.");			
		} catch (ArithmeticException e) {
			System.out.println("0으로 나누는 계산을 해서 프로그램을 종료합니다.");
		}
		System.out.println("##### 프로그램 종료 #####");
	}
	
	// 숫자타입의 문자열배열 만드는 함수 
	public void setSArray(Scanner s) throws IndexOutOfBoundsException {
		for(int i = 0 ; i < num.length ; i++ ) {
			System.out.println("[ " + (i+1) + "/" + num.length +" ] 세자리 숫자를 입력하세요!");
			String sno = s.nextLine();
			try{
				if(sno.length() != 3) {
					throw new NumberFormatException();
				}
				for(int j = 0 ; j < sno.length() ; j++ ) {
					char c = sno.charAt(j);
					Integer.parseInt(c+"");
				}
			} catch(NumberFormatException e) {
				--i;
				continue;
			}
			num[i] = sno;
		}
		s.close();
		System.out.println("### num 배열에 데이터 입력이 완료되었습니다. ###");
		System.out.println("num[] : " + Arrays.toString(num));
	}
	
	// 랜덤하게 숫자타입 문자열 발생하는 함수
	public void getRndmArr() {
		StringBuffer buff = new StringBuffer();
		
		for(int i = 0 ; i < num.length ; i++ ) {
			char ch = ' ';
			for(int j = 0 ; j < (int)(Math.random()*11) ; j++ ) {
				ch = (char)(random()*10 + '0');
				
				if(j == 0 && ch == '0') {
					try {
						throw new NumberFormatException();
					} catch (NumberFormatException e) {
						System.out.println((i+1) + "/" + num.length + ". 첫 숫자가 [ 0 ]이 나와서 다시 만듭니다.");
						--j;
						continue;
					}
				}
				buff.append(ch);
			}
			
			try {
				if(buff.length() != 3 ) {
					throw new IllegalArgumentException();
				}
			} catch(IllegalArgumentException e) {
				System.out.println((i+1) + "/" + num.length + ". 3자리 숫자가 아니어서 다시 만듭니다.");
				buff.delete(0, buff.length());
				--i;
				continue;
			}
			
			try{
				num[i] = buff.toString();
			} catch(IndexOutOfBoundsException e) {
				break;
			}
			buff.delete(0, buff.length());
		}
		
		System.out.println();
		System.out.println("### num 배열에 데이터 입력이 완료되었습니다. ###");
		System.out.println("num[] : " + Arrays.toString(num));
	}
	
	// 배열의 각 방의 데이터를 숫자로 변환하는 함수
	public int[] toNum() throws NumberFormatException, IndexOutOfBoundsException {
		int[] no = new int[num.length];
		for(int i =0 ; i < num.length ; i++ ) {
			no[i] = Integer.parseInt(num[i]);
		}
		
		return no;
	}
	
	// 숫자배열의 평균을 구하는 함수
	public float getAvg(int[] no) throws ArithmeticException {
		if(no.length == 0) throw new ArithmeticException();
		
		float avg = 0.0f;
		int sum = 0;
		for(int n : no) {
			sum += n;
		}
		avg = sum / no.length ;
		return avg;
	}

	public static void main(String[] args) {
		new HW00();
	}

}
