package com.oops;

import java.util.Scanner;

public class palindmethod 
{
	public static void main(String[] args)
	  { 
		 System.out.println("Enter Any Number :");

		Md p=new Md();
	     p.m2();
	  }
}

class Md
{
   Scanner s=new Scanner(System.in);
   int num=s.nextInt();
   int copy=num,rev=0;
   void m1()
   {
     while(copy>0)
    {
	rev=rev*10+copy%10;
        copy/=10;		
    } 
   }

   void m2()
   {
	  m1();

     if(rev==num)
      System.out.println(num+" is a Palindrome Number");
    else
         System.out.println(num+" is not a Palindrome Number");
   }
}

/*
class Bsaikiran                             // Model 1 Void
{
  public static void main(String[] args)
  {  
     Model p=new Model();
     p.m1();
     p.m2();

  }
}
class Model
{
   Scanner s= new Scanner(System.in);
   System.out.println("Enter Any Number :");
   int num=s.nextInt();
   int copy=num,rev=0;
   void m1()
   {w
     while(copy>0)
    {
	rev=rev*10+copy%10;
        copy/=10;		
    } 
   }

   void m2()
   {
     if(rev==num)
      System.out.println(num+" is a Palindrome Number");
    else
         System.out.println(num+" is not a Palindrome Number");
   }
}



class Bsaikiran                                // Model 2 Parameter
{
  public static void main(String[] args)
  {  
    Scanner s= new Scanner(System.in);
    System.out.println("Enter Any Number :");
    int number=s.nextInt();
     Model p=new Model();
     p.m1(number);
     p.m2(number);

  }
}
class Model
{
   int rev=0;
   void m1(int num)
   {
    int copy=num;
     while(copy>0)
    {
	rev=rev*10+copy%10;
        copy/=10;		
    } 
   }

   void m2(int num)
   {
     if(num==rev)
      System.out.println(num+" is a Palindrome Number");
    else
         System.out.println(num+" is not a Palindrome Number");
   }
}




class Bsaikiran                           // Model 3 return,Parameter
{ 
  public static void main(String[] args)
  {  
    Scanner s= new Scanner(System.in);
    System.out.println("Enter Any Number :");
    int number=s.nextInt();
    Model p=new Model();
    int result=p.m1(number);
    p.m2(number,result);

  }
}
class Model
{
   int m1(int num)
   {
    int copy=num,rev=0;
     while(copy>0)
    {
	rev=rev*10+copy%10;
        copy/=10;		
    } 
     return rev;
   }

   void m2(int num,int rev)
   {ww
     if(num==rev)
      System.out.println(num+" is a Palindrome Number");
    else
         System.out.println(num+" is not a Palindrome Number");
   }
}
*/