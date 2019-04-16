package SQL;

public class EmpSQL {
	public static final int SEL_ALL_EMP = 1001;
	public static final int SEL_DNO_EMP = 1002;
	
	public static String getSQL(int code) {
		StringBuffer buff = new StringBuffer();
		
		switch(code) {
		case SEL_ALL_EMP:
			buff.append("SELECT ");
			buff.append("	* ");
			buff.append("FROM ");
			buff.append("	emp");
			break;
		case SEL_DNO_EMP:
			buff.append("SELECT ");
			buff.append("	* ");
			buff.append("FROM ");
			buff.append("	emp ");
			buff.append("WHERE ");
			buff.append("	deptno = ?");
			break;
		}
		
		return buff.toString();
	}

}
