package com.as.controller;

import com.as.dto.EmployeeDTO;
import com.as.service.IEmployeeMgmt;
import com.as.vo.EmployeeVO;

public class MainController {

	private IEmployeeMgmt empService;
	
	public MainController(IEmployeeMgmt empService){
		this.empService = empService;
	}
	
	public String processEmployee(EmployeeVO empVO) throws Exception{
		//creating DTO object 
		EmployeeDTO dto = new EmployeeDTO();
		dto.setEname(empVO.getEname());
		dto.setDesignation(empVO.getDesignation());
		dto.setBasicSalary(Float.parseFloat(empVO.getBasicSalary()));
		
		String res = empService.registerEmployee(dto);
		return res;
		
	}
}
