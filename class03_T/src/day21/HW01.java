package day21;

/*
	1. emp ���̺��� ������� �����ȣ, ����̸�, �޿��� ��ȸ�ϼ���.
	
	2. �μ���ȣ�� �Է��ϸ� 1���� ����� �޴� ���� ����� �ۼ��ϰ� ��ȸ�ϼ���.
	
	3. 1, 2���� �ذ�Ǹ� �÷��ǿ� ��ȸ�� ����� ��Ƽ� ����ϼ���.
	
	4. 3���� �ذ�Ǹ� VO Ŭ������ ��Ƽ� �ٽ� �÷��ǿ� ��Ƽ� ����ϼ���.
	
 */

import java.util.*;
import java.sql.*;
import DB.*;
import SQL.*;
import VO.*;
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
		
		String sql = EmpSQL.getSQL(EmpSQL.SEL_DNO_EMP);
//		System.out.println(sql);
		pstmt = db.getPSTMT(sql);
		ArrayList<EmpVO> list = new ArrayList<EmpVO>(); 
		try {
			// ���Ǹ�� �ϼ��ϰ�
			pstmt.setInt(1, 10);
			// �ϼ��� ���Ǹ�� ������
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				EmpVO vo = new EmpVO();
				// vo �� ������ �Է��ϰ�
				vo.setEno(rs.getInt("empno"));
				vo.setName(rs.getString("ename"));
				vo.setDno(rs.getInt("deptno"));
				list.add(vo);
			}
			
		} catch (SQLException e) {}
		
		// ���
		for(int i = 0 ; i < list.size() ; i++ ) {
			System.out.println("name : " + list.get(i).getName());
			System.out.println("empno : " + list.get(i).getEno());
			System.out.println("deptno : " + list.get(i).getDno());
			System.out.println("=================================");
		}
	}

	public static void main(String[] args) {
		new HW01();
	}

}
