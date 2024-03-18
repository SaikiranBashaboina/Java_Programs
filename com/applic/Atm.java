package com.applic;
import java.util.Random;
import java.util.Scanner;
public class Atm 
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("S@iki Bank");
		System.out.println("Enter your card details");
		english e=new english();
		int res=e.card(s.nextInt());
		if(res==1)
		{
			System.out.println("Please Choose a Language \n1 ==> English\n2 ==> Hindi\n3 ==> telugu");
			int l=s.nextInt(),op;
			switch(l) {
			  case 1:
					System.out.println("1 ==> Withdraw \n2 ==> Deposit \n3 ==> Pinchange/New Pin Generate \n4 ==> Account Balance");
					op=s.nextInt();
					switch(op)
					{
					  case 1:
						  e.withdraw();
					    break;
					  case 2:
					    e.deposit();
					    break;
					  case 3:
						    e.pinchange();
						    break;
					  case 4:
						    e.accountbal();
						    break;
					}
			    break;
			  case 2:
				  telugu h=new telugu();
				  System.out.println("1 ==> Withdraw \n2 ==> Deposit \n3 ==> Pinchange/New Pin Generate \n4 ==> Account Balance");
					op=s.nextInt();
					switch(op)
					{
					  case 1:
						  h.withdraw();
					    break;
					  case 2:
					    h.deposit();
					    break;
					  case 3:
						    h.pinchange();
						    break;
					  case 4:
						    h.accountbal();
						    break;
					}
			    break;
			  case 3:
				  hindi t=new hindi();
				  System.out.println("1 ==> Withdraw \n2 ==> Deposit \n3 ==> Pinchange/New Pin Generate \n4 ==> Account Balance");
					op=s.nextInt();
					switch(op)
					{
					  case 1:
						  t.withdraw();
					    break;
					  case 2:
					    t.deposit();
					    break;
					  case 3:
						    t.pinchange();
						    break;
					  case 4:
						    t.accountbal();
						    break;
					}
				    break;
			}

		
		}
		else
			System.out.println("Wrong Details");
		System.out.println("Your Transaction Successfully");
	}

}
class machine{
	int sbal,cbal,mpin,anum,phone;
	machine()
	{	
		phone=1234567890;
		sbal=20000;
		cbal=30000;
		mpin=0007;
		anum=461;
	}
	int card(int an)
	{
		if(an==anum)
			return 1;
		else
			return 0;	
	}
	
}
//abstraction
interface lang{
	void withdraw();
	void deposit();
	public void pinchange();
	public void accountbal();
}
//multiple inheritance using abstraction
class english extends machine implements lang{
	Scanner s1=new Scanner(System.in);
	Random otp=new Random();
	public void withdraw() 
	{
		System.out.println("1.Saving   2.Current");
		int sc=s1.nextInt(),am,pin;
		if(sc==1)
		{
			System.out.println("Enter amount");
		    am=s1.nextInt();
			if(am>0 && am<=super.sbal)
			{
				System.out.println("Enter your pin");
				pin=s1.nextInt();
				if(pin==super.mpin)
				{
					System.out.println("Collect Your cash "+am);
					System.out.println("Do you Want Receipt Yes or No");
					String r=s1.next();
					if(r.equalsIgnoreCase("yes"))
						System.out.println("Take your Receipt");
				}
				else
					System.out.println("Incorrect pin");
			}
			else
				System.out.println("Insufficent Balance");
		}
		else
		{
			System.out.println("Enter amount");
			am=s1.nextInt();
			if(am>0 && am<=super.cbal)
			{
				System.out.println("Enter your pin");
				pin=s1.nextInt();
				if(pin==super.mpin)
				{
					System.out.println("Collect Your cash "+am);
					System.out.println("Do you Want Receipt Yes or No");
					String r=s1.next();
					if(r.equalsIgnoreCase("yes"))
						System.out.println("Take your Receipt");
				}
				else
					System.out.println("Incorrect pin");
			}
			else
				System.out.println("Insufficent Balance");
		}
	}

	public void deposit()
	{
		int tbal;
		System.out.println("1.Saving   2.Current");
		int d=s1.nextInt();
		if(d==1)
		{
			System.out.println("Enter your Amount :");
			int amount=s1.nextInt();
			tbal=amount+super.sbal;
			super.sbal=tbal;
			System.out.println("Ämount Deposited Successfully");		
		}
		else
		{
			System.out.println("Enter your Amount :");
			int amount=s1.nextInt();
			tbal=amount+super.cbal;
			super.cbal=tbal;
			System.out.println("Amount Deposited Successfully");
		}	
	}

	public void pinchange() 
	{
		int cp;
		System.out.println("1 ==> Pinchange \n2 ==>New Pin Generate");
		int p=s1.nextInt();
		if(p==1)
		{
			System.out.println("Enter Your Current pin");
			cp=s1.nextInt();
			if(cp==super.mpin)
			{
				System.out.println("Enter Your New pin");
				int npin=s1.nextInt();
				System.out.println("Enter Your New Pin Again");
				int n1pin=s1.nextInt();
				if(npin==n1pin)
				{
					System.out.println("Pin Changed Succefully");
					super.mpin=npin;
				}
				else
					System.out.println("New Pin Does'nt Match");
			}
			else
				System.out.println("Incorrect Old Pin");
		}
		else
		{
			System.out.println("Enter Your Phone Number");
			int tp=s1.nextInt();
			if(tp==super.phone)
			{
				System.out.println("OTP Sent To Your Phone Number");
				int ot=otp.nextInt(100000,999999);
				System.out.println(ot);
				System.out.println("Enter OTP");
				int tempotp=s1.nextInt();
				if(ot==tempotp)
				{
					System.out.println("Enter Your New Pin");
					cp=s1.nextInt();
					System.out.println("Enter Your New Pin Again");
					int ncp=s1.nextInt();
					if(cp==ncp)
					{
						System.out.println("Pin Generated Succefully");
						super.mpin=cp;
					}
					else
						System.out.println("Pin Number Does'nt Match");
				}
				else
					System.out.println("Incorrect Otp");
			}
			else
				System.out.println("Incorrect Phone Number");
			
		}	
	}

	public void accountbal() 
	{
		System.out.println("1.Saving   2.Current");
		int s=s1.nextInt(),p;
		if(s==1)
		{
			System.out.println("Enter Your Pin");
			p=s1.nextInt();
			if(p==super.mpin)
			{
				System.out.println("Saving Account Balance");
				System.out.println("Rs."+super.sbal);
			}
			else
				System.out.println("Incorrect pin");
			
		}
		else
		{
			System.out.println("Enter Your Pin");
			p=s1.nextInt();
			if(p==super.mpin)
			{
				System.out.println("Saving Account Balance");
				System.out.println("Rs."+super.cbal);
			}
			else
				System.out.println("Incorrect pin");
			
		}
	}
	
}
//multiple inheritance using abstraction
class telugu extends machine implements lang{
	public void withdraw() 
	{
		System.out.println("telugu withdraw");
	}
	public void deposit()
	{
		System.out.println("telugu deposit");		
	}

	public void pinchange() {
		System.out.println("telugu pinchange");		
	}

	public void accountbal() {
		System.out.println("telugu accountbal");		
	}
}
//multiple inheritance using abstraction
class hindi extends machine implements lang{
	public void withdraw() 
	{
		System.out.println("hindi withdraw");
	}
	public void deposit()
	{
		System.out.println("hindi deposit");		
	}

	public void pinchange() {
		System.out.println("hindi pinchange");		
	}

	public void accountbal() {
		System.out.println("hindi accountbal");		
	}
}
