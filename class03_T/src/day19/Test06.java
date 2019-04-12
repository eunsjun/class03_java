package day19;

import java.util.*;
import etc.*;
public class Test06 {
/*
	Class03 의 이름 리스트를
	TreeSet에 저장하는데
	저장할 때
	내림차순 정렬방식으로 저장이 되게 하세요.
	
 */
	public Test06() {
		TreeSet tree = new TreeSet(new C03Down());
		tree.addAll(new Class03().getName());
		
		// 하나씩 꺼내보자
		Iterator it = tree.iterator();
		for(int i = 0 ;it.hasNext(); i++) {
			String str = ((i+1) % 5 == 0 && i != 0) ? 
							(String)it.next() + "\n" : 
								(String)it.next() + ", " ;
			/*
			 * if((i+1) % 5 == 0 && i != 0) { str = (String)it.next() + "\n"; } else { str =
			 * (String)it.next() + ", "; }
			 */
			System.out.print(str);
		}
		System.out.println();
	}

	public static void main(String[] args) {
		new Test06();
	}

}


class C03Down implements Comparator {
	
	@Override
	public int compare(Object o1, Object o2) {
		return -(((String)o1).compareTo((String)o2));
	}
}