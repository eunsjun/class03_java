package day06;

public class Test08 {

	/*
	 * flag ��� ]
	 * 		break �� ����ϰ� �Ǹ�
	 * 		�� ����� ���������� ������ ����� 
	 * 		�ƴϸ� �߰��� ���ᰡ ����� Ȯ���� ����� ����.
	 * 		�� ��� �ݺ����� �ٱ��� ��������� ����
	 * 		�ʱ�ȭ�� �س��� ��
	 * 		�߰��� ���ᰡ �� ��쿡 �� ������ ���� �����ϸ�
	 * 		�� ��ɹ��� ���������� ��� ������ �Ǿ�����
	 * 		�ƴϸ� �߰��� ������� Ȯ�� �� �� �ְ� �ȴ�.
	 * 
	 * 		�� ����� flag ����̶� �Ѵ�.
	 */
	public static void main(String[] args) {
		boolean check = false;
		for(int i = 0; i < 10 ; i++ ) {
			if(i == 5) {
				check = true;
				break;
			}
		}
		if(check == true) {
			System.out.println("*** ���α׷� �߰� ���� ***");
		} else {
			System.out.println("*** ���α׷� ���� ���� ���� ***");
		}
	}

}
