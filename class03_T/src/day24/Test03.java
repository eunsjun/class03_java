package day24;

import java.util.Arrays;

public class Test03 {
/*
	3. 
		�ַ� ��Ʈ��ũ ó���� �� �� ���� ���
 */
	public Test03() {
		// �迭 �غ�
		byte[] buff = new byte[256];
		// �迭�� ��� �濡 'A'�� ä���ִ´�.
		Arrays.fill(buff, (byte)'A');
		
		System.out.println("�ƹ��ų� ���ּ���! : ");
		
		try{
			// �迭�� ���� ������ �Է�
			int len = System.in.read(buff, 10, 100);
			// �迭�� ����� �����͸� ������ ���ڿ��� ��ȯ
			String str = new String(buff, 10, len+10);
			
//			System.out.println("LEN : " + len);
//			String s = "�ƹ��ų�";
			System.out.println("��� : " + str);
			/*
				�ƹ��ų� ���ּ���! : 
				�ƹ��ų�
				��� : �ƹ��ų�
				AAAAAAAAAA
				
				�Է��� �� �Է��� ������ ����Ű�� ������ \r\n �ڵ尡 ���������
				�� �ڵ尡 �ԷµǾ
				�ٹٲ��ڵ���� �����̵ǰ�
				����� ����ϸ� �ٹٲ��� �ȴ�.
			 */
		} catch(Exception e) {}
	}

	public static void main(String[] args) {
		new Test03();
	}

}
