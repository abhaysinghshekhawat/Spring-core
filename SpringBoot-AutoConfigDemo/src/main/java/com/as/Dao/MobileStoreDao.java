package com.as.Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository("dao")
public class MobileStoreDao {
	
	private static final String COUNT_MOBILESTORE_ITEMS = "SELECT COUNT(*) FROM MOBILESTORE";
	@Autowired
	private DataSource ds;
	
	public int getMobileStoreItemsCount() throws Exception{
		int count = 0;
		try(Connection conn = ds.getConnection();
			PreparedStatement ps =conn.prepareStatement(COUNT_MOBILESTORE_ITEMS);){
			System.out.println(ds.getClass().getName());
			ResultSet res = ps.executeQuery();
			res.next();
			count = res.getInt(1);
			
			
		}catch(SQLException sex) {
			sex.printStackTrace();
			throw new Exception(sex.getMessage());
		}
		return count;
	}
	
}
