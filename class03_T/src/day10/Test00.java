package day10;

/*
	������ �ϳ��� �����ϰ� �Է��� ��
	���� ���̿� �ѷ��� ����Ͽ� ����ϴ� ���α׷��� �ۼ��ϼ���
	��, �Է�, ���̰��, �ѷ����, ����� �Լ��� ó���ϼ���.
 */
import java.util.*;
public class Test00 {
	Scanner sc = new Scanner(System.in);
	// ��������... - Ŭ���� ������ ������������� ��밡��...
	int r = 0;
	public Test00() {
		/*
		 * Scanner sc = new Scanner(System.in);
		 * ==> �������� : �Ҽӵ� �Լ������� ����ǰ� �Լ������� ����Ǹ� ������� ����
		 */
		int rad = getRadius();
		
		// ���ѷ� ���ϱ�...
		// ���ѷ��� ���Ϸ��� �������� �ʿ��ϴ�.
		
		// �ѷ��� ���� �ޱ�
		double arround = getArround(rad);
		double area = getArea(rad);
		
		// �ѷ��� ���� �Ѳ����� �ޱ�
		double[] data = getCalc(rad);
		double arround1 = data[0];
		double area1 = data[1];
		
		// ����ϱ�
//		toPrint(rad);
		toPrint1(rad);
	}
	
	// ���� �������� �Է¹޾� �ѷ��� ������ִ� �Լ�
	public double getArround(int r) {
		/*
		 *  ���������� �Ű������� �̸��� ������ ����
		 *  �����ġ���� ����� ������ ����Ѵ�. 
		 */
		double dulrae = 2 * r * 3.14;
		return dulrae;
	}
	
	// �������� �Է¹޾� ������ ������ִ� �Լ�
	public double getArea(int r) {
		/*
		 * double calcArea = r * r * 3.14; return calcArea;
		 */
		return (r * r * 3.14);
	}
	
	public double[] getCalc(int r) {
		double calcArround = getArround(r);
		double calcArea = getArea(r);
		
		double[] data = {calcArround, calcArea};
		
		return data;
	}
	
	// ���ڿ��� ���� ���� ��ȯ���ִ� �Լ�
	public String getString(int r) {
		double calcArround = getArround(r);
		double calcArea = getArea(r);
		
		return calcArround + "|" + calcArea;
	}
	
	// ������ִ� �Լ�
	public void toPrint(int r) {
		double[] data = getCalc(r);
		// �������� r, �ѷ��� data[0], ������ data[1]
		System.out.printf("��������  %2d �� ���� �ѷ��� %.2f  �̰� ������ %.2f �Դϴ�.", r, data[0], data[1]);
	}
	
	public void toPrint1(int r) {
		String str = getString(r);
		int idx = 0 ;
		
		for(int i = 0 ; i < str.length(); i++ ) {
			/*
			 * if(str.charAt(i) < '0' || str.charAt(i) > '9') { idx = i; break; }
			 */
			if(str.charAt(i) == '|') {
				idx = i ;
			}
		}
		
		String sArround = str.substring(0, str.indexOf('|'));
		/*
		 * 		���ڿ�.indexOf(����);
		 * 				���ڿ��� ���Ե� ������ �ε����� ��ȯ���ش�.
		 */
		String sArea = str.substring(str.indexOf('|') + 1);
		System.out.printf("��������  %2d �� ���� �ѷ��� %s �̰� ������ %s �Դϴ�.", r, sArround, sArea);
	}
	
	public static void main(String[] args) {
		new Test00();
	}
	
	public int getRadius() {
		int r = 0;
		
		inchar:
		while(true) {
			System.out.print("*** �������� �Է��ϼ���! : ");
			String sno = sc.next();
			
			// ���ڿ� �˻�
			for(int i = 0 ; i < sno.length(); i++ ) {
				if(sno.charAt(i) < '0' || sno.charAt(i) > '9') {
					System.out.println("�Է¹��ڰ� �߸�������ϴ�.");
					continue inchar;
				}
			}
			
			// ���� ������ ����Ǵ� ���� for �ݺ������� �˻翡 ����� ����̴�.
			// ����  �Է¹��� ���ڸ� ������ ��ȯ������.
			r = Integer.parseInt(sno);
			// ���� �ݺ��� ����...
			break;
		}
		return r;
	}
}
