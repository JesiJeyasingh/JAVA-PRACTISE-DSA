import java.util.Scanner;
class Max_Array{

public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("enter the size");
int size=sc.nextInt();
int[] arr=new int[size];
System.out.println("enter the values");
for(int i=0;i<size;i++)
{
arr[i]=sc.nextInt();
}
System.out.println("print  the values");
for(int i=0;i<size;i++)
{
System.out.println(arr[i]);
}
}
}

