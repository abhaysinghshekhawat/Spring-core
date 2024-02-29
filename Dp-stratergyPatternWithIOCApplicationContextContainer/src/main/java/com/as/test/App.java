package com.as.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.as.comps.Flipkart;
import com.as.factory.FlipkartFactory;

public class App {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext cxt = new ClassPathXmlApplicationContext("com/as/cfgs/applicationContext.xml");
		Flipkart fp = cxt.getBean("fkp",Flipkart.class);
		String res = fp.deliverProducts(new String[] {"google","t-shirt"}, new int[] {1200,300});
		System.out.println(res);
	}
}
