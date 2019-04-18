package com.increpas.c3.SQL;

import java.util.*;
public class BSQL {
	public static final int SEL_BRD_ALL = 1001;
	
	public static final int INSERT_BRD = 3001;
	
	public static String getSQL(int code) {
		StringBuffer buff = new StringBuffer();
		switch(code) {
		case SEL_BRD_ALL:
			buff.append("SELECT ");
			buff.append("	b_no bno, ");
			buff.append("	b_mno mno, ");
			buff.append("	b_body body, ");
			buff.append("	b_date bdate ");
			buff.append("from ");
			buff.append("	board ");
			buff.append("WHERE ");
			buff.append("	b_isshow = 'Y' ");
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
