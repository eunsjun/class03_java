package day21;

/*
	1. emp ���̺��� ������� �����ȣ, ����̸�, �޿��� ��ȸ�ϼ���.
	
	2. �μ���ȣ�� �Է��ϸ� 1���� ����� �޴� ���� ����� �ۼ��ϰ� ��ȸ�ϼ���.
	
	3. 1, 2���� �ذ�Ǹ� �÷��ǿ� ��ȸ�� ����� ��Ƽ� ����ϼ���.
	
	4. 3���� �ذ�Ǹ� VO Ŭ������ ��Ƽ� �ٽ� �÷��ǿ� ��Ƽ� ����ϼ���.
	
 */

import java.sql.*;
import DB.*;
public class HW01 {
	CJDBC db;
	Connection con;
	Statement stmt;
	PreparedStatement pstmt;
	ResultSet rs;
	
	public HW01() {
		db = new CJDBC();
		con = db.getCon();
		stmt = db.getSTMT();
//		pstmt = db.getPSTMT("");
	}

	public static void main(String[] args) {
		new HW01();
	}

}
