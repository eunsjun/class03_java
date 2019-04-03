package day12;

public class Dohyung {

	public static void main(String[] args) {
		System.out.println("==== 도형 클래스 시작 ===");
		HW00_Semo test1 = new HW00_Semo();
		System.out.println("==== 도형 클래스 종료 ===");
		
		HW00_Circle test2 = new HW00_Circle(7);
		test2.calcArea();
		System.out.println("동그라미 면적 : " + test2.area);
	}

}
