package com.increpas.c3.controller;

import java.util.*;
import com.increpas.c3.DAO.*;
import com.increpas.c3.VO.*;
import etc.*;
public class Test01 {
	MDAO dao;
	Scanner sc;
	public Test01() {
		dao = new MDAO();
		sc = new Scanner(System.in);
		while(true) {
			System.out.println("조회할 학생을 입력하세요!");
			String str = sc.nextLine();
			if(str.equals("quit")) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}
			
			dao.getJoin(str);
		}
	}

	public static void main(String[] args) {
		new Test01();
	}

}
