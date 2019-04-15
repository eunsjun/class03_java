package day20;

import java.util.*;
import etc.*;
public class Test02 {
/*
 * 	우리반 학생들의 
 * 		java, oracle, jsp, spring, web, js, total
 * 	을 입력하고
 * 	출력은 총점이 높은 사람부터 출력해보자.
 */
	public Test02() {
		// 맵을 만든다.
		HashMap map = new HashMap();
		
		// 과목 키값을 저장할 ArrayList를 만든다.
		// 생성자 함수에 컬렉션 타입 데이터 넣는 방법
		ArrayList sub = new ArrayList(new Class03().getSub());
		
		// 학생 이름 저장할 ArrayList를 만든다.
		// Class03의 함수 반환값을 받는 방법
		ArrayList name = new Class03().getName();
		
		for(int i = 0 ; i < name.size(); i++ ) {
			// 각 과목을 저장할 HashMap을 만든다.
			HashMap smap = new HashMap();
			// smap 에 과목을 저장하자.
			int total = 0;
			for(int j = 0 ; j < sub.size() - 1 ; j++ ) {
				smap.put(sub.get(j), (int)(Math.random()*51+50));
				total += (int)smap.get(sub.get(j));
			}
			smap.put(sub.get(sub.size() - 1), total);
			map.put(name.get(i), smap);
		}
		
		// 출력
		/*
				HashMap 은 자체기준으로 데이터를 정렬해서 저장하므로
				우리가 원하는 정렬기준으로 출력을 하려면
					1. ArrayList로 변환을 해줘야 한다.( Map -> Set -> ArrayList)
		 */
		
		Set set = map.entrySet();
		ArrayList slist = new ArrayList(set);
		/*
				slist에는 Map.Entry 타입 데이터가 들어있고
				그 데이터에는 
					key 변수에는 이름이
					value 변수에는 과목점수를 입력한 HashMap이 들어있다.
				따라서 정렬을 하려면
					value 변수에 있는 맵의 total 값에 들어있는 데이터를 비교해야 할 것이다.
				
		 */
		
		// 정렬
		Collections.sort(slist, new SubSort());
		
		// 출력
		//  정렬된 slist 를 출력한다.
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
		
		// 총점을 꺼내보자.
		// Map.Entry의 key와 value의 타입은 Object 이므로
		// 사용할려면 정확안 데이터타입으로 강제 형변환을 해줘야 한다.
		int num1 = (int)((HashMap)ent1.getValue()).get("total");
		int num2 = (int)((HashMap)ent2.getValue()).get("total");
		
//		comp = -(num1 - num2);
		comp = num2 - num1;
		
		return comp;
	}
}