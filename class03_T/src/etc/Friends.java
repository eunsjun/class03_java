package etc;

import java.util.*;
public class Friends {
	private ArrayList list;
	public Friends() {
		list = new ArrayList();
		
		list.add(setData("ģ��", "���ؼ�", "010-1111-1111"));
		list.add(setData("ģ��", "������", "010-1234-1234"));
		list.add(setData("ģ��", "������", "010-9876-5432"));
		list.add(setData("����", "������", "010-2222-2222"));
		list.add(setData("ģ��", "������", "010-3333-3333"));
	}
	
	public ArrayList setData(String group, String name, String tel) {
		ArrayList l = new ArrayList();
		l.add(group);
		l.add(name);
		l.add(tel);
		return l;
	}

	public ArrayList getList() {
		return list;
	}
	
}
