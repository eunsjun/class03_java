package day19;

import java.util.*;
import etc.*;
public class Test10 {
// �츮�� �л����� �ڹ� ������ �����ϰ� ���� �Է��Ѵ�.
	public Test10() {
		Hashtable table = new Hashtable();
		ArrayList name = new Class03().getName();
		for(int i = 0 ; i < name.size(); i++ ) {
			table.put(name.get(i), (int)(Math.random()*51 + 50));
		}
		
		// ����ϱ�
		for(int i = 0; i < table.size() ; i++ ) {
			System.out.println(name.get(i) + " : " + table.get(name.get(i)));
		}
	}

	public static void main(String[] args) {
		new Test10();
	}

}
