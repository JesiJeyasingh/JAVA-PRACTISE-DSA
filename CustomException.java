package ExceptionHandlingPrograms;

import java.util.Scanner;

public class CustomException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Scanner sc= new Scanner(System.in);
//		System.out.println("enter the age");
//		int age=sc.nextInt();
//		try {
//		if(age<=18) {
//			throw new NotEligibleForVotingException("Not to vote");
//		}
//		}
//		catch(NotEligibleForVotingException e)
//		{
//			System.out.println(e.getMessage());
//		}
		
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the age");
		int age=sc.nextInt();
		
		if(age<=18) {
			throw new NotEligibleForVotingException("Not to vote");
		}
		
		
		

	}

}
