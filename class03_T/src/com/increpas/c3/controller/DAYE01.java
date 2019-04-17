package com.increpas.c3.controller;

import java.util.*;
import com.increpas.c3.DAO.*;
import com.increpas.c3.VO.*;
import etc.*;
public class DAYE01 {
	
	// 데이터 베이스에 접속해서 작업을 하는 것은 모두 DAO에 맞겼으므로
	// DAO를 전역변수로 만들어서 사용하면 될 것 같다.
	MDAO dao;
	
	public DAYE01() {
		dao = new MDAO();
		
		// 먼저 데이터 준비
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
		
		// 회원 정보 수정하는 함수 호출
		dao.setMembData(map);
		
	}

	public static void main(String[] args) {
		new DAYE01();
	}

}
