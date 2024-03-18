package com.applic;
import java.util.Scanner;
public class shopping 
{
	public static void main(String[] args) 
	{
		Scanner s= new Scanner(System.in);
		System.out.println("Welcome To S@IKi Mall");
		System.out.println("Choose a Category\n1.Men 2.Women");
		char ch='Y';
	   int total,gtotal=0;
	   int shirts=20,sprice=499,shirtq=0;
 	   int pants=10,pprice=799,pantq=0;
 	   int sarees=50,srprice=4999,sareeq=0;
	   int skirts=30,skprice=3999,skirtq=0;
		while(ch=='Y' || ch=='y')
		{
		   int c=s.nextInt();
            if(c==1)
            {
               System.out.println("Choose The Product\n1.Shirt 2.Pant");
               int m=s.nextInt();
               shirts-=shirtq;
               pants-=pantq;
               if(m==1)
               {
            	   System.out.println("Only left "+shirts+" Shirts \nAvailable in Black,Blue,White \nPrice Each Rs."+sprice+" only");
            	   System.out.println("Enter Quantity");
            	   shirtq=s.nextInt();
            	   if(shirtq<=shirts) 
            	   {
            		   total=shirtq*sprice;
            		   gtotal+=total;
                	   System.out.println("Price: "+total);
            	   }
            	   else
            	       System.out.println("Sorry Quantity are Not Available");
               }
               else if(m==2)
               {
            	   System.out.println("Only left "+pants+" Pants \nAvailable in Black,Blue \nPrice Each Rs."+pprice+" only");
            	   System.out.println("Enter Quantity");
            	   pantq=s.nextInt();
            	   if(pantq<=pants) 
            	   {
            		   total=pantq*pprice;
            		   gtotal+=total;
                	   System.out.println("Price: "+total);
            	   }
            	   else
            	       System.out.println("Sorry Quantity are Not Available");
                 }
               else
            	   System.out.println("Choose Product Correctlty");
             }
            else if(c==2)
            {
        	    System.out.println("Women");
        	    System.out.println("Choose The Product\n1.Saree 2.Skirt");
                int w=s.nextInt();
          	    sarees-=sareeq;
          	    skirts-=skirtq;
                if(w==1)
                {
             	   System.out.println("Only left "+sarees+" Saree \nAvailable in Black,Blue,White \nPrice Each Rs."+srprice+" only");
             	   System.out.println("Enter Quantity");
             	   sareeq=s.nextInt();
             	   if(sareeq<=sarees) 
             	   {
             		   total=sareeq*srprice;
            		   gtotal+=total;
                 	   System.out.println("Price: "+total);
             	   }
             	   else
             	       System.out.println("Sorry Quantity are Not Available");
                }
                else if(w==2)
                {
             	   System.out.println("Only left "+skirts+" Skirts \nAvailable in Black,Blue \nPrice Each Rs."+skprice+" only");
             	   System.out.println("Enter Quantity");
             	   skirtq=s.nextInt();
             	   if(skirtq<=skirts) 
             	   {
             		   total=skirtq*skprice;
            		   gtotal+=total;
                 	   System.out.println("Price: "+total);
             	   }
             	   else
             	       System.out.println("Sorry Quantity are Not Available");
                }
                else
             	   System.out.println("Choose Product Correctlty");
            }
            else
         	   System.out.println("Choose Category Correctlty");
    	  System.out.println("Do you want to continue Shopping\nPress Y  Otherwise N");
          ch=s.next().charAt(0);
          if(ch=='y' || ch=='Y')
              System.out.println("Choose a Category\n1.Men 2.Women");
          else
          {
        	System.out.println("Total Price: "+gtotal);
          	System.out.println("Thank you Visit Again");
          }
		}	
	}
}
