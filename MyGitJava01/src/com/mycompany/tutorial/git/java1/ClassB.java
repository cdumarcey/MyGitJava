package com.mycompany.tutorial.git.java1;

public class ClassB {
	
	private String name;
	private Integer number;	
	private String birthdate;	
	
	public String getName() {
		if(this.name != null) return this.name.trim();
		else return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getBirthdate() {
		return birthdate;
	}
	
	public void setBirthdate(String birthdate) {
		this.birthdate = birthdate;
	}

public Integer getNumber() {
		return number;
	}
	
	public void setNumber(Integer number) {
		this.number = number;
	}

}
