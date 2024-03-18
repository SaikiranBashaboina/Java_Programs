package com.oops;

public class construct {

	public static void main(String[] args)
	{
		Abc abc=new Abc();
		abc.m1();
		Abc abc1=new Abc("Sandy",561,"CSE");
		abc1.m1();
		
	}

}
class Abc
{
	String name;
	int roll;
	String study;
	Abc()
	{
		study="ECE";
		name="Saikiran";
		roll=461;
	}
	public Abc(String name,int roll,String study)
	{
		this.name=name;
		this.roll=roll;
		this.study=study;
		
	}
	public void m1()
	{
		System.out.println("Name "+name+" Roll "+roll);
		System.out.println("Btech in :"+study);

	}
}
interface inter{
	default void mi()
	{
		
	}
	static void m2()
	{
		
	}
}