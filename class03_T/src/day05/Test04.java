package day05;

public class Test04 {
/*
 * ����]
 * 		���� �ϳ��� �����ϰ� ���� 
 * 		�� ���ڰ� ¦������  Ȧ�������� ����ϼ���.
 * 
 * -if �׸��� if ~ else ������ ����ؼ� ó���ϼ���.
 */
	public static void main(String[] args) {
		int num = (int)(Math.random()*201);
		String msg = "Ȧ�� �Դϴ�.";
		
		if(num % 2 == 0) {
			msg = "¦�� �Դϴ�.";
		}
		
		System.out.println("�����ϰ� �߻��� �� " + num + " �� " +  msg);
		
		// if ~ else ����
		if(num % 2 == 0) {
			msg = "¦�� �Դϴ�.";
		} else {
			// ���⼭�� ���� �ʱ�ȭ�� �̹� �Ǿ� �����Ƿ�
			// msg ������ �ٸ� �����͸� �Է����� �ʾƵ� �ȴ�.
			// ���� ������ ������ ����.
		}
		System.out.println("�����ϰ� �߻��� �� " + num + " �� " +  msg);
	}
}
