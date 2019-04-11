package day18;

import java.util.*;
import java.text.*;
public class HW00 {
	Vector<Vector<Object>> van;
	String[] name = {"강찬규", "강태훈", "김상우", "김태헌", "김태형",
					"김형준", "김환진", "박정헌", "박형진", "서병주",
					"안다예", "양희준", "전영수", "조원용", "허준석" };
	public HW00() {
		van = new Vector<Vector<Object>>();
		int sum;
		for(int i = 0 ; i < name.length ; i++ ) {
			sum = 0 ;
			van.add(new Vector<Object>());
			van.get(i).add(name[i]);
			for(int j = 1 ; j < 7 ; j++ ) {
				van.get(i).add((int)(Math.random()* 51 + 50));
				sum += (int)van.get(i).get(j);
			}
			van.get(i).add(sum);
			van.get(i).add((int)((sum / 6f)*100 + 0.5) / 100f);
		}
		
//		for(Vector<Object> v : van) {
//			System.out.println(v);
//		}
		
		for(int i = 0; i < van.size() ; i++ ) {
			System.out.println(toString(i));
		}
	}
	
	public String toString(int idx) {
		String pattern = "{0} - {1} | {2} | {3} | {4} | {5} | {6} | {7} | {8} |";
		String str = MessageFormat.format(pattern, 
								van.get(idx).get(0), 
								van.get(idx).get(1),
								van.get(idx).get(2),
								van.get(idx).get(3),
								van.get(idx).get(4),
								van.get(idx).get(5),
								van.get(idx).get(6),
								van.get(idx).get(7),
								van.get(idx).get(8)
					);
		return str;
	}

	public static void main(String[] args) {
		new HW00();
	}

}
