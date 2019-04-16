package com.andres.microservices;

public class LimitsConfiguration {

	private int maximun;
	private int minumun;
	
	
	protected LimitsConfiguration() {
		super();
		// TODO Auto-generated constructor stub
	}


	public LimitsConfiguration(int maximun, int minumun) {
		super();
		this.maximun = maximun;
		this.minumun = minumun;
	}


	public int getMaximun() {
		return maximun;
	}


	public void setMaximun(int maximun) {
		this.maximun = maximun;
	}


	public int getMinumun() {
		return minumun;
	}


	public void setMinumun(int minumun) {
		this.minumun = minumun;
	}
	
	
	
}
