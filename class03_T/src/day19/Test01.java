package day19;

import java.util.*;
import etc.*;
import static java.lang.Math.*;
public class Test01 {
	ArrayList ban ;	// �� ��ü ������ ����Ʈ
	Score stud;		// �л��Ѹ����� Ŭ����(VO)
	ArrayList list;	// �̸� ���� ����Ʈ
	public Test01() {
		list = new Class03().getName();
		ban = new ArrayList();
		for(int i = 0 ; i < list.size() ; i++) {
			// �л� ��ü ����
			stud = new Score();
			// �л� �̸� �Է� <== �̸��� list���� �ϳ��� �̾Ƽ� �Է��Ѵ�.
			stud.setName((String)list.get(i));
			
			// ���� ���� �Է�
			stud.setJava((int)(random()*51 + 50));
			stud.setOracle((int)(random()*51 + 50));
			stud.setJsp((int)(random()*51 + 50));
			stud.setSpring((int)(random()*51 + 50));
			stud.setWeb((int)(random()*51 + 50));
			stud.setJs((int)(random()*51 + 50));
			stud.setCalc();
			
			// �ݿ� �л� �Է�
			ban.add(stud);
		}
		
		Collections.sort(ban);
		
		for(Object o : ban) {
			System.out.println((Score) o);
			System.out.println("==================");
		}
		System.out.println("#############################");
		System.out.println("#### ���� ���� ���� ���� ####");
		System.out.println("#############################");
		// ������ ���� ������ �ٲٰ� �ʹ�.
		// ���� ������ �ٲ��ָ� �� ���̴�. ==> Comparator �������̽��� ������ ���ı����� ����� �ȴ�.
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
