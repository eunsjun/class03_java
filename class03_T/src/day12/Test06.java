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
		/*
		 * int no = 0; for(Test05 t : score) { System.out.println( ++no + ". " +
		 * t.getName()); }
		 */
		
		setScore();
		toPrint();
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
	
	// �� �л��� ���� ���� �Է��ϴ� �Լ�
	public void setScore() {
		// ����
		// 1. �Է��Ϸ��� ����� �־�� �Ǵ� �ϳ��� ��������.
		for(int i = 0 ; i < score.length ; i++ ) {
			// �迭�� �����ϰ� 6���� ������ �����ص���.
			int tscore[] = new int[6];
			for(int j = 0 ; j < 6 ; j++ ) {
				tscore[j] = (int) (Math.random()*41 + 60);
			}
			
			// 6���� ������ �� ���� �Է�����.
			score[i].setJavaScore(tscore[0]);
			score[i].setOracleScore(tscore[1]);
			score[i].setJspScore(tscore[2]);
			score[i].setSpringScore(tscore[3]);
			score[i].setWebScore(tscore[4]);
			score[i].setJsScore(tscore[5]);
			
			// ���� ���ϱ�
			score[i].setTotal();
		}
	}
	
	// �л� ����� ������ ������ִ� �Լ�
	public void toPrint() {
		System.out.printf("%6s | %6s | %6s | %6s | %6s | %6s | %6s | %6s |\r\n", "��  ��", "java", "oracle", "j s p", "spring", "w e b", "j   s", "Total");
		System.out.println("======================================================================");
		for(Test05 t : score) {
			System.out.printf("%4s | %6d | %6d | %6d | %6d | %6d | %6d | %6d |\r\n", 
								t.getName(), t.getJavaScore(),
								t.getOracleScore(), t.getJspScore(), 
								t.getSpringScore(), t.getWebScore(), 
								t.getJsScore(), t.getTotal());
		}
		System.out.println("======================================================================");
	}
	
	// ������ ���� ������ �����ϼ���...
	
	public static void main(String[] args) {
		new Test06();
	}

}
