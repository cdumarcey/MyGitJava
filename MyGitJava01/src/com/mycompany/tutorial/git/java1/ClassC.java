package com.mycompany.tutorial.git.java1;

public class ClassC {
	
	private String name;
	private Integer number;
	private String desc;
	
	
	
	public String getName() {
		if(this.name != null) return this.name.trim();
		else return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public Integer getNumber() {
		return number;
	}
	
	public void setNumber(Integer number) {
		this.number = number;
	}

}
