package etc;

import java.util.*;
public class Class03 {
	private String[] tname = {"������", "������", "����", "������", "������",
			"������", "��ȯ��", "������", "������", "������",
			"�ȴٿ�", "������", "������", "������", "���ؼ�" };
	private ArrayList name;
	public Class03() {
		name = new ArrayList();
		for(String irum : tname) {
			name.add(irum);
		}
	}
	
	public ArrayList getName() {
		return name;
	}

	public void setName(ArrayList name) {
		this.name = name;
	}

}
