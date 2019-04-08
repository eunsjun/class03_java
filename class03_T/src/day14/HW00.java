package day14;

/*
		����]
			String[] str = {"123", "456", "789", ...};
			�迭�� �� ���ڿ��� �����ϰ� ���弼��...
			
			�� �ִ� ���
			�̰��� �հ� ����� ���ϴ� ���α׷��� �ۼ��ϼ���.
			
			��, �߻��� �� �ִ� ���ܸ� �����Ͽ� ��� ó���ϼ���.
				1. �迭�� ������ ��� ���
				2. ���ڷ� ��ȯ�� �Ұ����� ���
				3. ����� ����ϴµ� 0���� �������� ���....
				
				 �߰��۾�]
				 	a. �迭���̵� �����ϰ�...
				 	b. ���ڿ����̵� �����ϰ�...
 */

import static java.lang.Math.*;
import java.util.*;
public class HW00 {
	String[] num;
	
	public HW00() {
		/*
		 * String str = 'A' + ""; String str1 = '9' + ""; String str2 = "2" + '5';
		 * 
		 * StringBuffer buff = new StringBuffer(); buff.append('3');
		 * 
		 * String s = buff.toString();
		 */
		int len = (int)(Math.random()*6 + 5);
		num = new String[len];
		
		/*
		Scanner sc = new Scanner(System.in);
		try{
			setSArray(sc);
		} catch(IndexOutOfBoundsException e) {
			System.out.println("�迭 �ε��� ����...");
		}
		*/
		this.getRndmArr();
		
		// ��� ����ϱ�
		float avg = 0.f;
		try {
			avg = getAvg(toNum());
			System.out.println("*** �迭 num[] �� ���ڷ� �ٲ� ����� ��� : " + avg );
		} catch (NumberFormatException e) {
			System.out.println("�迭�� ��� ������ ���� ������ �ƴմϴ�.");
		} catch (IndexOutOfBoundsException e) {
			System.out.println("�迭�� ��� ������ �ʰ��� �ε����� ã�� �����մϴ�.");			
		} catch (ArithmeticException e) {
			System.out.println("0���� ������ ����� �ؼ� ���α׷��� �����մϴ�.");
		}
		System.out.println("##### ���α׷� ���� #####");
	}
	
	// ����Ÿ���� ���ڿ��迭 ����� �Լ� 
	public void setSArray(Scanner s) throws IndexOutOfBoundsException {
		for(int i = 0 ; i < num.length ; i++ ) {
			System.out.println("[ " + (i+1) + "/" + num.length +" ] ���ڸ� ���ڸ� �Է��ϼ���!");
			String sno = s.nextLine();
			try{
				if(sno.length() != 3) {
					throw new NumberFormatException();
				}
				for(int j = 0 ; j < sno.length() ; j++ ) {
					char c = sno.charAt(j);
					Integer.parseInt(c+"");
				}
			} catch(NumberFormatException e) {
				--i;
				continue;
			}
			num[i] = sno;
		}
		s.close();
		System.out.println("### num �迭�� ������ �Է��� �Ϸ�Ǿ����ϴ�. ###");
		System.out.println("num[] : " + Arrays.toString(num));
	}
	
	// �����ϰ� ����Ÿ�� ���ڿ� �߻��ϴ� �Լ�
	public void getRndmArr() {
		StringBuffer buff = new StringBuffer();
		
		for(int i = 0 ; i < num.length ; i++ ) {
			char ch = ' ';
			for(int j = 0 ; j < (int)(Math.random()*11) ; j++ ) {
				ch = (char)(random()*10 + '0');
				
				if(j == 0 && ch == '0') {
					try {
						throw new NumberFormatException();
					} catch (NumberFormatException e) {
						System.out.println((i+1) + "/" + num.length + ". ù ���ڰ� [ 0 ]�� ���ͼ� �ٽ� ����ϴ�.");
						--j;
						continue;
					}
				}
				buff.append(ch);
			}
			
			try {
				if(buff.length() != 3 ) {
					throw new IllegalArgumentException();
				}
			} catch(IllegalArgumentException e) {
				System.out.println((i+1) + "/" + num.length + ". 3�ڸ� ���ڰ� �ƴϾ �ٽ� ����ϴ�.");
				buff.delete(0, buff.length());
				--i;
				continue;
			}
			
			try{
				num[i] = buff.toString();
			} catch(IndexOutOfBoundsException e) {
				break;
			}
			buff.delete(0, buff.length());
		}
		
		System.out.println();
		System.out.println("### num �迭�� ������ �Է��� �Ϸ�Ǿ����ϴ�. ###");
		System.out.println("num[] : " + Arrays.toString(num));
	}
	
	// �迭�� �� ���� �����͸� ���ڷ� ��ȯ�ϴ� �Լ�
	public int[] toNum() throws NumberFormatException, IndexOutOfBoundsException {
		int[] no = new int[num.length];
		for(int i =0 ; i < num.length ; i++ ) {
			no[i] = Integer.parseInt(num[i]);
		}
		
		return no;
	}
	
	// ���ڹ迭�� ����� ���ϴ� �Լ�
	public float getAvg(int[] no) throws ArithmeticException {
		if(no.length == 0) throw new ArithmeticException();
		
		float avg = 0.0f;
		int sum = 0;
		for(int n : no) {
			sum += n;
		}
		avg = sum / no.length ;
		return avg;
	}

	public static void main(String[] args) {
		new HW00();
	}

}
