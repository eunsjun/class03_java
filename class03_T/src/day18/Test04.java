package day18;

import java.util.*;
public class Test04 {
/*
	문제]
		ArrayList 에 
			랜덤하게 반지름(정수)을 5개 입력해서
			원의 둘레와 넓이(실수)를 같이 저장하세요.
			그리고 데이터를 꺼내서 출력하세요.
 */
	public Test04() {
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
		
		Iterator itor = list.iterator();
	}

	public static void main(String[] args) {
		new Test04();
	}

}
