package day05;

public class Test05 {
/*
 * 	if ~ else if(����) ~ else
 * 		�������̻� ������ ���� ��� ó�� ���
 * 
 * 	����]
 * 
 * 		if(����) {
 * 
 * 		} else if(����1){
 * 
 * 		} else {
 * 
 * 		}
 * 
 * 	����]
 * 		�ڵ��� ������� (������ �Ʒ�) �� ����
 * 		������ �ɷ�����.
 */
	public static void main(String[] args) {
		int num = -100;
		String msg;
		
		
		if(num > 0) {
			msg = "0���� ũ��.";
		} else if(num > -50) {
			msg = "-50 ���� ũ��.";
		} else {
			msg = "-50���� �۴�.";
		}
		
		System.out.println(num + " �� " + msg);
	}
}
