package day20;

import java.util.*;
import java.io.*;
public class Test05 {
/*
	Properties
	==> Map �� ������ �ϴ� Ŭ����
		
		�Ϲ� Map���� �������� ����(�ܺ���ġ)�� �̿��ؼ� 
		���� �����͸� �о Mapó�� ������ �� �ְ�
		Map�� ����� �����͸� ���� ����(�ܺ���ġ)�� ����ؼ� ������ �� �ִ�.
		
		������]
			������ ������ ���� �� ���ڵ��� ���� �ʴ´�.
			==> �ѱ� ������ ��� ���� ��ü���� ���ڵ��� ���� ������
				������ �ѱ��� ��� �ѱ��� ������ ����� ����� ���� �ʴ´�.
				
		����]
			�ѱ��� ���Ե� ������ Properties ���� ����ϱ� ���ؼ� ���ڵ� ��Ű�� ���
			
			1. cmd â�� ����.
			2. Path�� �ڹ� Ȩ���� ����ְ�
			3. native2ascii ����� �̿��ؼ� ���ڵ����ش�.
				����]
					] native2ascii 	��������	���ο�����
				
				��]
					] native2ascii C:\Data\sample.txt c:\Data\sample_ko.txt
 */
	/*
	 * sample.txt ������ �о Map�� �����غ���.
	 */
	public Test05() {
		Properties prop = new Properties();
		// �ܺ����ϰ� �����ؾ� �Ѵ�.
		// �� �۾��� ���� IO ������ �� �ٽ� �� ���캸��� ����.
		FileInputStream fin = null;
		
		try {
			// ������ �д´�.
			/*
			 *  ����
			 		Properties �� �����ڵ�� ���ڵ��� ���ϸ� ��Ȯ�ϰ� ���� �� �����Ƿ�
			 		�����ڵ�� ����� ���ϸ� �е��� ����.
			 		�ȱ׷��� �ܰ� ��Ÿ����.
			 */
			fin = new FileInputStream("c:\\Data\\sample_ko.txt");
			
			// ���� �� ������ ������ Properties �� �е��� ����.
			prop.load(fin);
			// ���� ���� ������ Map���� ó�� �Ǿ� �ִ� ���°� ���.
		} catch(Exception e) {
			System.out.println("����...");
		}
		String name = (String) prop.get("name");
		int age = (int) Integer.parseInt((String)prop.get("age"));
		String tel = (String) prop.get("tel");
		String msg = (String) prop.get("msg");
		
		System.out.printf("### %5s ###\n\tage : %3d\n\ttel : %s\n\tmsg : %s\n", name, age, tel, msg);
	}

	public static void main(String[] args) {
		new Test05();
	}

}
