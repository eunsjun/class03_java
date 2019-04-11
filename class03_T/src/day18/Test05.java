package day18;
/*		
		float pi = 3.141592f;
		
		// 소수점 네째자리에서 반올림하세요.
 * 3.141592
 * 	==> 3.142
 * 		<== 3.141592 * 1000 ==> 3141.592 + 0.5 ==> (int)3142.092 ==> 3142
 * 			==> 3142 / 1000f ==> 3.142 
		 
//		float result = (int)(pi * 1000 + .5);
		
		float result = (int)(Math.round(pi * 1000)) / 1000f;
		System.out.println(result);
 */		


import java.util.*;
public class Test05 {
/*
	랜덤하게 1 ~ 50 정수를 10개를 만들어 ArrayList 에 저장하고
	정수를 내림차순 정렬하세요.
 */
	public Test05() {
		// ArrayList 만들고
		ArrayList list = new ArrayList();
		
		// 데이터 10개 만들어 입력하고
		for(int i = 0 ; i < 10 ; i++ ) {
			// 회차마다 정수 하나를 만들고
			int num = (int) (Math.random()* 50 + 1);
			// 만들어진 정수를 list에 집어넣고
			list.add(num);
		}
		// list 출력하고
		System.out.println("정렬 없음 : " + list);
		
		Collections.sort(list);	// List로 자동 형변환
		System.out.println("기본정렬 : " + list);
		
		// list 정렬하고
		Collections.sort(list, new MySortD18());
		// 정렬된 list 출력하고
		Comparator c;
		System.out.println("내림차순정렬 : " + list);
	}
	
	public static void main(String[] args) {
		new Test05();
	}

}


class MySortD18 implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		// ArrayList에 저장되어 있는 원래 데이터 타입으로 강제 형변환 해준다.
		int tmp1 = (int) o1;
		int tmp2 = (int) o2;
		
		/*
		if(tmp1 == tmp2) {
			return 0;
		} else if( tmp1 < tmp2) {
			return -1;
		} else {
			return 1;
		}
		*/
		
		return -(tmp1 - tmp2);
	}
	
}