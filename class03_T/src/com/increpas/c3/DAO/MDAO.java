package com.increpas.c3.DAO;

/*
	이 클래스는 호원에 관련된 데이터베이스 작업을 하는 클래스이다.
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
	
	// 회원 존재여부 확인 함수
	public int getMembCnt(String sid, String spw) {
		String sql = MSQL.getSQL(MSQL.SEL_CNT);
		pstmt = db.getPSTMT(sql);
		int cnt = 0 ;
		try {
			// 질의 명령 완성하고
			pstmt.setString(1, sid);
			pstmt.setString(2, spw);
			
			// 완성된 질의명령 데이터베이스에 보내고 결과받고
			rs = pstmt.executeQuery();
			
			// 데이터 꺼내고
			rs.next();	// 커서를 데이터가 있는 쪽으로 내리고
			cnt = rs.getInt("cnt");	// 데이터 꺼내고
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			db.close(rs);
			db.close(pstmt);
			db.close(con);
		}
		
		return cnt;
	}
	
	// 아이디 사용 카운트 반환 함수 ==> 0 면 사용가능한 아이디...
	public int getIdCnt(String sid) {
		// 할일
		// 질의명령 가져오고
		String sql = MSQL.getSQL(MSQL.SEL_ID);
		// PreparedStatement 만들고
		pstmt = db.getPSTMT(sql);
		int cnt = 0 ;
		try {
			// 질의 명령 완성하고
			pstmt.setString(1, sid);
			// 질의 명령 데이터베이스에 보내고 결과 받고
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
		// 데이터 보내고
		
		return cnt;
	}

}
