package day19;

import java.util.*;
import etc.*;
public class Test08 {
// ���� �� ������ �ﰢ�� Ŭ���� 10���� ���� TreeSet�� �־��.
	public Test08() {
		TreeSet tree = new TreeSet();
		
		// ������ �Է�
		for(int i = 0 ; i < 10 ; i++ ) {
			tree.add(new Semo());
		}
		
		// ������ ���
		Iterator it = tree.iterator();
		while(it.hasNext()) {
			System.out.println((Semo) it.next());
		}
	}

	public static void main(String[] args) {
		new Test08();
	}

}
