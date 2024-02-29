package com.as.Test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.as.components.Cricketer;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("com/as/cfgs/applicationContext.xml");
        Cricketer player = ctx.getBean("crkt", Cricketer.class);
        player.batting();
        player.batting();
    }
}
