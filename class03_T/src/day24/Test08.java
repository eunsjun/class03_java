package day24;

import java.io.*;
public class Test08 {
/*
	API Documentation ������
		( C:\share\Lesson\Java\doc\docs\api )
	������ ����� �˾Ƴ�����.
 */
	public Test08() {
		// 1. ����� �˾Ƴ��� ���� ������ ���Ϸ� �����.
		File dir = new File("C:\\share\\Lesson\\Java\\doc\\docs\\api");
		
		String[] list = dir.list();
		/*
		 * for(String f : list) { System.out.println(f); }
		 */
		for(int i = 0 ; i < list.length ; i++ ) {
			System.out.printf("%2d. %s\n", (i+1),list[i]);
		}
	}

	public static void main(String[] args) {
		new Test08();
	}

}
