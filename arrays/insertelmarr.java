package arrays;

public class insertelmarr {

	public static void main(String[] args)
	{
		int [] a= {1,2,3,4,5,6,7,8,9,100};
		int ele=65,pos=5;
		int [] new_a=new int[a.length+1];
		for(int x=0;x<a.length;x++)
		{
			if(pos==x)
			{
				new_a[pos]=ele;
				new_a[pos+1]=a[x];
			}
			else if(x>pos)
				new_a[x+1]=a[x];
			else
				new_a[x]=a[x];
		}
		for(int i:new_a)
			System.out.print(i+" ");

	}

}
