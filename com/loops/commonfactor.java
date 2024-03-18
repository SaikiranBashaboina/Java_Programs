package com.loops;

public class commonfactor 
{
	public static void main(String[] args) 
	{
	    int n1=33,n2=99,val=0,x=1;
	    int result=n1<n2 ? n1 : n2;
	    	while(result/2>=2)
			{
				if (n1%result==0 && n2%result==0)
				{
					val=result;
				}
				result--;
			}
		    System.out.println("common least factor of two numbers  is "+val);
		   int res=n1>n2 ? n1 : n2;
	    	while(x<=res/2)
			{
				if (n1%x==0 && n2%x==0)
				{
					val=x;
				}
				x++;
			}
			System.out.println("common highest factor of two numbers  is "+val);
	}
}
