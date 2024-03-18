package com.patterns;

public class starpattpract 
{
	public static void main(String[] args)
	{
		int star=5;
		for (int i =star; i >=1 ; i--)   
		{
			  for(int j=star;j>=i;j--)
				System.out.print(j+" ");
		      for (int j =1 ; j <(2*i)-1; j++)
		    	  System.out.print(i+" ");	
		      for(int j=i+1;j<=star;j++)
					System.out.print(j+" ");
		      System.out.println();
		 }
		for (int i =2; i <=star ; i++)   
		{
			  for(int j=star;j>=i;j--)
				System.out.print(j+" ");
		      for (int j =1 ; j <(2*i)-1; j++)
		    	  System.out.print(i+" ");	
		      for(int j=i+1;j<=star;j++)
					System.out.print(j+" ");
		      System.out.println();
		 }
	}
}

