package day10;

import java.util.*;
public class Test02 {
/*
 * �簢�� Ŭ������ ����� ����ؼ� ������ ����غ���.
 */
	public Test02() {
		// ���� ��ü�� ������.( ��ü <== ���۷������� and �ν��Ͻ� )
		Sagak quad = new Sagak();
		Sagak s1 = new Sagak();
		
		// �簢 Ŭ�������� ���ο� ���� ������ �ִµ� ���� ���� 0���� �ʱ�ȭ�� �����̹Ƿ�
		// ���� ���� ���� �Է�������Ѵ�.
		
		// �Է¹��� �غ�
		Scanner sc = new Scanner(System.in);
		
		// ���ΰ� �Է¹޾Ƽ� ������ ����
		System.out.print("���θ� �Է��ϼ���! : ");
		quad.garo = sc.nextInt();
		
		// ���ΰ� �Է¹޾� ������ �����Ѵ�.
		System.out.print("���θ� �Է��ϼ���! : ");
		quad.sero = sc.nextInt();
		// s1 ��ü�� ���� ���� ���� ���� 0���� ���ο� ���� ������ �ȵǾ� �ִ� ���´�.
		
		// ���� ������ ����
		quad.calcArea();
		
		System.out.println("���ΰ� " + quad.garo + " �̰� ���ΰ� " + quad.sero + " �� �簢���� ������ " + quad.area + " �Դϴ�.");
	}

	public static void main(String[] args) {
		new Test02();
	}

}
