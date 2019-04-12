package day19;

/*
	TreeSet 에 데이터를 입력을 하면 정렬을 해서 저장하게 된다.
	이 말은 데이터들 간에 서로 크기가 비교가 되어야 한다는 말이고
	그말 서로 비교할 수 있어야 된다.
 */

import java.util.*;
import etc.*;
public class Test07 {
/*
	삼각형 클래스를 10개를 만들어서 TreeSet에 넣어보자.
 */

	public Test07() {
		TreeSet tree = new TreeSet(new SemoSort());
		
		// 삼각형 객체 입력
		for(int i = 0 ; i < 10 ; i++ ) {
			Samgak semo = new Samgak();
			tree.add(semo);
		}
		
		Iterator it = tree.iterator();
		while(it.hasNext()) {
			System.out.println((Samgak) it.next());
		}
	}

	public static void main(String[] args) {
		new Test07();
	}

}

class SemoSort implements Comparator {
	
	@Override
	public int compare(Object o1, Object o2) {
		Samgak s1 = (Samgak) o1;
		Samgak s2 = (Samgak) o2;
		return -(s1.getWidth()*s1.getHeight() - s2.getWidth()*s2.getHeight());
	}
}