package day20;

import java.util.*;
public class Test08_01 {

	public Test08_01() {
		HashMap<String, Object> map = new HashMap<String, Object>();
		map.put("이름", "전영수");
		map.put("나이", 24);
		map.put("전화", "010-1111-2222");
		Set<String> set = map.keySet();
		ArrayList<String> list = new ArrayList<String>(set);
		for(int i = 0 ; i < list.size(); i++ ) {
			String str = (i + 1) + " 번째 키값 - " + list.get(i);
			System.out.println(str);
		}
	}

	public static void main(String[] args) {
		new Test08_01();
	}

}
