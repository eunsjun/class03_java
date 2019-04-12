package day19;

import java.util.*;
import etc.*;
public class Test11 {
	ArrayList name = new Class03().getName();
	public Test11() {
		Hashtable table = new Hashtable();
		for(int i = 0 ; i < name.size(); i++ ) {
			table.put(name.get(i), (int)(Math.random()*51+50));
		}
		
		Enumeration en = table.keys();
		
		// 키값 저장할 리스트
		ArrayList list = new ArrayList();
		while(en.hasMoreElements()) {
			list.add((String)en.nextElement());
		}
		
		for(int i = 0 ; i < list.size() ; i++ ) {
			System.out.println((String)list.get(i) + " - " + table.get((String)list.get(i)));
		}
		
	}

	public static void main(String[] args) {
		new Test11();
	}

}
