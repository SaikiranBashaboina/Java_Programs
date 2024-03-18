package com.oops;

import java.util.Scanner;

public class armstrongmethod {

	public static void main(String[] args) 
	{
		Scanner s= new Scanner(System.in);
	    System.out.println("Enter Any Number :");
	    int number=s.nextInt();
	    Model p=new Model();
	    p.m2(number);
	}
}
class Model
{
   void m2(int num)
   {
	    int i=0,num2=num,sum=0;
		while(num2!=0)
		{   
			num2=num2/10;
			i++;
		}
		num2=num;
		while(num2>0)
		{   
			int dig=num2%10;
			//pow+=Math.pow(sum,i);
			int j=i,pow=1;
			while(j>0)
			{
			   pow=pow*dig;
			   j--;
			}
			sum+=pow;
			num2=num2/10;
		}
		if(sum==num)
			System.out.println(num+" is  a armstrong number ");
		else
			System.out.println(num+" is not a armstrong number");
   }
}
