package DB;

import java.sql.*;
public class CJDBC {
	private Connection con;
	
	public CJDBC() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user ="increpas";
			String password = "increpas";
			con = DriverManager.getConnection(url, user, password);
		}catch(Exception e) {
			System.out.println("### DB 실패 ###");
		}
	}
	
	// Statement 를 요구하면 반환해주는 함수
	public Statement getSTMT() {
		Statement stmt = null;
		try {
			stmt = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, 
										ResultSet.CONCUR_READ_ONLY);
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		return stmt;
	}
	
	// PreparedStatement 를 요구하면 반환해주는 함수
	public PreparedStatement getPSTMT(String sql) {
		PreparedStatement pstmt = null;
		try {
			pstmt = con.prepareStatement(sql, ResultSet.TYPE_SCROLL_INSENSITIVE, 
												ResultSet.CONCUR_READ_ONLY);
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		return pstmt;
	}
	
	// 객체를 사용을 하면 언젠가는 닫아줘야 할 것이다.
	// stmt 또는 pstmt를 사용이 끝나면 닫아줘야 할 것이고
	// 그 닫는 기능을 함수로 만들어 놓자.
	public void close(Object o) {
		// Connection, Statement, PreparedStatement, ResultSet 를 모두 담을 수 있는 타입은 Object 이므로
		// 매개변수는 Object 타입으로 한다. ==> 함수의 재사용성이 높아진다.
		try {
			if(o instanceof Connection) {
				((Connection)o).close();
			} else if(o instanceof Statement) {
				((Statement)o).close();
			} else if(o instanceof PreparedStatement) {
				((PreparedStatement)o).close();
			} else if(o instanceof ResultSet) {
				((ResultSet)o).close();
			}
		} catch(Exception e) {}
	}

	public Connection getCon() {
		return con;
	}
	
}
