package day18;

import java.util.*;
public class Score {
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
	public void setCalc() {
		this.total = java + oracle + jsp + spring + web + js;
		this.avg = total / 6f;
	}
	public float getAvg() {
		return avg;
	}
	public void setAvg(float avg) {
		this.avg = avg;
	}
	public void setAvg() {
		this.avg = total / 6f;
	}
	
	public void toPrint() {
		System.out.printf("%3s - %3d | %3d | %3d | %3d | %3d | %3d | %3d | %3.2f\r\n", name, java, oracle, jsp, spring, web, js, total, avg);
	}
}
