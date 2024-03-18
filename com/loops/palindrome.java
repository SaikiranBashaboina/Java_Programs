package com.loops;

public class palindrome {

	public static void main(String[] args) 
	{
		int num=123,n=num,rev=0;
		while(num!=0)
		{
			rev=rev*10+num%10;
			num=num/10;
		}	
		if(n==rev)
			System.out.println(n+" is a palindrome number");
		else
			System.out.println(n+" is not a palindrome number");
	}

}
/*
        int num=121,n=num,rev=0;
		for(;n>0;n/=10)
			  rev=rev*10+n%10;
		if(rev==num)
			 System.out.println(num+" is a palindrome number");
		else
			System.out.println(num+" is not a palindrome number"); 
 

int x,num,rev;        //1 to 100 palindromes
for(x=1;x<=100;x++)
{
	num=x;
	rev=0;
	while(num!=0)
	{
		rev=rev*10+num%10;
		num=num/10;
	}
		
	if(x==rev)
		System.out.println(x);
}                 */
