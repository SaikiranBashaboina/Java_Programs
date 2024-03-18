package com.loops;

public class Multiplictaiontable 
{
	public static void main(String hhh[])
	{
		int temp=0,num=9,x=100;
		while(x>=1)
		{
			temp=num*x;
			if (temp%9==0 && temp%11==0)
				System.out.println(num+" x "+x+" = "+temp);
			x--;
		}
	}
}

/*
   int a=15;
   for(int i=1;i<11;i++)
     System.out.println(a+" * "+i+" = "+a*i); 
     
     int a=15,i=1;
		for(;i<11;i++)
		    System.out.println(a+" * "+i+" = "+a*i);
*/