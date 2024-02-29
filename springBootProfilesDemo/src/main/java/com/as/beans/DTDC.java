package com.as.beans;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("dev")
public class DTDC implements Courier{
	
	public DTDC() {
		System.out.println("DTDC.DTDC()");
	}

	@Override
	public String deliver(String[] products) {
		// TODO Auto-generated method stub
		String res = String.join(",",products);
		System.out.println("delivered by DTDC");
		return res;
	}

}
