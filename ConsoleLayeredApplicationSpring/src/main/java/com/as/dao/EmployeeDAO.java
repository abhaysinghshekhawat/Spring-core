package com.as.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.sql.DataSource;

import com.as.bo.EmployeeBO;

public class EmployeeDAO implements IEmployeeDAO{

	private DataSource ds ;
	private static final String INSERT_QUERY = "INSERT INTO REALTIMEDI_SPRING_EMPLOYEE (ename,desig,basicsalary,grosssalary,netsalary) values(?,?,?,?,?)";
	
	public EmployeeDAO(DataSource ds) {
		this.ds = ds;
	}
	@Override
	public int insertEmployee(EmployeeBO employee) throws Exception {
		int result = 0;
		try(Connection con = ds.getConnection();
				PreparedStatement ps = con.prepareStatement(INSERT_QUERY)){
			
			// setting values to the prepared statement;
			ps.setString(1,employee.getEname());
			ps.setString(2, employee.getDesignation());
			ps.setFloat(3, employee.getBasicSalary());
			ps.setFloat(4, employee.getGrossSalary());
			ps.setFloat(5, employee.getNetSalary());
			
			// executing the query
			result = ps.executeUpdate();
		}catch(SQLException ex) {
			ex.printStackTrace();
			throw ex;
		}catch(Exception e) {
			throw e;
		}
		return result;
	}

}
