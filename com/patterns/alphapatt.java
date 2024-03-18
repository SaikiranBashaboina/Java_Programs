package com.patterns;

public class alphapatt {

	public static void main(String[] args) 
	{
		int num=5;                 //Alphabet pyramid
		char c='A';
		for(int i=0;i<num;i++)
		{
			for(int l=num-1;l>i;l--)
			    System.out.print(" ");
			for(int j=0;j<=i;j++)
			    System.out.print((char)(c+j)+" ");
			System.out.println();
		}
	}
}
/* 
  

int num=5;                 //Alphabet right angle pattern 
char c='A';
for(int i=0;i<num;i++)
{
	for(int j=0;j<=i;j++)
	    System.out.print((char)(c+j)+" ");
	System.out.println();
}

		int num=5;          //Alphabet right angle  reverse pattern 
		char c='A';
		for(int i=0;i<num;i++)
		{
			for(int l=num-1;l>i;l--)
			    System.out.print("  ");
			for(int j=i;j>=0;j--)
			    System.out.print(" "+(char)(c+j));
			System.out.println();
		}
*/
