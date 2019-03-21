package day02;

public class Test04 {

	public static void main(String[] args) {
		byte num1 = 127;
		short num2 = 256;
		int num3 = 1000;
		long num4 = 2000;
		
		System.out.println("### " + num1 + " | " + num2 + " | " + num3 + " | " + num4);
		
		//num4 = num3;
		
		num3 = (int) num4; 
		System.out.println("num3 : " + num3);
		
	}

}
