package day14;

/*
	���� 1]
		java, oracle, jsp, sprint, web, js, ���, ����
		����� ���ϴ� �Լ�, ������ ���ϴ� �Լ��� ó���ϰ�
		������ ���κ� ������ ������ VO Ŭ������ �����
		
		�츮�� �л� ��ü�� ������ �迭�� ���� �����ϼ���.
		
		�߻��� �� �ִ� ���ܿ� ���� ó���� �� �ּ���...
		1. �迭�� ������ ��� ���
		2. 10 ������ ������ ���� ���
		3. ����� ����ϴµ� 0 ���� ������ ���
 */
public class HW01 {
	Class03[] score;
	String[] name = {"������", "������", "����", "������", "������",
					"������", "��ȯ��", "������", "������", "������",
					"�ȴٿ�", "������", "������", "������", "���ؼ�" };
	
	public HW01() {
		score = new Class03[15];
		setData();
		toPrint();
	}
	// ������ �Է��Լ�
	public void setData() {
		for(int i = 0 ; i < score.length ; i++ ) {
			int[] no = createScore();
			try {
				score[i] = new Class03(name[i]);
				score[i].setJava(no[0]);
				score[i].setOracle(no[1]);
				score[i].setJsp(no[2]);
				score[i].setSpring(no[3]);
				score[i].setWeb(no[4]);
				score[i].setJs(no[5]);
				score[i].setTotal();
				score[i].setAvg();
			} catch (NullPointerException e) {
				System.out.println("�̸��� �Էµ��� �ʾ� ���α׷��� �����մϴ�.");
			} catch (IllegalArgumentException e) {
				System.out.println("������ �Էµ��� �ʾҰų� ���ڶ��ϴ�. ���α׷��� �����մϴ�.");
			} catch(ArithmeticException e) {
				System.out.println("����� ���ϴµ� 0 ���� ������ �����Դϴ�. ���α׷��� �����մϴ�.");
			}
		}
	}
	// ���� �߻� �Լ�
	public int[] createScore() {
		int[] no = new int[6];
		for(int j = 0 ; j < no.length ; j++ ) {
			no[j] = (int)(Math.random()*90 + 11);
		}
		
		return no;
	}
	
	public void toPrint() throws NullPointerException, IllegalArgumentException, ArithmeticException {
		System.out.printf("**%6s***%4s***%6s***%3s***%6s***%3s***%3s***%5s***%5s**\r\n", "******", "****", "******", "***", "******", "***", "***", "*****", "*****");
		System.out.printf("| %5s | %4s | %6s | %3s | %6s | %3s | %3s | %5s | %4s  |\r\n", "name", "java", "oracle", "jsp", "spring", "web", "js", "total", "avg");
		System.out.printf("==%6s===%4s===%6s===%3s===%6s===%3s===%3s===%5s===%5s==\r\n", "======", "====", "======", "===", "======", "===", "===", "=====", "=====");
		for(Class03 stud : score) {
			System.out.printf("| %3s | %3d  | %4d   | %3d | %4d   | %3d | %3d | %4d  | %5.2f |\r\n", stud.getName(), stud.getJava(), stud.getOracle(), stud.getJsp(), stud.getSpring(), stud.getWeb(), stud.getJs(), stud.getTotal(), stud.getAvg());
			System.out.printf("--%6s---%4s---%6s---%3s---%6s---%3s---%3s---%5s---%5s--\r\n", "------", "----", "------", "---", "------", "---", "---", "-----", "-----");
		}
		System.out.printf("**%6s***%4s***%6s***%3s***%6s***%3s***%3s***%5s***%5s**\r\n", "******", "****", "******", "***", "******", "***", "***", "*****", "*****");
	}
	
	public static void main(String[] args) {
		new HW01();
	}

}
