package day05;

public class Test08 {
/*
 * while ���
 * 		for ��ɰ��� �������� ī���� ������ ���� ���
 * 		�����ı��� ���� �������ߵȴ�.
 * 
 * 		for ����� ī���� ������ for ��� �ȿ����� ����ϴ� ���������� �ȴ�.
 * 		
 */
	public static void main(String[] args) {
		// 1���� 10���� ����ϼ���.
		int no = 1;
		
		while(no <= 10) {
			System.out.print(no + ", ");
			no++; // ������
		}
		System.out.println("*** while ��� ���� �� ***");
		
		int i = 0;
		for(; i <= 10; i++) {
			System.out.print(i + ", ");
		}
		
		System.out.println();
		System.out.println("### for i ��� ���� �� ###");
		System.out.println(i); // ���������̹Ƿ� �ۿ����� ��� ����...
		
		for(int j = 0; j <= 10; j++) {
			System.out.print(j + ", ");
		}
		System.out.println();
		System.out.println("### for j ��� ���� �� ###");
		// System.out.print(j); // for ��� �ۿ����� ��� ����
		
	}
}
