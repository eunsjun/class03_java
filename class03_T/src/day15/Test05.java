package day15;


import static java.lang.Math.*;
public class Test05 {
/*
	Question]
		�츮�� �л� �Ѹ��� ������ ������ Ŭ������ �����
		������� �ν��ϰ� �̸��� ������ ���� ������� ó���ǰ�
		�ۼ��ϼ���....
		�׸���
		������ ����ϸ�
			������ : 90, 90, 90, 90, 90, 90
			���� : 540, 
			��� : 90.0
		���� ��µǰ� �ϼ���.
 */
	
	String[] name = {"������", "������", "����", "������", "������",
			"������", "��ȯ��", "������", "������", "������",
			"�ȴٿ�", "������", "������", "������", "���ؼ�" };
	
	public Test05() {
		int[] score = getNumArr();
		Score s1 = new Score(name[13], score[0], score[1], score[2], score[3], score[4], score[5]);
		score = getNumArr();
		Score s2 = new Score(name[13], score[0], score[1], score[2], score[3], score[4], score[5]);
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println("s1 �� s2 �л��� �����ϱ�??? : " + (s1.equals(s2) ? "��! ���� �л��Դϴ�." : "�ƴϿ�. �ٸ� �л��Դϴ�."));
	}
	
	// ������ �Է����ִ� �Լ�
	public int[] getNumArr() {
		int[] no = new int[6];	// �迭 ������ ����� ���� ����
		for(int i = 0 ; i < no.length ; i++ ) {
			no[i] = (int)(random()*41 + 60);
		}
		
		return no;
	}
	
	
	public static void main(String[] args) {
		new Test05();
	}

}
