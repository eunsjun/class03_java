package day06;

public class Test02 {
/*
 * break ���
 * 		==> �ݺ����̳� switch case���� �����ų�� ����ϴ� ���
 * 
 * continue ���
 * 		==> �ݺ����� ���� ȸ���� ���� �����ų��(�پ������) ����ϴ� ���
 */
	public static void main(String[] args) {
		// 1 ~ 10 ����ϴµ�
		// 1. 5 ������ ����
		for(int i = 0 ; i < 10 ; i++ ) {
			if(i == 5) {
				break;
			}
			System.out.print(i + ", ");
		}
		System.out.println();
		System.out.println("=====================================");
		
		// 2. 5 ������ ���� ȸ���� �����ϰ� �ϼ���.
		for(int i = 0 ; i < 10 ; i++ ) {
			if(i == 5) {
				continue;
			}
			System.out.print(i  + ", ");
		}
		System.out.println();
		System.out.println("=====================================");
	}

}
