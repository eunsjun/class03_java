package day18;

import java.util.*;
public class HW02 {
/*
	����]
		�����ϰ� ������ 10���� ����
		ArrayList�� �����ϰ� ����ϰ�
		�������� �����ؼ� ����ϰ�
		�������� �����ؼ� ����ϼ���.
 */
	public HW02() {
		ArrayList list = new ArrayList();
		
		// ������ �Է�
		for(int i = 0 ; i < 10 ; i++ ) {
			char ch = (char)(Math.random()*26 + 'A');
			list.add(ch);
		}
		
		// ���
		System.out.println(list);
		
		
		// �⺻ ����
		/*
		 * Collections.sort(list); System.out.println(list);
		 */
		// �������� ����
		/* Collections.reverse(list); */
		Collections.sort(list, new HwSort02());
		System.out.println(list);
	}

	public static void main(String[] args) {
		new HW02();
	}

}


class HwSort02 implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
		return -((char)o1 - (char)o2);
	}
}