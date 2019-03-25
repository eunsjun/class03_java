package day05;

import java.util.*;
public class Test06 {
/*
 * switch case
 * 		: if else if else ���� ����� ����ó����
 * 
 * 		����]
 * 			switch (�����){
 * 			case ��1:
 * 				���๮1;
 * 				break;
 * 			case ��2:
 * 				���๮2;
 * 				break;
 * 			...
 * 			case ��n:
 * 				���๮n;
 * 				break;
 * 			default
 * 				���� ���� ��� ó�����;
 * 			}
 * 
 * 			break ����� ���� ���� switch case ������ ���������� �� �����Ƿ� ����ε� ���� ���� ���Ѵ�.
 * 
 * 
 * 		***
 * 		break ����� switch case �� �� �ݺ����� ���Ḧ �˷��ִ� ��ɾ��̴�.
 */
	public static void main(String[] args) {
		/*
		 *  ����]
		 *  	dno �� 10 �� ���� ȸ���
		 *  			20�� ���� ������
		 *  			30�� ���� ������
		 *  			������ ���� �ѹ��η� 
		 *  		�μ��� �����ϼ���.
		 */
		
		// �Է¹��� �غ�
		Scanner sc = new Scanner(System.in);
		// �޼��� ����ϰ� �Է¹ް�
		System.out.print("�μ���ȣ�� �Է��ϼ���! : ");
		int dno = sc.nextInt();
		String dname ;

		switch (dno) {
		case 10:
			dname = "ȸ���";
			break;
		case 20:
			dname = "������";
			break;
		case 30:
			dname = "������";
			break;
		default :
			dname = "�ѹ���";
		}
/*
 * ### �̷���(break ����) ����ϸ� ���� �ȵȴ�.
		switch (dno) {
		case 10:
			dname = "ȸ���";
		case 20:
			dname = "������";
		case 30:
			dname = "������";
		default :
			dname = "�ѹ���";
		}
 */
		
		
		// ����ϰ�
		System.out.println("�Է��� �μ���ȣ " + dno + " �� " + dname + " �Դϴ�.");
	}
}
