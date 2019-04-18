package com.increpas.c3.DAO;

import java.util.*;
import java.sql.*;

import com.increpas.c3.VO.*;
import com.increpas.c3.DB.*;
import com.increpas.c3.SQL.BSQL;

/*
	board ���̺� ���� ����� ������ �����͸� �޴� Ŭ����
	board���̺� ���õ� �����ͺ��̽� �۾��� ��� ���⼭ �ϸ� �ȴ�.
 */
public class BDAO {
	C3JDBC db;
	Connection con;
	Statement stmt;
	PreparedStatement pstmt;
	ResultSet rs;
	MDAO mdao;
	public BDAO() {
		db = new C3JDBC();
		con = db.getCon();
	}
	
	public BDAO(MDAO mdao) {
		this.mdao = mdao;
		db = mdao.db;
		con = mdao.con;
	}
	
	public BDAO(C3JDBC db) {
		this.db = db;
		con = db.getCon();
	}
	
	// board ���̺� �� ����ϴ� �Լ�
	public void insertBRD(String id, String msg) {
		// ����
		// ���Ǹ�� ��������
		String sql = BSQL.getSQL(BSQL.INSERT_BRD);
		// pstmt ��������
		pstmt = db.getPSTMT(sql);
		
		try {
			// ���� ��� �ϼ��ϰ�
			pstmt.setString(1, id);
			pstmt.setString(2, msg);
			// ���Ǹ�� ������ 
			pstmt.execute();
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			db.close(pstmt);
		}
	}
	
	// �Խ��� ���̺��� ��� ������ �������� �Լ�
	public ArrayList<BoardVO> getAll(){
		// ArrayList �غ�
		ArrayList<BoardVO> list = new ArrayList<BoardVO>();
		// ���Ǹ�� �غ�
		String sql = BSQL.getSQL(BSQL.SEL_BRD_ALL);
		// stmt �غ�
		stmt = db.getSTMT();
		
		// BoardVO ���� ����
		BoardVO bvo;
		try {
			// ���� ��� ������ ������ �ް�
			rs = stmt.executeQuery(sql);
			// ������ �̾Ƽ� ����Ʈ�� �����ϰ�
			while(rs.next()) {
				// vo �غ�
				bvo = new BoardVO();
				// ������ �̾Ƽ� ���
				bvo.setbNo(rs.getInt("bno"));
				bvo.setmNo(rs.getInt("mno"));
				bvo.setId(rs.getString("id"));
				bvo.setBody(rs.getString("body"));
				bvo.setbDate(rs.getDate("bdate"));
				bvo.setbTime(rs.getTime("bdate"));
				
				// list�� ���
				list.add(bvo);
			}
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			db.close(rs);
			db.close(stmt);
		}
		// ������ ��������
		return list;
	}
	
	// ���̵�� �ۼ��� �� �� ��ȯ���ִ� �Լ�
	// �Խ��� ���̺��� ���̵� �������� �ʾҴ�.
	public int getIdCnt(String sid) {
		int cnt = 0 ;
		// ����
		// ���Ǹ�� �غ�
		String sql = BSQL.getSQL(BSQL.SEL_ID_CNT);
		// pstmt �غ��ϰ�
		pstmt = db.getPSTMT(sql);
		try {
			// ���Ǹ�� �ϼ��ϰ�
			pstmt.setString(1, sid);
			// ���Ǹ�� ������ ������ �ް�
			rs = pstmt.executeQuery();
			rs.next();
			cnt = rs.getInt("cnt");
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			db.close(rs);
			db.close(pstmt);
		}
		// ������ ��������
		
		return cnt;
	}
	
	
	// �Էµ� ���̵�� �ۼ��� �� ��ȸ�ϴ� �Լ�
	public ArrayList<BoardVO> getIdContent(String sid){
		ArrayList<BoardVO> list = new ArrayList<BoardVO>();
		// ����
		// ���Ǹ�� ��������
		String sql = BSQL.getSQL(BSQL.SEL_ID_CONTENT);
		// pstmt ��������
		pstmt = db.getPSTMT(sql);
		try{
			// ���Ǹ�� �ϼ�
			pstmt.setString(1, sid);
			// ���Ǹ�� �����ͺ��̽��� ������ ��� �ް�
			rs = pstmt.executeQuery();
			// ���� ��� ������ list �� ���
			while(rs.next()) {
				BoardVO bvo = new BoardVO();
				bvo.setbNo(rs.getInt("bno"));
				bvo.setmNo(rs.getInt("mno"));
				bvo.setBody(rs.getString("body"));
				bvo.setbDate(rs.getDate("bdate"));
				bvo.setbTime(rs.getTime("bdate"));
				bvo.setId(sid);
				
				list.add(bvo);
			}
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			db.close(rs);
			db.close(pstmt);
		}
		// list ��ȯ���ش�.
		return list;
	}
}
