package com.springLifeCycle.service;

import java.util.Date;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component("bn")
@PropertySource("com/springLifeCycle/cfgs/info.properties")
public class VotterCandidateChecker {

	@Value("${per.name}")
	private String name;
	@Value("${per.age}")
	private int age;
	private Date enrollDate;

	public void checkValidity() {
		if (this.age < 18) {
			System.out.println("not eligible for votting");
		} else if (this.age >= 18) {
			System.out.println(this.toString() + "eligible for voting ");
		}
	}

	public void init() {
		if (name == null) {
			throw new IllegalArgumentException("name is null ");
		}
		if (age < 0 || age > 125) {
			throw new IllegalArgumentException("invalid age: " + age);
		}
		if (this.enrollDate == null) {
			this.enrollDate = new Date();
		}
	}

	@PreDestroy
	public void destroy() {
		System.out.println("VotterCandidateChecker.destroy()");
	}

	@PostConstruct
	public void afterPropertiesSet() throws Exception {
		System.out.println("VotterCandidateChecker.afterPropertiesSet()");
		if (name == null) {
			throw new IllegalArgumentException("name is null ");
		}
		if (age < 0 || age > 125) {
			throw new IllegalArgumentException("invalid age: " + age);
		}
		if (this.enrollDate == null) {
			this.enrollDate = new Date();
		}

	}

	@Override
	public String toString() {
		return "VotterCandidateChecker [name=" + name + ", age=" + age + ", enrollDate=" + enrollDate + "]";
	}
}
