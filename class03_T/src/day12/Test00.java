package day12;


import day11.*;
public class Test00 {

	public Test00() {
		HW01 test = new HW01();
		test.no1 = 5;
		test.no2 = 7;
		
		test.calcArea();
		
		System.out.println("test �簢�� ���� : " + (int)test.area);
	}

	public static void main(String[] args) {
		new Test00();
	}

}
