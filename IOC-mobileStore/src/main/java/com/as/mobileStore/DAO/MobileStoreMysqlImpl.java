package com.as.mobileStore.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.as.mobileStore.entity.MobileStoreEntity;

@Repository
public class MobileStoreMysqlImpl implements ImobileStore{

	private static final String INSERT_QUERY = "INSERT INTO MOBILESTORE(BRAND,MODEL,COLOR,PRICE,LAUNCH_DATE) VALUES (?,?,?,?,?)";
	
	@Autowired
	private DataSource ds;
	
	@Override
	public String createProduct(MobileStoreEntity product) throws Exception {
		try(Connection conn = ds.getConnection();
			PreparedStatement ps =	conn.prepareStatement(INSERT_QUERY);){
			
			ps.setString(1, product.getBrand());
			ps.setString(2, product.getModel());
			ps.setString(3, product.getColor());
			ps.setFloat(4, product.getPrice());
			ps.setDate(5, product.getLaunchDate());
			int res = ps.executeUpdate();
			if(res==1) {
				return product + " inserted";
			}else {
				return product + " not inserted into the database";
			}
		}catch(SQLException ex) {
			ex.printStackTrace();
			throw ex;
		}
	}

}
