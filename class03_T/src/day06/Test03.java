package day06;

public class Test03 {
/*
 * 레이블이 붙은 반복문
 * 		==> break 또는 continue 명령을 레이블이 분은 반복문으로 바로 이동시키는 기능....
 * 
 * 형식]
 * 		break 레이블; 		==> 지정한 레이블이 붙은 반복문을 종료
 * 		continue 레이블;	==> 지정한 레이블이 붙은 반복문의 다음 회차로 진행...
 * 
 * 		레이블 만드는 형식]
 * 			레이블이름:
 * 			반복문{}
 * 
 * 
 * 주의]
 * 		레이블이 붙은 명령은 직계조상 반복에만 적용이 된다.
 * 
 * 
 * 		one:
 * 		for(){
 * 			soo:
 * 			for(){
 * 				if(){
 * 					break one; ==> O
 * 				}
 * 				continue two;	==> x
 * 				continue one;	==> o
 * 			}
 * 	
 * 			two:
 * 			for(){
 * 				break soo;
 * 			}
 * 		}
 * 		for(){
 * 			if(){
 * 				break one; 		==> x
 * 			}
 * 		}
 * 
 */
	
/*
 * 반복문을 사용해서
 * 
 * 		 **
 * 		 **
 * 		 *****
 * 		 *****
 * 		 *****
 * 
 */
	
	public static void main(String[] args) {
		one:
		for(int i = 0 ; i < 5 ; i++) {
			for(int j = 0 ; j < 5 ; j++) {
				if(i < 2 & j > 1) {
					System.out.println();
					continue one;
				}
				System.out.print("*");
			}
			System.out.println();
		}
	}
}










