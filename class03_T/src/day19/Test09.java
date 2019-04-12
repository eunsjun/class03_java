package day19;

import java.util.*;
import java.text.*;
public class Test09 {
/*
	Map
		==> List, Set ���� ������ �ٸ� �÷���
			List, Set �� ����ȯ�� �ȵȴ�.
			
			�ϳ��� �����͸� �� �����͸� ������ �� �ִ� Ű���� ������ ����
			�����͸� ����ϴ� �÷����� ����
			
			����� ��쿡�� Ű���� �̿��ؼ� �����͸� ������ �Է��ϰ� �ؾ� �Ѵ�.
			
			Map �迭 �÷�����
				���� ���� �����͸� ���� �ϴ� �뵵���ٴ�
				�����͸� �ս��� �����Ͽ� ����� �������� ���ȴ�.
				
				
		����]
			1. HashMap/Hashtable
				Hashtable�� ������������ ���� Ŭ�����̰�
				HashMap�� �Ź��� �̹Ƿ�
				����� HashMap ����� �����Ѵ�.
				
				���������� Ű���� �ؽ� ���̺��� �̿��ؼ� �����ؼ� �����Ѵ�.
				
				�ֿ��Լ�]
					put(Object key, Object value)
						==> �����͸� �Է��ϴ� �Լ�
					get(Object key)
						==> �����͸� �����ϴ� �Լ�
						
				�����Լ�]
					values() 	==> ��ȯ���� �÷���
						==> ������(value)�� �����ִ� �Լ�
					keys()		==> HashTable �Ҽ� ��ȯ���� Enumeration
						==> Ű��(key)�� �����ִ� �Լ�
						
						��ȯ���� Enumeration �̹Ƿ�
						Iteratoró�� ����ϸ� �ȴ�.
						Enumeration : Iterator�� ������
										�����͸� ���������� ������ ����� Ŭ����
						
					keySet()	==> HashMap �Ҽ��Լ� ��ȯ���� Set ==> Iterator
					
				����]
					entrySet()
						==> Map �� �ݵ�� Ű���� �˾ƾ� �����͸� ������ �� �ִ�.
							Ű���� �����͸� Set ���� �����ִ� �Լ�
							
					���� ==>
							Map�� Ű���� �����Ͱ� �ѽ��� �Ǿ�� ������ �Ǵµ�
							Set�� ���� �ϳ��� �����Ѵ�.
							����
								�ݵ�� Ű���� �����͸� �ϳ��� ��� Set�� ������ �Ѵ�.
								
							==> �̷� �������� �ذ��ϱ� ���ؼ� VO Ŭ������ ����Ѵ�.
							�� Ŭ������ 
									Map.Entry
								==> �� Ŭ���� �ȿ��� Key�� value ������ ����ȭ�� ���Ұ�
									�����Ϳ� ������ �Լ��� ó���� �ϰ� �ִ�.
									�Ѹ����
										�ΰ��� ������ �ϳ��� ���� ���� Ŭ���� �̴�.
										
										
			2. TreeMap
				==> TreeSet�� ����������
					���ο��� �����ϸ鼭 �����͸� ����ϴ� Map�̴�.
					�̶� ���ı����� Ű���� �������� �����ϰ� �ȴ�.
					����
							Ű���� ���ĵ��� �ʴ� Ŭ������ ����� �� ����
							�ʿ��ϴٸ� ���� ����� ���ؼ� ����ؾ� �Ѵ�.
							
							
							
		����]
			�÷��� ���ο��� �ٽ� �÷����� �Է��� �� �ִ�.
			��??
				������ �Է� �Լ��� �Ű������� Object �̱� ������
				�����͸� �Է��ϴ� ���� Object Ÿ������ �ڵ� ����ȯ�� �ȴ�.
				�÷��ǵ� Ŭ�����̱� ������ 
				�ֻ��� Ŭ������ Object �̰�
				������ �Է��Լ��� �����ϴ� ����
				Object�� �ڵ� ����ȯ�� �ȴ�.
				==> ������ ��Ȯ�� ������ Ÿ������ ���� ����ȯ�� ����� �ϴ� ������.
		
 */
	
	// Hashtable �� ����� �����͸� �����غ���.
	public Test09() {
		// Hashtable ����
		Hashtable table = new Hashtable();
		// ������ �Է�
		table.put("�̸�", "������");
		table.put("��ȭ", "010-1234-5678");
		table.put("����", 24);
		table.put("����", 184.5f);
		table.put("����", new Date("1996/09/29"));
		
		int len = table.size();
		System.out.println("Hashtable size : " + len);
		
		String name = (String) table.get("�̸�");
		String tel = (String) table.get("��ȭ");
		int age = (int) table.get("����");
		float tall = (float) table.get("����");
		Date birth = (Date) table.get("����");
		
		SimpleDateFormat form = new SimpleDateFormat("yyyy�� MM�� dd��");
		String sbirth = form.format(birth);
		
		System.out.println("Name  : " + name);
		System.out.println("Tel   : " + tel);
		System.out.println("Age   : " + age);
		System.out.println("Tall  : " + tall);
		System.out.println("Birth : " + sbirth);
		
		System.out.println("==================");
		
		Collection col = table.values();
		
		Iterator it = col.iterator();
		while(it.hasNext()) {
			Object o = it.next();
			if(o instanceof String) {
				System.out.println((String)o);
			} else if(o instanceof Integer) {
				System.out.println("���� : " + (int) o);
			} else if(o instanceof Float) {
				System.out.println("���� : " + (float) o);
			} else if(o instanceof Date) {
				String sb = form.format((Date) o);
				System.out.println("���� : " + sb);
			}
		}
/*
		System.out.println(col);
		
		HashSet set = new HashSet(col);
		System.out.println(set);
		
		ArrayList list = new ArrayList(col);
		System.out.println(list);
*/	
	}

	public static void main(String[] args) {
		new Test09();
	}

}
