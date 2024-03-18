package com.patterns;


public class numpattern {

	public static void main(String[] args) 
	{
		int num=6;      //num right angle pattern 
		for(int i=1;i<=num;i++)
		{
			for(int j=1;j<=i;j++)
			    System.out.print(j+" ");
			System.out.println();
		}

	}

}
/*
		int num=6;      //num right angle pattern 
		for(int i=1;i<=num;i++)
		{
			for(int j=1;j<=i;j++)
			    System.out.print(j+" ");
			System.out.println();
		}
		
		int num=6;      //num right angle reverse  
		for(int i=1;i<=num;i++)
		{
			for(int l=num-1;l>=i;l--)
			    System.out.print("  ");
			for(int j=i;j>0;j--)
			    System.out.print(" "+j);
			System.out.println();
		}

Scanner s= new Scanner(System.in);  //half daimond
		System.out.println("Enter the Pattern Number:");
		int star=s.nextInt();      
		for (int i = 1; i <=star ; i++)            
		{ 	
			 for (int j =1 ; j<=i; j++) 
			      System.out.print(j+" ");
			 System.out.println();
		}
		for (int i = star; i >=1 ; i--)            
		{ 	
			 for (int j =1 ; j<=i; j++) 
			      System.out.print(j+" ");
			 System.out.println();
		}

*/