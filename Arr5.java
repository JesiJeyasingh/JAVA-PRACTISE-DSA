class Arr5
{
	
	
	public void largeDig(int num)
	{
		
		int copy=0;
		while(num>0)
		{
			int rem=num%10;
			if(rem>copy)
			{
				copy=rem;
			}
			num=num/10;
		}
		System.out.println(copy);
	}
	
	public void smallDig(int num)
	{
		
		int copy=9;
		while(num>0)
		{
			int rem=num%10;
			if(rem<copy)
			{
				copy=rem;
			}
			num=num/10;
		}
		System.out.println(copy);
	}
	
	
	public void countDig(int num)
	{
		
		int count=0;
		while(num>0)
		{
			int rem=num%10;
			count++;
			num=num/10;
		}
		System.out.println("count digits"+count);
	}
	
	
	public void sumDig(int num)
	{
		
		int sum=0;
		while(num>0)
		{
			int rem=num%10;
			sum=sum+rem;
			num=num/10;
		}
		System.out.println("sum digits"+sum);
	}
	
	public void prodDig(int num)
	{
		
		int prod=1;
		while(num>0)
		{
			int rem=num%10;
			prod=prod*rem;
			num=num/10;
		}
		System.out.println("product digits"+prod);
	}
	
	
	public void revNum(int num)
	{
		int rev=0;
		while(num>0)
		{
			int rem=num%10;
			rev=rev*10+rem;
			num=num/10;
		}
		System.out.println("reverserd number"+rev);
	}
	
	
	public void palinNum(int num)
	{
		int copy=num;
		int rev=0;
		while(num>0)
		{
			int rem=num%10;
			rev=rev*10+rem;
			num=num/10;
		}
		if(rev==copy)
		{
			System.out.println("palindrome no");
		}
		else
		{
			System.out.println("not a palindrome");
		}
		
	}
	
	
	public void countEvenDig(int num)
	{
		
		int count=0;
		while(num>0)
		{
			int rem=num%10;
			if(rem%2==0)
			{
			count++;
			}
			num=num/10;
		}
		System.out.println("count digits"+count);
	}
	
	
	public void sumEvenDig(int num)
	{
		
		int sum=0;
		while(num>0)
		{
			int rem=num%10;
			if(rem%2==0)
			{
			sum=sum+rem;
			}
			num=num/10;
		}
		System.out.println("sum digits"+sum);
	}
	
	public void factorNum(int num)//this also have doubt 
	{  
	
	    // int result=0;
		for(int i=1;i<=num;i++)
		{
			if(num%i==0)
			{
			 //result=i;
				System.out.print(i+",");
			}
			
			//System.out.println("factors are"+result);
		}
		
		System.out.println();
	}
	
	public void powerNum(int a,int num)//tjhisis correct or not 
	{
		int prod=1;
		for(int i=1;i<=num;i++)
		{
			prod=prod*a;
		}
		System.out.println(prod);
	}
	
	public void lastDig(int num)
	{
		
			int rem=num%10;
			System.out.println(rem);
	}
	
	public void firstDigit(int num) // this also 
	{
		int first=num/10000;
		System.out.println(first);
	}
	
	public void sumFirLas(int num)
	{
		int first=num/10000;
		int last =num%10;
		int sum=first+last;
		System.out.println(sum);
	}
	 
	 
	 public void armsNum(int num)
	 {
		 int copy=num;
		 int sum=0;
		 while(num>0)
		 {
			 int rem=num%10;
			 sum =sum+rem*rem*rem;
			 num=num/10;
		 }
		 if(sum==copy)
		 {
			 System.out.println("armstrong no");
		 }
		 else{
			 System.out.println("not a armstrong");
		 }
	 }
	 
	 public void primeNum(int num)
	 {
		 int count=0;
		for(int i=1;i<=num;i++)
		{
			if(num%i==0)
			{
				count++;
			}
		}
		if(count==2)
		{
			System.out.println("prime");
		}
		else{
			System.out.println("not prime");
		}
	 }
	 
	 public void primeRange(int num)//doubt please clari it 
	 {
		 int count=0;
		 for(int i=1;i<=num;i++)
		 {
			 if(num%i==0)
			 {
				// System.out.print(i+" ");
				count++;
			 }
			 
			
		 }
		   if(count==2)
		 {
			 System.out.print(num+"primenumber ");
			 
		 }
		 System.out.println();
		
	 }
	 
	 public void perfectNum(int num)
	 {
		 int sum=0;
		 
		 for(int i=1;i<num;i++)
		 {
			 if(num%i==0)
			 {
				sum=sum+i ;
			 }
		 }
		 if(sum==num)
		 {
			 System.out.println("perfect num");
		 }
		 else{
			 System.out.println("not a perfect no");
		 }
	 }
	 
	 
	 public void neonNum(int num)
	 {
		 
		 int copy=num;
		 int ans=num*num;
		 int sum=0;
		 while(ans>0)
		 {
			 int rem=ans%10;
			 sum=sum+rem;
			 ans=ans/10;
		 }
		 if(sum==copy)
		 {
			 System.out.println("neon number");
		 }
		 else{
			 System.out.println("not a neon");
		 }
	 }
	 
	 public void spyNum(int num)
	 {
		 int copy=num;
		 int sum=0;
		 int prod=1;
		 while(num>0)
		 {
			 int rem=num%10;
			 sum=sum+rem;
			 prod=prod*rem;
			 num=num/10;
		 }
		 if(sum==prod)
		 {
			 System.out.println("spy umber");
		 }
		 else{
			 System.out.println("nota spy");
		 }
	 }
	 
	 public void harshadNum(int num)
	 {
		 int copy=num;
		 int sum=0;
		 while(num>0)
		 {
			 int rem=num%10;
			 sum=sum+rem;
			 num=num/10;
		 }
		 if(copy%sum==0)
		 {
			 System.out.println("harhsad no");
		 }
		 else
		 {
			 System.out.println("not a hardshad");
		 }
	 }
	 
	 public void automorphivNum(int num)
	 {
		 int copy=num;
		 int ans=num*num;
		 if(ans%100==copy)
		 {
			 System.out.println("automorphic number");
		 }
		 else
		 {
			 System.out.println("not a automorphic");
		 }
	 }
	 
	 public void factNum(int num)
	 {
		 int prod=1;
		 for(int i=num;i>=1;i--)
		 {
			 prod=prod*i;
		 }
		 System.out.println("factorial"+prod);
	 }
	 
	 
	/* public void factNum1(int num)
	 {
		 int result=1;
		while(num>=1)
		 {
			 result=result*base;
			 num--;
		 }
		 System.out.println("factorial"+prod);
	 } */
	 
	 public void strongNum(int num)
	 {
		 int copy=num;
		// int prod=1;
		 int sum=0;
		 while(num>0)
		 {
			 int rem=num%10;
			 int prod=1;//for resseting erytime the code 
			 for(int i=rem;i>=1;i--)
			 {
				 prod=prod*i;
			 }
			 sum=sum+prod;
			 num=num/10;
		 }
		 if(sum==copy)//here i had doubt that last digit 1 has not been includedin my  dry run show mw the sdfry run also for this 
		 {
			 System.out.println("strong number");
		 }
		 else{
			 System.out.println("not a srong numbera");
		 }
	 }
	 
	 
	 public void gcdNum(int a,int b)
	 {
		 int gcd=0;
		 for(int i=1;i<=a&&i<=b;i++)
		 {
			 if(a%i==0&&b%i==0)
			 {
				 gcd=i;
			 }
		 }
		 System.out.println("gcd"+gcd);
	 }
	 
	 public void lcmNum(int a,int b)
	 {
		 int lcm=0;
		 for(int i=1;i<=a&&i<=b;i++)
		 {
			 if(i%a==0&&i%b==0)
			 {
				 lcm=i;
			 }
		 }
		 System.out.println("lcm"+lcm);
	 }
	 
	 
	  public void coPrime(int a,int b)
	 {
		 int count=0;
		 for(int i=1;i<=a&&i<=b;i++)
		 {
			 if(a%i==0&&b%i==0)
			 {
				 count++;
			 }
		 }
		 
		 if(count==1)
		 {
			 System.out.println("copreime");
		 }
		 else{
			 System.out.println("not a copreime");
		 }
	 }
	 
	 
	 
	 public void gcdEucliedean(int a,int b)
	 {
		 
		 while(b>0)
		 {
			
		 
			 int rem=a%b;
			 a=b;
			 b=rem;
		 }
		  System.out.println("gceucliean"+a);
	 }
	 
	 
	 public void gcdUsingLcm(int a,int b)
	 {
		 int x=a;
		 int y=b;
		 
		 while(y>0)
		 {
			 int rem=x%y;
			 x=y;
			 y=rem;
		 }
		 int gcd=x;
		  int lcm=(x*y)/gcd;
		  System.out.println("gcdUsingLcm"+lcm);
	 }
	 
	 
	 public void fibonacciSeries(int num)
	 {
		 int a=0;
		 int b=1;
		 for(int i=1;i<=num;i++)
		 {
			 
			 System.out.print(a+" ");
			 int c=a+b;
			 a=b;
			 b=c;
		 }
		 System.out.println();
	 }
	 
			
    public void fibonacciNthterm(int num)
	 {
		 int a=0;
		 int b=1;
		 for(int i=1;i<=num;i++)
		 {
			 
			 
			 int c=a+b;
			 a=b;
			 b=c;
		 }
		System.out.println(a+" ");
	 }
	 
	 
	 public  void arithmeticPro(int first,int diff,int n)
	 { 
		 for(int i=1;i<=n;i++)
		 {
			  System.out.print(first+" ");
			  first=first+diff;
			
		 }
		 System.out.println();
	 }
	 
	  public  void arithmeticProSum(int first,int diff,int n)
	 { 
	      int sum=0;
		 for(int i=1;i<=n;i++)
		 {
			  sum=sum+first;
			  first=first+diff;
			
		 }
		 System.out.print(sum+" ");
	 }
	 
	 
	 public  void geometicPro(int first,int diff,int n)
	 { 
		 for(int i=1;i<=n;i++)
		 {
			  System.out.print(first+" ");
			  first=first*diff;
			
		 }
		 System.out.println();
	 }
	 
	  public  void geometicProSum(int first,int diff,int n)
	 { 
	      int sum=0;
		 for(int i=1;i<=n;i++)
		 {
			  sum=sum+first;
			  first=first*diff;
			
		 }
		 System.out.print(sum+" ");
	 }
			 
		 
	 
	 
	 
		 
	 
	/* public void aritProgre(int fnum,int snum)
	 {
		 int fnum=2;
		 int snum=5;
		 
		 
		 int diff=snum-fnum;
		 while(snum>0)
		 {
		 int next=snum+diff;
		 fnum=snum;
		 snum=next;
		 }
		 
		 System.out.println(diff);
	 }*/
	 
			 
	 
			 
	 
	 
	 

	 
	
	
			
	
			
	
				
	
	
	
	
public static void main(String[] args)
{
Arr5 a=new Arr5();
a.largeDig(999890);
a.smallDig(999234);
a.countDig(54678);
a.sumDig(43543);
a.prodDig(12345);
a.revNum(12345);
a.palinNum(121);
a.palinNum(13121215);
a.countEvenDig(23456);
a.sumEvenDig(2435);
a.factorNum(6);
a.powerNum(2,3);
a.lastDig(54678);
a.firstDigit(12345);
a.sumFirLas(12345);
a.armsNum(153);
a.armsNum(123);
a.primeNum(7);
a.primeRange(20);
a.perfectNum(6);
a.perfectNum(9);
a.neonNum(9);
a.neonNum(12);
a.spyNum(1124);
a.spyNum(123);
a.spyNum(87);
a.harshadNum(18);
a.harshadNum(12);
a.automorphivNum(25);
a.factNum(5);
//a.factNum1(4);
a.strongNum(145);
a.strongNum(147);

a.gcdNum(12,18);
a.lcmNum(4,6);
a.coPrime(8,15);
a.gcdEucliedean(48,18);
a.gcdUsingLcm(12,18); 
a.fibonacciSeries(5);
a.fibonacciSeries(7);
a.fibonacciNthterm(4);
a.arithmeticPro(2,3,5);
a.arithmeticProSum(2,3,3);
a.geometicPro(2,3,5);
a.geometicProSum(2,3,3);
//a.aritProgre(2,5);


}
}