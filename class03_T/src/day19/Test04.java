package day19;

import java.util.*;
import etc.*;
public class Test04 {
/*
	etc.Class03 �� �����͸� �̿��ؼ� set�� ����� �������.
 */
	public Test04() {
		/*
		ArrayList list = new Class03().getName();
		HashSet set = new HashSet(list);
		*/
		HashSet set = new HashSet(new Class03().getName());
		System.out.println(set);
		
		Vector vec = new Vector(set);
		System.out.println("���� 1 : " + vec);
		Collections.reverse(vec);
		System.out.println("���� 2 : " + vec);
		Collections.sort(vec);
		Collections.reverse(vec);
		System.out.println("���� 3 : " + vec);
	}

	public static void main(String[] args) {
		new Test04();
	}

}
