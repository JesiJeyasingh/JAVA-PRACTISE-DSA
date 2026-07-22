import java.util.Scanner;
class Max_Array1
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("enter the size");
int size=sc.nextInt();
System.out.println("enter the values");
int[] arr=new int[size];
for(int i=0;i<size;i++)
{
	arr[i]=sc.nextInt();
}
System.out.println("print the values");
for(int i=0;i<size;i++)
{
	System.out.println(arr[i]);
}
System.out.println();

int max=Integer.MIN_VALUE;
for(int i=0;i<size;i++)
{
	if(arr[i]>max)
	{
		max=arr[i];
	}
}
System.out.println("maximum value"+max);


}
}

