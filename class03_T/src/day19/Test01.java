package day19;

import java.util.*;
import etc.*;
import static java.lang.Math.*;
public class Test01 {
	ArrayList ban ;	// 반 전체 데이터 리스트
	Score stud;		// 학생한명데이터 클래스(VO)
	ArrayList list;	// 이름 저장 리스트
	public Test01() {
		list = new Class03().getName();
		ban = new ArrayList();
		for(int i = 0 ; i < list.size() ; i++) {
			// 학생 객체 생성
			stud = new Score();
			// 학생 이름 입력 <== 이름은 list에서 하나씩 뽑아서 입력한다.
			stud.setName((String)list.get(i));
			
			// 과목 점수 입력
			stud.setJava((int)(random()*51 + 50));
			stud.setOracle((int)(random()*51 + 50));
			stud.setJsp((int)(random()*51 + 50));
			stud.setSpring((int)(random()*51 + 50));
			stud.setWeb((int)(random()*51 + 50));
			stud.setJs((int)(random()*51 + 50));
			stud.setCalc();
			
			// 반에 학생 입력
			ban.add(stud);
		}
		
		Collections.sort(ban);
		
		for(Object o : ban) {
			System.out.println((Score) o);
			System.out.println("==================");
		}
		System.out.println("#############################");
		System.out.println("#### 총점 내림 차순 정렬 ####");
		System.out.println("#############################");
		// 정렬을 총점 순으로 바꾸고 싶다.
		// 정렬 기준을 바꿔주면 될 것이다. ==> Comparator 인터페이스를 구현한 정렬기준을 만들면 된다.
		Collections.sort(ban, new SortTotal());
		for(Object o : ban) {
			System.out.println((Score) o);
			System.out.println("==================");
		}
		
		
	}

	public static void main(String[] args) {
		new Test01();
	}

}

class SortTotal implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
		Score s1 = (Score) o1;
		Score s2 = (Score) o2;
		int total1 = s1.getTotal();
		int total2 = s2.getTotal();
		return -(total1 - total2);
	}
	
}
