package day06;

public class Test04 {
/*
 * 
 * 1 2 3 4 5
 * 1 2 3 4 5
 * 1 2 3 4 5
 * 1 2 3 4 5
 * 1 2 3 4 5
 * 
 * 
 * 5 4 3 2 1
 * 5 4 3 2 1
 * 5 4 3 2 1
 * 5 4 3 2 1
 * 5 4 3 2 1
 * 
 * 
 * 1
 * 1 2
 * 1 2 3
 * 1 2 3 4
 * 1 2 3 4 5
 * 
 * 
 * 5
 * 5 4 
 * 5 4 3 
 * 5 4 3 2
 * 5 4 3 2 1
 * 
 * 
 *  1
 *  2  3
 *  4  5  6
 *  7  8  9 10
 * 11 12 13 14 15
 * 
 * 쉬운방법 ==> 숫자변수 만들어 해결하는 방법
 * 어려운방법	==> 카운터변수로 해결하는 방법
 * 
 */

/*
	
	*
	**
	***
	****
	*****
	
*/
	
	/*
	 * 2x + 4y = 10
		방정식의
		결과를 출력
		
		단,
		X >= 0,
		Y >= 0
		X, y <= 10
	 */
	
	/*
	 * 주사위 두개의 
		합이 6이
		나오는 경우의
		수를 모두 
		출력하세요.
	 */
	public static void main(String[] args) {
		/*
		for(int i = 0 ; i < 5 ; i++ ) {
			for(int j = 0 ; j <= i ; j++ ) {
				System.out.print("*");
			}
			System.out.println();
		}
		*/
		
		for(int i = 0 ; i < 5 ; i++ ) {
			for(int j = 5 ; j > 0 ; j-- ) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
		
		
		System.out.println();
		for( int i = 0 ; i < 5 ; i++ ) {
			for(int j = 0 ; j < 5 ; j++ ) {
				System.out.printf("%2d", 5 - j);
			}
			System.out.println();
		}
	}

}
