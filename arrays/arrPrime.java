package arrays;
public class arrPrime
{
	public static void main(String[] saikiran) 
	{
		int[] a=new int[]{9,2,17,23,9};
		int [] b=new int[a.length];
		arr m=new arr();
		for(int i=0;i<a.length;i++ )
		{
			int resc=m.primec(a[i]);
			m.p(resc,a,b,i);
		}
		System.out.println("Prime Numbers");
		for(int x=0;x<b.length;x++)
		{
			if(b[x]!=0)
			System.out.print(b[x]+" ");
		}
	
	}
	
}
class arr
{
	int primec(int num)
	{
		int count=0;
	    for(int j=2;j<=num/2;j++)
	    {
		    if(num%j==0)
		    {
			    count++;
		         break;
		    }
	    }
	    return count;
	}
	void p(int r,int[] a,int[] b,int i)
	{
		if(r==0)
		{
			b[i]=a[i];
			System.out.println(a[i]+" is a Prime Number");
		}
		else
			System.out.println(a[i]+" is not a Prime Number");
	}	
}