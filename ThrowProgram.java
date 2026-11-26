package ExceptionHandlingPrograms;

import java.util.Scanner;

public class ThrowProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//-----normal usage of throw
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the age");
	int age=sc.nextInt();
	
	if(age<=18) {
		throw new ArithmeticException("not eligible ");
	}
	else
	{
		System.out.println("eliegible to voting");
	}
	}

}
