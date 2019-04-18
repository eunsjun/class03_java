package day23;

public class Test01 {
	Test01_01 t1;
	
	public Test01() {
		t1 = new Test01_01();
	}

	public static void main(String[] args) {
		Test01 tt = new Test01();
		System.out.println(tt.t1.num);
		System.out.println(tt.t1.str);
	}

}

class Test01_01{
	int num;
	String str;
}