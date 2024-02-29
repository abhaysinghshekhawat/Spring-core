package com.as.comps;

import org.springframework.stereotype.Component;

@Component("dtdc")
public final  class DTDC implements Courier{

	public DTDC() {
		System.out.println("DTDC 0 params constructor called");
	}
	@Override
	public String delivery(int oid) {
		System.out.println("delievered the product with orderId " + oid);
		return "delievered";
	}

}
