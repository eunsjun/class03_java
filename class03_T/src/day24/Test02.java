package day24;

import java.io.*;
import java.util.*;
public class Test02 {
/*
	2. 
	�ԷµǴ� �������ڸ� �о��.
 */
	public Test02() {
		System.out.println("�Է��غ��ÿ�! : ");
		
		// ���� ����� ������ ���� �غ�
		byte[] buff = new byte[256];
		// [] ���� ���ڿ� ���� �ѹ��� ���� �������� ���� ��������.
		
		try{
			int len = System.in.read(buff);
			// len - ���� ������ ����
			// buff - ���� �����͸� �����ϴ� �Ű�����
			
			// ���� ����� ���ڷ� ��ȯ�ؼ� ���
			String str = new String(buff, 0, len);
			
			System.out.println("��� : " + str);
		}catch(Exception e) {}
	}

	public static void main(String[] args) {
		new Test02();
	}

}
