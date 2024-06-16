package com.SpringCorRef;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context= new ClassPathXmlApplicationContext("com/SpringCorRef/refConfeg.xml");
        A temp =(A)context.getBean("Aref");
        System.out.println(temp.getValue1());
        System.out.println(temp.getOb().getValue2());
    }
}
