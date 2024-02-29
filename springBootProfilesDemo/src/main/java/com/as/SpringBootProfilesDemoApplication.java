package com.as;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.as.service.FlipkartService;

@SpringBootApplication
public class SpringBootProfilesDemoApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(SpringBootProfilesDemoApplication.class, args);
		FlipkartService fs = ctx.getBean(FlipkartService.class);
		String res = fs.deliverProducts(new String[] {"jeans","tee","sunglasses"});
		System.out.println("final Res: " + res);
	}

}
