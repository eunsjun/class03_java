package day14;

/*
 * 우리반 학생 한명의 시험정보를 저장할 클래스
 */

public class Class03 {
	private String name;
	private int java, oracle, jsp, spring, web, js, total, length;
	private float avg;
	public Class03() {
	}
	public Class03(String name) {
		try{
			setName(name);
		} catch(NullPointerException e) {
			System.out.println("이름이 입력되어야 합니다.");
		}
	}
	public Class03(String name, int java, int oracle, int jsp, int spring, int web, int js) {
		try {
			setName(name);
			setJava(java);
			setJava(oracle);
			setJava(jsp);
			setJava(spring);
			setJava(web);
			setJava(js);
		} catch (IllegalArgumentException e) {
			System.out.println("10점 이하의 점수가 입력되었습니다.");
			System.out.println("정보입력을 취소합니다.");
		} catch (NullPointerException e) {
			System.out.println("이름이 입력되어야 합니다.");
			System.out.println("정보입력을 취소합니다.");
		}
		setTotal();
		setAvg();
	}
	
	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}
	public void setLength() {
		this.length += 1;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) throws NullPointerException {
		if(name.equals("") || name == null) throw new NullPointerException();
		this.name = name;
	}
	public int getJava() {
		return java;
	}
	public void setJava(int java) throws IllegalArgumentException {
		if(java <= 10) throw new IllegalArgumentException();
		this.java = java;
//		length += 1;
		setLength();
	}
	public int getOracle() {
		return oracle;
	}
	public void setOracle(int oracle) throws IllegalArgumentException {
		if(oracle <= 10) throw new IllegalArgumentException();
		this.oracle = oracle;
		length += 1;
	}
	public int getJsp() {
		return jsp;
	}
	public void setJsp(int jsp) throws IllegalArgumentException {
		if(jsp <= 10) throw new IllegalArgumentException();
		this.jsp = jsp;
		length += 1;
	}
	public int getSpring() {
		return spring;
	}
	public void setSpring(int spring) throws IllegalArgumentException {
		if(spring <= 10) throw new IllegalArgumentException();
		this.spring = spring;
		length += 1;
	}
	public int getWeb() {
		return web;
	}
	public void setWeb(int web) throws IllegalArgumentException {
		if(web <= 10) throw new IllegalArgumentException();
		this.web = web;
		length += 1;
	}
	public int getJs() {
		return js;
	}
	public void setJs(int js) throws IllegalArgumentException {
		if(js <= 10) throw new IllegalArgumentException();
		this.js = js;
		length += 1;
	}
	public int getTotal() {
		return total;
	}
	public void setTotal() {
		this.total = java + oracle + jsp + spring + web + js;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	public float getAvg() {
		return avg;
	}
	public void setAvg(float avg) {
		this.avg = avg;
	}
	public void setAvg() throws ArithmeticException {
		this.avg = (float)total / length ;
	}
	
}
