package com.as.components;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

@Component("crkt")
public class Cricketer implements ApplicationContextAware{

	// no-has a dependent property
	ApplicationContext applicationContext;
	
	public Cricketer() {
		System.out.println("Cricketer::0-param constructor");
	}
	
	public void batting() {
		System.out.println("Cricketer.batting()");
		Bat bat = applicationContext.getBean("bat",Bat.class);
		int run = bat.scoreRuns();
		System.out.println("runs scored: " + run);
	}
	
	public void balling() {
		System.out.println("Cricketer.balling()");
	}
	
	public void fielding() {
		System.out.println("Cricketer.fielding()");
	}

	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		// TODO Auto-generated method stub
		this.applicationContext = applicationContext;
	}
}
