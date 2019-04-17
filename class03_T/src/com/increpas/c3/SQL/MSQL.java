package com.increpas.c3.SQL;

public class MSQL {
	public static final int MEMBER_ALL = 1001;
	public static final int SEL_CNT = 1002;
	public static final int SEL_ID = 1003;
	public static final int SEL_NAME_CNT = 1004;
	public static final int SEL_NAME_ALL = 1005;
	
	public static final int UPDATE_TEL = 2001;
	
	public static final int INSERT_MEMB = 3001;
	
	public static String getSQL(int code) {
		StringBuffer buff = new StringBuffer();
		switch(code) {
		case MEMBER_ALL:
			buff.append("SELECT ");
			buff.append("	* ");
			buff.append("FROM ");
			buff.append("	member ");
			buff.append("WHERE ");
			buff.append("	isshow = 'Y' ");
			break;
		case SEL_CNT:
			buff.append("SELECT ");
			buff.append("	count(*) cnt ");
			buff.append("FROM ");
			buff.append("	member ");
			buff.append("WHERE ");
			buff.append("	m_id = ? ");
			buff.append("	AND m_pw = ? ");
			break;
		case SEL_ID:
			buff.append("SELECT ");
			buff.append("	count(*) cnt ");
			buff.append("FROM ");
			buff.append("	member ");
			buff.append("WHERE ");
			buff.append("	m_id = ? ");
			break;
		case SEL_NAME_CNT:
			buff.append("SELECT ");
			buff.append("	count(*) cnt ");
			buff.append("FROM ");
			buff.append("	member ");
			buff.append("WHERE ");
			buff.append("	m_name = ? ");
			break;
		case SEL_NAME_ALL:
			buff.append("SELECT ");
			buff.append("	m_name name ");
			buff.append("FROM ");
			buff.append("	member ");
			break;
		case UPDATE_TEL:
			buff.append("UPDATE ");
			buff.append("	member ");
			buff.append("SET ");
			buff.append("	m_tel = ? ");
			buff.append("WHERE ");
			buff.append("	m_id = ? ");
			break;
		case INSERT_MEMB:
			buff.append("INSERT INTO ");
			buff.append("	member( ");
			buff.append("	m_no, m_name, m_id, m_pw, m_mail ");
			buff.append(") ");
			buff.append("VALUES( ");
			buff.append("	( ");
			buff.append("		SELECT ");
			buff.append("			NVL(MAX(M_NO) + 1, 1001) ");
			buff.append("		FROM ");
			buff.append("			member ");
			buff.append("	), ");
			buff.append("	?, ?, ?, ? ");
			buff.append(")");
			break;
		}
		
		return buff.toString();
	}
}
