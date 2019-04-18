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
	
	public BDAO() {
		db = new C3JDBC();
		con = db.getCon();
	}
	
	public BDAO(MDAO mdao) {
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

}
