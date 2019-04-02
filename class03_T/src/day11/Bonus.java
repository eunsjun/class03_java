package day11;

/*
		'A' ~ 'Z' ������ ���ڸ� �����ϰ� 10���� �迭�� ������
		�� �迭�� �̿��� String Ŭ������ ���弼��...
 */
public class Bonus {
	char[] ch ;
	public Bonus() {
		ch = new char[10];
		setChar();
	}
	
	public void setChar() {
		for(int i = 0 ; i < 10 ; i++ ) {
			ch[i] = (char)(Math.random()*26 + 'A');
		}
	}
	
	public void toPrint() {
		for(char c : ch) {
			System.out.print(c + " ");
		}
	}
	
	public String toString() {
		StringBuffer buff = new StringBuffer();
		for(char c : ch) {
			buff.append(c);
		}
		return buff.toString();
	}
	
	public static void main(String[] args) {
		Bonus etc = new Bonus();
		etc.toPrint();
		
		System.out.println();
		String str = new String(etc.ch);
		System.out.println(str);
		
		System.out.println("=================================");
		System.out.println(etc.toString());
	}
}
