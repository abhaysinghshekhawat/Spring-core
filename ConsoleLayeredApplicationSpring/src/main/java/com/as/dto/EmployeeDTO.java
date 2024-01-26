package com.as.dto;

public class EmployeeDTO {

	private Integer eno;
	private String ename;
	private String designation;
	private Float basicSalary;
	public Integer getEno() {
		return eno;
	}
	public void setEno(Integer eno) {
		this.eno = eno;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public Float getBasicSalary() {
		return basicSalary;
	}
	public void setBasicSalary(Float basicSalary) {
		this.basicSalary = basicSalary;
	}
	
	@Override
	public String toString() {
		return "EmployeeDTO [eno=" + eno + ", ename=" + ename + ", designation=" + designation + ", basicSalary="
				+ basicSalary + "]";
	}
	
	
	
}
