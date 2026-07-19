import java.util.Scanner;
class Array1{
public static void main(String[] args)
{
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the size");
		int size=sc.nextInt();
       int a[]=new int[size];
	System.out.println("enter the values");
	for(int i=0;i<size;i++)
	{
		a[i]=sc.nextInt();
	}
	System.out.println("largest values"+Array1.Largest(a));
	
}

public static int Largest(int a[])
{
	int largest=a[0];
	for(int i=1;i<a.length;i++)
	{
		if(a[i]>largest)
		{
			largest=a[i];
		}
	}
	return largest;
}

}