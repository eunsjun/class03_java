package day24;

import java.io.*;
import java.util.*;
public class Test04 {
/*
	 ������ ���Ͽ� �����ϴ� ���α׷��� ����� ����.
 */
	
	public Test04() {
		// ���Ͽ� �����ϱ� ���ؼ��� ���Ϸ� ����Ǵ� ��Ʈ���� �ʿ��ϰ�
		// ������ ���� ���Ϸ� �����͸� �������� ����̹Ƿ�
		// FileOutputStream �� �ʿ��ϴ�.
		FileOutputStream fout = null;
		try {
			fout = new FileOutputStream("C:\\share\\Lesson\\Java\\test\\test01.txt");
			/*
				������ �������� �ʾƵ� �ڵ����� ����� �ش�.
			 */
			
//			1. �ѱ��ڸ� �Է��غ���.
//			fout.write('A');
			
//			2. �������ڸ� �Է�
/*			String str = "�����??? �츮�� �⼮�� �Ű� �� ���ֽʽÿ�!";
			byte[] buff = str.getBytes();
			fout.write(buff);
*/			
			
			
//			3. ���ϴ� ��ġ������ ����
			String str = "The class String includes methods for examining individual characters of the sequence, \r\nfor comparing strings, for searching strings, for extracting substrings, \r\nand for creating a copy of a string with all characters translated to uppercase or to lowercase. \r\nCase mapping is based on the Unicode Standard version specified by the Character class.";
			byte[]  buff = str.getBytes();
			fout.write(buff);
//			fout.write(buff, 12, buff.length - 12);
			
			System.out.println("### ���� ���� ���� ###");
		} catch(Exception e) {
			System.out.println("�������忡 ���� �߽��ϴ�.");
			e.printStackTrace();
		} finally {
			/*
			 *  �ܺ���ġ�� ����� ��쿡��
			 *  �ش� ��ġ�� ����� ������ �ݾ��ִ� ���� ��Ģ�̴�.
			 */
			try{
				fout.close();
			} catch(Exception e) {}
		}
	}

	public static void main(String[] args) {
		new Test04();
	}

}
