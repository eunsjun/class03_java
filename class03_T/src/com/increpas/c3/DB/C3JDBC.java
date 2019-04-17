package com.increpas.c3.DB;

/*
	 �� Ŭ������ �ν��Ͻ��� ����� ����
	 ����̹��� �ε��ϰ�
	 Ŀ�ؼ��� �� �ִ� Ŭ�����̴�.
	 (new ��Ű�� ���� ����Ŭ�� �����ؼ� ������ �ϳ��� �Ҵ� �޴� Ŭ�����̴�.)
 */
import java.sql.*;
public class C3JDBC {
	private Connection con;
	public C3JDBC() {
		//����
		try {
			// 1. ����̹� �ε�
			Class.forName("oracle.jdbc.driver.OracleDriver");
			// 2. Ŀ�ؼ� ���
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user = "increpas";
			String password = "increpas";
			con = DriverManager.getConnection(url, user, password);
		} catch(Exception e) {
			System.out.println("�����ͺ��̽� ���� ����");
			e.printStackTrace();
		}
	}
	
	// 3. Statement ��� �Լ� �ۼ��ϰ�
	public Statement getSTMT() {
		Statement stmt = null;
		try {
			stmt = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, 
												ResultSet.CONCUR_READ_ONLY);
		} catch(Exception e) {
			System.out.println("### getSTMT ERROR ###");
			e.printStackTrace();
		}
		
		return stmt;
	}
	
	// 4. PreparedStatement ��� �Լ� �ۼ��ϰ�
	public PreparedStatement getPSTMT(String sql) {
		PreparedStatement pstmt = null;
		try {
			pstmt = con.prepareStatement(sql, ResultSet.TYPE_SCROLL_INSENSITIVE, 
														ResultSet.CONCUR_READ_ONLY);
		}catch(Exception e) {
			System.out.println("### PreparedStatement Get ERROR ###");
			e.printStackTrace();
		}
		return pstmt;
	}
	
	// 5. �ݴ� �Լ� �ۼ��ϰ�
	public void close(Object o) {
		try {
			if(o instanceof Connection) {
				((Connection) o).close();
			} else if(o instanceof Statement) {
				((Statement) o).close();
			} else if(o instanceof PreparedStatement) {
				((PreparedStatement) o).close();
			} else if(o instanceof ResultSet) {
				((ResultSet) o).close();
			}
		} catch(Exception e) {}
	}
	
	public Connection getCon() {
		return con;
	}
}
