package com.as.App.component;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.Setter;
import lombok.ToString;

@Component("emp")
@ConfigurationProperties("emp.info")
@Setter
@ToString
public class Employee {

private int eno;
private String name;
private String desig;
private int exp;


}
