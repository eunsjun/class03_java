package day21;

import java.util.*;
import etc.*;
public class Test01 {
/*
	TreeMap 정렬
		==> TreeMap 은 키값을 가지고 정렬을 한다.
			정렬할 때는 compare() 또는 compareTo()
			자동 호출이 되서 그 함수의 반환값으로 정렬하는데
				반환값이 마이너스가 나오면 자리를 바꾸지 않고
				플러스가 나오면 서로 자리를 교체하는 방식으로 
			정렬을 한다.
			그런데 TreeMap은 키값을 가지고 정렬을 하기 때문에
			compare()나 compareTo()의 매개변수 Object 에 키값이 입력이되서
			정렬을 한다.
			
 */
	Class03 c3 = new Class03();
	ArrayList<String> name = c3.getName();
	ArrayList<String> sub = c3.getSub();
	
	@SuppressWarnings({"unchecked", "unused", "rawtypes"})
	public Test01() {
		
		// 과목점수 저장할 ArrayList
		HashMap<String, HashMap<String, Integer>> subList = new HashMap<String, HashMap<String, Integer>>();
		// ArrayList에 HashMap 저장
		for(int i = 0 ; i < name.size(); i++ ) {
			// 학생마다 점수가 저장되어 있는 맵이 필요하므로
			// 반복할 때마다 새로운 HashMap이 만들어져야 한다.
			HashMap<String, Integer> score =  new HashMap<String, Integer>();
			// total 초기화
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
		
		// TreeMap에 데이터 입력
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
