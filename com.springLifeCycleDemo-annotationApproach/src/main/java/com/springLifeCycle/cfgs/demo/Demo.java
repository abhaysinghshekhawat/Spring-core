package com.springLifeCycle.cfgs.demo;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("dm")
@Scope(value="prototype")
public class Demo {

	private Date date;
	
	@Autowired
	public Demo(Date date) {
		this.date = date;
	}

	public Date getDate() {
		return date;
	}
	
	
	
}
