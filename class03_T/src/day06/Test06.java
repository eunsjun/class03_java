package day06;

/*
 * 2 ~ 200 ���� ������ �Ҽ��� ����ϼ���.
	�Ҽ� : 1�� �ڽ����θ� ������ �������� ����
 */
public class Test06 {
	public static void main(String[] args) {
		ori:
		for(int i = 2 ; i < 201 ; i++) {
			for(int j = 2, cnt = 0; j < i ; j++ ) {
				if(i % j == 0 ) {
					// ������ �������� ���� ���Դٴ� �̾߱� �̹Ƿ� �Ҽ��� �ƴϴ�.
					continue ori;
				}
			}
			
			System.out.print(i + ", ");
		}
	}
}
