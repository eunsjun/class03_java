package etc;

import java.util.*;
public class Class03 {
	private String[] tname = {"강찬규", "강태훈", "김상우", "김태헌", "김태형",
			"김형준", "김환진", "박정헌", "박형진", "서병주",
			"안다예", "양희준", "전영수", "조원용", "허준석" };
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
