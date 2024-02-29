package com.as.service2;

import org.springframework.stereotype.Component;

@Component
public class Greeting {

	public void greet(String user) {
		System.out.println("hello " + user);
	}
}
