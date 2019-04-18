package com.increpas.c3.controller;

import java.util.*;

import com.increpas.c3.DAO.*;
import com.increpas.c3.VO.*;
public class BoardCont01 {
/*
	이 클래스는 
	회원 로그인을 처리를 하고
	board 테이블에 데이터를 조회하고 입력하는 클래스
 */
	MDAO mdao ;
	BDAO bdao;
	
	Scanner sc;
	String sid;
	public BoardCont01() {
		mdao = new MDAO();
		bdao = new BDAO(mdao);
		
		sc = new Scanner(System.in);
		sid = setLogin(sc);
		
		l1:
		while(true) {
			System.out.println("------------------");
			System.out.println("1. 글 전체 조회");
			System.out.println("2. 글 번호 조회"); // 글번호를 입력하면 글의 정보를 출력해주는 함수실행
			System.out.println("3. 아이디 글 조회"); // 아이디를 입력하면 글의 정보를 출력해주는 함수실행
			System.out.println("7. 글 등록");
			System.out.println("9. 종료");
			System.out.println("------------------");
			System.out.println("메뉴 번호 : ");
			String sno = sc.nextLine();
			
			switch(sno) {
			case "1":
				getBRD();
				break;
			case "2":
				
				break;
			case "3":
				getIdBRD();
				break;
			case "7":
				setBoard(sid, sc);
				break;
			case "9":
				System.out.println("프로그램을 종료합니다.");
				break l1;
			}
		}
	}
	
	// 글 조회 함수
	public void getBRD() {
		// 할일
		// 데이터가 여러줄일 거니까 ArrayList를 준비한다.
		ArrayList<BoardVO> list = bdao.getAll();
		
		// 출력
		for(BoardVO vo : list) {
			System.out.println(vo.getbNo() + " | " + vo.getId() + " - " + 
										vo.getbDate() + " " + vo.getbTime());
			System.out.println("본 문 : " + vo.getBody());
			System.out.println("------------------------------------");
		}
		System.out.println("##### 저장된 글 수 : " + list.size() + " #####");
	}
	
	// 아이디로 작성한 글 검색하는 함수
	public void getIdBRD() {
		// 할일
		String sid = "";
		int cnt;
		
		while(true) {
			// 아이디를 입력받는다.
			System.out.println("검색할 아이디를 입력하세요!");
			sid = sc.nextLine();
			int num = mdao.getIdCnt(sid);
			if(num == 0) {
				System.out.println("존재하지 않는 아이디 입니다.");
				continue;
			}
			cnt = bdao.getIdCnt(sid);
			if(sid.equals("quit")) {
				return;
			}
			if(cnt == 0) {
				System.out.println("작성된 글이 없습니다.");
				continue;
			}
			break;
		}
		
		ArrayList<BoardVO> list = bdao.getIdContent(sid);

		// 출력
		for(BoardVO vo : list) {
			System.out.println(vo.getbNo() + " | " + vo.getId() + " - " + 
										vo.getbDate() + " " + vo.getbTime());
			System.out.println("본 문 : " + vo.getBody());
			System.out.println("------------------------------------");
		}
		System.out.println("##### 작성한 글 수 : " + list.size() + " #####");
	}
	
	public void setBoard(String sid, Scanner s) {
		// 할일
		// 메세지 입력받고
		System.out.println(sid + " 님 글을 입력하세요!");
		String msg = s.nextLine();
		// 아이디와 메세지 보내고
		bdao.insertBRD(sid, msg);
		System.out.println("### 입력이 완료되었습니다. ###");
	}
	
	// 로그인 처리 함수
	public String setLogin(Scanner s) {
		String sid = "";
		// 할일
		// 	1. 아이디와 비번을 입력 받는다.
		
		boolean bool = true;
		
		// id 변수 선언 초기화
		// 메세지 출력
		while(bool) {
			System.out.println("아이디를 입력하세요!");
			sid = sc.nextLine();
			System.out.println("비밀번호를 입력하세요!");
			String spw = s.nextLine();
			
			int cnt = mdao.getMembCnt(sid, spw);
			
			if(cnt == 1) {
				System.out.println(sid + " 님 로그인 되었습니다.");
				bool = false;
			}
		}
		
		return sid;
	}
	
	public static void main(String[] args) {
		new BoardCont01();
	}

}
