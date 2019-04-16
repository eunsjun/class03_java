package day21;

import java.util.*;
import etc.*;
public class Test01 {
/*
	TreeMap ����
		==> TreeMap �� Ű���� ������ ������ �Ѵ�.
			������ ���� compare() �Ǵ� compareTo()
			�ڵ� ȣ���� �Ǽ� �� �Լ��� ��ȯ������ �����ϴµ�
				��ȯ���� ���̳ʽ��� ������ �ڸ��� �ٲ��� �ʰ�
				�÷����� ������ ���� �ڸ��� ��ü�ϴ� ������� 
			������ �Ѵ�.
			�׷��� TreeMap�� Ű���� ������ ������ �ϱ� ������
			compare()�� compareTo()�� �Ű����� Object �� Ű���� �Է��̵Ǽ�
			������ �Ѵ�.
			
 */
	Class03 c3 = new Class03();
	ArrayList<String> name = c3.getName();
	ArrayList<String> sub = c3.getSub();
	
	@SuppressWarnings({"unchecked", "unused", "rawtypes"})
	public Test01() {
		
		// �������� ������ ArrayList
		HashMap<String, HashMap<String, Integer>> subList = new HashMap<String, HashMap<String, Integer>>();
		// ArrayList�� HashMap ����
		for(int i = 0 ; i < name.size(); i++ ) {
			// �л����� ������ ����Ǿ� �ִ� ���� �ʿ��ϹǷ�
			// �ݺ��� ������ ���ο� HashMap�� ��������� �Ѵ�.
			HashMap<String, Integer> score =  new HashMap<String, Integer>();
			// total �ʱ�ȭ
			score.put(sub.get(sub.size() - 1), 0);
			for(int j = 0 ; j < sub.size() - 1 ; j++ ) {
				score.put(sub.get(j), getNum());
				score.put(sub.get(sub.size() - 1), score.get(sub.get(sub.size() -1)) + score.get(sub.get(j)));
			}
			
			subList.put(name.get(i), score);
		}
		
		TreeMap map = new TreeMap(new Comparator() {
			@Override
			public int compare(Object o1, Object o2) {
				String key1 = (String) o1;
				String key2 = (String) o2;
				
				HashMap<String, Integer> m1 = subList.get(key1);
				HashMap<String, Integer> m2 = subList.get(key2);
				
				int t1 = m1.get("total");
				int t2 = m2.get("total");
				
				return -(t1 - t2);
			}
		});
		
		// TreeMap�� ������ �Է�
		map.putAll(subList);
		
		// print
		Set set = map.entrySet();
		Iterator it = set.iterator();
		while(it.hasNext()) {
			Map.Entry en = (Map.Entry) it.next();
			String key = (String) en.getKey();
			HashMap<String, Integer> m = (HashMap<String, Integer>) en.getValue();
			toPrint(m, key);
		}
		
	}
	
	public void toPrint(HashMap<String, Integer> m, String n) {
		System.out.println("------------------------");
		System.out.printf("\t  name : %4s\n" , n);
		for(int i = 0 ; i < sub.size(); i++ ) {
			System.out.printf("\t%6s : %3d\n", sub.get(i), m.get(sub.get(i)));
		}
	}
	
	public int getNum() {
		return (int)(Math.random()*51+50);
	}

	public static void main(String[] args) {
		new Test01();
	}

}
