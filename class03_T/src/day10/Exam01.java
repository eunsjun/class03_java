package day10;

/*
	����]
		���� �ΰ��� �Է¹޾Ƽ�
		�簢��, �ﰢ��, ���� ���̸� ���ϴ�
		Ŭ������ ����� �Լ��� ���� 
		����(����/���� || ����/���� || ������ �ΰ�)�� ����� ����ϼ���.
 */
import java.util.*;
public class Exam01 {
	// �Է¹��� ���� �غ�
	Scanner sc = new Scanner(System.in);
	public Exam01() {
		// ���� �ΰ� �Է� �ޱ�
		System.out.print("ù��° ���ڸ� �Է��ϼ���! : ");
		int num1 = inputData();
		System.out.print("�ι�° ���ڸ� �Է��ϼ���! : ");
		int num2 = inputData();
		
		Nemo nemo = new Nemo(num1, num2);
		int qArea = nemo.myunjuk();
		
		System.out.println("���ΰ� " + nemo.garo + " ���ΰ� " + nemo.sero + " �� �簢���� ������ " + qArea + " �Դϴ�.");
		
		// �ﰢ��
		Semo semo = new Semo(num1, num2);
		float triArea = semo.getArea();
		System.out.println("�غ��� " + semo.wid + " �̰� ���̰� " + semo.heig + " �� �ﰢ���� ������ " + triArea + " �Դϴ�.");
		
		// ���� ����
		Won won = new Won(num1, num2);
		
		System.out.println("�������� " + won.c1 + " �� ���� ���̴� " + won.area1 + " �Դϴ�.");
		System.out.println("�������� " + won.c2 + " �� ���� ���̴� " + won.area2 + " �Դϴ�.");
		
	}
	
	public int inputData() {
		int num = 0 ;
		
		a1:
		while(true) {
			String sno = sc.next();
			for(int i = 0 ; i < sno.length(); i++ ) {
				if(sno.charAt(i) > '9' || sno.charAt(i) < '0') {
					continue a1;
				}
			}
			num = Integer.parseInt(sno);
			break;
		}
		
		return num;
	}
	
	public static void main(String[] args) {
		new Exam01();
	}

}
