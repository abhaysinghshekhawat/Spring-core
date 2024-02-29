package com.springLifeCycle.service;

import java.util.Date;

public class VotterCandidateChecker {

	private String name;
	private int age;
	private Date enrollDate;
	
	
	public void setName(String name) {
		System.out.println("VotterCandidateChecker.setName()");
		this.name = name;
	}
	public void setAge(int age) {
		System.out.println("VotterCandidateChecker.setAge()");
		this.age = age;
	}
	public void checkValidity() {
		if(this.age < 18) {
			System.out.println("not eligible for votting");
		}
		else if(this.age >= 18) {
			System.out.println(this.toString() + "eligible for voting ");
		}
	}
	public void init() {
		if(name==null) {
			throw new IllegalArgumentException("name is null ");
		}
		if(age<0 || age>125) {
			throw new IllegalArgumentException("invalid age: " + age);
		}
		if(this.enrollDate==null) {
			this.enrollDate = new Date();
		}
	}
	
	public void destroy() {
		System.out.println("VotterCandidateChecker.destroy()");
	}
	@Override
	public String toString() {
		return "VotterCandidateChecker [name=" + name + ", age=" + age + ", enrollDate=" + enrollDate + "]";
	}
	
	
	
	
	
}
