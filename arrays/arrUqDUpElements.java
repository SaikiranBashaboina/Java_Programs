package arrays;

public class arrUqDUpElements {

	public static void main(String[] args)
	{
		int [] a=new int[] {2,4,8,1,1,2,3,4,0};    //Distinct elements in  array
		boolean[] b=new boolean[a.length];
		for(int x=0;x<a.length;x++)
		{
			if(b[x]==true)
				continue;
			int count=1;
			for(int y=x+1;y<a.length;y++)
			{
				if(a[x]==a[y])
				{
					count++;
					b[y]=true;
				}
			}
			System.out.print(a[x]+" ");   //Distinct 
		}
	}
}

/*
 
if(count>1)        //Duplicate elements in  array
	System.out.print(a[x]+" "); 

if(count==1)   //Unqiue elements in array 
	System.out.print(a[x]+" ");

System.out.println(a[x]+" Number Count is :"+count);  //to print count of numbers repeated
 
 */
