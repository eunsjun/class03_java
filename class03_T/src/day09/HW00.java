package day09;

import java.util.*;
public class HW00 {

	public static void main(String[] args) {
		
		String[] name = {"강찬규", "박정헌", "전영수", "양희준", "김태헌"};
		int[] point = {98, 99, 100, 98, 90};
//		int[] point = new int[name.length];
		
		for(int i = 0 ; i < 5 ; i++ ) {
//			System.out.println(name);
			System.out.println(name[i] + " : " + point[i] + " 점");
		}
		
		/*
		 * 이름을 입력하면 해당 학생의 이름과 점수를 [ 강찬규 : 98 ] 출력되게 하세요.
		 */
		
//		System.out.println("세번째 학생 [ " + name[2] + " ] 학생의 점수 : " + point[2]);
		
		Scanner sc = new Scanner(System.in);
		
		// 이름을 입력하면 인덱스를 출력하고 점수 뽑아내기
		System.out.println("학생이름을 입력하세요!");
		String sname = sc.next();
		// 반복비교를 해서 인덱스를 찾아낸다.
		int idx = 0 ;
		for(int i = 0 ; i < name.length ; i++ ) {
			if( sname.equals(name[i]) ) {
				idx = i ;
			}
		}
		
		System.out.println("입력한 학생 : " + name[idx] + " | 점수 : " + point[idx]);
		
		/*
		while(true) {
			System.out.print("조회할 학생을 입력하세요! [ quit(종료) ] : ");
			String str = sc.next();
			System.out.println();
			if(str.equals("quit")) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}
			int idx = 0 ;
			for(int i = 0 ; i < name.length ; i++ ) {
				if(str.equals(name[i])) {
					idx = i ;
					break;
				}
			}
			System.out.println("조회된 학생 [ " + name[idx] + " ] 학생의 점수는 " + point[idx] + " 점 입니다.");
		}
		*/
		
	}

}
