package day09;

import java.util.*;
public class Test02 {

	public static void main(String[] args) {
		// Ű���� �Է¹ޱ�
		Scanner sc = new Scanner(System.in);
		System.out.println("���� �ΰ��� ������ �ΰ� �Է��ϼ���.");
		String sno = sc.next();
		/*
		 		next() : ����� ���� Ű�� ���� ����Ѵ�.
		 				������ �� ��� ���� ���� ���ڿ��� ����
		 				������ �����ؼ� ������ ���ڿ��� �޸𸮿� �׳� �д�.
		 */
		System.out.println("sno 1st : " + sno);
		
		System.out.println("���� �ΰ��� ������ �ΰ� �Է��ϼ���.");
		sno = sc.nextLine(); // next()���� "20" �� ���°� ������ " 20" ���ܵ״µ�
							// nextLine()���� ������ ���ڿ��� ��� ���´�.(" 20")
		/*
		 * 	nextLine() : ����Ű�� �ν��� �Ѵ�.
		 * 				���� �޸𸮿� ����Ǿ��ִ� ����(���� ����)�� ���ڿ��� ������ �Լ�..
		 */
		System.out.println("sno 2nd : " + sno);
	}

}
