package com.increpas.c3.controller;

import java.util.*;
import com.increpas.c3.DAO.*;
import com.increpas.c3.VO.*;
import etc.*;
public class DAYE01 {
	
	// ������ ���̽��� �����ؼ� �۾��� �ϴ� ���� ��� DAO�� �°����Ƿ�
	// DAO�� ���������� ���� ����ϸ� �� �� ����.
	MDAO dao;
	
	public DAYE01() {
		dao = new MDAO();
		
		// ���� ������ �غ�
		HashMap<String, ArrayList<String>> map = new HashMap<String, ArrayList<String>>();
		Class03 c3 = new Class03();
		ArrayList<String> name = c3.getName();
		ArrayList<String> id = c3.getId();
		ArrayList<String> mail = c3.getMail();
		ArrayList<String> tel = c3.getTel();
		
		map.put("name", name);
		map.put("id", id);
		map.put("mail", mail);
		map.put("tel", tel);
		
		// ȸ�� ���� �����ϴ� �Լ� ȣ��
		dao.setMembData(map);
		
	}

	public static void main(String[] args) {
		new DAYE01();
	}

}
