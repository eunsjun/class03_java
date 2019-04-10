package day17;

import java.util.*;
public class Test11 {
/*
	우리반 학생들의 과목 점수 데이터를 Vector 를 사용해서 
	저장하고 출력하세요.
 */
	String[] tmp = {"강찬규", "강태훈", "김상우", "김태헌", "김태형",
			"김형준", "김환진", "박정헌", "박형진", "서병주",
			"안다예", "양희준", "전영수", "조원용", "허준석" };
	public Test11() {
		Vector v = new Vector(15, 5);
		for(int i = 0 ; i < tmp.length ; i++ ) {
			// 다른 방법
//			v.add(i, new Vector().add(tmp[i]));
			
			// 한사람 정보를 저장할 벡터 하나를 만든다.
			Vector irum = new Vector(9);
			// 한사람 벡터에 데이터 저장하고
			irum.add(tmp[i]);
			
			// 한사람 벡터를 전체 벡터에 넣고
			v.add(irum);
			
		}
		
		for(int i = 0 ; i < tmp.length ; i++ ) {
			Vector van = (Vector)v.get(i);
			String name = (String)van.get(0);
			System.out.println(name);
			/*
			 * System.out.println(((Vector)(v.get(i))).get(0));
			 */		}
	}

	public static void main(String[] args) {
		new Test11();
	}

}
