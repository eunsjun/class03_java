package day19;

import etc.*;
import java.util.*;
public class Test02 {
/*
	Set �迭
		�Է¼����� �������� �ʴ´�.
		������ ��Ģ�� ���� ���������� �����ؼ� �����Ѵ�.
		�ߺ��� �����ʹ� �ѹ��� �����Ѵ�.
		(���������Ͱ� �Է��� �Ǹ� 
		����� �����ʹ� �����ϰ� ���ο� �����͸� �Է��Ѵ�.)
		
		
		1. HashSet
			==> HashCode�� �̿��ؼ� �����ؼ� �����ϴ� �÷���
				�Ϲ����� ������ �̷�� ���� �ʴ´�.
				
				����]
					HashSet(int intialCapacity, float loadtFactor)
					==> loadFactor : �ؽ��ڵ尪�� ����� ��Ģ�� ������ ���
					�ؽ��ڵ尪�� ����� ��Ģ�� ����ڰ� �Է��ؼ� �ؽ����̺��� ���� ���.
					
				����]
					Set�迭�� �÷����� �����͸� �����ϴ� �Լ��� ������ ���� �ʴ�.
					==> ��???
							�����ڰ� �����Ͱ� ����� ��Ҹ� �𸣱� ������
							Ư����ġ�� �����ؼ� �����͸� ���� �� ����.( �ε����� �������� �ʴ´�.)
							==> ������ �ڷ����� �ƴϴ�.
							
					���� �����͸� �������� �ݵ�� Iterator �� ��ȯ�ؼ� ���������� �ϳ��� ������ �Ѵ�.
					
		2. TreeSet
			==> ���������� Tree Sort ��� �˰����� �̿��ؼ� �����͸� �����Ѵ�.
				
				
			�������]
				TreeSet(Comparator comparator)
				==> ���Ĺ���� �����ؼ� TreeSet�� �����.
				
				TreeSet(SortedSet<E> s)
				==> TreeSet�� �̿��ؼ� �ٽ� TreeSet�� �����.
				
			�����Լ�]
				subSet()
					==> �ϳ��� Set�� ��� �����߿� Ư���κи� ��� ���ο� Set�� ������ִ� �Լ�
					
				headSet(E toElement)
					==> ó������ ������ �κб��� ��� ���ο� Set�� ������ִ� �Լ�
					
				tailSet(E fromElement)
					==> ������ �κк��� ������ ���� ��� ���ο� Set�� ������ִ� �Լ�
					
					
 */
	
	// 15���� ���ڿ��� HashSet�� �Է��� �� ������ ����� ����.
	// �츮�� �л��̸��� �Է��غ���.
	public Test02() {
		// �̸� ����Ʈ �޾ƿ���
		ArrayList list = new Class03().getName();
		
		// HashSet �����
		HashSet set = new HashSet();
		
		// HashSet �� ������ �Է��ϰ�
		for(Object o : list) {
			// ArrayList �� ���ڿ��� �Է��ߴµ� Object�� �ڵ� ����ȯ�� �Ǽ� ����Ǿ� ������
			// ������ �Ǹ� Object�� ������ �ȴ�.
			// ���� ����� ���� ��Ȯ�� Ÿ������ ��������ȯ�� ����� �Ѵ�.
			set.add((String) o);
		}
		
		int size = set.size();
		System.out.println("set.size() : " + size);
		
		// �����͸� �ϳ��� ������ ����غ���.
		// Set �� ������ �����Լ��� ���� ������ Iterator �� ��ȯ������ �ϳ��� ������ �Ѵ�.
		
		// Iterator �� ��ȯ
		Iterator it = set.iterator();
		
		// �ϳ��� ���������� ������ ����Ѵ�.
		for(int i = 0 ; it.hasNext(); i++ ) {
			// ������ ������ ���
			String name = (String) it.next();
			// ����Ѵ�.
			System.out.println( (i+1)+ " �� �л� : " + name);
		}
		
	}

	public static void main(String[] args) {
		new Test02();
	}

}
