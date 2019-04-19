package day24;

import java.io.*;
public class Test09 {
/*
	���� ��Ʈ��(������Ʈ��)
	==> 1. �⺻��Ʈ���� ����� �߰��Ѵٴ���
		2. ������� ���Ǹ� �����ϱ� ����
		�������� ����� ��Ʈ��
		
		����]
			�ݵ�� �⺻ ��Ʈ���� �����ؾ� �ϰ�
			���� ��Ʈ���� �ʿ信 ���� �����ؼ� ����ϸ� �ȴ�.
			
		����]
			���� ��Ʈ�� ���� ���⼺�� �ְ�
			�ݵ�� ���� ���Ⳣ���� ���� �ؾ� �Ѵ�.
			
			
		***
		1. BufferedInputStream/BufferedOutputStream
			==> ����� ���� ����� ����
				��Ʈ���� ������ ��� ��Ű�� ������ �Ѵ�.
				���ۿ� �����͸� ��Ҵٰ�
				�ѹ��� ó���ϴ� ����� �߰��� ��Ʈ���̴�.
				
			***
			�ֿ��Լ�
			flush()
			==> ������ ���۸� ���� �Լ�
 */

/*
	���Ͽ� �����ϴ� ���α׷��� ���弼��.
	�� BufferedStream�� ����ϼ���.
 */
	public Test09() {
		// 1. ������Ʈ���� �ݵ�� �⺻��Ʈ��(Ÿ�ٽ�Ʈ��)�� �ʿ��ϴ�.
		FileOutputStream fout = null;
		
		// 2. ������Ʈ�� �غ�
		BufferedOutputStream bout = null;
		
		try {
			fout = new FileOutputStream("C:\\share\\Lesson\\Java\\test\\test09.txt");
			bout = new BufferedOutputStream(fout);
			
			String str = "�ƹ��ų� ���ڿ� �Է��ϼ���! ���̿�~~~!";
			byte[] buff = str.getBytes();
			bout.write(buff);
			// ���� ���۰� ���� �ʾƼ� ������ ������ FileOutputStream���� ���� �ʾҴ�.
			// ���� ������ ������ ������ �ȵ� �����̴�.
			
			// �ݵ�� ���������� �Ϸ�� �������� ���۸� ����ִ� ������ ������.
			bout.flush();
			
			System.out.println("���� �Ϸ�");
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			try{
				fout.close();
				bout.close();
			} catch(Exception e) {}
		}
	}

	public static void main(String[] args) {
		new Test09();
	}

}
