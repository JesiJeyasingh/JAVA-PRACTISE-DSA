class Arr4{
	
	//===========OPERATORS
	public String eligVote(int num)
	{
		if(num>=18)
		{
			return "eligible to vote";
		}
		else
		{
			return"not eligible";
			
		}
	}
	
	public void elig(int num)
	{
		if(num>=18){
			System.out.println("eligible to vote");
		}
		else{
			System.out.println("not eligible");
		}
	}
	
	public static String posNeg(int num)
	{
		if(num>0)
		{
			return "postive";
		}
		else if(num<0)
		{
			return "negative";
		}
		else{
			return "zero";
		}
	}
	
      public void evenOdd(int num)
	  {
		  if(num%2==0)
		  {
			  System.out.println("even");
		  }
		  else{
			  System.out.println("not even");
		  }
	  }
	  
	  public void largNum(int a,int b,int c)
	  {
		  if(a>b&&a>c)
		  {
			  System.out.println("a is gretater"+a);
		  }
		  else if(b>a&&b>c)
		  {
			  System.out.println("b is greater"+b);
		  }
		  else{
			  System.out.println("c is gretaer");
		  }
	  }
	  
	  
//======================LOOPS
	  
	  public void num(int n)
	  {
		  for(int i=1;i<=n;i++)
		  {
			  System.out.print(i+" ");
		  }
		  System.out.println();
	  }
	  
	  public void numRev()
	  {
		  for(int i=10;i>=1;i--)
		  {
			  System.out.print(i+" ");
		  }
		  System.out.println();
	  }
	  
	  public void numEven(int n)
	  {
		  for(int i=1;i<=n;i++)
		  {
			  if(i%2==0)
			  {
				  System.out.print(i+" ");
			  }
		  }
		  System.out.println();
	  }
	  
	  public void numOdd(int n)
	  {
		  for(int i=1;i<=n;i++)
		  {
			  if(i%2!=0)
			  {
				  System.out.print(i+" ");
			  }
		  }
		  System.out.println();
	  }
	  
	  
	  public void sumNo(int n)
	  {
		  int sum=0;
		  for(int i=1;i<=n;i++)
		  {
			  sum=sum+i;
		  }
		  System.out.println("sum values"+sum);
	  }
	  
	  public void countDig(int num)
	  {
		  int count=0;
		  while(num>0)
		  {
//int rem=num%10;
 num=num/10;
			  count++;
			  			 
		  }
		  System.out.println(" count values"+count);
	  }
	  
	  public void sumDig(long num)
	  {
		  long sum=0L;
		  while(num>0)
		  {
			  
			  long rem=num%10L;
			  sum=sum+rem;
			  num=num/10;
			  
			  
		  }
		  System.out.println("sum of digits"+sum);
	  }
	  
	  public void revDig(int num)
	  {
		  int rev=0;
		  while(num>0)
		  {
			  int rem=num%10;
			  rev=rev*10+rem;
			  num=num/10;
							  /*int rem=num%10;
							   //rev=rev+rem;
							   System.out.println("rev"+rem);*/
		  }
		  System.out.println("reverse number"+rev); //tell me why it shows 0 and also tell how to get then entire reversed value outside in this line 
	  }
	  
	  
	   public void palinNum(int num)
	  {
		  //int rem;
		  int rev=0;
		  int copy=num;
		  while(num>0)
		  {
			  
			   int rem=num%10;
			   rev=rev*10+rem;
			   num=num/10;
			  //System.out.print("reversed  no"+rem);
		  }
		  System.out.println("reveresed"+rev);
		 // System.out.println("reverse number"+rev);
		  if(rev==copy)
		  {
			  System.out.println("palindrome");
		  }
		  else{
			  System.out.println("not a palindrome");
		  }
	  }
	  
	  
	  
	  
	  
	  
	  
			  
	  
	  
	  
	   
	   
	
	
	
	
public static void main(String[] args)
{
	Arr4 a=new Arr4();
	//usind return type
	String result=a.eligVote(17);
	System.out.println(result);
	
	//using void 
	a.elig(20);
	
	String res=posNeg(30);
	System.out.println(res);
	
	a.evenOdd(39);
	
	a.largNum(22,33,44);
	
	//loops
	a.num(20);
	a.numRev();
	a.numEven(50);
	a.numOdd(30);
	
	
	a.sumNo(10);
	a.countDig(12345);
	a.sumDig(12345678910L);//tell me why they shows if i give 10 in ecnd it shows integer number too large then i cobvert into long but alos shows why 
	a.revDig(12345);
	a.palinNum(121);
}
}

