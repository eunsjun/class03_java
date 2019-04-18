package com.increpas.c3.controller;

import java.util.*;

import com.increpas.c3.DAO.*;
import com.increpas.c3.VO.*;
public class BoardCont01 {
/*
	�� Ŭ������ 
	ȸ�� �α����� ó���� �ϰ�
	board ���̺� �����͸� ��ȸ�ϰ� �Է��ϴ� Ŭ����
 */
	MDAO mdao ;
	BDAO bdao;
	
	Scanner sc;
	String sid;
	public BoardCont01() {
		mdao = new MDAO();
		bdao = new BDAO(mdao);
		
		sid = setLogin();
		sc = new Scanner(System.in);
		
		l1:
		while(true) {
			System.out.println("------------------");
			System.out.println("1. �� ��ȸ");
			System.out.println("2. �� ���");
			System.out.println("3. ����");
			System.out.println("------------------");
			System.out.println("�޴� ��ȣ : ");
			String sno = sc.nextLine();
			
			switch(sno) {
			case "1":
				getBRD();
				break;
			case "2":
				setBoard(sid);
				break;
			case "3":
				System.out.println("���α׷��� �����մϴ�.");
				break l1;
			}
		}
	}
	
	// �� ��ȸ �Լ�
	public void getBRD() {
		// ����
		// �����Ͱ� �������� �Ŵϱ� ArrayList�� �غ��Ѵ�.
		ArrayList<BoardVO> list = bdao.getAll();
		
		// ���
		for(BoardVO vo : list) {
			System.out.println(vo.getbNo() + " | " + vo.getmNo() + " - " + 
										vo.getbDate() + " " + vo.getbTime());
			System.out.println("�� �� : " + vo.getBody());
			System.out.println("------------------------------------");
		}
		System.out.println("##### ����� �� �� : " + list.size() + " #####");
	}
	
	public void setBoard(String sid) {
		// ����
		// �޼��� �Է¹ް�
		sc = new Scanner(System.in);
		System.out.println(sid + " �� ���� �Է��ϼ���!");
		String msg = sc.nextLine();
		// ���̵�� �޼��� ������
		bdao.insertBRD(sid, msg);
		System.out.println("### �Է��� �Ϸ�Ǿ����ϴ�. ###");
	}
	
	// �α��� ó�� �Լ�
	public String setLogin() {
		String sid = "";
		// ����
		// 	1. ���̵�� ����� �Է� �޴´�.
		
		boolean bool = true;
		sc = new Scanner(System.in);
		
		// id ���� ���� �ʱ�ȭ
		// �޼��� ���
		while(bool) {
			System.out.println("���̵� �Է��ϼ���!");
			sid = sc.nextLine();
			System.out.println("��й�ȣ�� �Է��ϼ���!");
			String spw = sc.nextLine();
			
			int cnt = mdao.getMembCnt(sid, spw);
			
			if(cnt == 1) {
				System.out.println(sid + " �� �α��� �Ǿ����ϴ�.");
				bool = false;
			}
		}
		
		return sid;
	}
	
	public static void main(String[] args) {
		new BoardCont01();
	}

}
