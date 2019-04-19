package day24;

import java.io.*;
public class Test08_02 {
/*
	API Documentation ������
		( C:\share\Lesson\Java\doc\docs\api )
	������ ����� �˾Ƴ�����.
 */
	public Test08_02() {
		// 1. ����� �˾Ƴ��� ���� ������ ���Ϸ� �����.
		File dir = new File("C:\\share\\Lesson\\Java\\doc\\docs\\api\\resources\\fonts");
		
		// Ȯ���ڰ�( . ���Ŀ� ���� ���ڿ��� �̾߱��ϰ� ������ Ÿ���� �������ش�.) 
		// svg�� ���ϸ� ��� ��� �ϰ� �ʹ�.
		String[] list = dir.list(new FilenameFilter() {
			@Override
			public boolean accept(File dir, String name) {
				/*
					�Ű����� ����
						File dir	: ���� ������ ������ �˷��ش�.
						String name	: ���� ������ �̸��� �˷��ش�.
						
					accept() �Լ� �ڵ� ȣ��Ǵ� �Լ���.
					����� ���ϴ� ������ �ϳ��� �߰��Ҷ����� �� �Լ��� ȣ��ȴ�.
					�� �Լ��� ��ȯ���� 	true  �� ��ȯ�ϸ� ��Ͽ� ���Խ�Ű��
										false �� ��ȯ�ϸ� ��Ͽ��� ���ܽ�Ų��.
				 */
				
				String tmp = name.substring(name.indexOf('.') + 1);
				
				if(tmp.equals("svg")) {
					return true;
				} else {
					return false;
				}
				
				/*
				if(name.endsWith("svg")) {
					return true;
				} else {
					return false;
				}
				*/
			}
		});
		
		// ����Ʈ ���
		for(int i = 1 ; i <= list.length ; i++) {
			System.out.printf("%2d. %s\n", i, list[i-1]);
		}
	}

	public static void main(String[] args) {
		new Test08_02();
	}

}

