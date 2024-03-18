package com.loops;

public class prime 
{
	public static void main(String hhh[])
	{
		int x=2,number=100,countt=0;
		while(x<=number/2)
		{
			if (number%x==0)
			{
				countt+=1;
				
			}
			x++;
		}
		if(countt>0)
			System.out.println(number+" is not a prime number ");
		else
			System.out.println(number+" is a prime number");
	}
}

/*
int num=2,x,ct;
System.out.println("Prime numbers :");
for(;num<=30;num++)
{
	x=2;ct=0;
	while(x<=num/2)
	{
		if (num%x==0)
        {
			ct++;
            break;
        }
		x++;
	}
	if(ct==0)
		System.out.println(num);
	
}	

=================================
int count=0,num=2;
		while(count<=20)
		{
			int countt=0;
			for(int x=2;x<=num/2;x++)
			{
				if(num%x==0)
				{
					countt++;
					break;
				}
			}
			if(countt==0)
			{
				count++;
				System.out.println(num+" is  a prime number ");
			}
			num++;
===================================
int num=2,x,ct,n,rev;
System.out.println("Prime palindrome numbers :");
for(;num<=200;num++)
{
	x=2;ct=0;
	while(x<=num/2)
	{
		if (num%x==0)
          {
			ct++;
            break;
          }
		x++;
	}
	if(ct==0)
	{
		n=num;
		rev=0;
		while(n>0)
		{
			rev=rev*10+n%10;
			n/=10;
		}	
		if(num==rev)
			System.out.println(num);
	}
	
}		*/