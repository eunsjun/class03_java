package day20;

import java.util.*;
import etc.*;
public class Test03 {
/*
	TreeMap
		특징 : TreeMap 의 키값은 반드시 정렬기준이 있는 것만 들어갈 수 있다.
			   TreeMap은 키값을 가지고 정렬을 하는데
			   정렬기준이 있는 것만 사용할 수 있다.
			   
			   value 는 정렬기준이 없어도 입력할 수 있다.
 */
	public Test03() {
		TreeMap map1 = new TreeMap();
		ArrayList name = new Class03().getName();
		/*
		map1.put(new Samgak(), name.get(0));
		map1.put(new Samgak(), name.get(1));
		*/
		
		for(int i = 0 ; i < name.size(); i++ ) {
			map1.put(name.get(i), new Samgak());
		}
		
		/*
				String 클래스의 대소 비교
					String str1 = "abcd";
					String str2 = "abc";
					
					boolean bool = str1 > str2 ;
					==> X
					int no = str1.compareTo(str2);
		 */
		
		Set set = map1.entrySet();
		
		// 정렬
		ArrayList list = new ArrayList(set);
		Collections.sort(list, new Comparator() {
			@Override
			public int compare(Object o1, Object o2) {
				Map.Entry e1 = (Map.Entry) o1;
				Map.Entry e2 = (Map.Entry) o2;
				
				// 삼각형의 넓이가 큰 것부터 출력되게 정렬하자.
				int num1 = (int)((Samgak) e1.getValue()).getWidth() * (int)((Samgak) e1.getValue()).getHeight();
				int num2 = (int)((Samgak) e2.getValue()).getWidth() * (int)((Samgak) e2.getValue()).getHeight();
				return -(num1 - num2);
			}
		});
		
		// 출력
		for(int i = 0 ; i < list.size(); i++ ) {
			String irum = (String)((Map.Entry)list.get(i)).getKey();
			int width = ((Samgak)((Map.Entry)list.get(i)).getValue()).getWidth();
			int height = ((Samgak)((Map.Entry)list.get(i)).getValue()).getHeight();
			float area = ((Samgak)((Map.Entry)list.get(i)).getValue()).getArea();
			
			System.out.printf("%4s - w : %2d, h : %2d, area : %5.2f\n", irum, width, height, area);
		}
	}

	public static void main(String[] args) {
		new Test03();
	}

}
