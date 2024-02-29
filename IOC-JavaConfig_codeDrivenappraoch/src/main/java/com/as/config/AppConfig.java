package com.as.config;

import java.time.LocalDateTime;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.as.service.WishMessageGenerator;
import com.as.service2.Greeting;

@Configuration
@ComponentScan(basePackageClasses = {WishMessageGenerator.class,Greeting.class})
public class AppConfig {

	@Bean
	public LocalDateTime createLTD() {
		return LocalDateTime.now();
	}
}
