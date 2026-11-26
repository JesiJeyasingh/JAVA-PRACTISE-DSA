package ExceptionHandlingPrograms;

public class FinallyHandlingProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//----------handled the exceptions(finally also run)
		int x[] = {1,2,3,4,5};
		try
		{
			System.out.println(x[7]);
		}
		catch(ArrayIndexOutOfBoundsException a ){
			a.printStackTrace();
		}
		finally {
			System.out.println("this is the most important block");
		}
		
		//----------exception not handled(finally run)
		
		int x1[] = {1,2,3,4,5};
		try
		{
			System.out.println(x1[7]);
		}
		catch(StringIndexOutOfBoundsException a ){
			a.printStackTrace();
		}
		finally {
			System.out.println("this is the most important block");
		}
		
		//----------finally-stop
		
				//int x2[] = {1,2,3,4,5};
				try
				{
					//System.exit(0);
					while(true) {
						System.out.println(".");
					}
					
					//System.out.println(x2[3]);--unrechable becoz,control never goes out of try
				}
				
				finally {
					System.out.println("this is the most important block");
				}
		
		
		
		

	}

}
