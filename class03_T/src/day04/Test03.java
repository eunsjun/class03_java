package day04;

public class Test03 {

	public static void main(String[] args) {
		/*
		 * ��Ʈ ������
		 * 		: ���ڸ� ��Ʈ�� ��ȯ�� �����ϴ� ������
		 * 		  & - (�� ��� 1�϶� 1), 
		 * 		  | - (���� �ϳ��� 1�̸� 1), 
		 * 		  ^ - (������ 0, �ٸ��� 1)
		 */
		int no1 = 6500;
		int no2 = 1234;
		System.out.println("no1 & no2 : " + (no1 & no2));
		System.out.println("no1 | no2 : " + (no1 | no2));
		System.out.println("no1 ^ no2 : " + (no1 ^ no2));
	}

}
