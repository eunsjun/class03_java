package day19;

/*
	TreeSet �� �����͸� �Է��� �ϸ� ������ �ؼ� �����ϰ� �ȴ�.
	�� ���� �����͵� ���� ���� ũ�Ⱑ �񱳰� �Ǿ�� �Ѵٴ� ���̰�
	�׸� ���� ���� �� �־�� �ȴ�.
 */

import java.util.*;
import etc.*;
public class Test07 {
/*
	�ﰢ�� Ŭ������ 10���� ���� TreeSet�� �־��.
 */

	public Test07() {
		TreeSet tree = new TreeSet(new SemoSort());
		
		// �ﰢ�� ��ü �Է�
		for(int i = 0 ; i < 10 ; i++ ) {
			Samgak semo = new Samgak();
			tree.add(semo);
		}
		
		Iterator it = tree.iterator();
		while(it.hasNext()) {
			System.out.println((Samgak) it.next());
		}
	}

	public static void main(String[] args) {
		new Test07();
	}

}

class SemoSort implements Comparator {
	
	@Override
	public int compare(Object o1, Object o2) {
		Samgak s1 = (Samgak) o1;
		Samgak s2 = (Samgak) o2;
		return -(s1.getWidth()*s1.getHeight() - s2.getWidth()*s2.getHeight());
	}
}