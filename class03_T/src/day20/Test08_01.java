package day20;

import java.util.*;
public class Test08_01 {

	public Test08_01() {
		HashMap<String, Object> map = new HashMap<String, Object>();
		map.put("�̸�", "������");
		map.put("����", 24);
		map.put("��ȭ", "010-1111-2222");
		Set<String> set = map.keySet();
		ArrayList<String> list = new ArrayList<String>(set);
		for(int i = 0 ; i < list.size(); i++ ) {
			String str = (i + 1) + " ��° Ű�� - " + list.get(i);
			System.out.println(str);
		}
	}

	public static void main(String[] args) {
		new Test08_01();
	}

}
