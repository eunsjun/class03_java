package day24;

import java.io.*;
public class Test08_01 {
/*
	API Documentation ������
		( C:\share\Lesson\Java\doc\docs\api )
	������ ����� �˾Ƴ�����.
 */
	
/*
	���� ���� ����� �̸����� ������������ ������ �ؼ�
	������ ������ �����ִ�.
	�̰��� ������ ������ �����ؼ�
	�������� ����� �ǰ� �ϰ�
	���� ������ ����� �ǵ���
	�����ؼ� ����ϼ���.
 */
	public Test08_01() {
		// 1. ����� �˾Ƴ��� ���� ������ ���Ϸ� �����.
		File dir = new File("C:\\share\\Lesson\\Java\\doc\\docs\\api");
		
		File[] list = dir.listFiles();
		for(int i = 0 ; i < list.length ; i++ ) {
			File fileinfo = list[i];
			String fileName = fileinfo.getName();	// ���� �̸� �˾Ƴ��� �Լ�
			long len = fileinfo.length();	// ���� ũ�� �����ִ� �Լ�
			System.out.printf("%2d. %27s - %d\n", (i+1),fileName, len);
		}
	}

	public static void main(String[] args) {
		new Test08_01();
	}

}
