package arrays;
import java.util.*;
public class arrpract 
{
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter rows and columns");
		int rows=s.nextInt(),cols=s.nextInt();
		int [][] arr=new int[rows][cols];
		int [][] arr2=new int[cols][rows];
		for(int x=0;x<rows;x++)
		{
			System.out.println("Enter values for row "+x);
			for(int y=0;y<cols;y++)
				arr[x][y]=s.nextInt();
		}
		System.out.println("Original Matrix ");
		for(int x=0;x<rows;x++)
		{
			for(int y=0;y<cols;y++)
				System.out.print(arr[x][y]+" ");
			System.out.println();
		}
		for(int x=0;x<rows;x++)
		{
			for(int y=0;y<cols;y++)
				arr2[y][x]=arr[x][y];
		}
		System.out.println("Transpose Matrix ");
		for(int x=0;x<cols;x++)
		{
			for(int y=0;y<rows;y++)
				System.out.print(arr2[x][y]+" ");
			System.out.println();
		}

		
	}
}