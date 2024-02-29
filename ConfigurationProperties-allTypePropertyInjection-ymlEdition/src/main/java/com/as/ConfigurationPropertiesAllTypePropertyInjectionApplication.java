package com.as;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.as.beans.PersonInfo;

@SpringBootApplication
public class ConfigurationPropertiesAllTypePropertyInjectionApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(ConfigurationPropertiesAllTypePropertyInjectionApplication.class, args);
		PersonInfo perInfo =ctx.getBean(PersonInfo.class);
		System.out.println(perInfo);
	}

}
