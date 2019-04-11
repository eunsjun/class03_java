package day18;

import java.util.*;
public class Test06 {

	public Test06() {
		ArrayList list = new ArrayList();
		list.add("�ֶ�");
		list.add("ȭ��");
		list.add("����");
		list.add("����");
		
		System.out.println("list not sort : " + list);
		
		// ���� ���� ����
		Collections.sort(list);
		System.out.println("�������� ���� : " + list);
		
		// ���� ���� ����
		Collections.sort(list, new MySort06());
		System.out.println("�������� ���� : " + list);
	}

	public static void main(String[] args) {
		new Test06();
	}

}

class MySort06 implements Comparator {
/*
		"abc" < "abcd"
		"abc" < "abd"
 */
	@Override
	public int compare(Object o1, Object o2) {
		/*
				�� �Լ��� JVM�� ������ �õ��ϴ� ���� �ڵ� ȣ��Ǵ� �Լ�
				�����ϴ� ���� �񱳴�� o1, o2�� �ڵ��Է��ϸ鼭 �ڵ� ȣ��ȴ�.
				�ؾ������� 
				�����͸� �ٲ��� ������ �����ϸ� �ȴ�.
					�ٲٴ� ��Ģ��
						����� ��ȯ�ϸ� �ȹٲٰ�
						������ ��ȯ�ϸ� �ٲ۴�.
						0�� ��ȯ�ϸ� ���� �������Ͷ�� ���̴�.
						
				����
				���ڿ� ������ ���ڿ� �ΰ��� ���ؼ� �ٲ��� ������ ������ �ָ� �ȴ�.
				�� �񱳴� 0���� ������ ��ġ�� ������ �ڵ尪�� ���ָ� �� ���̴�.
		 */
		String str1 = (String) o1;
		String str2 = (String) o2;
		return -str1.compareTo(str2);
		/*
				compareTo()
					�� ���ڿ��� ��Ұ��踦 �����ִ� �Լ�
					��ȯ���� ����
					����� ������ �� ���ڿ��� ũ�ٴ� �ǹ�
					������ ������ �� ���ڿ��� ũ�ٴ� �ǹ��̴�.
					0 �� ���ٴ� �ǹ�...
		 */
	}
	
}
