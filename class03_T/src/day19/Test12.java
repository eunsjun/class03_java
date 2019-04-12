package day19;

import java.util.*;
import etc.*;
public class Test12 {
// HashMap 으로 처리
	public Test12() {
		// 이름 가져오기
		ArrayList name = new Class03().getName();
		HashMap map = new HashMap();
		for(int i = 0 ; i < name.size(); i++ ) {
			map.put(name.get(i), (int)(Math.random()*51+50));
		}
		
		Set set = map.keySet();
//		ArrayList list = new ArrayList(set);
		// set 을 Iterator로 변환하고
		Iterator it = set.iterator();
		
		// 데이터 뽑아서 출력
		while(it.hasNext()) {
			String key = (String)it.next();
			System.out.println( key + " / " + map.get(key));
		}
	}

	public static void main(String[] args) {
		new Test12();
	}

}
