class InterviewPatterns1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 //BUTTERFLY PATTERN
		/*
		for(int i=1;i<=7;i++) {
			for(int j=1;j<=7;j++) {
				if(j==1||j==7||i==j||i+j==8) {
					System.out.print("* ");
				}
				else
				{
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		*/
		
		//HOURGLASS PATTERN
		/*
		for(int i=1;i<=7;i++) {
			for(int j=1;j<=7;j++) {
				if(i==1||i==7||i==j||i+j==8) {
					System.out.print("* ");
				}
				else
				{
					System.out.print("  ");
				}
			}
			System.out.println();
	}
	*/
	
	//FLOYDS TRAINGLE
	/*
	int n=15;
	for(int i=1;i<=5;i++)
	{
		for(int j=1;j<=i;j++)
		{
			System.out.print(n+"  ");
			n--;
		}
		System.out.println();
	}
	*/
	
	
	//NUMBER PATTERN
	/*
	 int n=1;
	 for(int i=1;i<=3;i++)
	 {
		 for(int j=1;j<=3;j++)
		 {
			 if(i==1&&j==2)
			 {
				 System.out.print(n);
			 }
			 else{
				 System.out.print(" ");
			 }
			 if(i==2)
			 {
				 System.out.print(n);
				 n++;
			 }
			 if(i==3&&j==2)
			 {
				 n--;
				 System.out.print(n);
			 }
			 else{
				 System.out.print(" ");
			 
			 }
		 }
		 System.out.println();
	 }
	 */
	 
	 //NUMBER PATTERN
	  int n1=1;
	  int n2=1;
	  for(int i=1;i<=3;i++)
	  {
		  for(int j=1;j<=6;j++)
		  {
			  if(i==1&&j==1)
			  {
				  System.out.print(n1+"    ");
				  n1++;
			  }
			  
			  
			  if(i==1&&j==6)
			  {
				  System.out.print("    "+n2);
				  n2++;
			  }
			  
			  
			  
			  if(i==2&&j==1)
			  {
				  System.out.print(n1+" ");
				  n1++;
			  }
			  
			  if(i==2&&j==2)
			  {
				  System.out.print(n1+"   ");
				  n1++;
			  }
			  
			  
			  
			  if(i==2&&j==6)
			  {
				  System.out.print(n2);
				  n2++;
			  }
			  if(i==2&&j==5)
			  {
				  System.out.print(n2+"  ");
				  n2++;
			  }
			   
			  
			  if(i==3&&j<=3)
			  {
				  System.out.print(n1++ +" ");
			  }
			  if(i==3&&j>3)
			  {
				  System.out.print(n2++ +" ");
			  }
		  }
		  System.out.println();
	  }
				  
				 
			  
			 
			

}
}
