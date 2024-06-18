package com.BeenLifecycleMethod;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class LifecycleUsignXml {

	public static void main(String[] args)
	{
		AbstractApplicationContext context= new ClassPathXmlApplicationContext("com/BeenLifecycleMethod/lifecycleConfeg.xml");
		Student student = (Student) context.getBean("BStudent");
		System.out.println(student);
		context.registerShutdownHook();
	}

}
