package com.as.comps;

import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;


@Component("delhi")
public final class Delhivery implements Courier{

	public Delhivery() {
		System.out.println("Delhivery 0 params constructory called");
	}
	@Override
	public String delivery(int oid) {
		System.out.println("delievered the product with orderId " + oid);
		return "delievered";
	}

}
