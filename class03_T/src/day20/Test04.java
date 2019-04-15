package day20;

import java.util.*;
import etc.*;
public class Test04 {
	// ��ü �׷��� �����ϴ� ��
	HashMap groupMap = new HashMap();
	Scanner sc;
	public Test04() {
		sc = new Scanner(System.in);
		ArrayList list = new Friends().getList();
		for(int i = 0 ; i < list.size(); i++ ) {
			ArrayList l = (ArrayList)list.get(i);
			
			setFriend((String)l.get(0), (String)l.get(1), (String)l.get(2));
		}
		
		while(true) {
			System.out.println("��ȸ�� �׷��� �Է��ϼ���! : (���� : quit)");
			String str = sc.next();
			if(str.equals("quit")) {
				break;
			}
			if(!groupMap.containsKey(str)) {
				continue;
			}
			
			System.out.println("��ȸ�� �̸��� �Է��ϼ���! : ( ���� : prev )");
			String str1 = sc.next();
			if(str1.equals("prev")) {
				continue;
			}
			if(!((HashMap) groupMap.get(str)).containsKey(str1)) {
				System.out.println("��ϵ��� ���� ģ���Դϴ�.");
				continue;
			}
			getOne(str, str1);
		}
	}
	
	// ���ο� �׷��� ����� �Լ�
	public void makeGroup(String name) {
		// �׷� �̸��� �˷��ָ� �� �׷��� ������ִ� �Լ�
		if(!groupMap.containsKey(name)) {
			// �ش� �̸��� Ű���� �������� ������
			// �ش� �׷��� ���ٴ� ���̹Ƿ�
			// name �� Ű������ ������ HashMap�� ���� �־��ش�.
			groupMap.put(name, new HashMap());
		}
	}
	
	// ģ�� ��� �Լ�
	public void setFriend(String group, String name, String tel) {
		/* 	����� ģ���� 
			��ϵ� �׷�� �̸�, ��ȭ��ȣ�� �Է��ϸ� ������ִ� �Լ�
			
			�׷��� 
			����� �׷��� ���ٸ�???
			��ϵ��� ���� ���̹Ƿ�
			�׶��� �׷��� ����� �Է��� �ؾ� �� ���̴�.
		*/
		makeGroup(group);
		
		// 1. ģ���� ����� �׷��� ���� �ʿ��� �˾Ƴ��� �� ���̴�.
		HashMap tmpMap = (HashMap) groupMap.get(group);
		// 2. ã�Ƴ� �ʿ� ģ���� ����Ѵ�.
		tmpMap.put(name, tel);
	}
	
	// �ѻ�� ������ ��ȸ�ϴ� �Լ�
	public void getOne(String group, String name) {
		// ����
		// 1. ���� �׷��� �˾Ƴ���
		HashMap tmpMap = (HashMap) groupMap.get(group);
		// 2. ���� �ʿ��� ģ�� ������ ��ȸ�Ѵ�.
		String tel = (String) tmpMap.get(name);
		
		System.out.println("*** ��ȸ ������ ***\n\t�̸� : " + name + "\n\tTel : " + tel);
	}
	
	// ��� ��� ������ �Լ� ==> ����
	public void getAll() {
		
	}
	
	public static void main(String[] args) {
		new Test04();
	}

}



