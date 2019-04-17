package com.increpas.c3.controller;


import java.util.*;
import com.increpas.c3.DAO.*;
import com.increpas.c3.VO.*;
import etc.*;
public class MC02 {
	MDAO dao ;
	public MC02() {
		dao = new MDAO();
		Class03 c3 = new Class03();
		ArrayList<String> id = c3.getId();
		ArrayList<String> tel = c3.getTel();
		
		dao.setTel(id, tel);
	}
	
	
	public static void main(String[] args) {
		new MC02();
	}
}
