package day20;

import java.util.*;
import etc.*;
public class Test02 {
/*
 * 	�츮�� �л����� 
 * 		java, oracle, jsp, spring, web, js, total
 * 	�� �Է��ϰ�
 * 	����� ������ ���� ������� ����غ���.
 */
	public Test02() {
		// ���� �����.
		HashMap map = new HashMap();
		
		// ���� Ű���� ������ ArrayList�� �����.
		// ������ �Լ��� �÷��� Ÿ�� ������ �ִ� ���
		ArrayList sub = new ArrayList(new Class03().getSub());
		
		// �л� �̸� ������ ArrayList�� �����.
		// Class03�� �Լ� ��ȯ���� �޴� ���
		ArrayList name = new Class03().getName();
		
		for(int i = 0 ; i < name.size(); i++ ) {
			// �� ������ ������ HashMap�� �����.
			HashMap smap = new HashMap();
			// smap �� ������ ��������.
			int total = 0;
			for(int j = 0 ; j < sub.size() - 1 ; j++ ) {
				smap.put(sub.get(j), (int)(Math.random()*51+50));
				total += (int)smap.get(sub.get(j));
			}
			smap.put(sub.get(sub.size() - 1), total);
			map.put(name.get(i), smap);
		}
		
		// ���
		/*
				HashMap �� ��ü�������� �����͸� �����ؼ� �����ϹǷ�
				�츮�� ���ϴ� ���ı������� ����� �Ϸ���
					1. ArrayList�� ��ȯ�� ����� �Ѵ�.( Map -> Set -> ArrayList)
		 */
		
		Set set = map.entrySet();
		ArrayList slist = new ArrayList(set);
		/*
				slist���� Map.Entry Ÿ�� �����Ͱ� ����ְ�
				�� �����Ϳ��� 
					key �������� �̸���
					value �������� ���������� �Է��� HashMap�� ����ִ�.
				���� ������ �Ϸ���
					value ������ �ִ� ���� total ���� ����ִ� �����͸� ���ؾ� �� ���̴�.
				
		 */
		
		// ����
		Collections.sort(slist, new SubSort());
		
		// ���
		//  ���ĵ� slist �� ����Ѵ�.
		System.out.println("---------------");
		for(int i = 0 ; i < slist.size(); i++ ) {
			Map.Entry ent = (Map.Entry)slist.get(i);
			HashMap cmap = (HashMap)ent.getValue();
			String stud = (String) ent.getKey();
			int java = (int)cmap.get(sub.get(0));
			int oracle = (int)cmap.get(sub.get(1));
			int jsp = (int)cmap.get(sub.get(2));
			int spring = (int)cmap.get(sub.get(3));
			int web = (int)cmap.get(sub.get(4));
			int js = (int)cmap.get(sub.get(5));
			int total = (int)cmap.get(sub.get(6));
			
			System.out.printf("%2d. %5s\n%7s - %3d\n%7s - %3d\n%7s - %3d\n%7s - %3d\n%7s - %3d\n%7s - %3d\n%7s - %3d\r\n%15s\n", 
					(i+1), stud,"java", java,"oracle", oracle, "jsp", jsp, "spring", spring, "web", web, "js", js, "total", total, "---------------");
		}
		
	}

	public static void main(String[] args) {
		new Test02();
	}
}

class SubSort implements Comparator {
	@Override
	public int compare(Object o1, Object o2) {
		int comp = 0;
		Map.Entry ent1 = (Map.Entry) o1;
		Map.Entry ent2 = (Map.Entry) o2;
		
		// ������ ��������.
		// Map.Entry�� key�� value�� Ÿ���� Object �̹Ƿ�
		// ����ҷ��� ��Ȯ�� ������Ÿ������ ���� ����ȯ�� ����� �Ѵ�.
		int num1 = (int)((HashMap)ent1.getValue()).get("total");
		int num2 = (int)((HashMap)ent2.getValue()).get("total");
		
//		comp = -(num1 - num2);
		comp = num2 - num1;
		
		return comp;
	}
}