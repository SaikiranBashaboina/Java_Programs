package com.loops;

public class armstrong {

	public static void main(String[] args) 
	{
		int num=153,i=0,num2=num,sum=0,pow=0;
		while(num2!=0)
		{   
			num2=num2/10;
			i++;
		}
		num2=num;
		while(num2!=0)
		{   
			sum=num2%10;
			pow+=Math.pow(sum,i);//pow=pow+(int)Math.pow(sum,i);
			num2=num2/10;
		}
		if(pow==num)
			System.out.println(pow+" is  a armstrong number ");
		else
			System.out.println(pow+" is not a armstrong number");

	}
}
/*
int num=153,n=num,i=0,sum,pow=0;
		for(;n>0;n/=10)
		{   
			i++;
		}
		n=num;
		for(int j=1;j<=i;j++)
		{
			sum=n%10;
			pow+=Math.pow(sum,i);//pow=pow+(int)Math.pow(sum,i);
			n=n/10;
		}
		if(pow==num)
			System.out.println(pow+" is  a armstrong number ");
		else
			System.out.println(pow+" is not a armstrong number");
*/

/*
int x,n,c,pow,digit;
for(x=1;x<=10000;x++)
{
    n=x;
    c=0;
    digit=0;
    pow=0;
    for(;n>0;n/=10)
    {   
	    c++;
    }
    n=x;
    while(n>0)
    {
	    digit=n%10;
	    pow+=Math.pow(digit,c);//pow=pow+(int)Math.pow(digit,count);
	    n=n/10;
    }
    if(pow==x)
	     System.out.println(pow);
}*/