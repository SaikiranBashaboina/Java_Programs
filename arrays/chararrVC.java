package arrays;

public class chararrVC {

	public static void main(String[] args)
	{
		char [] c= {'a','a','c','b','B','e','y','z','Q'};
		int ccount=0,vcount=0;
		System.out.println("Characters in Array");
		for(char ch : c)
			System.out.print(ch+" ");
		for(char ch : c)
		{
			if(ch=='a' || ch=='A' || ch=='e' || ch=='E' || ch=='i' || ch=='I' || ch=='o' || ch=='O' || ch=='u' || ch=='U')
				vcount++;
			else
				ccount++;
		}
		System.out.println();
		System.out.println("Count Of Vowels are :"+vcount);
		System.out.println("Count Of Consonants are :"+ccount);		

	}

}
