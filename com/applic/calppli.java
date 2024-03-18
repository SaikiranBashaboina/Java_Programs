package com.applic;
import java.util.Scanner;
public class calppli {

	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		Calculator c=new Calculator();
		System.out.println("Enter the operation to perform\n+  -  *  /  ^  <  >");
		char ch=s.next().charAt(0);
		System.out.println("Enter any Two Numbers");
		c.num1=s.nextInt();
		c.num2=s.nextInt();
		switch(ch)
		{
		case '+':
			c.add();
			break;
		case '-':
			c.sub();
			break;
		case '*':
			c.mul();
			break;
		case '/':
			c.div();
			break;
		case '^':
			c.pow();
			break;
		case '>':
			c.great();
			break;
		case '<':
			c.least();
			break;
		default:
			System.out.println("Enter correct operation");		
		}
	}
}

class Calculator
{
	int num1,num2;
	void add()
	{
		System.out.println("Addition of "+num1+" & "+num2+" is :"+(num1+num2));
	}
	void sub()
	{
		System.out.println("Subtraction of "+num1+" & "+num2+" is :"+(num1-num2));
	}
	void mul()
	{
		System.out.println("Multiplication of "+num1+" & "+num2+" is :"+(num1*num2));
	}
	void div()
	{
		System.out.println("Division of "+num1+" & "+num2+" is :"+(num1/num2));
	}
	void pow()
	{
		System.out.println(num1+" Power "+num2+" is :"+(int)(Math.pow(num1, num2)));
	}
	void great()
	{
		if(num1>num2)
		   System.out.println(num1+" greater than "+num2);
		else if(num1==num2)
			  System.out.println(num2+" both are equal "+num1);
		else
		  System.out.println(num2+" greater than "+num1);
	}
	void least()
	{
		if(num1<num2)
		   System.out.println(num1+" less than "+num2);
		else if(num1==num2)
			  System.out.println(num2+" both are equal "+num1);
		else	
		  System.out.println(num2+" less than "+num1);
	}	
}