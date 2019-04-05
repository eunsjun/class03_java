package day14;


import java.util.*;
import java.io.*;
public class Test08 {
/*
	���� ����
		==> �Լ��� ���� ���� ���α׷������̴�.
			�Ѱ��� �۾��� ���ؼ� ������̴�.
			�Լ��ȿ��� �۾��� �ϴٰ�
			���ܰ� �߻��ϸ�
			�� �Լ��� ���̻� ������ �ʿ䰡 ���� ��찡 ����.
			���� �� �Լ��� ���ܸ� ���� �ϵ��� �� ���� ��찡 ����.
			
			����]
				void abc() throws ����1, ����2, ... {
				
				}
				
			�ǹ�]
				�� �Լ��� �����ϴٰ� ����� ���ܰ� �߻��ϸ� ������ �����Ѵ�.
				
			**********
			���ܰ� ���̵� �Լ��� 
			�� �Լ��� ȣ���� ������ �ݵ�� ���� ó���� �� �־�� �Ѵ�.
			
			
		����]
			==> ��� � �Լ��� ���ܸ� ������ �Լ���
				���� ó���� ������ �ʾƵ� �Ǵ� ��찡 �ִ�.
				
				�����ϴ� ���ܰ� RuntimeException �Ҽ��� ���ܴ� 
				����ó���� �ص� �׸�, ���ص� �׸��̱� �̱� ������ ���ص� �Ǵµ�...
				�ǵ����̸� ���ִ� ���� ����.
				( �̷� �Լ����� java.lang ��Ű�� �Ҽ��� Ŭ������ �ִ� �Լ�����
					�̷��� ����ó���� �س��� ��찡 ����.)
				
 */
	
/*
	���ڿ��� �Է��ϴµ�
	���ڿ��� ���̰� 3�ڸ� �����̰ų� 7�ڸ� �ʰ� �Ǵ� ���� �ٽ� �Է� �޵��� 
	���ܷ� ó���ϼ���.
 */


	public Test08() {
		String id = "";
		Scanner sc = new Scanner(System.in);
		while(true) {
			try{
				id = getSid(sc);
				break;
			} catch(EOFException e) {
				System.out.println("���̵� ���̰� ���� �ʽ��ϴ�.");
			}
		}
		sc.close();
		System.out.println("�Է��Ͻ� ���̵�� " + id + " �Դϴ�.");
	}
	
	public String getSid(Scanner s) throws EOFException {
		String sid = "";
		System.out.println("���̵� �Է��ϼ���!");
		sid = s.nextLine();
		s.reset();
		if(sid.length() <= 3 || sid.length() > 7) {
			throw new EOFException();
		}
		return sid;
	}
	
	public static void main(String[] args) {
		new Test08();
	}

}
