package com.oops;

public class inhert {

	public static void main(String[] args) 
	{
		clg c=new clg();
		c.dis();

	}

}
class College 
{
	String clg;
	int code;
	College()
	{
		clg="SVIT";
		code=461;
	}
	College(String clg,int code)
	{
		this.clg=clg;
		this.code=code;
	}
	void dis()
	{
		System.out.println("College Name :"+clg+" Code :"+code);
	}
}
class clg extends College
{
	String clg;
	int code;
	clg()
	{
		clg="cbit";
		code=561;
	}
	clg(String clg,int code)
	{
		this.clg=clg;
		this.code=code;
	}
	void dis()
	{
		System.out.println("College Name :"+super.clg+" Code :"+code);
	}
}

/*

 
 java j=new java();
		python p=new python();
		j.b1();
		p.h1();

class inst
{
	double fee;
	inst()
	{
		fee=100000;
	}
	void p1()
	{
		System.out.println("Codinghub Private lmtd");
	}
}
class java extends inst
{
	double fee;
	java()
	{
		fee=50000;
	}
	void b1()
	{
		System.out.println("Java developer fees :"+super.fee);
		System.out.println("On spot fee :"+fee);
	}
	
}
class python extends inst
{
	double fee;
	python()
	{
		fee=50000;
	}
	void h1()
	{
		System.out.println("Pyhton developer fees :"+super.fee);
		System.out.println("On spot fee :"+fee);
	}
	
}
*/