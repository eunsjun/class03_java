package day24;

import java.io.*;
public class Test06 {
// ���� �����ϱ�...
	public Test06() {
		/*
			����]
				��Ʈ���� �ܹ����̴�.
				������ ������ �Ѱ����� �о 
				�ٸ������� �������� ���� �ȴ�.
				���� ��Ʈ���� �ΰ��� �־�� �ȴ�.
		 */
		// ��Ʈ���غ�
		FileInputStream fin = null;
		FileOutputStream fout = null;
		
		try {
			fin = new FileInputStream("C:\\share\\Lesson\\Java\\test\\test01.txt");
			fout = new FileOutputStream("C:\\share\\Lesson\\Java\\test\\test01_01.txt");
			// �Ѱ����� �о �״�� �ٸ����� ����.
			// �׷��� ��� �о�� ���� �𸥴�.
			while(true) {
				byte[] buff = new byte[1024];
				int len = fin.read(buff);
				if(len == -1) {
					break;
				}
				fout.write(buff, 0, len);
			}
			System.out.println("*** Copy Mission Complete! ***");
			
		} catch(Exception e) {
			
		} finally {
			try {
				fout.close();
				fin.close();
			} catch(Exception e) {}
		}
	}

	public static void main(String[] args) {
		new Test06();
	}

}
