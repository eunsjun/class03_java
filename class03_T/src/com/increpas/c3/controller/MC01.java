package com.increpas.c3.controller;


import java.util.*;
import com.increpas.c3.DAO.*;
import com.increpas.c3.VO.*;
public class MC01 {
	MDAO dao;
	Scanner sc;
	public MC01() {
		dao = new MDAO();
		//getCount();
		
		// 회원 입력
		
	}
	
	// 회원입력하는 함수
	public void insertMember() {
		// MDAO에 전달해야되는 데이터가 무지하게 많으므로
		// 그런데.. 보니까 모두 회원 정보에 관련된 데이터이므로
		// 우리가 만들어 놓은 MemberVO에 저장해서 객체를 보내면 될 것 같다.
		MemberVO mvo = new MemberVO();
		mvo.setName("박정헌");
		mvo.setId("jhpark");
		mvo.setPw("12345");
		mvo.setMail("jhp@increpas.com");
		
		// 먼저 아이디 사용가능 여부를 알아내야 겠다.
	}
	
	public void getCount() {
		// 아이디와 비밀번호를 입력 받는다.
		sc = new Scanner(System.in);
		String sid, spw;
		System.out.println("아이디를 입력하세요! : ");
		sid = sc.nextLine();
		System.out.println("비밀번호를 입력하세요! : ");
		spw = sc.nextLine();
		sc.close();
		
		// 질의 명령을 실행한다.
		// 질의 명령은 MDAO 클래스에서 실행하기로 했으니
		// MDAO 클래스의 함수를 호출한다.
		int cnt = dao.getMembCnt(sid, spw);
		String msg = cnt == 1 ? "가입된 회원입니다." : "없는 회원입니다.";
		
		System.out.println(sid+" 회원은 " + msg);
	}

	public static void main(String[] args) {
		new MC01();
	}

}
