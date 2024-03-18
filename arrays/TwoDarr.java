package arrays;

public class TwoDarr {

	public static void main(String[] args)
	{
		int [][] arr= {{1,2,3},{4,5,6},{7,8,9}};
		int sum=0;
		for(int x=0;x<arr.length;x++)
		{	
			int [] temp=arr[x];
			for(int j=0;j<temp.length;j++)
				sum=sum+temp[j];	
		}
		System.out.println(sum);
	}

}
/*

int [][] arr= {{1,2,3,},{4,5,6}};
		for(int x=0;x<arr.length;x++)
		{
			int [] temp=arr[x];
			for(int j=0;j<temp.length;j++)
				System.out.print(temp[j]+" ");//arr[i][j]
			System.out.println();
		}

int [][] arr= {{1,2,3,},{4,5,6}};
		for(int x=0;x<arr.length;x++)
		{
			for(int j=0;j<arr[i].length;j++)
				System.out.print(arr[i][j]+" ");
			System.out.println();
		}
*/
