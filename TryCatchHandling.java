package ExceptionHandlingPrograms;

public class TryCatchHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int x=10;
		int y=0;
		System.out.println("hey try &catch block");
		 try {
			 System.out.println("hii try");
			 System.out.println(x/y);
			 
			 System.out.println("bye try");
		 }
		 catch(ArithmeticException a) {
			 System.out.println("hey catch");
			// System.out.println("ae is handled");
			 
			 System.out.println(a.getMessage());//return only exception reason
			 a.printStackTrace();//entire line,infor all
			 System.out.println(a.toString());//name,description
			 
			 
			 System.out.println("bye catch ");
		 }
		 
		 System.out.println("bye 1 st Try &catch block");
		 
		 

	}

}
