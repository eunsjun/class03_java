package day18;

import java.util.*;
public class Test06 {

	public Test06() {
		ArrayList list = new ArrayList();
		list.add("솔라");
		list.add("화사");
		list.add("휘인");
		list.add("문별");
		
		System.out.println("list not sort : " + list);
		
		// 오름 차순 정렬
		Collections.sort(list);
		System.out.println("오름차순 정렬 : " + list);
		
		// 내림 차순 정렬
		Collections.sort(list, new MySort06());
		System.out.println("내림차순 정렬 : " + list);
	}

	public static void main(String[] args) {
		new Test06();
	}

}

class MySort06 implements Comparator {
/*
		"abc" < "abcd"
		"abc" < "abd"
 */
	@Override
	public int compare(Object o1, Object o2) {
		/*
				이 함수는 JVM이 정렬을 시도하는 순간 자동 호출되는 함수
				정렬하는 순간 비교대상 o1, o2을 자동입력하면서 자동 호출된다.
				해야할일은 
				데이터를 바꿀지 말지를 결정하면 된다.
					바꾸는 규칙은
						양수를 반환하면 안바꾸고
						음수를 반환하면 바꾼다.
						0을 반환하면 같은 데이이터라는 말이다.
						
				따라서
				문자열 정렬은 문자열 두개를 비교해서 바꿀지 말지를 결정해 주면 된다.
				그 비교는 0부터 시작한 위치의 문자의 코드값을 빼주면 될 것이다.
		 */
		String str1 = (String) o1;
		String str2 = (String) o2;
		return -str1.compareTo(str2);
		/*
				compareTo()
					두 문자열의 대소관계를 비교해주는 함수
					반환값은 정수
					양수가 나오면 앞 문자열이 크다는 의미
					음수가 나오면 뒤 문자열이 크다는 의미이다.
					0 은 같다는 의미...
		 */
	}
	
}
