package day19;

import java.util.*;
import static java.lang.Math.*;
public class Test03 {
/*
	1 ~ 10 까지 랜덤하게 정수를 15개를 발생시켜서
	HashSet에 저장하자.
 */
	public Test03() {
		HashSet set = new HashSet();
		System.out.println("1. set size : " + set.size());
		
		// 정수 발생시켜서 set에 입력
		for(int i = 0 ; i < 15 ; i++ ) {
			int no = (int)(random()*10 + 1);
			System.out.print(no + ", ");
			set.add(no);
		}
		System.out.println();
		// 출력
		// set의 사이즈 출력
		System.out.println("2. set size : " + set.size());
		// 내용 출력
		System.out.println("3. set : " + set);
		
		// 하나씩 꺼내서 출력
		Iterator it = set.iterator();
		while(it.hasNext()) {
			System.out.print(it.next() + " | ");
		}
	}

	public static void main(String[] args) {
		new Test03();
	}

}
