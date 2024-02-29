package com.as.App;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.as.App.component.Employee;

@SpringBootApplication
public class ConfigurationPropertiesDemoApplication {

	public static void main(String[] args) {
	  ApplicationContext ctx = 	SpringApplication.run(ConfigurationPropertiesDemoApplication.class, args);
	  Employee emp = ctx.getBean("emp",Employee.class);
	  System.out.println(emp);
	}

}
