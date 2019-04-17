package com.increpas.c3.VO;

import java.util.*;
import java.sql.Time;
import java.text.*;
public class MemberVO {
	private int mNo;
	private String name, pw, id, mail, isShow, sDate;
	private Date join;
	private Time sTime;
	public int getmNo() {
		return mNo;
	}
	public void setmNo(int mNo) {
		this.mNo = mNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPw() {
		return pw;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	public String getIsShow() {
		return isShow;
	}
	public void setIsShow(String isShow) {
		this.isShow = isShow;
	}
	public String getsDate() {
		return sDate;
	}
	public void setsDate(String sDate) {
		this.sDate = sDate;
	}
	public void setsDate() {
		SimpleDateFormat pattern = new SimpleDateFormat("yyyy³â MM¿ù ddÀÏ HH:mm:ss");
		String str = pattern.format(join);
		this.sDate = str;
	}
	public Date getJoin() {
		return join;
	}
	public void setJoin(Date join) {
		this.join = join;
	}
	
}
