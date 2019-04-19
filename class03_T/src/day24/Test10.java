package day24;

import java.io.*;
public class Test10 {
/*
	������Ʈ�� 2
		DataInputStream/DataOutputStream
		==> ���� ����ϴ� ��Ʈ���� �ƴϴ�.
			��� ����� ����
			���
			���� ��Ʈ���� �ݵ�� byte[]�θ� �����͸� ó���Ѵ�.
			���� �����Ͱ� �ƴ� �ٸ� ������ �����ʹ�
			������ ���� �� �ִ�.
			==> �ڹ��� ���������� byte[] ��ȯ���� �ʰ�
				���� �ܺ� ��ġ�� ������ϴ� ����� �߰��� ���̴�.
				
		�� ������� �ʴ� ����
		<== 
			DataOutput�� �̿��� ���� DataInput���� �޾ƾ� �Ѵ�.
			������ �������� �Ѵ�.
			(������ �� int, float 
			==>
			��������
				int, float �� ������� ������ �Ѵ�.)
 */
	
/*
	���Ͽ� 
	ģ���� ������ ��������.
		ģ������
			�̸� 		String
			����		int
			����		float
			����		boolean <== woman : true | man : false
			��ȭ��ȣ	String
			�����ּ�	String
 */
	public Test10() {
		// �⺻ ��Ʈ�� �غ�
		FileOutputStream fout = null;
		// ������Ʈ�� �غ�
		DataOutputStream dout = null;
		
		try {
			fout = new FileOutputStream("C:\\share\\Lesson\\Java\\test\\friend01.txt");
			dout = new DataOutputStream(fout);
			String name = "������";
			int age = 26;
			float height = 182.f;
			boolean gen = false;
			String tel = "010-9876-5432";
			String mail = "cho@increpas.com";
			
			// DataInput/Output �� Ư¡�� �ڹ��� �����͸� ��ȯ���� �ʰ� ����� �� �ִ�.
			dout.writeUTF(name);
			dout.writeInt(age);
			dout.writeFloat(height);
			dout.writeBoolean(gen);
			dout.writeUTF(tel);
			dout.writeUTF(mail);
			
			
			System.out.println("���� ���� �Ϸ�");
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			try {
				fout.close();
				dout.close();
			}catch(Exception e) {}
		}
	}

	public static void main(String[] args) {
		new Test10();
	}

}
