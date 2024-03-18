package com.applic;

import java.util.Scanner;

public class useroddeven {

	public static void main(String[] args) 
	{
		Scanner s= new Scanner(System.in);
		System.out.println("Enter a number");
		char ch='Y';
		while(ch=='Y' || ch=='y')
		{
		int num=s.nextInt();
		if(num%2==0)
			System.out.println(num+" is Even Number");
		else
			System.out.println(num+" is Odd Number");
		System.out.println("Do you want to continue\nPress Y  Otherwise N");
        ch=s.next().charAt(0);
        if(ch=='y' || ch=='Y')
            System.out.println("Enter a number");
        else
        	System.out.println("Thank you");
		}
	}

}
