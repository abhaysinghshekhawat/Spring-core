package com.as.comps;

import java.util.Arrays;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service("fkp")
public final class Flipkart {

	// composition and also code to interface
	@Autowired
	@Qualifier("logistics")
	private Courier courier;

	public void setCourier(Courier courier) {
		this.courier = courier;
	}
	
	public String deliverProducts(String[] products, int[] prices) {
		int oid = new Random().nextInt();
		String status = courier.delivery(oid);
		return "delivered the products => " + Arrays.toString(products) + " with prices => " + Arrays.toString(prices) + " status => " + status;
	}
	
	
}
