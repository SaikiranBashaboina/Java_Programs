package com.patterns;
import java.util.Scanner;
public class hallowpatt {

	public static void main(String[] args)
	{
		Scanner s= new Scanner(System.in);
		System.out.println("Enter the Pattern Number:");
		int star=s.nextInt();              
		for (int i = 1; i <= star; ++i)      //Hollow Right Triangle Pattern
		{
			for(int j=i;j<star;j++)
				System.out.print("  ");  
		      for (int j = 1; j <= i; ++j) 
		      {
		    	  if(j==1 || i==j || i==star )
		             System.out.print("* ");
		    	  else
		    		  System.out.print("  ");
		      }
		      System.out.println();
		 }
	
	}
}
/*
 
 int star=10;
		for (int i = 1; i <= star; ++i)      //Hollow square Pattern
		{
		      for (int j = 1; j <= star; j++) 
		      {
		    	  if(i==1 || j==1 || i==star || j==star )
		             System.out.print("* ");
		    	  else
		    		  System.out.print("  ");
		      }
		      System.out.println();
		 }

			int star=10;
		for (int i = 1; i <= star; ++i)      //Hollow Right Triangle Pattern
		{
		      for (int j = 1; j <= i; ++j) 
		      {
		    	  if(j==1 || i==j || i==star )
		             System.out.print("* ");
		    	  else
		    		  System.out.print("  ");
		      }
		      System.out.println();
		 }
	
		 
int star=10;                                 // hallow Daimond pattern   
		for (int i = 1; i <=star ; i++)      
		{
			for (int l = star-1; l >= i; l--) 
		          System.out.print(" ");
		      for (int j = 1; j <= i; j++) 
		      {
		    	  if(j==1 || i==j )
			             System.out.print("* ");
			    	  else
			    		  System.out.print("  ");
		      }
		      System.out.println();      
		 }
		for (int i = star-1; i >=1 ; i--)             
		{ 
			for (int l = star-1; l >= i; l--) 
		          System.out.print(" ");
		      for (int j = i; j >= 1; j--)
		      {
		    	  if(j==1 || i==j )
			             System.out.print("* ");
			    	  else
			    		  System.out.print("  ");
		      }
		      System.out.println();
		 }

int star=7;
		for (int i = 1; i <= star; ++i)      //Hollow square daigonal left & right Pattern
		{
		      for (int j = 1; j <= star; j++) 
		      {
		    	  if(i==1 || j==1 || i==star || j==star || j==star-i+1 || i==j)
		             System.out.print("* ");
		    	  else
		    		  System.out.print("  ");
		      }
		      System.out.println();
		 }
		 
		int star=6;
		for (int i = 1; i <=star ; i++)      //haloow Pyramid Pattern
		{
			for (int l = star-1; l >= i; l--) 
		          System.out.print(" ");
		      for (int j = 1; j <= i; j++)
		      {
		    	  if(j==1 || i==j || i==star )
		             System.out.print("* ");
		    	  else
		    		  System.out.print("  ");
		      }

		      System.out.println();
		 }
	
		int star=5;                // hallow Inverted Pyramid Pattern:
		for (int i = star; i >=1 ; i--) 
		{ 
			for (int l = star-1; l >= i; l--) 
		          System.out.print(" ");
		      for (int j = i; j >= 1; j--)
		      {
		    	  if(j==1 || i==j || i==star )
		             System.out.print("* ");
		    	  else
		    		  System.out.print("  ");
		      }
		      System.out.println();
		 }
		 
		 int star=5;        //ulta palta hollow daimond       
		for (int i = star; i >=1 ; i--) 
		{ 
			for (int l = star-1; l >= i; l--) 
		          System.out.print(" ");
		      for (int j = i; j >= 1; j--)
		      {
		    	  if(j==1 || i==j || i==star )
		             System.out.print("* ");
		    	  else
		    		  System.out.print("  ");
		      }
		      System.out.println();
		 }
		for (int i = 1; i <=star ; i++)   
		{
			for (int l = star-1; l >= i; l--) 
		          System.out.print(" ");
		      for (int j = 1; j <= i; j++)
		      {
		    	  if(j==1 || i==j || i==star )
		             System.out.print("* ");
		    	  else
		    		  System.out.print("  ");
		      }

		      System.out.println();
		 }

		 
*/
