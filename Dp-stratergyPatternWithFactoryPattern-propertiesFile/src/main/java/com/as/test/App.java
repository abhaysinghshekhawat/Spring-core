package com.as.test;

import com.as.comps.Flipkart;
import com.as.factory.FlipkartFactory;

public class App {

	public static void main(String[] args) {
		try {
		Flipkart fk = FlipkartFactory.createFlipkart();
		int[] prices = {100,200,300};
		String[] products = {"tee","shoes","belt"};
		String res = fk.deliverProducts(products, prices);
		System.out.println(res);
		}catch(Exception ex) {
			System.out.println("exception inside App class " + ex);
		}
	}
}
