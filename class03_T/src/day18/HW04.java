package day18;

import java.util.*;
public class HW04 {

	public HW04() {
		ArrayList list = new ArrayList();
		for(int i = 0 ; i < 10 ; i++ ) {
			Circle c = new Circle();
			
			int r = (int)(Math.random()*11 + 5);
			c.setRad(r);
			c.setArround();
			c.setArea();
			
			list.add(c);
		}
		
		for(Object o : list) {
			System.out.println((Circle) o);
		}
		System.out.println("===============================");
		
		System.out.println();
		// 정렬
		Collections.sort(list, new HW04Sort());
		
		for(Object o : list) {
			System.out.println((Circle) o);
		}
		System.out.println("===============================");
		System.out.println();
		
		
		// 내림차순정렬
		Collections.sort(list, new HW04SortRev());
		
		for(Object o : list) {
			System.out.println((Circle) o);
		}
		System.out.println("===============================");
	}

	public static void main(String[] args) {
		new HW04();
	}
}


class HW04Sort implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
		return ( ((Circle)o1).getRad() - ((Circle)o2).getRad() );
	}
	
}

class HW04SortRev implements Comparator {
	
	@Override
	public int compare(Object o1, Object o2) {
		return -( ((Circle)o1).getRad() - ((Circle)o2).getRad() );
	}
	
}