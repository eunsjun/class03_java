package day19;

import java.util.*;
import etc.*;
public class Test13 {
// TreeMap 사용하기
	public Test13() {
		ArrayList name = new Class03().getName();
		TreeMap map = new TreeMap();
		for(int i = 0 ; i < name.size(); i++ ) {
			map.put((String)name.get(i), (int)(Math.random()*51+50));
		}
		
		Set set = map.entrySet();
		
		Iterator it = set.iterator();
		while(it.hasNext()) {
			Map.Entry tmp = (Map.Entry) it.next();
			
			String key = (String) tmp.getKey();
			int val = (int) tmp.getValue();
			
			System.out.println(key + " : " + val);
		}
	}

	public static void main(String[] args) {
		new Test13();
	}

}
