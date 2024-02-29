package com.as.beans;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("test")
public class Delhivery implements Courier{
	
	public Delhivery() {
		System.out.println("Delhivery.Delhivery():: 0-params constructor" );
	}

	@Override
	public String deliver(String[] products) {
		// TODO Auto-generated method stub
		String res = String.join(",",products);
		System.out.println("delivered by DTDC");
		return res;
	}

}
