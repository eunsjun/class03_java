package day19;


import java.util.*;
import etc.*;
public class Test05 {
// TreeSet �׽�Ʈ

/*
	TreeSet �� �Է¼����� �������ش�.
 */
	public Test05() {
//		TreeSet tree = new TreeSet(new Class03().getName());
		
		TreeSet tree = new TreeSet();
		Class03 c03 = new Class03();
		tree.addAll(c03.getName());
		
		HashSet set = new HashSet(new Class03().getName());
		System.out.println(tree);
		
		// �ϳ��� ������ ���
		Iterator it = tree.iterator();
		Iterator it1 = set.iterator();
		while(it.hasNext()) {
			String name = (String) it.next();
			System.out.println("### " + name + " | *** " + (String) it1.next());
		}
		 
	}

	public static void main(String[] args) {
		new Test05();
	}

}
