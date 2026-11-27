import java.util.Scanner;
class ArrayQEvnCount
{
public static void main(String[] args)
{
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the size");
	int size=sc.nextInt();
	
	int[] arr=new int[size];
	System.out.println("enter the values");
	for(int i=0;i<=size-1;i++)
	{
		arr[i]=sc.nextInt();
	}
	
	System.out.println("===even result==");
	int count=0;
	for(int i=0;i<=size-1;i++)
	{
		if(arr[i]%2==0)
		{
			count++;
		}
	}
	System.out.println("count of even :"+count);
}
}
	