package etc;

import java.util.*;
public class Class03 {
	private String[] tname = {"������", "������", "����", "������", "������",
			"������", "��ȯ��", "������", "������", "������",
			"�ȴٿ�", "������", "������", "������", "���ؼ�" };
	private ArrayList name;
	private ArrayList sub;
	
	public ArrayList getSub() {
		return sub;
	}

	public void setSub(ArrayList sub) {
		this.sub = sub;
	}

	public Class03() {
		name = new ArrayList();
		sub = new ArrayList();
		for(String irum : tname) {
			name.add(irum);
		}
		sub.add("java");
		sub.add("oracle");
		sub.add("jsp");
		sub.add("spring");
		sub.add("web");
		sub.add("js");
		sub.add("total");
	}
	
	public ArrayList getName() {
		return name;
	}

	public void setName(ArrayList name) {
		this.name = name;
	}

}
