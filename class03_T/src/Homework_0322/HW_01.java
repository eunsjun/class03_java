package Homework_0322;

/*
 * ����1]
	3 �ڸ��� ������ ���� �ϳ��� �Է� ���� ��
	���ڸ� ���ϸ� ���� ���ڸ� ���� ����ϼ���.
	��] 777 ==> 700
 */
import java.util.*;
public class HW_01 {

	public static void main(String[] args) {
		// �Է¹ް�
		Scanner sc = new Scanner(System.in);
		System.out.println("���ڸ� ���ڸ� �Է��ϼ���! : ");
		String str = sc.next();
		// ������ ��ȯ�ϰ�
		int no1 = Integer.parseInt(str);
		// �����ϰ�
		int no2 = no1 / 100 * 100 ;
		// ����Ѵ�.
		System.out.println(no1 + " �� 10�ڸ� ���ϸ� ������ " + no2 + " �Դϴ�!");
	}

}
