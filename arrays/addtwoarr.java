package arrays;

public class addtwoarr {

	public static void main(String[] args) 
	{
		int [] a=new int[] {1,2,3,4,5};
		int [] b=new int[] {10,20,30,40,50};
		int [] c=new int[a.length+b.length];
		for(int x=0;x<c.length;x++)
		{
			if(x<a.length)
				c[x]=a[x];
			else
				c[x]=b[x-a.length];			
		}
		for(int x=0;x<c.length;x++)
			System.out.println(c[x]);
	}
}


/*

int [] a=new int[] {461,462,463,464,465,467};
int [] b=new int[] {10,20,30,40,50};
int [] c=new int[a.length+b.length];
for(int x=0;x<a.length+b.length;x++)
{
	if(x%2!=0)
		c[x]=b[x/2];
}
for(int x=0;x<a.length+b.length;x++)
{
	if(x%2==0)
		c[x]=a[x/2];
}
for(int x=0;x<c.length;x++)
	System.out.println(c[x]+" ");
	
============================================================

int [] a=new int[] {1,2,3,4,5};
		int [] b=new int[] {10,20,30,40,50};
		int [] c=new int[a.length+b.length];
		for(int x=0;x<a.length;x++)
			c[x]=a[x];
		for(int x=a.length;x<a.length+b.length;x++) //		for(int x=0;x<b.length;x++)
			c[x]=b[x-a.length];                    //   c[x+a.length]=b[x]; 
		for(int x=0;x<c.length;x++)
			System.out.println(c[x]);
*/