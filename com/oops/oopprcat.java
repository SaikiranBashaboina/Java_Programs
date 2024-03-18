package com.oops;
public class oopprcat 
{
	public static void main(String[] args)
	{
		Colleg c=new Colleg("kmit",100);
		c.dis();
		Colleg c1=new Colleg(150,"cbit");
		c1.dis(10);
	}
}


class Colleg
{
	String clg;
	int code;
	Colleg()
	{
		clg="SVIT";
		code=461;
	}
	Colleg(String clg,int code)
	{
		this.clg=clg;
		this.code=code;
		System.out.println("College : "+clg+" Code :"+code);
	}
	Colleg(int code,String clg)
	{
		this.clg=clg;
		this.code=code;
		System.out.println("Code :"+code+" College : "+clg);
	}
	void dis()
	{
		System.out.println("College : \""+clg+"\" Code :"+code);
	}
	void dis(int a)
	{
		System.out.println("College : \""+clg+"\" Code :"+code+" "+a);
	}
	void dis(char a)
	{
		System.out.println("College : \""+clg+"\" Code :"+code+" "+a);
	}
	
}
























