package com.increpas.c3.DAO;

import java.util.*;
import java.sql.*;

import com.increpas.c3.VO.*;
import com.increpas.c3.DB.*;
import com.increpas.c3.SQL.BSQL;

/*
	board 테이블에 질의 명령을 보내고 데이터를 받는 클래스
	board테이블에 관련된 데이터베이스 작업은 모두 여기서 하면 된다.
 */
public class BDAO {
	C3JDBC db;
	Connection con;
	Statement stmt;
	PreparedStatement pstmt;
	ResultSet rs;
	
	public BDAO() {
		db = new C3JDBC();
		con = db.getCon();
	}
	
	public BDAO(MDAO mdao) {
		db = mdao.db;
		con = mdao.con;
	}
	
	public BDAO(C3JDBC db) {
		this.db = db;
		con = db.getCon();
	}
	
	// board 테이블에 글 등록하는 함수
	public void insertBRD(String id, String msg) {
		// 할일
		// 질의명령 가져오고
		String sql = BSQL.getSQL(BSQL.INSERT_BRD);
		// pstmt 가져오고
		pstmt = db.getPSTMT(sql);
		
		try {
			// 질의 명령 완성하고
			pstmt.setString(1, id);
			pstmt.setString(2, msg);
			// 질의명령 보내고 
			pstmt.execute();
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			db.close(pstmt);
		}
	}
	
	// 게시판 테이블의 모든 데이터 가져오는 함수
	public ArrayList<BoardVO> getAll(){
		// ArrayList 준비
		ArrayList<BoardVO> list = new ArrayList<BoardVO>();
		// 질의명령 준비
		String sql = BSQL.getSQL(BSQL.SEL_BRD_ALL);
		// stmt 준비
		stmt = db.getSTMT();
		
		// BoardVO 변수 선언
		BoardVO bvo;
		try {
			// 질의 명령 보내고 데이터 받고
			rs = stmt.executeQuery(sql);
			// 데이터 뽑아서 리스트에 저장하고
			while(rs.next()) {
				// vo 준비
				bvo = new BoardVO();
				// 데이터 뽑아서 담기
				bvo.setbNo(rs.getInt("bno"));
				bvo.setmNo(rs.getInt("mno"));
				bvo.setBody(rs.getString("body"));
				bvo.setbDate(rs.getDate("bdate"));
				bvo.setbTime(rs.getTime("bdate"));
				
				// list에 담기
				list.add(bvo);
			}
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			db.close(rs);
			db.close(stmt);
		}
		// 데이터 내보내고
		return list;
	}

}
