package day06;

public class Test03 {
/*
 * ���̺��� ���� �ݺ���
 * 		==> break �Ǵ� continue ����� ���̺��� ���� �ݺ������� �ٷ� �̵���Ű�� ���....
 * 
 * ����]
 * 		break ���̺�; 		==> ������ ���̺��� ���� �ݺ����� ����
 * 		continue ���̺�;	==> ������ ���̺��� ���� �ݺ����� ���� ȸ���� ����...
 * 
 * 		���̺� ����� ����]
 * 			���̺��̸�:
 * 			�ݺ���{}
 * 
 * 
 * ����]
 * 		���̺��� ���� ����� �������� �ݺ����� ������ �ȴ�.
 * 
 * 
 * 		one:
 * 		for(){
 * 			soo:
 * 			for(){
 * 				if(){
 * 					break one; ==> O
 * 				}
 * 				continue two;	==> x
 * 				continue one;	==> o
 * 			}
 * 	
 * 			two:
 * 			for(){
 * 				break soo;
 * 			}
 * 		}
 * 		for(){
 * 			if(){
 * 				break one; 		==> x
 * 			}
 * 		}
 * 
 */
	
/*
 * �ݺ����� ����ؼ�
 * 
 * 		 **
 * 		 **
 * 		 *****
 * 		 *****
 * 		 *****
 * 
 */
	
	public static void main(String[] args) {
		one:
		for(int i = 0 ; i < 5 ; i++) {
			for(int j = 0 ; j < 5 ; j++) {
				if(i < 2 & j > 1) {
					System.out.println();
					continue one;
				}
				System.out.print("*");
			}
			System.out.println();
		}
	}
}










