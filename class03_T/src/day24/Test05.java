package day24;

import java.io.*;
import java.util.*;
public class Test05 {
// Test04���� ���� test01.txt ������ �о��.
	public Test05() {
		// ��Ʈ���غ�
		FileInputStream fin = null;
		
		try {
//			fin = new FileInputStream("C:\\share\\Lesson\\Java\\test\\test01.txt");
//			1. �ѱ��ڸ� �о��.
//			int ch = fin.read();
//			System.out.println("�� �� : " + (char) ch);

			/*
//			2. �������� �б�
			// ���� �ڵ� �б�
			fin = new FileInputStream("src/day24/Test04.java");
			// ���� ���� 
			byte[] buff = new byte[1024];
			// �о ������ ���
			int len = fin.read(buff);
			// ���ڿ��� ��ȯ�ϱ�
			String str = new String(buff, 0, len);
			// print
			System.out.println("�� �� ]\n" + str);
			*/
			
//			3. ��� ������ �о��.
			// ���� ���� �б�
			fin = new FileInputStream("src/day24/Test04.java");
			// �׷��� ����ڸ� �о�� �� �� �𸣹Ƿ�
			// �ݺ��ؼ� ó���ϱ�� ����.
			System.out.println("�� �� ]");
			while(true) {
				// ������ ���� ���� �о��.
				byte[] buff = new byte[1024];
				int len = fin.read(buff); // ��ȯ���� ���� ������ ��...
				// ���� �о�� �����Ͱ� ���� ���� ��ȯ���� -1 �̴�.
				if(len == -1 ) {
					// ���̻� ���� �����Ͱ� ���� ������ �������ش�.
					break;
				}
				
				String str = new String(buff, 0, len);
				System.out.print(str);
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		} finally {
			try {
				fin.close();
			}catch(Exception e) {}
		}
	}

	public static void main(String[] args) {
		new Test05();
	}

}
