package day18;

import java.util.*;
public class HW02 {
/*
	문제]
		랜덤하게 영문자 10개를 만들어서
		ArrayList에 저장하고 출력하고
		오름차순 정렬해서 출력하고
		내림차순 정렬해서 출력하세요.
 */
	public HW02() {
		ArrayList list = new ArrayList();
		
		// 데이터 입력
		for(int i = 0 ; i < 10 ; i++ ) {
			char ch = (char)(Math.random()*26 + 'A');
			list.add(ch);
		}
		
		// 출력
		System.out.println(list);
		
		
		// 기본 정렬
		/*
		 * Collections.sort(list); System.out.println(list);
		 */
		// 내림차순 정렬
		/* Collections.reverse(list); */
		Collections.sort(list, new HwSort02());
		System.out.println(list);
	}

	public static void main(String[] args) {
		new HW02();
	}

}


class HwSort02 implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
		return -((char)o1 - (char)o2);
	}
}