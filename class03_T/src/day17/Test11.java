package day17;

import java.util.*;
import java.text.*;
public class Test11 {
/*
	�츮�� �л����� ���� ���� �����͸� Vector �� ����ؼ� 
	�����ϰ� ����ϼ���.
 */
	String[] tmp = {"������", "������", "����", "������", "������",
			"������", "��ȯ��", "������", "������", "������",
			"�ȴٿ�", "������", "������", "������", "���ؼ�" };
	Vector<Vector<Object>> v;
	public Test11() {
		v = new Vector<Vector<Object>>(15, 5);
		for(int i = 0 ; i < tmp.length ; i++ ) {
			// �ٸ� ���
//			v.add(i, new Vector().add(tmp[i]));
			
			// �ѻ�� ������ ������ ���� �ϳ��� �����.
			Vector<Object> irum = new Vector(9);
			// �ѻ�� ���Ϳ� ������ �����ϰ�
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
			// �ѻ�� ���͸� ��ü ���Ϳ� �ְ�
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
