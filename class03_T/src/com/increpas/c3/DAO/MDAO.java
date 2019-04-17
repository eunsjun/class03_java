package com.increpas.c3.DAO;

/*
	�� Ŭ������ ȣ���� ���õ� �����ͺ��̽� �۾��� �ϴ� Ŭ�����̴�.
 */
import java.sql.*;
import java.util.*;
import java.util.Date;

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
	
	// ȸ�� ��ȯ��ȣ �Է��ϴ� �Լ�
	public void setTel(ArrayList<String> id, ArrayList<String> tel) {
		// sql
		int cnt = 0;
		String sql = MSQL.getSQL(MSQL.UPDATE_TEL);
		pstmt = db.getPSTMT(sql);
		for(int i = 0 ; i < id.size(); i++ ) {
			try {
				pstmt.setString(1, tel.get(i));
				pstmt.setString(2, id.get(i));
				
				// ���Ǹ�� ������
				cnt = pstmt.executeUpdate();
			} catch(Exception e) {
				e.printStackTrace();
			}
			
			if(cnt == 0) {
				System.out.println(id.get(i)+ " ȸ�� ��ȭ��ȣ �Է� ����");
			}
		}
		
		System.out.println("### ��� ȸ�� ��ȭ��ȣ �Է� ���� ###");
	}
	
	
	// �̸��� �Է��ϸ� �������� �ð����� ������ִ� �Լ�
	public void getJoin(String name) {
		// ���� ���
		String sql = "SELECT m_id id, join_date join from member where m_name = ?";
		// PreparedStatement
		pstmt = db.getPSTMT(sql);
		
		try {
			// ���Ǹ�� �ϼ�
			pstmt.setString(1, name);
			
			// ���Ǹ�� ������ ������ �ް�
			rs = pstmt.executeQuery();
			
			// ������ ������
			rs.next();
			String id = rs.getString("id");
//			Date date = rs.getDate("join");
			Time tt = rs.getTime("join");
			
			// ������ ����ϰ�
			System.out.println(id + " ȸ���� ���Խð��� " /* + date + " " */+ tt + " �Դϴ�.");
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	
	// ȸ�� ���� ��ü���� �Լ�
	public void setMembData(HashMap<String, ArrayList<String>> map) {
		ArrayList<String> name = map.get("name");
		ArrayList<String> id = map.get("id");
		ArrayList<String> mail = map.get("mail");
		ArrayList<String> tel = map.get("tel");
		
		// sql
		String sql = MSQL.getSQL(MSQL.UPDATE_MEMB);
		// PreparedStatement �غ�
		pstmt = db.getPSTMT(sql);
		
		int cnt = 0 ;
		
		try {
			for(int i = 0 ; i < name.size(); i++ ) {
				//  ���Ǹ�� �ϼ�
				pstmt.setString(1, id.get(i));
				pstmt.setString(2, mail.get(i));
				pstmt.setString(3, tel.get(i));
				pstmt.setString(4, name.get(i));
				
				// ���Ǹ�� ������
				cnt = pstmt.executeUpdate();
				
				if(cnt == 0) {
					System.out.println(name.get(i) + " ȸ�� ������Ʈ ����");
				}
			}
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}
