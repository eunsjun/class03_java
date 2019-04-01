package day10;

/*
	문제]
		정수 두개를 입력받아서
		사각형, 삼각형, 원의 넓이를 구하는
		클래스를 만들고 함수도 만들어서 
		내용(가로/세로 || 가로/높이 || 반지름 두개)과 결과를 출력하세요.
 */
import java.util.*;
public class Exam01 {
	// 입력받을 도구 준비
	Scanner sc = new Scanner(System.in);
	public Exam01() {
		// 숫자 두개 입력 받기
		System.out.print("첫번째 숫자를 입력하세요! : ");
		int num1 = inputData();
		System.out.print("두번째 숫자를 입력하세요! : ");
		int num2 = inputData();
		
		Nemo nemo = new Nemo(num1, num2);
		int qArea = nemo.myunjuk();
		
		System.out.println("가로가 " + nemo.garo + " 세로가 " + nemo.sero + " 인 사각형의 면적은 " + qArea + " 입니다.");
		
		// 삼각형
		Semo semo = new Semo(num1, num2);
		float triArea = semo.getArea();
		System.out.println("밑변이 " + semo.wid + " 이고 높이가 " + semo.heig + " 인 삼각형의 면적은 " + triArea + " 입니다.");
		
		// 원의 넓이
		Won won = new Won(num1, num2);
		
		System.out.println("반지름이 " + won.c1 + " 인 원의 넓이는 " + won.area1 + " 입니다.");
		System.out.println("반지름이 " + won.c2 + " 인 원의 넓이는 " + won.area2 + " 입니다.");
		
	}
	
	public int inputData() {
		int num = 0 ;
		
		a1:
		while(true) {
			String sno = sc.next();
			for(int i = 0 ; i < sno.length(); i++ ) {
				if(sno.charAt(i) > '9' || sno.charAt(i) < '0') {
					continue a1;
				}
			}
			num = Integer.parseInt(sno);
			break;
		}
		
		return num;
	}
	
	public static void main(String[] args) {
		new Exam01();
	}

}
