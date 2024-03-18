package arrays;

public class deltelmarr {

	public static void main(String[] args)
	{
		int [] a= {10,20,30,40,50,60,70,80,90,100};
		int del=40;
		int [] new_a=new int[a.length-1];
		for(int x=0,k=0;x<a.length;x++)
		{
			if(del!=a[x])
			{
				new_a[k]=a[x];
				k++;
			}
		}
		for(int i:new_a)
			System.out.print(i+" ");

	}

}
