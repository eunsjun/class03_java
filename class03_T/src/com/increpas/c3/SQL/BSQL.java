package com.increpas.c3.SQL;

import java.util.*;
public class BSQL {
	public static final int SEL_BRD_ALL = 1001;
	public static final int SEL_ID_CNT = 1005;
	public static final int SEL_ID_CONTENT = 1006;
	
	public static final int INSERT_BRD = 3001;
	
	public static String getSQL(int code) {
		StringBuffer buff = new StringBuffer();
		switch(code) {
		case SEL_BRD_ALL:
			buff.append("SELECT ");
			buff.append("	b_no bno, ");
			buff.append("	b_mno mno, ");
			buff.append("	(SELECT m_id FROM member where m_no = b_mno) id, ");
			buff.append("	b_body body, ");
			buff.append("	b_date bdate ");
			buff.append("from ");
			buff.append("	board ");
			buff.append("WHERE ");
			buff.append("	b_isshow = 'Y' ");
			buff.append("ORDER BY ");
			buff.append("	b_date desc ");
			break;
		case SEL_ID_CONTENT:
			buff.append("SELECT ");
			buff.append("	b_no bno, ");
			buff.append("	b_mno mno, ");
			buff.append("	b_body body, ");
			buff.append("	b_date bdate ");
			buff.append("from ");
			buff.append("	board ");
			buff.append("WHERE ");
			buff.append("	b_isshow = 'Y' ");
			buff.append("	AND b_mno = ( ");
			buff.append("					SELECT ");
			buff.append("						m_no ");
			buff.append("					FROM  ");
			buff.append("						member  ");
			buff.append("					WHERE  ");
			buff.append("						m_id = ?  ");
			buff.append("				) ");
			break;
		case SEL_ID_CNT:
			buff.append("SELECT ");
			buff.append("	count(*) cnt ");
			buff.append("from ");
			buff.append("	board ");
			buff.append("WHERE ");
			buff.append("	b_isshow = 'Y' ");
			buff.append("	AND b_mno = ( ");
			buff.append("					SELECT ");
			buff.append("						m_no ");
			buff.append("					FROM  ");
			buff.append("						member  ");
			buff.append("					WHERE  ");
			buff.append("						m_id = ?  ");
			buff.append("				) ");
			break;
		case INSERT_BRD:
			buff.append("INSERT INTO ");
			buff.append("	board( ");
			buff.append("		b_no, b_mno, b_body ");
			buff.append("	) ");
			buff.append("VALUES( ");
			buff.append("	(SELECT NVL(MAX(b_no)+1, 10001) FROM board), ");
			buff.append("	(SELECT m_no FROM member WHERE m_id = ? ), ");
			buff.append("	? ");
			buff.append(") ");
			break;
		}
		return buff.toString();
	}
}
