package com.mycompany.tutorial.git.java1;

public class ClassD {
	
	private String name;
	private Integer number;
	private String title;
	
	
	public String getName() {
		if(this.name != null) return this.name.trim();
		else return name;
	}
	
	public void setName(String name) {
		if(name != null) this.name = name.trim();
		else this.name = name;
	}
	
	public Integer getNumber() {
		return number;
	}
	
	public void setNumber(Integer number) {
		this.number = number;
	}
	
	public String getTitle() {
		return title;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}

}
