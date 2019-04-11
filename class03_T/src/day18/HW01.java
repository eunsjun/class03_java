package day18;

/*
	�츮�� �л����� ���� ���� �����͸� Vector �� ����ؼ� 
	�����ϰ� ����ϼ���.
	��, �л� �����ʹ� VO Ŭ������ ����ؼ� ó���ϼ���.
 */

import java.util.*;
import static java.lang.Math.*;
public class HW01 {
	String[] name = {"������", "������", "����", "������", "������",
					"������", "��ȯ��", "������", "������", "������",
					"�ȴٿ�", "������", "������", "������", "���ؼ�" };
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
			System.out.println(s.getName() + " - java ���� : " + s.getJava());
		}
	}

	public static void main(String[] args) {
		new HW01();
	}

}
