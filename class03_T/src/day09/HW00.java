package day09;

import java.util.*;
public class HW00 {

	public static void main(String[] args) {
		
		String[] name = {"������", "������", "������", "������", "������"};
		int[] point = {98, 99, 100, 98, 90};
//		int[] point = new int[name.length];
		
		for(int i = 0 ; i < 5 ; i++ ) {
//			System.out.println(name);
			System.out.println(name[i] + " : " + point[i] + " ��");
		}
		
		/*
		 * �̸��� �Է��ϸ� �ش� �л��� �̸��� ������ [ ������ : 98 ] ��µǰ� �ϼ���.
		 */
		
//		System.out.println("����° �л� [ " + name[2] + " ] �л��� ���� : " + point[2]);
		
		Scanner sc = new Scanner(System.in);
		
		// �̸��� �Է��ϸ� �ε����� ����ϰ� ���� �̾Ƴ���
		System.out.println("�л��̸��� �Է��ϼ���!");
		String sname = sc.next();
		// �ݺ��񱳸� �ؼ� �ε����� ã�Ƴ���.
		int idx = 0 ;
		for(int i = 0 ; i < name.length ; i++ ) {
			if( sname.equals(name[i]) ) {
				idx = i ;
			}
		}
		
		System.out.println("�Է��� �л� : " + name[idx] + " | ���� : " + point[idx]);
		
		/*
		while(true) {
			System.out.print("��ȸ�� �л��� �Է��ϼ���! [ quit(����) ] : ");
			String str = sc.next();
			System.out.println();
			if(str.equals("quit")) {
				System.out.println("���α׷��� �����մϴ�.");
				break;
			}
			int idx = 0 ;
			for(int i = 0 ; i < name.length ; i++ ) {
				if(str.equals(name[i])) {
					idx = i ;
					break;
				}
			}
			System.out.println("��ȸ�� �л� [ " + name[idx] + " ] �л��� ������ " + point[idx] + " �� �Դϴ�.");
		}
		*/
		
	}

}
