package com.loops;

public class extractdigits 
{
 	public static void main(String[] args)
	{
		int num=72895,n=num,sum=0;
		while(num!=0)
		{
			sum=sum*10+num%10;
			num=num/10;
		}
		System.out.println(n+" reverse is "+sum);
	}
}


/*public static void main(String[] args)
{
	int num=32415,sum=0;
	while(num!=0)
	{   
		sum=sum+num%10;
		num/=10;
	}
	System.out.println("sum of digits is "+sum);
}*/
