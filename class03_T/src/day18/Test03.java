package day18;

import java.util.*;
public class Test03 {
// 		LinkedList �׽�Ʈ
	public Test03() {
		LinkedList list = new LinkedList();
		list.add("�ֶ�");
		list.add("ȭ��");
		list.add("����");
		list.add("����");
		
		/* get() �Լ� ����ϴ� ���
		int len = list.size();
		for( int i = 0 ; i < len ; i++) {
			// ���� list���� �����Ͱ� �Ѱ��� Ÿ������ ���� �Ǿ������Ƿ�
			// �� �Ѱ��� Ÿ������ ��������ȭ�ؼ� ����ϸ� �ȴ�.
			String mamamoo = (String) list.get(i);
			System.out.println("������ "+ (i+1)+" ��° ��� : " + mamamoo);
		}
		System.out.println("	MaMaMoo Forever!!!");
		*/
		
		/*
			Iterator ����ϴ� ���
		 */
		Iterator itor = list.iterator();
		int i = 0 ;
		while(itor.hasNext()) {
			String mamamoo = (String) itor.next();
			System.out.println("������ "+ (++i)+" ��° ��� : " + mamamoo);			
		}
		System.out.println("	MaMaMoo Forever!!!");
		
	}

	public static void main(String[] args) {
		new Test03();
	}

}
