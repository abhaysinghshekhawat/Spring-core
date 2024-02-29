package com.springLifeCycle.cfgs.demo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DemoTest {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("com/springLifeCycle/cfgs/applicationContext.xml");
		Demo d1 = ctx.getBean("dm",Demo.class);
		Demo d2 = ctx.getBean("dm",Demo.class);
		System.out.println(d1.getDate().hashCode()+" "+d2.getDate().hashCode());

	}

}
