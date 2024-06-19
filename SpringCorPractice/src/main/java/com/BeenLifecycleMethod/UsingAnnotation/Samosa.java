package com.BeenLifecycleMethod.UsingAnnotation;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Samosa
{
	private int prise;

	public int getPrise() {
		return prise;
	}

	public void setPrise(int prise) {
		this.prise = prise;
	}

	public Samosa() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Samosa [prise=" + prise + "]";
	}
	
	@PostConstruct
	public void start()
	{
		System.out.println("i am eating");
	}
	@PreDestroy
	public void end()
	{
		System.out.println("i am done eating");
	}
}
