package etc;

public class Score2 {
	private String name;
	private int java, oracle, jsp, spring, web, js, total;
	private float avg;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getJava() {
		return java;
	}
	public void setJava(int java) {
		this.java = java;
	}
	public int getOracle() {
		return oracle;
	}
	public void setOracle(int oracle) {
		this.oracle = oracle;
	}
	public int getJsp() {
		return jsp;
	}
	public void setJsp(int jsp) {
		this.jsp = jsp;
	}
	public int getSpring() {
		return spring;
	}
	public void setSpring(int spring) {
		this.spring = spring;
	}
	public int getWeb() {
		return web;
	}
	public void setWeb(int web) {
		this.web = web;
	}
	public int getJs() {
		return js;
	}
	public void setJs(int js) {
		this.js = js;
	}
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	public void setTotal() {
		this.total = java + oracle + jsp + spring + web + js;
	}
	public float getAvg() {
		return avg;
	}
	public void setAvg(float avg) {
		this.avg = avg;
	}
	public void setAvg() {
		this.avg = Math.round(total / 6f * 100) / 100;
	}
	public void setCalc() {
		setTotal();
		setAvg();
	}
	public String toString() {
		return "Name : " + name + 
				"\nTotal : " + total +
				"\nAverage : " + avg +
				"\nJava : " + java +
				"\nOracle : " + oracle + 
				"\nJsp : " + jsp +
				"\nSpring : " + spring + 
				"\nWeb : " + web + 
				"\nJs : " + js;
	}

}
