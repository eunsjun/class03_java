package com.increpas.c3.DAO;

/*
	이 클래스는 호원에 관련된 데이터베이스 작업을 하는 클래스이다.
 */
import java.sql.*;
import java.util.*;
import java.util.Date;

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
		}
		// 데이터 보내고
		
		return cnt;
	}
	
	// 이름 검색해서 카운트 반환해주는 함수
	public ArrayList<String> getNameList() {
		ArrayList<String> list = new ArrayList<String>();
		// 할일
		// 질의명령 가져오고
		String sql = MSQL.getSQL(MSQL.SEL_NAME_ALL);
		// PreparedStatement 만들고
		stmt = db.getSTMT();
		// 질의 명령보내고 반환값 받고
		try {
			rs = stmt.executeQuery(sql);
			while(rs.next()) {
				String sname = (String) rs.getString("name");
				list.add(sname);
			}
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			db.close(rs);
		}
		// 데이터 내보내고
		
		
		return list;
	}
	
	// 회원 정보 입력하는 함수
	public void insertMember(MemberVO mvo) {
		// 회원 정보는 갯수가 무진장 많으므로 VO 클래스에 담아서 받자.
		// 할일
		// 질의명령 가져오고
		String sql = MSQL.getSQL(MSQL.INSERT_MEMB);
		System.out.println(mvo.getId());
		System.out.println(mvo.getName());
		System.out.println(mvo.getPw());
		System.out.println(mvo.getMail());
		// PreparedStatement 가져오고
		pstmt = db.getPSTMT(sql);
		try {
			// 질의명령 완성하고
			pstmt.setString(1, mvo.getName());
			pstmt.setString(2, mvo.getId());
			pstmt.setString(3, mvo.getPw());
			pstmt.setString(4, mvo.getMail());
			// 질의 명령 보내고
			pstmt.execute();
			System.out.println(mvo.getId() + " 회원 등록 완료!");
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			// 다쓴것들 닫아주고
			db.close(pstmt);
		}
	}
	
	// 회원 전환번호 입력하는 함수
	public void setTel(ArrayList<String> id, ArrayList<String> tel) {
		// sql
		int cnt = 0;
		String sql = MSQL.getSQL(MSQL.UPDATE_TEL);
		pstmt = db.getPSTMT(sql);
		for(int i = 0 ; i < id.size(); i++ ) {
			try {
				pstmt.setString(1, tel.get(i));
				pstmt.setString(2, id.get(i));
				
				// 질의명령 보내기
				cnt = pstmt.executeUpdate();
			} catch(Exception e) {
				e.printStackTrace();
			}
			
			if(cnt == 0) {
				System.out.println(id.get(i)+ " 회원 전화번호 입력 실패");
			}
		}
		
		System.out.println("### 모든 회원 전화번호 입력 성공 ###");
	}
	
	
	// 이름을 입력하면 가입일을 시간까지 출력해주는 함수
	public void getJoin(String name) {
		// 질의 명령
		String sql = "SELECT m_id id, join_date join from member where m_name = ?";
		// PreparedStatement
		pstmt = db.getPSTMT(sql);
		
		try {
			// 질의명령 완성
			pstmt.setString(1, name);
			
			// 질의명령 보내고 데이터 받고
			rs = pstmt.executeQuery();
			
			// 데이터 꺼내고
			rs.next();
			String id = rs.getString("id");
//			Date date = rs.getDate("join");
			Time tt = rs.getTime("join");
			
			// 데이터 출력하고
			System.out.println(id + " 회원님 가입시간은 " /* + date + " " */+ tt + " 입니다.");
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	
	// 회원 정보 전체수정 함수
	public void setMembData(HashMap<String, ArrayList<String>> map) {
		ArrayList<String> name = map.get("name");
		ArrayList<String> id = map.get("id");
		ArrayList<String> mail = map.get("mail");
		ArrayList<String> tel = map.get("tel");
		
		// sql
		String sql = MSQL.getSQL(MSQL.UPDATE_MEMB);
		// PreparedStatement 준비
		pstmt = db.getPSTMT(sql);
		
		int cnt = 0 ;
		
		try {
			for(int i = 0 ; i < name.size(); i++ ) {
				//  질의명령 완성
				pstmt.setString(1, id.get(i));
				pstmt.setString(2, mail.get(i));
				pstmt.setString(3, tel.get(i));
				pstmt.setString(4, name.get(i));
				
				// 질의명령 보내고
				cnt = pstmt.executeUpdate();
				
				if(cnt == 0) {
					System.out.println(name.get(i) + " 회원 업데이트 에러");
				}
			}
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}
