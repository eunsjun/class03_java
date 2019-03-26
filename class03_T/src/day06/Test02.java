package day06;

public class Test02 {
/*
 * break 명령
 * 		==> 반복문이나 switch case문을 종료시킬때 사용하는 명령
 * 
 * continue 명령
 * 		==> 반복문을 다음 회차로 강제 진행시킬때(뛰어넘을때) 사용하는 명령
 */
	public static void main(String[] args) {
		// 1 ~ 10 출력하는데
		// 1. 5 나오면 종료
		for(int i = 0 ; i < 10 ; i++ ) {
			if(i == 5) {
				break;
			}
			System.out.print(i + ", ");
		}
		System.out.println();
		System.out.println("=====================================");
		
		// 2. 5 나오면 다음 회차로 진행하게 하세요.
		for(int i = 0 ; i < 10 ; i++ ) {
			if(i == 5) {
				continue;
			}
			System.out.print(i  + ", ");
		}
		System.out.println();
		System.out.println("=====================================");
	}

}
