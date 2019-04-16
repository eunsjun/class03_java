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
			System.out.println("### DB ���� ###");
		}
	}
	
	// Statement �� �䱸�ϸ� ��ȯ���ִ� �Լ�
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
	
	// PreparedStatement �� �䱸�ϸ� ��ȯ���ִ� �Լ�
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
	
	// ��ü�� ����� �ϸ� �������� �ݾ���� �� ���̴�.
	// stmt �Ǵ� pstmt�� ����� ������ �ݾ���� �� ���̰�
	// �� �ݴ� ����� �Լ��� ����� ����.
	public void close(Object o) {
		// Connection, Statement, PreparedStatement, ResultSet �� ��� ���� �� �ִ� Ÿ���� Object �̹Ƿ�
		// �Ű������� Object Ÿ������ �Ѵ�. ==> �Լ��� ���뼺�� ��������.
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
