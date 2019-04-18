package com.increpas.c3.VO;

import java.util.*;
import java.sql.Time;
import java.text.*;
public class BoardVO {
	private int bNo, mNo;
	private String id, body, isShow, sDate;
	private Date bDate;
	private Time bTime;
	public int getbNo() {
		return bNo;
	}
	public void setbNo(int bNo) {
		this.bNo = bNo;
	}
	public int getmNo() {
		return mNo;
	}
	public void setmNo(int mNo) {
		this.mNo = mNo;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getBody() {
		return body;
	}
	public void setBody(String body) {
		this.body = body;
	}
	public String getIsShow() {
		return isShow;
	}
	public void setIsShow(String isShow) {
		this.isShow = isShow;
	}
	public Date getbDate() {
		return bDate;
	}
	public void setbDate(Date bDate) {
		this.bDate = bDate;
	}
	public String getsDate() {
		return sDate;
	}
	public void setsDate(String sDate) {
		this.sDate = sDate;
	}
	public void setsDate() {
		SimpleDateFormat pattern = new SimpleDateFormat("yyyy³â MM¿ù ddÀÏ HH:mm:ss");
		this.sDate = pattern.format(bDate);
	}
	public Time getbTime() {
		return bTime;
	}
	public void setbTime(Time bTime) {
		this.bTime = bTime;
	}
}
