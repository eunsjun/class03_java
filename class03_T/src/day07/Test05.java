package day07;

import java.util.Arrays;

public class Test05 {
/*
	String[] team1 = {"������", "������", "����", "������", "������"};
	String[] team2 = {"������", "��ȯ��", "������", "������", "������"};
	String[] team3 = {"�ȴٿ�", "������", "������", "������", "���ؼ�"};
	
	1. ������ ���� ����� �����ּ���...
	
	2. �� ���� ���� ����� �����ϰ�
		�����غ�����...
	
 */
	public static void main(String[] args) {
		String[] team1 = {"������", "������", "����", "������", "������"};
		String[] team2 = {"������", "��ȯ��", "������", "������", "������"};
		String[] team3 = {"�ȴٿ�", "������", "������", "������", "���ؼ�"};
		
		String[] class03 = new String[15];
		
		// ���� ����
		System.arraycopy(team1, 0, class03, 0, 5);
		System.arraycopy(team2, 0, class03, team1.length, 5);
		System.arraycopy(team3, 0, class03, team1.length + team2.length, 5);
		
		System.out.println("��������������� class03 ���������������");
//		System.out.println("�ޡޡޡޡޡޡޡޡޡޡޡޡޡޡޡޡޡޡޡޡޡޡޡޡޡޡޡޡޡޡޡޡޡޡޡޡ�");
		for(int i = 0 ; i < class03.length ; i++ ) {
			System.out.print(class03[i]);
			if((i+1) % 5 == 0 & i != class03.length - 1) {
				System.out.println();
				System.out.println("-------------------------------------");
			} else if(i == class03.length - 1){
				System.out.println();
			} else {
				System.out.print(" | ");
			}
			
		}
		System.out.println("�ޡޡޡޡޡޡޡޡޡޡޡޡޡޡޡޡޡޡޡޡ�");
		//
		
	}

}
