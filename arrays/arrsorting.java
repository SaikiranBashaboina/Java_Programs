package arrays;

public class arrsorting {

	public static void main(String[] args) 
	{
		int [] a=new int[] {20,6,10,9,70,9,23};  //Bubble sorting
		for(int x=0;x<a.length;x++)
		{
			for(int y=0;y<a.length-x-1;y++)
			{
				if(a[y]>a[y+1])
				{
					a[y]=a[y+1]+a[y];
					a[y+1]=a[y]-a[y+1];
					a[y]=a[y]-a[y+1];
				}
			}
		}
		for(int x=0;x<a.length;x++)
		{
			System.out.println(a[x]);
		}
	}
}


/*

int [] a=new int[] {12,4,8,1};  //sorting array by Ascending Selection process
		int min=0;
		for(int x=0;x<a.length;x++)
		{
			min=x;
			for(int y=x+1;y<a.length;y++)
			{
				if(a[min]>a[y])
					min=y;
			}
			int temp=a[x];
			a[x]=a[min];
			a[min]=temp;
		}
		for(int x=0;x<a.length;x++)
		{
			System.out.print(a[x]+" ");
		}
		
========================================================================

int [] a=new int[] {22,29,34,556,1,9};  //Ascending using single loop
		for(int x=0;x<a.length-1;x++)
		{
			if(a[x]>a[x+1]) 
			{
				a[x]=a[x]+a[x+1];
				a[x+1]=a[x]-a[x+1];
				a[x]=a[x]-a[x+1];
				x=-1;
			}
		}
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
		
=================================================================
int [] a=new int[] {20,6,10,9};  //Ascending
		for(int x=0;x<a.length;x++)
		{
			for(int y=x+1;y<a.length;y++)
			{
				if(a[x]>a[y])
				{
					a[x]=a[x]+a[y];
					a[y]=a[x]-a[y];
					a[x]=a[x]-a[y];
				}
			}
		}
		for(int x=0;x<a.length;x++)
		{
			System.out.println(a[x]);
		}
========================================================
int [] a=new int[] {20,6,10,9};  //Descending
for(int x=0;x<a.length;x++)
{
	for(int y=x+1;y<a.length;y++)
	{
		if(a[x]<a[y])
		{
			a[x]=a[x]+a[y];
			a[y]=a[x]-a[y];
			a[x]=a[x]-a[y];
		}
	}
}
for(int x=0;x<a.length;x++)
{
	System.out.println(a[x]);
}

*/