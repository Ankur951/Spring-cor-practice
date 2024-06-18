package com.BeenLifecycleMethod;

import javax.swing.plaf.synth.SynthSeparatorUI;

public class Student
{
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Student [name=" + name + "]";
	}
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
	
	
	public void init()
	{
		System.out.println(this.name+" is inrold in the school");
	}
	
	public void destory()
	{
		System.out.println(this.name+" is a passout Student");
	}
	
}