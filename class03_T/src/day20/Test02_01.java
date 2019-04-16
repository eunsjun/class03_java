package day20;

import java.util.*;
import etc.*;
public class Test02_01 {

	public Test02_01() {
		Class03 c3 = new Class03();
		ArrayList name = c3.getName();
		ArrayList sub = c3.getSub();
		HashMap map = new HashMap();
		for(int i = 0 ; i < name.size(); i++ ) {
			HashMap sMap = new HashMap();
			sMap.put(sub.get(sub.size() -1), 0);
			for(int j = 0 ; j < sub.size() - 1 ; j++ ) {
				sMap.put(sub.get(j), getNum());
				sMap.put(sub.get(sub.size() -1), 
							(int)sMap.get(sub.get(sub.size() -1)) + (int)sMap.get(sub.get(j)));
			}
			
			map.put(name.get(i), sMap);
		}
		
		// print
		for(Object o : map.entrySet()) {
			Map.Entry et = (Map.Entry) o;
			System.out.println("이름 : " + et.getKey());
			int i = 0 ;
			for(Object o1 : ((HashMap)(et.getValue())).entrySet()) {
				Map.Entry ent = (Map.Entry) o1;
				System.out.println(ent.getKey() + " : " + ent.getValue());
			}
		}
		
//		TreeMap tMap = new TreeMap();
		
		// 정렬 print
		
		@SuppressWarnings({ "unchecked", "rawtypes" })
		TreeMap tMap = new TreeMap(new Comparator() {
							// TreeMap은 정렬기준이 키값을 가지고 정렬한다.
			
							@Override
							public int compare(Object o1, Object o2) {
								HashMap m1 = (HashMap) map.get(o1);
								HashMap m2 = (HashMap) map.get(o2);
				
								return -((int)m1.get("total") - (int)m2.get("total"));
							}
						});
		
		tMap.putAll(map);
		
		for(Object o : tMap.entrySet()) {
			Map.Entry e = (Map.Entry) o;
			
			System.out.printf("%5s - %2d\n", e.getKey(), ((HashMap)e.getValue()).get("total"));
		}
	}
	
	public int getNum() {
		return (int)(Math.random()*51+50);
	}

	public static void main(String[] args) {
		new Test02_01();
	}

}
