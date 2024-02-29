package com.as.service;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("wmg") // for creating it as a bean using stereotype annotation
public class WishMessageGenerator {

	@Autowired // for doing dependency injection
	private LocalDateTime ldt;
	
	public String wish(String user) {
		if(ldt.getHour() < 12) return "GoodMorning:: " + user;
		else if(ldt.getHour() > 12 && ldt.getHour() < 15) return "GoodAfterNoon:: " + user;
		else if(ldt.getHour() >= 15 && ldt.getHour() < 20) return "GoodEvening:: " + user;
		else return "GoodNight:: " + user;
	}
}
