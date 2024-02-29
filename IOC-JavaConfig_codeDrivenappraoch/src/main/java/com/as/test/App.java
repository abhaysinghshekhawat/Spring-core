package com.as.test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.as.config.AppConfig;

import com.as.service.WishMessageGenerator;
import com.as.service2.Greeting;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        // creating IOC container
    	AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
    	WishMessageGenerator wm = ctx.getBean("wmg",WishMessageGenerator.class);
    	Greeting grt = ctx.getBean(Greeting.class);
    	grt.greet("deadshot");
    	System.out.println(wm.wish("deadshot"));
    }
}
