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
			db.close(pstmt);
			db.close(con);
		}
		// ������ ������
		
		return cnt;
	}

}
