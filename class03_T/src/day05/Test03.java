package day05;

public class Test03 {
/*
 * ���ǹ� ���� 2]
 * 		if ~ else ����
 * 			����]
 * 				if(����){
 * 				
 * 				} else {
 * 				
 * 				}
 */
	public static void main(String[] args) {
		// �����ϰ� 1�Ǵ� 0�� �߻��ؼ�
				// 0�̸� �ҹ��ڸ� �����ϰ�
				// 1�̸� �빮�ڸ� �����ϰ� �߻��ؼ� ����ϼ���.
				
				int no = (int)(Math.random()*2);
				char ch;
				String str;
				
				if(no == 0) {
					str = "�ҹ��ڷ� ";
					ch = (char)(Math.random()*26 + 'a');
				} else {
					str = "�빮�ڷ� ";
					ch = (char)(Math.random()*26 + 'A');
				}
				
				// ���
				System.out.printf("�߻��� ���ڴ� %7s%c %5s", str, ch, "�Դϴ�.");
				// �� ��� no ���� 0 �ƴϸ� �ٸ� ������ ������ �� �����Ƿ� 
				// ������ ���� �ݵ�� ������ �ȴ�. ���� ���� �ʱ�ȭ�� ��� �ȴ�.
	}
}
