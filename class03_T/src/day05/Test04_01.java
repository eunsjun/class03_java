package day05;

public class Test04_01 {
/*
 * ����] 
 * 		-100 ���� 100 ������ ���ڸ� �����ϰ� ����
 * 		�� ���ڰ� ������� �������� �׸��� ¦������ Ȧ�������� 
 * 		����ϼ���.
 * 
 * 		1. 0 �ΰ�� ==> ����� ������ �ƴ� ���
 * 		2. ����� ���
 * 		3. ������ ���
 */
	public static void main(String[] args) {
		int num = (int)(Math.random()*201 - 100);
		
		String msg1 = " �� ��� ";
		String msg2 = "¦�� �Դϴ�.";
		
		if(num == 0 ) {
			msg1 = " �� ����� ������ �ƴ� ";
			msg2 = "���Դϴ�.";
		}
		
		if(num != 0) {
			if(num < 0) {
				msg1 = " �� ���� ";
			}
			if(num % 2 != 0) {
				msg2 = "Ȧ�� �Դϴ�.";
			}
		}
		
		System.out.println("�����ϰ� �߻��� �� " + num + msg1 + msg2);
	}
}
