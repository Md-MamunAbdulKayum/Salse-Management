package com.notearena.model;

public class CustomerObjectForm {
	private String name;
	private int  age;
	private String  education;
	private String  address;
	private String designation;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getEducation() {
		return education;
	}
	public void setEducation(String education) {
		this.education = education;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	
	@Override
	public String toString() {
		return "CustomerObjectForm [name=" + name + ", age=" + age + ", education=" + education + ", address=" + address
				+ ", designation=" + designation + "]";
	} 
}
