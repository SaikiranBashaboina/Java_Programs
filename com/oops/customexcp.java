package com.oops;


public class customexcp {

	public static void main(String[] args) 
	{
		VotingAgeChecker checker = new VotingAgeChecker();
		   try
		   {
			checker.checkVotingAge(17);
				        
		   } 
		   catch (UnderAgeException e) 
		   {
			System.out.println(e.getMessage());
		  }

	}

}
class UnderAgeException extends Exception
{
    public UnderAgeException(String message) 
    {
        super(message);
    }
}
class VotingAgeChecker
{
    public void checkVotingAge(int age) throws UnderAgeException 
    {
        if (age < 18) {
            throw new UnderAgeException("You must be at least 18 years old to vote.");
        } else {
            System.out.println("You are eligible to vote.");
        }
    }
}