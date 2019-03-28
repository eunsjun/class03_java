package day08;

/*
 * 입력된 숫자의 마름모형식을 별로 출력하세요..
 * 
 * 그리고
 * 		그 마름모를 3x3(9개) 으로 반복해서 출력하세요.
 */
import java.util.*;
public class Test00 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// 메세지 그리고 입력
		boolean bool = true ;
		int no = 0;
		
		loop:
		while(bool) {
			System.out.print("홀수 숫자를 입력하세요 : ");
			String str = sc.next();
			
			// 숫자 아닌 문자를 검사
			for(int i = 0 ; i < str.length() ; i++) {
				if(str.charAt(i) < '0' || str.charAt(i) > '9') {
					System.out.print("숫자가 아닌 문자가 입력되었습니다.");
					continue loop;
				}
			}
			
			// 홀수인지 아닌지 검사
			no = Integer.parseInt(str);
			if(no % 2 == 0 ) {
				System.out.print("짝수를 입력했습니다.");
				continue loop;
			}
			bool = false;
		}
		// 스케너를 다썼다면 닫아준다.
		sc.close();
		
		
  		for( int l = 0 ; l < 3 ; l++ ) {
			for(int i = 0 ; i < no ; i++ ) {
				for(int m = 0 ; m < 3 ; m++) {
					for(int j = 0 ; j < no ; j++ ) {
						String symbol = "";
						if( j < Math.abs(no / 2 - i) ) {
							symbol = " ";
						} else if( j < no - Math.abs(no / 2 - i)) {
							symbol = "*";
						} else {
							symbol = " ";
						}
						
						System.out.print(symbol);
					}
				}
				System.out.println();
			}
  		}
/*
		for(int i = 0 ; i < no ; i++ ) {
			for(int j = 0 ; j < no - Math.abs(no / 2 - i) ; j++ ) {
				String symbol = "*";
				if( j < Math.abs(no / 2 - i) ) {
					symbol = " ";
				}
				System.out.print(symbol);
			}
			System.out.println();
		}
*/		
		
	}

}
