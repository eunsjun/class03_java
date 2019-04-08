package day15;

public class Test03 {
/*
 * Samgak Çü ºñ±³
 */
	public Test03() {
		Samgak s1 = new Samgak(10, 5);
		Samgak s2 = new Samgak(5, 10);
		
		System.out.println(s1.equals(s2));
		System.out.println(s1);
		System.out.println(s2);
		
		Sagak nemo1 = new Sagak();
		System.out.println(nemo1);
	}

	public static void main(String[] args) {
		new Test03();
	}

}
