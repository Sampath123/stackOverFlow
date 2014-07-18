package com.hashedin.model;

public class ReputationClass {
	private long reputation;
	private long count;
	public long getCount() {
		return count;
	}
	public void setCount(long count) {
		this.count = count;
	}
	public long getReputation() {
		return reputation;
	}
	public void setReputation(long reputation) {
		this.reputation = reputation;
	}
	public ReputationClass(long reputation, long count) {
		super();
		this.reputation = reputation;
		this.count = count;
	}
	public ReputationClass() {
		super();
		// TODO Auto-generated constructor stub
	}
	

}
