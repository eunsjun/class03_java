package day04;


import java.util.*;
public class Test04 {

	public static void main(String[] args) {
		/*
		 * ���� ������ : �� �����ڰ� �ϳ��� ������( ++, -- )
		 * ���� ������ : �� ������ 2���� ������
		 * 
		 * ���� ������ : �� �����ڰ� 3���� ������.
		 * 
		 * 		���ǿ����� - ���ǿ� ���� �ԷµǴ� ���� �����Ǵ� ������.
		 * 			����]
		 * 				(���ǽ�) ? (���϶� ��) : (������ �� ��);
		 * 	
		 */
		
		// �Է� ���� �غ�
		Scanner sc = new Scanner(System.in);
		// �Է¹ް� �����ϰ�
		// ù��° ���� �Է¹ް� ����
		System.out.print("ù��° ���� : ");
		String str = sc.next();
		int no1 = Integer.parseInt(str);
		System.out.println(); // �ٹٲ�...
		// �ι�° ���� �Է¹ް� ����
		System.out.print("�ι�° ���� : ");
		str = sc.next();
		int no2 = Integer.parseInt(str);
		System.out.println();
		// ������ ���ϰ� ��¸޼��� �Է�...
		String msg = (no1 > no2) ? ("no1�� Ů�ϴ�.") : ("no! no2�� ��Ŀ...!");
		// ����Ѵ�.
		System.out.println(msg);
	}

}
