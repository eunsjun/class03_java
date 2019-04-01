package day10;

import java.util.*;
public class Test02 {
/*
 * 사각형 클래스의 기능을 사용해서 면적을 출력해보자.
 */
	public Test02() {
		// 먼저 객체를 만들자.( 객체 <== 레퍼런스변수 and 인스턴스 )
		Sagak quad = new Sagak();
		Sagak s1 = new Sagak();
		
		// 사각 클래스에는 가로와 세로 변수가 있는데 아직 값이 0으로 초기화된 상태이므로
		// 가로 세로 값을 입력해줘야한다.
		
		// 입력받을 준비
		Scanner sc = new Scanner(System.in);
		
		// 가로값 입력받아서 변수에 저장
		System.out.print("가로를 입력하세요! : ");
		quad.garo = sc.nextInt();
		
		// 세로값 입력받아 변수에 저장한다.
		System.out.print("세로를 입력하세요! : ");
		quad.sero = sc.nextInt();
		// s1 객체의 가로 세로 값은 아직 0으로 새로운 값이 저장이 안되어 있는 상태다.
		
		// 면적 변수에 저장
		quad.calcArea();
		
		System.out.println("가로가 " + quad.garo + " 이고 세로가 " + quad.sero + " 인 사각형의 면적은 " + quad.area + " 입니다.");
	}

	public static void main(String[] args) {
		new Test02();
	}

}
