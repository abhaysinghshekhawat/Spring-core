package com.as.comps;

import java.util.Arrays;
import java.util.Random;

public final class Flipkart {

	// composition and also code to interface
	private Courier courier;

	public Courier getCourier() {
		return courier;
	}

	public void setCourier(Courier courier) {
		this.courier = courier;
	}
	
	public String deliverProducts(String[] products, int[] prices) {
		int oid = new Random().nextInt();
		String status = courier.delivery(oid);
		return "delivered the products => " + Arrays.toString(products) + " with prices => " + Arrays.toString(prices) + " status => " + status;
	}
	
	
}
