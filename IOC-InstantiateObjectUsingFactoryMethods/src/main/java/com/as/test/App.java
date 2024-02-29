package com.as.test;

import java.util.Map;
import java.util.Properties;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	 
    	DefaultListableBeanFactory factory = new DefaultListableBeanFactory();
    	XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(factory);
    	reader.loadBeanDefinitions("com/as/cfgs/applicationContext.xml");
    	Class cls= factory.getBean("clss",Class.class);
    	String str = factory.getBean("str",String.class);
    	Properties props = factory.getBean("sysProp",Properties.class);
    	String sbStr = factory.getBean("sbStr",String.class);
    	System.out.println(str);
    	System.out.println(cls.toString());
    	System.out.println(sbStr);
        for(Map.Entry<Object, Object> entry : props.entrySet()) {
        	System.out.println(entry.getKey()+" -> "+ entry.getValue());
        }
        
    }
    
    
}
