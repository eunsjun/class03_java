package day21;

/*
	1. emp 테이블에서 모든사원의 사원번호, 사원이름, 급여를 조회하세요.
	
	2. 부서번호를 입력하면 1번의 결과를 받는 질의 명령을 작성하고 조회하세요.
	
	3. 1, 2번이 해결되면 컬렉션에 조회된 결과를 담아서 출력하세요.
	
	4. 3번이 해결되면 VO 클래스에 담아서 다시 컬렉션에 담아서 출력하세요.
	
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
			// 질의명령 완성하고
			pstmt.setInt(1, 10);
			// 완성된 질의명령 보내고
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				EmpVO vo = new EmpVO();
				// vo 에 데이터 입력하고
				vo.setEno(rs.getInt("empno"));
				vo.setName(rs.getString("ename"));
				vo.setDno(rs.getInt("deptno"));
				list.add(vo);
			}
			
		} catch (SQLException e) {}
		
		// 출력
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
