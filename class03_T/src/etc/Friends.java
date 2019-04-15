package etc;

import java.util.*;
public class Friends {
	private ArrayList list;
	public Friends() {
		list = new ArrayList();
		
		list.add(setData("친구", "허준석", "010-1111-1111"));
		list.add(setData("친구", "강찬규", "010-1234-1234"));
		list.add(setData("친구", "서병주", "010-9876-5432"));
		list.add(setData("웬수", "전영수", "010-2222-2222"));
		list.add(setData("친구", "김태형", "010-3333-3333"));
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
