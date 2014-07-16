package com.hashedin.model;


public class TopUserCommentCount {
	
	private long id;
	private long count;
	public TopUserCommentCount(long id, long count) {
		super();
		this.id = id;
		this.count = count;
	}
	public TopUserCommentCount() {
		super();
		// TODO Auto-generated constructor stub
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public long getCount() {
		return count;
	}
	public void setCount(long count) {
		this.count = count;
	}
	
	
	
}
