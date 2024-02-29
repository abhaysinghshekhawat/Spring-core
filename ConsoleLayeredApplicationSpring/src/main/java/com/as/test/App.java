package com.as.test;



import java.util.Scanner;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.env.Environment;

import com.as.controller.MainController;
import com.as.vo.EmployeeVO;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
		/*
		 * DefaultListableBeanFactory factory = new DefaultListableBeanFactory();
		 * XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(factory);
		 * reader.loadBeanDefinitions("com/as/cfgs/applicationContext.xml");
		 * MainController controller =
		 * factory.getBean("controller",MainController.class);
		 */
    	ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("com/as/cfgs/applicationContext.xml");
        MainController controller = ctx.getBean("controller",MainController.class);
        Environment env = ctx.getEnvironment();
        System.out.println(env.toString());
       try {
    	   Scanner sc = new Scanner(System.in);
    	   System.out.println("insert Employee name: ");
    	   String name = sc.next();
    	   System.out.println("insert Employee designation");
    	   String desig = sc.next();
    	   System.out.println("insert basicSalary: ");
    	   String basicSalary = sc.next();
    	   
    	   // creating VO object
    	   EmployeeVO vo = new EmployeeVO();
    	   vo.setBasicSalary(basicSalary);
    	   vo.setDesignation(desig);
    	   vo.setEname(name);
    	   
    	   String res = controller.processEmployee(vo);
    	   System.out.println(res);
       }catch(Exception e) {
    	   e.printStackTrace();
       }
    }
}
