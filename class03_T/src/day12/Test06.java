package day12;

/*
 *  Test05 �� �л� �Ѹ��� �����͸� ������ �� �ֵ��� �س�������
 *  ���� �츮�� ��ü�� �����͸� ������ ��ƺ���.
 */

public class Test06 {
	// �迭�� 15�� �����Ͱ� �� ������ ����� ����.
	Test05[] score ;
	String[] ban = {"������", "������", "����", "������", "������",
			"������", "��ȯ��", "������", "������", "������",
			"�ȴٿ�", "������", "������", "������", "���ؼ�" };
	public Test06() {
		score = new Test05[15];
		setName(); // ���������� �̸��� �Է��� �ȴ�.
		int no = 0;
		for(Test05 t : score) {
			System.out.println( ++no + ". " + t.getName());
		}
	}
	
	// �ν��Ͻ��� ����� �̸��� �����ϴ� �Լ�
	public void setName() {
		for(int i = 0 ; i < score.length ; i++ ) {
			// �� �л����� �ν��Ͻ��� ������.
			score[i] = new Test05();
			/*
			 * String irum = ban[i]; score[i].setName(irum);
			 */
			score[i].setName(ban[i]);
		}
	}
	
	public static void main(String[] args) {
		new Test06();
	}

}
