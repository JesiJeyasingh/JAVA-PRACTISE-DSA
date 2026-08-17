import java.util.Scanner;

class Arr2{
int count=0;

public String primeNum(int num)
{
	for(int i=1;i<=num;i++)
	{
		if(num%i==0)
		{
			count++;
		}String
	}
	if(count==2)
	{
		return "prime";
	}
	else
	{
		return "notprime";
	}
	
}

public void factorNum(int num)
{
	for(int i=1;i<num;i++)
	{
		if(num%i==0)
		{
			System.out.println(i);
		}
	}
	
	
}

public static void main(String[] args)
{
	
Scanner sc=new Scanner(System.in);
System.out.print("enter the number"+" ");
int num=sc.nextInt();	
System.out.println("");
	Arr2 p=new Arr2();
	System.out.println(p.primeNum(7));
	p.factorNum(32);
}
}


	