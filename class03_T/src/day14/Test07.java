package day14;


/*
	���ڿ��� �Է��ϴµ�
	���ڿ��� ���̰� 3�ڸ� �����̰ų� 7�ڸ� �ʰ� �Ǵ� ���� �ٽ� �Է� �޵��� 
	���ܷ� ó���ϼ���.
 */

import java.util.*;
public class Test07 {
	// �Է¹��� �غ�
//	Scanner sc ;
//	String str = "";
	public Test07() {
		Scanner sc = new Scanner(System.in);
		String str = getStr(sc);
		System.out.println("�Է��Ͻ� ���̵�� " + str + "�Դϴ�.");
	}
	
	public String getStr(Scanner s) {
		String sid = "";
		while(true) {
			System.out.println("���̵� �Է��ϼ���! : ");
			sid = s.nextLine();
			try {
				if(sid.length() <= 3 || sid.length() > 7 ) {
					throw new IndexOutOfBoundsException();
				}
				s.close();
				break;
			} catch(NumberFormatException e) {
				System.out.println("���� ������ �߸��Ǿ����ϴ�.");
			} catch(IndexOutOfBoundsException e) {
				System.out.println("���̰� �߸��Ǿ����ϴ�.");
			}
		}
		
		return sid;
	}
	
	public static void main(String[] args) {
		new Test07();
	}

}
