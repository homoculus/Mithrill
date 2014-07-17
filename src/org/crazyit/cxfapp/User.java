package org.crazyit.cxfapp;

public class User {
	private Integer id;
	private String name;
	private String gender;
	private double height;
	
	public User(){}
	
	public User(Integer id, String name, String gender, double height){
		this.id = id;
		this.name = name;
		this.gender = gender;
		this.height = height;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	@Override
	public String toString() {
		return "Person[name=" + name + ",gender=" + gender + ",height=" + height + "]";
	}
	
}
