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
		
		// ȸ�� �Է�
		
	}
	
	// ȸ���Է��ϴ� �Լ�
	public void insertMember() {
		// MDAO�� �����ؾߵǴ� �����Ͱ� �����ϰ� �����Ƿ�
		// �׷���.. ���ϱ� ��� ȸ�� ������ ���õ� �������̹Ƿ�
		// �츮�� ����� ���� MemberVO�� �����ؼ� ��ü�� ������ �� �� ����.
		MemberVO mvo = new MemberVO();
		mvo.setName("������");
		mvo.setId("jhpark");
		mvo.setPw("12345");
		mvo.setMail("jhp@increpas.com");
		
		// ���� ���̵� ��밡�� ���θ� �˾Ƴ��� �ڴ�.
	}
	
	public void getCount() {
		// ���̵�� ��й�ȣ�� �Է� �޴´�.
		sc = new Scanner(System.in);
		String sid, spw;
		System.out.println("���̵� �Է��ϼ���! : ");
		sid = sc.nextLine();
		System.out.println("��й�ȣ�� �Է��ϼ���! : ");
		spw = sc.nextLine();
		sc.close();
		
		// ���� ����� �����Ѵ�.
		// ���� ����� MDAO Ŭ�������� �����ϱ�� ������
		// MDAO Ŭ������ �Լ��� ȣ���Ѵ�.
		int cnt = dao.getMembCnt(sid, spw);
		String msg = cnt == 1 ? "���Ե� ȸ���Դϴ�." : "���� ȸ���Դϴ�.";
		
		System.out.println(sid+" ȸ���� " + msg);
	}

	public static void main(String[] args) {
		new MC01();
	}

}
