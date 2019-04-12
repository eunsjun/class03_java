package day19;

import java.util.*;
import java.text.*;
public class Test09 {
/*
	Map
		==> List, Set 과는 조상이 다른 컬렉션
			List, Set 과 형변환이 안된다.
			
			하나의 데이터를 그 데이터를 구분할 수 있는 키값과 쌍으로 만들어서
			데이터를 기억하는 컬렉션의 일종
			
			사용할 경우에는 키값을 이용해서 데이터를 꺼내고 입력하고를 해야 한다.
			
			Map 계열 컬렉션은
				많은 양의 데이터를 보관 하는 용도보다는
				데이터를 손쉽게 구분하여 사용할 목적으로 사용된다.
				
				
		종류]
			1. HashMap/Hashtable
				Hashtable이 이전버젼에서 나온 클래스이고
				HashMap이 신버젼 이므로
				사용은 HashMap 사용을 권장한다.
				
				내부적으로 키값을 해쉬 테이블을 이용해서 정렬해서 보관한다.
				
				주요함수]
					put(Object key, Object value)
						==> 데이터를 입력하는 함수
					get(Object key)
						==> 데이터를 추출하는 함수
						
				참고함수]
					values() 	==> 반환값은 컬렉션
						==> 데이터(value)만 꺼내주는 함수
					keys()		==> HashTable 소속 반환값은 Enumeration
						==> 키값(key)만 꺼내주는 함수
						
						반환값이 Enumeration 이므로
						Iterator처럼 사용하면 된다.
						Enumeration : Iterator의 구버젼
										데이터를 순차적으로 꺼내는 기능의 클래스
						
					keySet()	==> HashMap 소속함수 반환값은 Set ==> Iterator
					
				참고]
					entrySet()
						==> Map 은 반드시 키값을 알아야 데이터를 추출할 수 있다.
							키값과 데이터를 Set 으로 묶어주는 함수
							
					문제 ==>
							Map은 키값과 데이터가 한쌍이 되어야 저장이 되는데
							Set은 오직 하나만 저장한다.
							따라서
								반드시 키값과 데이터를 하나로 묶어서 Set에 저장을 한다.
								
							==> 이런 불편함을 해결하기 위해서 VO 클래스를 사용한다.
							그 클래스가 
									Map.Entry
								==> 이 클래스 안에는 Key와 value 변수를 은닉화해 놓았고
									데이터에 접근은 함수로 처리를 하고 있다.
									한마디로
										두개의 변수를 하나로 묶어 놓은 클래스 이다.
										
										
			2. TreeMap
				==> TreeSet과 마찬가지로
					내부에서 정렬하면서 데이터를 기억하는 Map이다.
					이때 정렬기준은 키값을 기준으로 정렬하게 된다.
					따라서
							키값이 정렬되지 않는 클래스를 사용할 수 없고
							필요하다면 정렬 방식을 정해서 사용해야 한다.
							
							
							
		참고]
			컬렉션 내부에는 다시 컬렉션을 입력할 수 있다.
			왜??
				데이터 입력 함수의 매개변수가 Object 이기 때문에
				데이터를 입력하는 순간 Object 타입으로 자동 형변환이 된다.
				컬렉션도 클래스이기 때문에 
				최상위 클래스는 Object 이고
				데이터 입력함수를 실행하는 순간
				Object로 자동 형변환이 된다.
				==> 꺼낼때 정확한 데이터 타입으로 강제 형변환을 해줘야 하는 이유다.
		
 */
	
	// Hashtable 을 만들고 데이터를 저장해보자.
	public Test09() {
		// Hashtable 생성
		Hashtable table = new Hashtable();
		// 데이터 입력
		table.put("이름", "전영수");
		table.put("전화", "010-1234-5678");
		table.put("나이", 24);
		table.put("신장", 184.5f);
		table.put("생일", new Date("1996/09/29"));
		
		int len = table.size();
		System.out.println("Hashtable size : " + len);
		
		String name = (String) table.get("이름");
		String tel = (String) table.get("전화");
		int age = (int) table.get("나이");
		float tall = (float) table.get("신장");
		Date birth = (Date) table.get("생일");
		
		SimpleDateFormat form = new SimpleDateFormat("yyyy년 MM월 dd일");
		String sbirth = form.format(birth);
		
		System.out.println("Name  : " + name);
		System.out.println("Tel   : " + tel);
		System.out.println("Age   : " + age);
		System.out.println("Tall  : " + tall);
		System.out.println("Birth : " + sbirth);
		
		System.out.println("==================");
		
		Collection col = table.values();
		
		Iterator it = col.iterator();
		while(it.hasNext()) {
			Object o = it.next();
			if(o instanceof String) {
				System.out.println((String)o);
			} else if(o instanceof Integer) {
				System.out.println("나이 : " + (int) o);
			} else if(o instanceof Float) {
				System.out.println("신장 : " + (float) o);
			} else if(o instanceof Date) {
				String sb = form.format((Date) o);
				System.out.println("생일 : " + sb);
			}
		}
/*
		System.out.println(col);
		
		HashSet set = new HashSet(col);
		System.out.println(set);
		
		ArrayList list = new ArrayList(col);
		System.out.println(list);
*/	
	}

	public static void main(String[] args) {
		new Test09();
	}

}
