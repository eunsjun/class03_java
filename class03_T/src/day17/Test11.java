package day17;

import java.util.*;
import java.text.*;
public class Test11 {
/*
	우리반 학생들의 과목 점수 데이터를 Vector 를 사용해서 
	저장하고 출력하세요.
 */
	String[] tmp = {"강찬규", "강태훈", "김상우", "김태헌", "김태형",
			"김형준", "김환진", "박정헌", "박형진", "서병주",
			"안다예", "양희준", "전영수", "조원용", "허준석" };
	Vector<Vector<Object>> v;
	public Test11() {
		v = new Vector<Vector<Object>>(15, 5);
		for(int i = 0 ; i < tmp.length ; i++ ) {
			// 다른 방법
//			v.add(i, new Vector().add(tmp[i]));
			
			// 한사람 정보를 저장할 벡터 하나를 만든다.
			Vector<Object> irum = new Vector(9);
			// 한사람 벡터에 데이터 저장하고
			irum.add(tmp[i]);
			for(int j = 0 ; j < 6 ; j++) {
				int score = (int)(Math.random()*51 + 50 );
				/*
				 * DecimalFormat pattern = new DecimalFormat("###"); String val =
				 * pattern.format(score);
				 */
				
				irum.add(j+1, score);
//				irum.add(j+1, val);
			}
			
//			setTotal(irum);
//			setAvg(irum);
			// 한사람 벡터를 전체 벡터에 넣고
			v.add(irum);
			
		}
		setCalc();
		
		for(int i = 0 ; i < tmp.length ; i++ ) {
			Vector<?> van = (Vector<?>)v.get(i);
			String name = (String)van.get(0);
//			System.out.println(name);
			
			System.out.println(v.get(i));
			/*
			 * System.out.println(((Vector)(v.get(i))).get(0));
			 */		
		}
	}
	
	public void setTotal(Vector<Object> vec) {
		int sum = 0 ;
		for(int j = 1 ; j < 7 ; j++ ) {
			sum += (int) vec.get(j);
		}
		vec.add(7, sum);
	}
	public void setCalc() {
		int sum ;
		for(int i = 0 ; i < tmp.length ; i++ ) {
			sum = 0 ;
			for(int j = 1 ; j < 7 ; j++ ) {
//				sum += Integer.parseInt((String) v.get(i).get(j));
				sum += (int) v.get(i).get(j);
			}
			v.get(i).add(sum);
			float avg = sum / 6f;
			DecimalFormat pattern = new DecimalFormat("####.00");
			String val = pattern.format(avg);
			v.get(i).add(val);
		}
	}
	
	public void setAvg(Vector<Object> vec) {
		int total = (int)vec.get(7);
		float avg = total / 6f;
		
		vec.add(avg);
	}
	
	public static void main(String[] args) {
		new Test11();
	}

}
