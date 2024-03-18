package com.Collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class introcollections {

	public static void main(String[] args)
	{
		ArrayList al=new ArrayList();
		al.add(10);
		al.add(true);
		al.add("Hello");
		System.out.println(al);
		System.out.println(al.get(0));
		for(Object t:al)
			System.out.println(t);
		for(int x=0;x<al.size();x++)
			System.out.println(al.get(x));
		Set<Integer> s=new HashSet<Integer>();
		s.add(10);
		s.add(null);
		s.add(10);
		s.add(12);
		s.add(23);
		System.out.println(s);
		System.out.println(s.size());
		for(Integer t:s)
			System.out.println(t);
	}

}
