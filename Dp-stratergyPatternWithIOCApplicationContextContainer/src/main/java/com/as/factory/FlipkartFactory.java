package com.as.factory;

import com.as.comps.Courier;
import com.as.comps.DTDC;
import com.as.comps.Delhivery;
import com.as.comps.Flipkart;

public class FlipkartFactory {

	public static Flipkart createFlipkart(String CourierType) {
		Flipkart flipkart = new Flipkart();
		Courier c = null;
		// implementing factory pattern to inject the dependent class object to the target class i.e flipkart
		if(CourierType.equalsIgnoreCase("dtdc")) c = new DTDC();
		else if(CourierType.equalsIgnoreCase("delhivery")) c = new Delhivery();
		else throw new IllegalArgumentException("no such delivery partner exists");
		
		flipkart.setCourier(c);
		return flipkart;
	}
}
