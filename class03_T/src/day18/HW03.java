package day18;

import java.util.*;

public class HW03 {
/*
	Test04 에서 만든 ArrayList 를 
	오름차순 정렬
	내림차순 정렬
	해서 각각 출력하세요.
 */
	public HW03() {
		ArrayList list = new ArrayList();
		
		for(int i = 0 ; i < 5 ; i++ ) {
			ArrayList circle = new ArrayList();
			int rad = (int) (Math.random()*11 + 5);
			float arround = (int)(2 * rad * 3.14f * 100 + 0.5f) / 100f ;
			float area = (int)(rad * rad * 3.14f * 100 + 0.5f) / 100f ;
			
			circle.add(rad);
			circle.add(arround);
			circle.add(area);
			
			list.add(circle);
		}
		
		for(Object o : list) {
			ArrayList c = (ArrayList) o;
			ArrayList ttl = new ArrayList();
			ttl.add("반지름 : ");
			ttl.add("둘  레  : ");
			ttl.add("넓  이  : ");
			for(int i = 0 ; i < c.size(); i++ ) {
				Object obj = c.get(i);
				
				if(obj instanceof Integer) {
					System.out.println((String)ttl.get(i) + (int) obj);
				} else if(obj instanceof Float) {
					System.out.println((String)ttl.get(i) + (float)obj);					
				}
			}
			System.out.println("---------------");
		}
		ArrayList ttl = new ArrayList();
		ttl.add("반지름 : ");
		ttl.add("둘   레 : ");
		ttl.add("넓   이 : ");
		
		Collections.sort(list, new HW03Sort());
		
		System.out.println("**********************************");
		System.out.println("************ Iterator ************");
		System.out.println("**********************************");
		Iterator it = list.iterator();
		while(it.hasNext()) {
			ArrayList tmp = (ArrayList) it.next();
			
			Iterator itor = tmp.iterator();
			int i = 0 ;
			while(itor.hasNext()) {
				Object o = itor.next();
				if(o instanceof Integer) {
					System.out.println((String)ttl.get(i) + (int) o);
				} else if(o instanceof Float) {
					System.out.println((String)ttl.get(i) + (float)o);
				}
				i++;
			}
			System.out.println("###############");
		}
		System.out.println();
		Collections.sort(list, new HW03Sort01());
		
		System.out.println("**********************************");
		System.out.println("************ Iterator2 ***********");
		System.out.println("**********************************");
		Iterator it1 = list.iterator();
		while(it1.hasNext()) {
			ArrayList tmp = (ArrayList) it1.next();
			
			Iterator itor = tmp.iterator();
			int i = 0 ;
			while(itor.hasNext()) {
				Object o = itor.next();
				if(o instanceof Integer) {
					System.out.println((String)ttl.get(i) + (int) o);
				} else if(o instanceof Float) {
					System.out.println((String)ttl.get(i) + (float)o);
				}
				i++;
			}
			System.out.println("###############");
		}
	}

	public static void main(String[] args) {
		new HW03();
	}

}

class HW03Sort implements Comparator {
	
	@Override
	public int compare(Object o1, Object o2){	
		ArrayList l1 = (ArrayList) o1;
		ArrayList l2 = (ArrayList) o2;
		return ((int)l1.get(0) - (int)l2.get(0));
	}
	
}

class HW03Sort01 implements Comparator {
	
	@Override
	public int compare(Object o1, Object o2){	
		ArrayList l1 = (ArrayList) o1;
		ArrayList l2 = (ArrayList) o2;
		return -((int)l1.get(0) - (int)l2.get(0));
	}
	
}
