package com.slokam.clone;

public class Passport implements Cloneable{

	@Override
	public Object clone() throws CloneNotSupportedException {
		
		return super.clone();
	}
	
	private int id;
	private String passNum;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getPassNum() {
		return passNum;
	}
	public void setPassNum(String passNum) {
		this.passNum = passNum;
	}
	
	
}
