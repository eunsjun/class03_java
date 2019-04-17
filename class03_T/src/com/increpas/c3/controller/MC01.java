package com.increpas.c3.controller;


import java.util.*;
import com.increpas.c3.DAO.*;
import com.increpas.c3.VO.*;
import etc.*;
public class MC01 {
	MDAO dao;
	Scanner sc;
	public MC01() {
		dao = new MDAO();
		//getCount();
		
		/*
		// 회원 입력
		insertMember();
		*/
		
		insertAll();
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
		sc = new Scanner(System.in);
		while(true) {
			int cnt = dao.getIdCnt(mvo.getId());
			if(cnt != 0) {
				System.out.println("이미 사용하는 아이디 입니다!");
				System.out.println("사용할 아이디를 입력하세요!");
				String sid = sc.nextLine();
				mvo.setId(sid);
			} else {
				break;
			}
		}
		sc.close();
		
		dao.insertMember(mvo);
		
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

	// 모든 회원 입력하는 함수
	/*
		문제점]
			이미 가입이 된 학생이 있다.
			==> 해결 방법 : 이름검색해서 있음 건너뛰면 된다.
	 */
	public void insertAll() {
		ArrayList<String> nameList = new Class03().getName();
		ArrayList<String> idList = new Class03().getId();
		ArrayList<String> mailList = new Class03().getMail();
		ArrayList<String> dbList = dao.getNameList();
		
		loop:
		for(int i = 0 ; i < nameList.size() ; i++ ) {
			
			MemberVO mvo = new MemberVO();
			
			for(int j = 0 ; j < dbList.size(); j++ ) {
				if((nameList.get(i)).equals(dbList.get(j))){
					continue loop;
				}
			}
			
			String name = nameList.get(i);
			String id = idList.get(i);
			String mail = mailList.get(i);
			mvo.setName(name);
			mvo.setId(id);
			mvo.setMail(mail);
			mvo.setPw("12345");
			dao.insertMember(mvo);
		}
	}
	
	
	public static void main(String[] args) {
		new MC01();
	}

}
