package day21;

/*
	1. emp 테이블에서 모든사원의 사원번호, 사원이름, 급여를 조회하세요.
	
	2. 부서번호를 입력하면 1번의 결과를 받는 질의 명령을 작성하고 조회하세요.
	
	3. 1, 2번이 해결되면 컬렉션에 조회된 결과를 담아서 출력하세요.
	
	4. 3번이 해결되면 VO 클래스에 담아서 다시 컬렉션에 담아서 출력하세요.
	
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
