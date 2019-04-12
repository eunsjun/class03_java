package day19;

import java.util.*;
import etc.*;
public class Test06 {
/*
	Class03 �� �̸� ����Ʈ��
	TreeSet�� �����ϴµ�
	������ ��
	�������� ���Ĺ������ ������ �ǰ� �ϼ���.
	
 */
	public Test06() {
		TreeSet tree = new TreeSet(new C03Down());
		tree.addAll(new Class03().getName());
		
		// �ϳ��� ��������
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