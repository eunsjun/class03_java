package day18;

import java.util.*;
public class Test02 {

	public Test02() {
		// ArrayList ��ü ����
		ArrayList list = new ArrayList();
		// list �� ������ �߰�
		list.add("������");
		list.add("soo");
		list.add("010-1111-1111");
		list.add("�л�");
		list.add("���ڴ� ���� ��׸� �Ծ�����???");
		list.add(24);
		
/*
		System.out.println(list);
		
		// list �� �����͸� ����ȯ�ؼ� ��������.
		for( int  i = 0 ; i < list.size() ; i++ ) {
			Object o = list.get(i);
			
			if(o instanceof String) {
				String str1 = (String) o;
				System.out.println("eunsjun ] " + str1);
			} else if(o instanceof Integer) {
				int num = (int) o;
				System.out.println("soo ] " + (num + 5));
			}
		}
		
		int len = list.size();
		System.out.println(len);
		System.out.println(list.get(1));
		System.out.println(list.get(2));
		
		// �ε��� 1 �� ������ ����
		list.remove(1);
		len = list.size();
		System.out.println(len);
		System.out.println(list.get(1));
		System.out.println(list.get(2));
		
		// �ε��� 1 �� ���� �߰��غ���
		list.add(1, null);
		len = list.size();
		System.out.println(len);
		System.out.println(list.get(1));
		System.out.println(list.get(2));
*/
		/*
		 * Iterator ����
		 * 		1. �÷����� Iterator �� ��ȯ��Ų��
		 * 		2. �ϳ��� ���������� ������.
		 */
		
		Iterator itor = list.iterator();
		
		while(itor.hasNext()) {	// ������ ������ �����Ͱ� �ִ��� ���� ���� �Լ�
			Object o = itor.next(); // Iterator ���� ������ �����ϴ� �Լ�
			if(o instanceof String) {
				String str = (String) o; // String ���� ���� ����ȯ
				System.out.println("���ڿ� Ÿ�� : " + str);
			} else if(o instanceof Integer) {
				int num = (int) o;		// unboxing
				System.out.println("���� Ÿ�� : " + (num + 5));
			}
		}
	}

	public static void main(String[] args) {
		new Test02();
	}

}
