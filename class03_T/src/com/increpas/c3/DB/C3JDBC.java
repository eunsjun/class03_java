package com.increpas.c3.DB;

/*
	 이 클래스는 인스턴스를 만드는 순간
	 드라이버를 로딩하고
	 커넥션을 얻어내 주는 클래스이다.
	 (new 시키는 순간 오라클에 접속해서 세션을 하나를 할당 받는 클래스이다.)
 */
import java.sql.*;
public class C3JDBC {
	private Connection con;
	public C3JDBC() {
		//할일
		try {
			// 1. 드라이버 로딩
			Class.forName("oracle.jdbc.driver.OracleDriver");
			// 2. 커넥션 얻고
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user = "increpas";
			String password = "increpas";
			con = DriverManager.getConnection(url, user, password);
		} catch(Exception e) {
			System.out.println("데이터베이스 연결 실패");
			e.printStackTrace();
		}
	}
	
	// 3. Statement 얻는 함수 작성하고
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
	
	// 4. PreparedStatement 얻는 함수 작성하고
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
	
	// 5. 닫는 함수 작성하고
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
