package day19;

import java.util.*;
import etc.*;
public class Test12 {
// HashMap ���� ó��
	public Test12() {
		// �̸� ��������
		ArrayList name = new Class03().getName();
		HashMap map = new HashMap();
		for(int i = 0 ; i < name.size(); i++ ) {
			map.put(name.get(i), (int)(Math.random()*51+50));
		}
		
		Set set = map.keySet();
//		ArrayList list = new ArrayList(set);
		// set �� Iterator�� ��ȯ�ϰ�
		Iterator it = set.iterator();
		
		// ������ �̾Ƽ� ���
		while(it.hasNext()) {
			String key = (String)it.next();
			System.out.println( key + " / " + map.get(key));
		}
	}

	public static void main(String[] args) {
		new Test12();
	}

}
