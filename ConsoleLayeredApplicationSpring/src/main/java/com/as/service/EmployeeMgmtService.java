package com.as.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.as.bo.EmployeeBO;
import com.as.dao.IEmployeeDAO;
import com.as.dto.EmployeeDTO;

public class EmployeeMgmtService implements IEmployeeMgmt {

	//HAS-A-PROPERTY
	private IEmployeeDAO dao;
	
	@Autowired
	public EmployeeMgmtService(IEmployeeDAO dao) {
		this.dao = dao;
	}
	
	@Override
	public String registerEmployee(EmployeeDTO emp) throws Exception {
		System.out.println("inside the com.as.dto.EmployeeRegister::RegisterEmployee()");
		
		// businees logic
		float grossSalary = emp.getBasicSalary() + emp.getBasicSalary()*0.4f;
		float netSalary = grossSalary - emp.getBasicSalary()*0.2f;
		
		// creating EmployeeBO object
		EmployeeBO bo= new EmployeeBO();
		bo.setEname(emp.getEname());
		bo.setDesignation(emp.getDesignation());
		bo.setBasicSalary(emp.getBasicSalary());
		bo.setGrossSalary(grossSalary);
		bo.setNetSalary(netSalary);
		
		// calling dao's method to insert the BO object inside db
		int res = dao.insertEmployee(bo);
		
		return (res==1) ? (bo + " registered successfully ") : (bo + " not registered ");
		
	}

}
