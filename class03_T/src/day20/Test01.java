package day20;

import java.util.*;
import etc.*;
public class Test01 {
/*
	우리반 학생들의 자바점수를 
	HashMap에 저장하세요.
	그리고
	점수가 높은 학생부터 출력하세요...
 */
	public Test01() {
		ArrayList name = new ArrayList(new Class03().getName());
		HashMap map = new HashMap();
		
		// 데이터 입력
		for(int i = 0; i < name.size() ; i++ ) {
			map.put(name.get(i), (int)(Math.random()*51 + 50));
		}
		
		// 키값과 데이터를 동시에 출력하기 위해서
		// Set으로 만들어서 출력하자.
		Set set = map.entrySet();
		// Set과 List는 서로 형변환이 가능하다.
		// 그리고 생성자 함수에 매개변수로 입력도 된다.
		ArrayList list = new ArrayList(set);
		Collections.sort(list, new MySort01());
		
		// 출력...
		// 1.
		/*
		for(int i = 0 ; i < list.size(); i++ ) {
			System.out.println(((Map.Entry)list.get(i)).getKey() + " - " + ((Map.Entry)list.get(i)).getValue());
		}
		*/
		
		// 2.
		// list를 Iterator로 변환한다.
		Iterator itor = list.iterator();
		
		// 순차적으로 꺼내서 출력한다.
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
		// ArrayList 에 들어있는 데이터는
		//  Map.Entry 이기 때문에
		// 여기서 비교할 데이터는 
		// Map.Entry 가 될 것이다.
		Map.Entry tmp1 = (Map.Entry) o1;		
		Map.Entry tmp2 = (Map.Entry) o2;		
		return -((int)tmp1.getValue() - (int)tmp2.getValue());
	}
}
