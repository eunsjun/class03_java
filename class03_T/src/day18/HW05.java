package day18;

import java.util.*;
public class HW05 {

	public HW05() {
		ArrayList list = new ArrayList();
		for(int i = 0 ; i < 10 ; i++ ) {
			Circle02 c = new Circle02();
			
			int r = (int)(Math.random()*11 + 5);
			c.setRad(r);
			c.setArround();
			c.setArea();
			
			list.add(c);
		}
		
		for(Object o : list) {
			System.out.println((Circle02) o);
		}
		System.out.println("===========================");
		System.out.println();
		Collections.sort(list);
		
		for(Object o : list) {
			System.out.println((Circle02) o);
		}
		System.out.println("===========================");
		
		System.out.println();
		Collections.reverse(list);
		
		for(Object o : list) {
			System.out.println((Circle02) o);
		}
	}

	public static void main(String[] args) {
		new HW05();
	}
	
}
