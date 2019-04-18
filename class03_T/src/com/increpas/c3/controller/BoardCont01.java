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
		
		sc = new Scanner(System.in);
		sid = setLogin(sc);
		
		l1:
		while(true) {
			System.out.println("------------------");
			System.out.println("1. �� ��ü ��ȸ");
			System.out.println("2. �� ��ȣ ��ȸ"); // �۹�ȣ�� �Է��ϸ� ���� ������ ������ִ� �Լ�����
			System.out.println("3. ���̵� �� ��ȸ"); // ���̵� �Է��ϸ� ���� ������ ������ִ� �Լ�����
			System.out.println("7. �� ���");
			System.out.println("9. ����");
			System.out.println("------------------");
			System.out.println("�޴� ��ȣ : ");
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
			System.out.println(vo.getbNo() + " | " + vo.getId() + " - " + 
										vo.getbDate() + " " + vo.getbTime());
			System.out.println("�� �� : " + vo.getBody());
			System.out.println("------------------------------------");
		}
		System.out.println("##### ����� �� �� : " + list.size() + " #####");
	}
	
	// ���̵�� �ۼ��� �� �˻��ϴ� �Լ�
	public void getIdBRD() {
		// ����
		String sid = "";
		int cnt;
		
		while(true) {
			// ���̵� �Է¹޴´�.
			System.out.println("�˻��� ���̵� �Է��ϼ���!");
			sid = sc.nextLine();
			int num = mdao.getIdCnt(sid);
			if(num == 0) {
				System.out.println("�������� �ʴ� ���̵� �Դϴ�.");
				continue;
			}
			cnt = bdao.getIdCnt(sid);
			if(sid.equals("quit")) {
				return;
			}
			if(cnt == 0) {
				System.out.println("�ۼ��� ���� �����ϴ�.");
				continue;
			}
			break;
		}
		
		ArrayList<BoardVO> list = bdao.getIdContent(sid);

		// ���
		for(BoardVO vo : list) {
			System.out.println(vo.getbNo() + " | " + vo.getId() + " - " + 
										vo.getbDate() + " " + vo.getbTime());
			System.out.println("�� �� : " + vo.getBody());
			System.out.println("------------------------------------");
		}
		System.out.println("##### �ۼ��� �� �� : " + list.size() + " #####");
	}
	
	public void setBoard(String sid, Scanner s) {
		// ����
		// �޼��� �Է¹ް�
		System.out.println(sid + " �� ���� �Է��ϼ���!");
		String msg = s.nextLine();
		// ���̵�� �޼��� ������
		bdao.insertBRD(sid, msg);
		System.out.println("### �Է��� �Ϸ�Ǿ����ϴ�. ###");
	}
	
	// �α��� ó�� �Լ�
	public String setLogin(Scanner s) {
		String sid = "";
		// ����
		// 	1. ���̵�� ����� �Է� �޴´�.
		
		boolean bool = true;
		
		// id ���� ���� �ʱ�ȭ
		// �޼��� ���
		while(bool) {
			System.out.println("���̵� �Է��ϼ���!");
			sid = sc.nextLine();
			System.out.println("��й�ȣ�� �Է��ϼ���!");
			String spw = s.nextLine();
			
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
