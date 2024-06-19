package com.BeenLifecycleMethod.UsingAnnotation;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Example
{
	public static void main(String[] args)
	{
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("com/BeenLifecycleMethod/UsingAnnotation/lifecycleConfeg.xml");
		Samosa  S1=(Samosa)context.getBean("s1");
		System.out.println(S1);
		context.registerShutdownHook();
	}
}
