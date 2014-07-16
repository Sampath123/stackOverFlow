package com.hashedin.model;

import java.util.Date;

public class CommentsCountOverTime {
	private Date date;
	private long count;
	
	
	
	public CommentsCountOverTime() {
		super();
		// TODO Auto-generated constructor stub
	}
	public CommentsCountOverTime(Date date, long count) {
		super();
		this.date = date;
		this.count = count;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public long getCount() {
		return count;
	}
	public void setCount(long count) {
		this.count = count;
	}
	

}
