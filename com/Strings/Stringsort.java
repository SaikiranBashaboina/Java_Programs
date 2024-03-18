package com.Strings;

public class Stringsort {

	public static void main(String[] args) 
	{
		String s="saikiran";
		String n="";
		for(int x=0;x<s.length();x++)
		{
			char ch=s.charAt(x);
			for(int y=x+1;y<s.length();y++)
			{
				char ch2=s.charAt(y);
				if(ch<ch2)
				{
					n=n+ch;
				}
				else
					n=n+ch2;
			}
		}
		System.out.println(n);
		
		
	}

}
