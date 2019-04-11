package day18;
/*		
		float pi = 3.141592f;
		
		// �Ҽ��� ��°�ڸ����� �ݿø��ϼ���.
 * 3.141592
 * 	==> 3.142
 * 		<== 3.141592 * 1000 ==> 3141.592 + 0.5 ==> (int)3142.092 ==> 3142
 * 			==> 3142 / 1000f ==> 3.142 
		 
//		float result = (int)(pi * 1000 + .5);
		
		float result = (int)(Math.round(pi * 1000)) / 1000f;
		System.out.println(result);
 */		


import java.util.*;
public class Test05 {
/*
	�����ϰ� 1 ~ 50 ������ 10���� ����� ArrayList �� �����ϰ�
	������ �������� �����ϼ���.
 */
	public Test05() {
		// ArrayList �����
		ArrayList list = new ArrayList();
		
		// ������ 10�� ����� �Է��ϰ�
		for(int i = 0 ; i < 10 ; i++ ) {
			// ȸ������ ���� �ϳ��� �����
			int num = (int) (Math.random()* 50 + 1);
			// ������� ������ list�� ����ְ�
			list.add(num);
		}
		// list ����ϰ�
		System.out.println("���� ���� : " + list);
		
		Collections.sort(list);	// List�� �ڵ� ����ȯ
		System.out.println("�⺻���� : " + list);
		
		// list �����ϰ�
		Collections.sort(list, new MySortD18());
		// ���ĵ� list ����ϰ�
		Comparator c;
		System.out.println("������������ : " + list);
	}
	
	public static void main(String[] args) {
		new Test05();
	}

}


class MySortD18 implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		// ArrayList�� ����Ǿ� �ִ� ���� ������ Ÿ������ ���� ����ȯ ���ش�.
		int tmp1 = (int) o1;
		int tmp2 = (int) o2;
		
		/*
		if(tmp1 == tmp2) {
			return 0;
		} else if( tmp1 < tmp2) {
			return -1;
		} else {
			return 1;
		}
		*/
		
		return -(tmp1 - tmp2);
	}
	
}