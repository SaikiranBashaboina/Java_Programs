package arrays;

import java.util.Arrays;

public class arrbinarysr {

	public static void main(String[] args)
	{
		int []a= {10,20,30,4,60,70};   //Ascending sort
		Arrays.sort(a);
		int f=0,l=a.length-1,m,search=10;
		while(f<=l)
		{
			m=(f+l)/2;
			if(search==a[m])
			{
				System.out.println("Element Found");
				break;
			}
			else if(search>a[m])
				f=m+1;
			else if(search<a[m])
				l=m-1;		
		}
		if(f>l)
			System.out.println("Element Not Found");
	}

}

/*

int []a= {10,20,30,4,60,70};   //Ascending sort
Arrays.sort(a);
int f=0,l=a.length-1,m,search=10;
while(f<=l)
{
	m=(f+l)/2;
	if(search==a[m])
	{
		System.out.println("Element Found");
		break;
	}
	else if(search>a[m])
		f=m+1;
	else if(search<a[m])
		l=m-1;		
}
if(f>l)
	System.out.println("Element Not Found");
	
========================

int []a= {10,20,30,4,60,70};   //Descending sort
		Arrays.sort(a);
		int l=0,f=a.length-1,m,search=1;
		while(f>=l)
		{
			m=(f+l)/2;
			if(search==a[m])
			{
				System.out.println("Element Found");
				break;
			}
			else if(search<a[m])
				f=m-1;
			else if(search>a[m])
				l=m+1;		
		}
		if(f<l)
			System.out.println("Element Not Found");

*/