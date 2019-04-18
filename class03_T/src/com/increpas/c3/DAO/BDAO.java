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
	MDAO mdao;
	public BDAO() {
		db = new C3JDBC();
		con = db.getCon();
	}
	
	public BDAO(MDAO mdao) {
		this.mdao = mdao;
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
				bvo.setId(rs.getString("id"));
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
	
	// 아이디로 작성된 글 수 반환해주는 함수
	// 게시판 테이블에는 아이디를 저장하지 않았다.
	public int getIdCnt(String sid) {
		int cnt = 0 ;
		// 할일
		// 질의명령 준비
		String sql = BSQL.getSQL(BSQL.SEL_ID_CNT);
		// pstmt 준비하고
		pstmt = db.getPSTMT(sql);
		try {
			// 질의명령 완성하고
			pstmt.setString(1, sid);
			// 질의명령 보내고 데이터 받고
			rs = pstmt.executeQuery();
			rs.next();
			cnt = rs.getInt("cnt");
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			db.close(rs);
			db.close(pstmt);
		}
		// 데이터 내보내고
		
		return cnt;
	}
	
	
	// 입력된 아이디로 작성된 글 조회하는 함수
	public ArrayList<BoardVO> getIdContent(String sid){
		ArrayList<BoardVO> list = new ArrayList<BoardVO>();
		// 할일
		// 질의명령 가져오고
		String sql = BSQL.getSQL(BSQL.SEL_ID_CONTENT);
		// pstmt 가져오고
		pstmt = db.getPSTMT(sql);
		try{
			// 질의명령 완성
			pstmt.setString(1, sid);
			// 질의명령 데이터베이스에 보내고 결과 받고
			rs = pstmt.executeQuery();
			// 받은 결과 꺼내서 list 에 담고
			while(rs.next()) {
				BoardVO bvo = new BoardVO();
				bvo.setbNo(rs.getInt("bno"));
				bvo.setmNo(rs.getInt("mno"));
				bvo.setBody(rs.getString("body"));
				bvo.setbDate(rs.getDate("bdate"));
				bvo.setbTime(rs.getTime("bdate"));
				bvo.setId(sid);
				
				list.add(bvo);
			}
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			db.close(rs);
			db.close(pstmt);
		}
		// list 반환해준다.
		return list;
	}
}
