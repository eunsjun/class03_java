package day03;


/*
 *  ����]
 *  	���� ���̸� ���ϴµ�
 *  	���̰��� ������ ����� ���� ����ϼ���.
 */
public class Test03 {
	public static void main(String[] args) {
		final float PHI = 3.14F ;	
		// �Ǽ��� �⺻ �Է� Ÿ���� double �̴�. 
		// float Ÿ������ ������ �Է��ؾ� �� ���� ���ͷ� ����ȯ�� �ʿ��ϴ�.
		// ����� �̸��� �빮�ڷ� ������ �Ѵ�.

		// PHI = 3.141592F;
		// 	�̷��� ����� �����͸� �Է��ϸ� �ȵȴ�.
		//	��??? ����� �ѹ� �Էµ� �����ʹ� ������ �Ұ����ϴϱ�...
		
		int rad = 5 ;
		float area = rad * rad * PHI ;
		
		
		System.out.println("�������� " + rad + " �� ���� ���̴� " + area + " �Դϴ�.");
	}
}
