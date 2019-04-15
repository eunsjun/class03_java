package day20;

import java.util.*;
import etc.*;
public class Test01 {
/*
	�츮�� �л����� �ڹ������� 
	HashMap�� �����ϼ���.
	�׸���
	������ ���� �л����� ����ϼ���...
 */
	public Test01() {
		ArrayList name = new ArrayList(new Class03().getName());
		HashMap map = new HashMap();
		
		// ������ �Է�
		for(int i = 0; i < name.size() ; i++ ) {
			map.put(name.get(i), (int)(Math.random()*51 + 50));
		}
		
		// Ű���� �����͸� ���ÿ� ����ϱ� ���ؼ�
		// Set���� ���� �������.
		Set set = map.entrySet();
		// Set�� List�� ���� ����ȯ�� �����ϴ�.
		// �׸��� ������ �Լ��� �Ű������� �Էµ� �ȴ�.
		ArrayList list = new ArrayList(set);
		Collections.sort(list, new MySort01());
		
		// ���...
		// 1.
		/*
		for(int i = 0 ; i < list.size(); i++ ) {
			System.out.println(((Map.Entry)list.get(i)).getKey() + " - " + ((Map.Entry)list.get(i)).getValue());
		}
		*/
		
		// 2.
		// list�� Iterator�� ��ȯ�Ѵ�.
		Iterator itor = list.iterator();
		
		// ���������� ������ ����Ѵ�.
		while(itor.hasNext()) {
			Map.Entry et = (Map.Entry) itor.next();
			System.out.println(et.getKey() + " | " + et.getValue());
		}
	}

	public static void main(String[] args) {
		new Test01();
	}

}

class MySort01 implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
		// ArrayList �� ����ִ� �����ʹ�
		//  Map.Entry �̱� ������
		// ���⼭ ���� �����ʹ� 
		// Map.Entry �� �� ���̴�.
		Map.Entry tmp1 = (Map.Entry) o1;		
		Map.Entry tmp2 = (Map.Entry) o2;		
		return -((int)tmp1.getValue() - (int)tmp2.getValue());
	}
}
