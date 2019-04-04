package day13;

public class Emp_Test {
	private int num ;
	Emp_Data[] emp ;
	Data01 data;
	public Emp_Test() {
		this(14);
	}
	
	public Emp_Test(int num) {
		this.num = num ;
		emp = new Emp_Data[num];
		setData();
		toPrint();
	}
	
	public void setData() {
		data = new Data01();
		for(int i = 0 ; i < emp.length ; i++ ) {
			emp[i] = new Emp_Data(data.getEname()[i]);
			emp[i].setEno(data.getEno()[i]);
			emp[i].setJob(data.getJob()[i]);
			emp[i].setMgr(data.getMgr()[i]);
			emp[i].setHdate(data.getHdate()[i]);
			emp[i].setSal(data.getSal()[i]);
			emp[i].setComm(data.getComm()[i]);
			emp[i].setDno(data.getDno()[i]);
		}
	}
	
	public void toPrint() {
		System.out.printf("%6s | %7s | %10s | %4s | %10s | %5s | %4s | %4s \r\n", "empno", "ename", "j o b  ", "mgr", "hiredate ", "s a l", "comm", "dno");
		System.out.println("=======================================================================");
		for(Emp_Data d : emp) {
			System.out.printf("%6d | %7s | %10s | %4s | %10s | %5d | %4s | %4d \r\n", d.getEno(), d.getEname(), d.getJob(), d.getSmgr(), d.getHdate(), d.getSal(), d.getScomm(), d.getDno());
		}
		System.out.println("=======================================================================");
	}
	
	public static void main(String[] args) {
		new Emp_Test();
	}

}
