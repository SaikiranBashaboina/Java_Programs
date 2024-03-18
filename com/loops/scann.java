package com.loops;
import java.util.Scanner;
public class scann 
{
	public static void main(String[] args)
	{ 
		Scanner s=new Scanner(System.in);
		System.out.println("enter ");
		int s1=s.nextInt();
		for(int x=1;x<=s1;x++)
		{
		int num=x,sq,sum=0;
	    sq=(int)Math.pow(num,2);
	    while(sq>0)
	   {
	    sum=sum+sq%10;
	    sq/=10;
	   }
	   if(num==sum)
	      System.out.println(x+" Evil number");
	  
		}
		
	 
	}
}
