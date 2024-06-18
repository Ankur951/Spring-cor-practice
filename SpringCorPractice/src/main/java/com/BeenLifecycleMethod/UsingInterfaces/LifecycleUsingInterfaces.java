package com.BeenLifecycleMethod.UsingInterfaces;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class LifecycleUsingInterfaces {

	public static void main(String[] args)
	{
		AbstractApplicationContext context =new ClassPathXmlApplicationContext("com/BeenLifecycleMethod/UsingInterfaces/lifecycleConfeg.xml");
		Papsi p1= (Papsi) context.getBean("p1");
		System.out.println(p1);
		context.registerShutdownHook();
	}

}
