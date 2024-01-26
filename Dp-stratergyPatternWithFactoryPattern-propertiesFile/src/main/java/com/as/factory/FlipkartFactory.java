package com.as.factory;

import java.io.FileInputStream;
import java.lang.reflect.Constructor;
import java.util.Map;
import java.util.Properties;

import com.as.comps.Courier;
import com.as.comps.Flipkart;

public class FlipkartFactory {

	private static Properties props;
	static {
		try(FileInputStream fis = new FileInputStream("src/main/java/com/as/common/info.properties")){
			props = new Properties();
			props.load(fis);
			
		}catch(Exception ex) {
			System.out.println("exception inside static block of FlipkartFactory class: "+ex);
		}
	}
	public static Flipkart createFlipkart() throws Exception {
		Flipkart flipkart = new Flipkart();
		Courier courier = null;
		
		Class cls = Class.forName(props.getProperty("dependent.class"));
		Constructor[] consts = cls.getDeclaredConstructors();
		courier = (Courier) consts[0].newInstance();
		flipkart.setCourier(courier);
		return flipkart;
	}
}
