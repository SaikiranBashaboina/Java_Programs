package com.applic;

import java.util.Scanner;
public class empsal
{
	public static void main(String[] args)
	{
		emp obj;
		obj=new emp();
		obj.work_days=31;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter No:of Present days");
		obj.emp_sal(s.nextInt());	
	}
}
class emp
{
	int work_days;
	double act_sal=25000;
	void emp_sal(int present_days)
	{
		double total_sal,day_sal;
		day_sal=act_sal/work_days;
		total_sal=present_days*day_sal;
		System.out.println("Salary credited : "+Math.round(total_sal*100D)/100D);
	}
}