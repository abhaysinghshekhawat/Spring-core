package com.as;


import javax.sql.DataSource;

import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

import com.as.Dao.MobileStoreDao;

@SpringBootApplication
public class SpringBootAutoConfigDemoApplication {

	/*
	 * @Bean public DataSource createDs() { BasicDataSource ds = new
	 * BasicDataSource(); ds.setDriverClassName("com.mysql.cj.jdbc.Driver");
	 * ds.setUrl("jdbc:mysql:///springpractice"); ds.setUsername("root");
	 * ds.setPassword("toor"); return ds; }
	 */
	public static void main(String[] args) throws Exception {
	 ApplicationContext ctx =	SpringApplication.run(SpringBootAutoConfigDemoApplication.class, args);
	 MobileStoreDao dao = ctx.getBean("dao",MobileStoreDao.class);
	 System.out.println("count: " + dao.getMobileStoreItemsCount());
	}

}
