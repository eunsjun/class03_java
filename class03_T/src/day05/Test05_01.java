package day05;

/*
 * 		-100 ���� 100 ������ ���ڸ� �����ϰ� ����
 * 		�� ���ڰ� ������� �������� �׸��� ¦������ Ȧ�������� 
 * 		����ϼ���.
 * 
 * 		1. 0 �ΰ�� ==> ����� ������ �ƴ� ���
 * 		2. ����� ���
 * 		3. ������ ���
 */
public class Test05_01 {

	public static void main(String[] args) {
		int num = (int)(Math.random()*201 - 100);
		String msg ;

/*
		// ���⼭���� �߸� ���� ��
		if(num > 0) {
			msg = "0 ���� ū �� �Դϴ�."; // �̰͸� ����ȴ�.
		} else if(num > 20) {
			msg = "20���� Ů�ϴ�.";
		} else if(num > 50) {
			msg = "50���� Ů�ϴ�.";
		} else {
			msg = "100 ���� Ů�ϴ�.";
		}
		// �������...
* 
*/
		if(num == 0) {
			msg = " �� ����� ������ �ƴմϴ�.";
		} else if(num > 0) { 
			// �� �������� �Ѿ�� ���� 0�� �ƴ϶�� �̾߱��̴�.
			if(num % 2 == 0) {
				msg = "��� ¦���Դϴ�.";
			} else {
				msg = "��� Ȧ���Դϴ�.";
			}
		} else {
			// �� ���� 0�� �ƴϰ� 0���� ũ�� �ʴ� ��� ���
			if(num % 2 != 0) {
				msg = "���� Ȧ���Դϴ�.";
			} else {
				msg = "���� ¦���Դϴ�.";
			}
			
		}
		System.out.println(num + " �� " + msg);
	}

}