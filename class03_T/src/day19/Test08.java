package day19;

import java.util.*;
import etc.*;
public class Test08 {
// 서로 비교 가능한 삼각형 클래스 10개를 만들어서 TreeSet에 넣어보자.
	public Test08() {
		TreeSet tree = new TreeSet();
		
		// 데이터 입력
		for(int i = 0 ; i < 10 ; i++ ) {
			tree.add(new Semo());
		}
		
		// 데이터 출력
		Iterator it = tree.iterator();
		while(it.hasNext()) {
			System.out.println((Semo) it.next());
		}
	}

	public static void main(String[] args) {
		new Test08();
	}

}
