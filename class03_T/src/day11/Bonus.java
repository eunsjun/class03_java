package day11;

/*
		'A' ~ 'Z' 사이의 문자를 랜덤하게 10개를 배열로 만든후
		이 배열을 이용해 String 클래스를 만드세요...
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
