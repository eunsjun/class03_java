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
		// ȸ�� �Է�
		insertMember();
		*/
		
		insertAll();
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
		sc = new Scanner(System.in);
		while(true) {
			int cnt = dao.getIdCnt(mvo.getId());
			if(cnt != 0) {
				System.out.println("�̹� ����ϴ� ���̵� �Դϴ�!");
				System.out.println("����� ���̵� �Է��ϼ���!");
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

	// ��� ȸ�� �Է��ϴ� �Լ�
	/*
		������]
			�̹� ������ �� �л��� �ִ�.
			==> �ذ� ��� : �̸��˻��ؼ� ���� �ǳʶٸ� �ȴ�.
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
