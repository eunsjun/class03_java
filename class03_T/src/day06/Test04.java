package day06;

public class Test04 {
/*
 * 
 * 1 2 3 4 5
 * 1 2 3 4 5
 * 1 2 3 4 5
 * 1 2 3 4 5
 * 1 2 3 4 5
 * 
 * 
 * 5 4 3 2 1
 * 5 4 3 2 1
 * 5 4 3 2 1
 * 5 4 3 2 1
 * 5 4 3 2 1
 * 
 * 
 * 1
 * 1 2
 * 1 2 3
 * 1 2 3 4
 * 1 2 3 4 5
 * 
 * 
 * 5
 * 5 4 
 * 5 4 3 
 * 5 4 3 2
 * 5 4 3 2 1
 * 
 * 
 *  1
 *  2  3
 *  4  5  6
 *  7  8  9 10
 * 11 12 13 14 15
 * 
 * ������ ==> ���ں��� ����� �ذ��ϴ� ���
 * �������	==> ī���ͺ����� �ذ��ϴ� ���
 * 
 */

/*
	
	*
	**
	***
	****
	*****
	
*/
	
	/*
	 * 2x + 4y = 10
		��������
		����� ���
		
		��,
		X >= 0,
		Y >= 0
		X, y <= 10
	 */
	
	/*
	 * �ֻ��� �ΰ��� 
		���� 6��
		������ �����
		���� ��� 
		����ϼ���.
	 */
	public static void main(String[] args) {
		/*
		for(int i = 0 ; i < 5 ; i++ ) {
			for(int j = 0 ; j <= i ; j++ ) {
				System.out.print("*");
			}
			System.out.println();
		}
		*/
		
		for(int i = 0 ; i < 5 ; i++ ) {
			for(int j = 5 ; j > 0 ; j-- ) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
		
		
		System.out.println();
		for( int i = 0 ; i < 5 ; i++ ) {
			for(int j = 0 ; j < 5 ; j++ ) {
				System.out.printf("%2d", 5 - j);
			}
			System.out.println();
		}
	}

}
