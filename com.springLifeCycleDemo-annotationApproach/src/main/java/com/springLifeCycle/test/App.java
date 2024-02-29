package com.springLifeCycle.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springLifeCycle.service.VotterCandidateChecker;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("com/springLifeCycle/cfgs/applicationContext.xml"); // IOC-container creation done;
      VotterCandidateChecker obj = ctx.getBean("bn",VotterCandidateChecker.class);
      
      obj.checkValidity();
      ctx.close();
    }
}
