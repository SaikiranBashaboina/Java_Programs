package com.patterns;

public class daimond {

	public static void main(String[] args)
	{
		int star=6;   //Daimond 
		for (int i = 1; i <=star ; i++)      
		{
			for (int l = star-1; l >= i; l--) 
		          System.out.print(" ");
		      for (int j = 1; j <= i; j++) 
		          System.out.print("* ");
		      System.out.println();
		 }
		for (int i = star-1; i >=1 ; i--)             
		{ 
			for (int l = star-1; l >= i; l--) 
		          System.out.print(" ");
		      for (int j = i; j >= 1; j--) 
		          System.out.print("* ");
		      System.out.println();
		 }

	}

}
/*
  int star=5;      //Half Diamond Pattern:
		for (int i = 1; i <=star ; i++)            
		{ 
			
		      for (int j = 1; j <=i; j++) 
		          System.out.print("* ");
		      System.out.println();
		 }
		for (int i = star-1; i >=1 ; i--)            
		{ 
			
		      for (int j = 1; j <=i; j++) 
		          System.out.print("* ");
		      System.out.println();
		 }
		 
		 
int star=6;                //Reverse Half Diamond Pattern:
		for (int i = 1; i <=star ; i++)                  
		{
			for (int l = star-1; l >= i; l--) 
		          System.out.print("  ");
		      for (int j = 1; j <= i; j++) 
		          System.out.print("* ");
		      System.out.println();
		 }
		for (int i = star-1; i >=1 ; i--)               
		{ 
			for (int l = star-1; l >= i; l--) 
		          System.out.print("  ");
		      for (int j = i; j >= 1; j--) 
		          System.out.print("* ");
		      System.out.println();
		 }

		 
*/
