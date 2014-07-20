package com.hashedin.model;

public class TopUserCommentCount {

	private String name;
	private long count;
	
	
	public TopUserCommentCount() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public TopUserCommentCount(String name, long count) {
		super();
		this.name = name;
		this.count = count;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getCount() {
		return count;
	}
	public void setCount(long count) {
		this.count = count;
	}

	

}
