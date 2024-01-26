package com.as.bo;

public class EmployeeBO {

	private Integer eno;
	private String ename;
	private String designation;
	private Float basicSalary;
	private Float grossSalary;
	private Float netSalary;

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

	public Float getGrossSalary() {
		return grossSalary;
	}

	public void setGrossSalary(Float grossSalary) {
		this.grossSalary = grossSalary;
	}

	public Float getNetSalary() {
		return netSalary;
	}

	public void setNetSalary(Float netSalary) {
		this.netSalary = netSalary;
	}

	@Override
	public String toString() {
		return "EmployeeBO [eno=" + eno + ", ename=" + ename + ", designation=" + designation + ", basicSalary="
				+ basicSalary + ", grossSalary=" + grossSalary + ", netSalary=" + netSalary + "]";
	}
	
	

}
