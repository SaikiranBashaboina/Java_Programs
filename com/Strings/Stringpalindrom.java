package com.Strings;

public class Stringpalindrom {

	public static void main(String[] args) 
	{
		String s="Madam",rev="";
		s=s.toUpperCase();
		for(int x=s.length()-1;x>=0;x--)
			rev=rev+s.charAt(x);
		if(rev.equals(rev))
			System.out.println("Palindrome String");
		else
			System.out.println("Not a Palindrome String");

	}

}
