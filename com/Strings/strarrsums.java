package com.Strings;

public class strarrsums {

	public static void main(String[] args)
	{
		System.out.println("==============1==============");
		String s="Heaaallo allaa Good morning";
		String[] ar=s.split(" ");
		for(int x=0;x<ar.length;x++)
		{
			if(x%2==0)
				System.out.println(ar[x].toLowerCase());
			else
			{
				StringBuffer te=new StringBuffer(ar[x].toUpperCase());
				System.out.println(te.reverse());
			}
		}
		
		System.out.println("==============2==============");
		int count=0,vcount=0;
		String h="";
		for(String t:ar)
		{
			vcount=0;
			for(int y=0;y<t.length();y++)
			{
				char ch=t.charAt(y);
				if(ch=='a' || ch=='A' || ch=='e' || ch=='E' || ch=='i' || ch=='I' || ch=='o' || ch=='O' || ch=='u' || ch=='U')
					vcount++;
			}
			if(vcount>count)
			{
				count=vcount;
				h=t;
			}
			else if(vcount==count)
				System.out.println("Highest vowels word: "+h);
		}
		System.out.println("Highest vowels word: "+h+""+count);
		
		System.out.println("==============3==============");
		String s1="A10B12C60";
		int sum=0,nu=0;
		for(int i=0;i<s1.length();i++)
		{
			char ch=s1.charAt(i);
			if (Character.isDigit(ch)) 
				nu=nu*10+ Character.getNumericValue(ch);  
			else if(Character.isAlphabetic(ch))
			{
				sum=sum+nu;
				nu=0;
			}
			if(i==s1.length()-1 && Character.isDigit(ch))
				sum=sum+nu;
		
		}
		System.out.println("Sum is "+sum);
		
		System.out.println("==============4==============");
		String cap="hello all good morNing";
		String[] cp=cap.split(" ");
		for(int y=0;y<cp.length;y++)
		{
			String a="",b="";
			for(int x=0;x<cp[y].length();x++)
			{
				if(x==0)
					a=a+cp[y].charAt(x);
				
				else
					b=b+cp[y].charAt(x);
			}
			cp[y]=a.toUpperCase()+b.toLowerCase();
		}
		for(String t:cp)
			System.out.print(t+" ");
		System.out.println();
		
		System.out.println("==============6==============");
		String c="Coding Hub Innovations Private Limited";
		String[] cs=c.split(" ");
		String ne="";
		for(int y=0;y<cs.length;y++)
		{
			for(int x=0;x<cs[y].length();x++)
			{
				if(x==0)
					ne=ne+cs[y].charAt(x);
			}
		}
		System.out.println(ne);
		
		
		System.out.println("==============7==============");	
		String sp="Hi 10 Hello 2 Hru 3";
		String[] asp=sp.split(" ");
		for(int x=0;x<asp.length;x++)
		{
			String sai=asp[x];
			if(Character.isAlphabetic(sai.charAt(0)))
				continue;
			else 
			{
				int nn=Integer.parseInt(sai);
				for(int i=1;i<=nn;i++)
				{
					System.out.println(asp[x-1]);
				}
			}
		}
		
     }
}
