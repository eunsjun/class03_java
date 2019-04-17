package com.increpas.c3.DAO;

/*
	�� Ŭ������ ȣ���� ���õ� �����ͺ��̽� �۾��� �ϴ� Ŭ�����̴�.
 */
import java.sql.*;
import java.util.*;
import com.increpas.c3.DB.*;
import com.increpas.c3.VO.*;
import com.increpas.c3.SQL.*;
public class MDAO {
	C3JDBC db;
	Connection con;
	Statement stmt ;
	PreparedStatement pstmt;
	ResultSet rs;
	
	public MDAO() {
		db = new C3JDBC();
		con = db.getCon();
	}
	
	// ȸ�� ���翩�� Ȯ�� �Լ�
	public int getMembCnt(String sid, String spw) {
		String sql = MSQL.getSQL(MSQL.SEL_CNT);
		pstmt = db.getPSTMT(sql);
		int cnt = 0 ;
		try {
			// ���� ��� �ϼ��ϰ�
			pstmt.setString(1, sid);
			pstmt.setString(2, spw);
			
			// �ϼ��� ���Ǹ�� �����ͺ��̽��� ������ ����ް�
			rs = pstmt.executeQuery();
			
			// ������ ������
			rs.next();	// Ŀ���� �����Ͱ� �ִ� ������ ������
			cnt = rs.getInt("cnt");	// ������ ������
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			db.close(rs);
			db.close(pstmt);
			db.close(con);
		}
		
		return cnt;
	}
	
	// ���̵� ��� ī��Ʈ ��ȯ �Լ� ==> 0 �� ��밡���� ���̵�...
	public int getIdCnt(String sid) {
		// ����
		// ���Ǹ�� ��������
		String sql = MSQL.getSQL(MSQL.SEL_ID);
		// PreparedStatement �����
		pstmt = db.getPSTMT(sql);
		int cnt = 0 ;
		try {
			// ���� ��� �ϼ��ϰ�
			pstmt.setString(1, sid);
			// ���� ��� �����ͺ��̽��� ������ ��� �ް�
			rs = pstmt.executeQuery();
			rs.next();
			cnt = rs.getInt("cnt");
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			db.close(rs);
		}
		// ������ ������
		
		return cnt;
	}
	
	// �̸� �˻��ؼ� ī��Ʈ ��ȯ���ִ� �Լ�
	public ArrayList<String> getNameList() {
		ArrayList<String> list = new ArrayList<String>();
		// ����
		// ���Ǹ�� ��������
		String sql = MSQL.getSQL(MSQL.SEL_NAME_ALL);
		// PreparedStatement �����
		stmt = db.getSTMT();
		// ���� ��ɺ����� ��ȯ�� �ް�
		try {
			rs = stmt.executeQuery(sql);
			while(rs.next()) {
				String sname = (String) rs.getString("name");
				list.add(sname);
			}
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			db.close(rs);
		}
		// ������ ��������
		
		
		return list;
	}
	
	// ȸ�� ���� �Է��ϴ� �Լ�
	public void insertMember(MemberVO mvo) {
		// ȸ�� ������ ������ ������ �����Ƿ� VO Ŭ������ ��Ƽ� ����.
		// ����
		// ���Ǹ�� ��������
		String sql = MSQL.getSQL(MSQL.INSERT_MEMB);
		System.out.println(mvo.getId());
		System.out.println(mvo.getName());
		System.out.println(mvo.getPw());
		System.out.println(mvo.getMail());
		// PreparedStatement ��������
		pstmt = db.getPSTMT(sql);
		try {
			// ���Ǹ�� �ϼ��ϰ�
			pstmt.setString(1, mvo.getName());
			pstmt.setString(2, mvo.getId());
			pstmt.setString(3, mvo.getPw());
			pstmt.setString(4, mvo.getMail());
			// ���� ��� ������
			pstmt.execute();
			System.out.println(mvo.getId() + " ȸ�� ��� �Ϸ�!");
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			// �پ��͵� �ݾ��ְ�
			db.close(pstmt);
		}
	}

}
