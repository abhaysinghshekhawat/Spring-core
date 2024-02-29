package com.as.mobileStore.entity;

import java.sql.Date;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
public class MobileStoreEntity {

	private Integer productId;
	private String brand;
	private String model;
	private String color;
	private Date launchDate;
	private Float price;
	
	
	
	
}
