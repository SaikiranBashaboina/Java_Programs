package com.patterns;

public class pyramid {

	public static void main(String[] args) 
	{
		int star=6;
		for (int i = 1; i <=star ; i++)      //Pyramid Pattern
		{
			for (int l = star-1; l >= i; l--) 
		          System.out.print(" ");
		      for (int j = 1; j <= i; j++) 
		          System.out.print("* ");
		      System.out.println();
		 }

	}

}
/*
 int star=5;
		for (int i = star; i >=1 ; i--)                    //Inverted Pyramid Pattern:
		{ 
			for (int l = star-1; l >= i; l--) 
		          System.out.print(" ");
		      for (int j = i; j >= 1; j--) 
		          System.out.print("* ");
		      System.out.println();
		 }
		 
int star=5;                      // halloow pyramid
		for (int i = star; i >=1 ; i--)            
		{ 
		      for (int j = 1; j <=star; j++) 
		      {
		    	  if(i==j || j==star || i==1)
			          System.out.print("* ");
		    	  else if(i<j)
		    		  System.out.print("  ");
		    	  else
			          System.out.print(" ");
		      }
		      System.out.println();
		 }
*/
