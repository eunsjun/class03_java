package day24;

import java.io.*;
public class Test10_01 {
/*
	Test10���� ���� friend01.txt������ �о��
 */
	public Test10_01() {
		// 1. �⺻ ��Ʈ�� �غ�
		FileInputStream fin  = null ;
		// 2. ���� ��Ʈ�� �غ�
		DataInputStream din = null ;
		
		try {
			fin = new FileInputStream("C:\\share\\Lesson\\Java\\test\\friend01.txt");
			din = new DataInputStream(fin);
			/*
			 * ���� ����
			 		DataOutputStream����
			 		���� ������
			 			�̸�, ����, ����, ����, ��ȭ, ���� ������ ���������Ƿ�
			 		�� ������� ������ �Ѵ�.
			 */
			
			String name = din.readUTF();
			int age = din.readInt();
			float height = din.readFloat();
			boolean gen = din.readBoolean();
			String tel = din.readUTF();
			String mail = din.readUTF();
			
			System.out.println("�̸� : " + name);
			System.out.println("���� : " + age);
			System.out.println("���� : " + height);
			System.out.println("���� : " + gen);
			System.out.println("��ȭ : " + tel);
			System.out.println("���� : " + mail);
			
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			try {
				din.close();
				fin.close();
			} catch(Exception e) {}
		}
	}

	public static void main(String[] args) {
		new Test10_01();
	}

}
