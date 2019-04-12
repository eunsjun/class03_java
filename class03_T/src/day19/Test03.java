package day19;

import java.util.*;
import static java.lang.Math.*;
public class Test03 {
/*
	1 ~ 10 ���� �����ϰ� ������ 15���� �߻����Ѽ�
	HashSet�� ��������.
 */
	public Test03() {
		HashSet set = new HashSet();
		System.out.println("1. set size : " + set.size());
		
		// ���� �߻����Ѽ� set�� �Է�
		for(int i = 0 ; i < 15 ; i++ ) {
			int no = (int)(random()*10 + 1);
			System.out.print(no + ", ");
			set.add(no);
		}
		System.out.println();
		// ���
		// set�� ������ ���
		System.out.println("2. set size : " + set.size());
		// ���� ���
		System.out.println("3. set : " + set);
		
		// �ϳ��� ������ ���
		Iterator it = set.iterator();
		while(it.hasNext()) {
			System.out.print(it.next() + " | ");
		}
	}

	public static void main(String[] args) {
		new Test03();
	}

}
