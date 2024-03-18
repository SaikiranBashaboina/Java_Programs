package com.oops;
public class Main 
{

	public static void main(String[] args) 
	{
		Prime P=new Prime();
		P.ifC(P.Forloop(10));
	}
}

class Prime
{
	int Forloop(int n)
	{
		System.out.println("Number is :"+n);
		int x,count=0;
		for(x=2;x<=n/2;x++)
		{
			if(n%x==0)
			count++;
		}
		return count;
	}
	void ifC(int factor)
	{
		if(factor==0)
			System.out.println("Prime");
		else
			System.out.println("Not Prime");
	}
}
