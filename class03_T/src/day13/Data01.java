package day13;

public class Data01 {
	private int[] eno = {7782, 7839, 7934, 7566, 7902, 7876, 7369, 7788, 7521, 7844, 7499, 7900, 7698, 7654};;
	private String[] ename = {"CLARK", "KING", "MILLER", "JONES", "FORD", "ADAMS", "SMITH", "SCOTT", "WARD", "TURNER", "ALLEN", "JAMES", "BLAKE", "MARTIN"};
	private String[] job = {"MANAGER", "PRESIDENT", "CLERK", "MANAGER",
					"ANALYST", "CLERK", "CLERK", "ANALYST", "SALESMAN", "SALESMAN",
					"SALESMAN", "CLERK", "MANAGER", "SALESMAN"};
	private int[] mgr = {7839, -1, 7782, 7839, 7566, 7788, 7902, 7566, 7698, 7698, 7698, 7698, 7839, 7698};
	private String[] hdate = {"1981/06/09", "1981/11/17", "1982/01/23", "1981/04/02", "1981/12/03", "1983/01/12", "1980/12/17",
			"1982/12/09", "1981/02/22", "1981/09/08", "1981/02/20", "1981/12/03", "1981/05/01", "1981/09/28"};
	private int[] sal = {2450, 5000, 1300, 2975, 3000, 1100, 800, 3000, 1250, 1500, 1600, 950, 2850, 1250};
	private int[] comm = {-1, -1, -1, -1, -1, -1, -1, -1, 500, -1, 300, -1, -1, 1400};
	private int[] dno = {10, 10, 10, 20, 20, 20, 20, 20, 30, 30, 30, 30, 30, 30};
	public int[] getEno() {
		return eno;
	}
	public String[] getEname() {
		return ename;
	}
	public String[] getJob() {
		return job;
	}
	public int[] getMgr() {
		return mgr;
	}
	public String[] getHdate() {
		return hdate;
	}
	public int[] getSal() {
		return sal;
	}
	public int[] getComm() {
		return comm;
	}
	public int[] getDno() {
		return dno;
	}
	
}
