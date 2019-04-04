package day13;

public class Emp_Data {
	private int eno;
	private String ename;
	private String job;
	private int mgr;
	private String hdate;
	private int sal;
	private int comm;
	private int dno;
	
	public Emp_Data() {
	}
	public Emp_Data(String ename) {
		this.ename = ename ;
	}
	public Emp_Data(String ename, String job, int mgr) {
		this.ename = ename ;
		this.job = job;
		this.mgr = mgr;
	}
	public Emp_Data(String ename, int sal) {
		this.ename = ename ;
		this.sal = sal ;
	}
	
	// Getters & Setters
	public int getEno() {
		return eno;
	}
	public void setEno(int eno) {
		this.eno = eno;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	public int getMgr() {
		return mgr;
	}
	public String getSmgr() {
		String smgr = "null";
		if(mgr != -1) {
			smgr = mgr + "";
		}
		return smgr;
	}
	public void setMgr(int mgr) {
		this.mgr = mgr;
	}
	public String getHdate() {
		return hdate;
	}
	public void setHdate(String hdate) {
		this.hdate = hdate;
	}
	public int getSal() {
		return sal;
	}
	public void setSal(int sal) {
		this.sal = sal;
	}
	public int getComm() {
		return comm;
	}
	public String getScomm() {
		String scomm = "null";
		if(comm != -1) {
			scomm = comm + "";
		}
		return scomm;
	}
	public void setComm(int comm) {
		this.comm = comm;
	}
	public int getDno() {
		return dno;
	}
	public void setDno(int dno) {
		this.dno = dno;
	}
	

}
