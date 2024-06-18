package com.BeenLifecycleMethod.UsingInterfaces;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Papsi implements InitializingBean,DisposableBean
{
	private int prise;

	@Override
	public String toString() {
		return "Papsi [prise=" + prise + "]";
	}

	public Papsi() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getPrise() {
		return prise;
	}

	public void setPrise(int prise) {
		this.prise = prise;
	}

	public void afterPropertiesSet() throws Exception
	{
		System.out.println("i am driking papsi");
	}
	
	public void destroy() throws Exception 
	{
		System.out.println("returning the botal");
	}
}
