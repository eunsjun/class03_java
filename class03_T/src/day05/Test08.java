package day05;

public class Test08 {
/*
 * while 명령
 * 		for 명령과의 차이점은 카운터 변수가 따로 없어서
 * 		증감식까지 따로 만들어줘야된다.
 * 
 * 		for 명령의 카운터 변수는 for 명령 안에서만 사용하는 지역변수가 된다.
 * 		
 */
	public static void main(String[] args) {
		// 1부터 10까지 출력하세요.
		int no = 1;
		
		while(no <= 10) {
			System.out.print(no + ", ");
			no++; // 증감식
		}
		System.out.println("*** while 명령 종료 후 ***");
		
		int i = 0;
		for(; i <= 10; i++) {
			System.out.print(i + ", ");
		}
		
		System.out.println();
		System.out.println("### for i 명령 종료 후 ###");
		System.out.println(i); // 전역변수이므로 밖에서도 사용 가능...
		
		for(int j = 0; j <= 10; j++) {
			System.out.print(j + ", ");
		}
		System.out.println();
		System.out.println("### for j 명령 종료 후 ###");
		// System.out.print(j); // for 명령 밖에서는 사용 못함
		
	}
}
