package day17;

import java.util.*;
public class Test11 {
/*
	�츮�� �л����� ���� ���� �����͸� Vector �� ����ؼ� 
	�����ϰ� ����ϼ���.
 */
	String[] tmp = {"������", "������", "����", "������", "������",
			"������", "��ȯ��", "������", "������", "������",
			"�ȴٿ�", "������", "������", "������", "���ؼ�" };
	public Test11() {
		Vector v = new Vector(15, 5);
		for(int i = 0 ; i < tmp.length ; i++ ) {
			// �ٸ� ���
//			v.add(i, new Vector().add(tmp[i]));
			
			// �ѻ�� ������ ������ ���� �ϳ��� �����.
			Vector irum = new Vector(9);
			// �ѻ�� ���Ϳ� ������ �����ϰ�
			irum.add(tmp[i]);
			
			// �ѻ�� ���͸� ��ü ���Ϳ� �ְ�
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
