import java.util.Scanner;
class Min_Arr{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the size");
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
int min=Integer.MAX_VALUE;
for(int i=0;i<size;i++)
{
	if(arr[i]<min)
	{
		min=arr[i];
	}
	
	
}
System.out.println("MIN_elem "+min);

}
}