package com.as.mobileStore.test;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.as.mobileStore.controller.MainController;
import com.as.mobileStore.entity.MobileStoreEntity;
import com.google.protobuf.TextFormat.ParseException;

public class Test {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("/com/as/mobileStore/cfg/applicationContext.xml");
		MainController controller = ctx.getBean("cnt",MainController.class);
		System.out.println(Arrays.toString(ctx.getBeanDefinitionNames()));
		System.out.print("enter your choice: ");
		String choice = sc.next();
		switch(choice) {
		
		case "create" :
			try {
				System.out.println("enter the  brand: ");
				String brand = sc.next();
				
				System.out.println("enter the model: ");
				String model = sc.next();
				
				System.out.println("enter the color: ");
				String color = sc.next();
				
				System.out.println("enter the price: ");
				Float price = Float.parseFloat(sc.next());
				
				System.out.println("enter the launchDate: ");
				String date = sc.next();
				
				MobileStoreEntity entity = new MobileStoreEntity();
				entity.setBrand(brand);
				entity.setColor(color);
				entity.setModel(model);
				entity.setPrice(price);
				
				SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
				java.util.Date dt1 = sdf.parse(date);
				java.sql.Date dt2= new java.sql.Date(dt1.getTime());
				entity.setLaunchDate(dt2);
				String res = controller.registerProduct(entity);
				System.out.println("result is: " + res);
				break;
				
			}
			catch(Exception ex) {
				ex.printStackTrace();
			}
			
		}

	}

}
