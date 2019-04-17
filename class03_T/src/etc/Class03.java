package etc;

import java.util.*;
public class Class03 {
	private String[] tname = {"°­Âù±Ô", "°­ÅÂÈÆ", "±è»ó¿ì", "±èÅÂÇå", "±èÅÂÇü",
			"±èÇüÁØ", "±èÈ¯Áø", "¹ÚÁ¤Çå", "¹ÚÇüÁø", "¼­º´ÁÖ",
			"¾È´Ù¿¹", "¾çÈñÁØ", "Àü¿µ¼ö", "Á¶¿ø¿ë", "ÇãÁØ¼®" };
	private ArrayList name;
	private ArrayList sub;
	private ArrayList<String> id;
	private ArrayList<String> mail;
	private ArrayList<String> tel;
	
	public ArrayList getSub() {
		return sub;
	}

	public void setSub(ArrayList sub) {
		this.sub = sub;
	}

	public Class03() {
		name = new ArrayList();
		setIdList();
		setMailList();
		setTelList();
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
	
	public void setIdList() {
		id = new ArrayList<String>();
		id.add("kck");
		id.add("kth");
		id.add("ksw");
		id.add("kt");
		id.add("hkt");
		id.add("khj");
		id.add("lg");
		id.add("jhpark");
		id.add("hjp");
		id.add("sbj");
		id.add("AHN");
		id.add("guitarman");
		id.add("fluman");
		id.add("banjang");
		id.add("mj");
	}
	
	public void setMailList() {
		mail = new ArrayList<String>();
		mail.add("kck@increpas.com");
		mail.add("kth@increpas.com");
		mail.add("ksw@increpas.com");
		mail.add("kt@increpas.com");
		mail.add("kim@increpas.com");
		mail.add("khj@increpas.com");
		mail.add("lg@increpas.com");
		mail.add("jhp@increpas.com");
		mail.add("hjp@increpas.com");
		mail.add("sbj@increpas.com");
		mail.add("AHN@increpas.com");
		mail.add("guitarman@increpas.com");
		mail.add("fluman@increpas.com");
		mail.add("banjang@increpas.com");
		mail.add("mj@increpas.com");
	}
	
	public void setTelList() {
		tel = new ArrayList<String>();
		tel.add("010-7170-3992");
		tel.add("010-2832-8803");
		tel.add("010-8600-2499");
		tel.add("010-7161-0208");
		tel.add("010-4190-0079");
		tel.add("010-3072-2421");
		tel.add("010-3661-3771");
		tel.add("010-3762-3828");
		tel.add("010-2249-5576");
		tel.add("010-4613-9442");
		tel.add("010-6211-3248");
		tel.add("010-4428-5869");
		tel.add("010-7187-0947");
		tel.add("010-4159-9500");
		tel.add("010-8705-2362");
	}

	public ArrayList<String> getId() {
		return id;
	}

	public ArrayList<String> getMail() {
		return mail;
	}

	public ArrayList<String> getTel() {
		return tel;
	}
	
	
}
