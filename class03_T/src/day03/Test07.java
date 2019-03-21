package day03;

import java.util.Scanner;
// java.util 패키지 내의 Scanner 클래스만 임포트 했다.
// 만약 java.util 패키지 내의 많은 클래스를 사용해야 한다면 java.util.* 로 하면 된다.
public class Test07 {
	public static void main(String args[]) {
		// 1. 입력받을 준비하고
		Scanner sc = new Scanner(System.in);
		// 2. 메세지 출력하고
		System.out.print("영수씨 숫자 몇 ??? : ");
		// 3. 입력받고
		int num = sc.nextInt(); // int 형식의 숫자만 입력해줘야 한다.
		// 4. 입력값 출력하고
		System.out.println("이거 맞지?? " + num);
	}
}
