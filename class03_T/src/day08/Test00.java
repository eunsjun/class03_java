package day08;

/*
 * �Էµ� ������ ������������ ���� ����ϼ���..
 * 
 * �׸���
 * 		�� ������ 3x3(9��) ���� �ݺ��ؼ� ����ϼ���.
 */
import java.util.*;
public class Test00 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// �޼��� �׸��� �Է�
		boolean bool = true ;
		int no = 0;
		
		loop:
		while(bool) {
			System.out.print("Ȧ�� ���ڸ� �Է��ϼ��� : ");
			String str = sc.next();
			
			// ���� �ƴ� ���ڸ� �˻�
			for(int i = 0 ; i < str.length() ; i++) {
				if(str.charAt(i) < '0' || str.charAt(i) > '9') {
					System.out.print("���ڰ� �ƴ� ���ڰ� �ԷµǾ����ϴ�.");
					continue loop;
				}
			}
			
			// Ȧ������ �ƴ��� �˻�
			no = Integer.parseInt(str);
			if(no % 2 == 0 ) {
				System.out.print("¦���� �Է��߽��ϴ�.");
				continue loop;
			}
			bool = false;
		}
		// ���ɳʸ� �ٽ�ٸ� �ݾ��ش�.
		sc.close();
		
		
  		for( int l = 0 ; l < 3 ; l++ ) {
			for(int i = 0 ; i < no ; i++ ) {
				for(int m = 0 ; m < 3 ; m++) {
					for(int j = 0 ; j < no ; j++ ) {
						String symbol = "";
						if( j < Math.abs(no / 2 - i) ) {
							symbol = " ";
						} else if( j < no - Math.abs(no / 2 - i)) {
							symbol = "*";
						} else {
							symbol = " ";
						}
						
						System.out.print(symbol);
					}
				}
				System.out.println();
			}
  		}
/*
		for(int i = 0 ; i < no ; i++ ) {
			for(int j = 0 ; j < no - Math.abs(no / 2 - i) ; j++ ) {
				String symbol = "*";
				if( j < Math.abs(no / 2 - i) ) {
					symbol = " ";
				}
				System.out.print(symbol);
			}
			System.out.println();
		}
*/		
		
	}

}
