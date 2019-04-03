package day12;

import day11.HW01;

public class HW00_Circle extends HW01 {
	public HW00_Circle() {
		System.out.println("@@@ 동그라미 클래스 @@@");
	}
	public HW00_Circle(int no1) {
		this.no1 = no1;
	}
	public void calcArea() {				// Overriding
		area = no1 * no1 * (float) Math.PI;
	}
	
	public void calcArea(int no2) {			// Overloading
		area = no2 * no2 * (float) Math.PI;
	}
}
