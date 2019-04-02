package day11;

public class Test09 {

	public Test09() {
		GrandFather grand = new GrandFather();
		GrandFather f = new Father();
		GrandFather s1 = new Son();
		// error
//		Son g1 = new GrandFather();
//		Son g2 = new Father();
		
		Son g3 = (Son)(new GrandFather());
	}

	public static void main(String[] args) {

	}

}

class GrandFather {
}
class Father extends GrandFather {
}
class Son extends Father {
}
