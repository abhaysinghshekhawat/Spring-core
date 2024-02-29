package com.as.components;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component("bat")
public class Bat {

	public Bat() {
		System.out.println("Bat.0-param-Constructor");
	}
	public int scoreRuns() {
		return new Random().nextInt(130);
	}
}
