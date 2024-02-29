package com.as.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import com.as.beans.Courier;

@Service
public class FlipkartService {

	@Autowired
	Courier cr;
	
	public String deliverProducts(String[] ps) {
		String res = cr.deliver(ps);
		return res;
	}
	
}
