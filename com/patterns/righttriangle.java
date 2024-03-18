package com.patterns;

public class righttriangle {

	public static void main(String[] args) 
	{
		int star=10;      //right triangle 
		for (int i = 1; i <=star ; i++)            
		{ 
			
		      for (int j = 1; j <=i; j++) 
		          System.out.print("* ");
		      System.out.println();
		 }

	}
}
/*
  
  int star=10;      //invert right triangle
		for (int i = star; i >=1 ; i--)            
		{ 
			
		      for (int j = 1; j <=i; j++) 
		          System.out.print("* ");
		      System.out.println();
		 }

int star=10;      // revesre invert right triangle 
for (int i = star; i >=1 ; i--)            
{ 
	for (int l = star-1; l >= i; l--) 
          System.out.print("  ");
      for (int j = i; j >= 1; j--) 
          System.out.print("* ");
      System.out.println();
 }

int star=10;    // revesre  right triangle 
for (int i = 1; i <=star ; i++)            
{ 
	for (int l = star-1; l >= i; l--) 
          System.out.print("  ");
      for (int j = 1; j <=i; j++) 
          System.out.print("* ");
      System.out.println();
 }
 */
