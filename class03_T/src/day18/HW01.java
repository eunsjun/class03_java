package day18;

/*
	우리반 학생들의 과목 점수 데이터를 Vector 를 사용해서 
	저장하고 출력하세요.
	단, 학생 데이터는 VO 클래스를 사용해서 처리하세요.
 */

import java.util.*;
import static java.lang.Math.*;
public class HW01 {
	String[] name = {"강찬규", "강태훈", "김상우", "김태헌", "김태형",
					"김형준", "김환진", "박정헌", "박형진", "서병주",
					"안다예", "양희준", "전영수", "조원용", "허준석" };
	Vector<Score> van;
	public HW01() {
		van = new Vector<Score>();
		Score score ;
		for(int i = 0 ; i < name.length ; i++ ) {
			score = new Score();
			score.setName(name[i]);
			score.setJava((int)(random()*51 + 50));
			score.setOracle((int)(random()*51 + 50));
			score.setJsp((int)(random()*51 + 50));
			score.setSpring((int)(random()*51 + 50));
			score.setWeb((int)(random()*51 + 50));
			score.setJs((int)(random()*51 + 50));
			score.setCalc();
			van.add(score);
		}
		
		for(Score s : van) {
			s.toPrint();
			System.out.println(s.getName() + " - java 점수 : " + s.getJava());
		}
	}

	public static void main(String[] args) {
		new HW01();
	}

}
