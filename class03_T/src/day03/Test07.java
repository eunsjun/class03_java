package day03;

import java.util.Scanner;
// java.util ��Ű�� ���� Scanner Ŭ������ ����Ʈ �ߴ�.
// ���� java.util ��Ű�� ���� ���� Ŭ������ ����ؾ� �Ѵٸ� java.util.* �� �ϸ� �ȴ�.
public class Test07 {
	public static void main(String args[]) {
		// 1. �Է¹��� �غ��ϰ�
		Scanner sc = new Scanner(System.in);
		// 2. �޼��� ����ϰ�
		System.out.print("������ ���� �� ??? : ");
		// 3. �Է¹ް�
		int num = sc.nextInt(); // int ������ ���ڸ� �Է������ �Ѵ�.
		// 4. �Է°� ����ϰ�
		System.out.println("�̰� ����?? " + num);
	}
}
