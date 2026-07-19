class Array3{
public static void main(String[] args)
{
int arr[]={1,1,2,2,3,3};
DuplicArray(arr);


}

public  static void DuplicArray(int arr[])
{
for(int i=0;i<arr.length;i+=2)
{
if(arr[i]==arr[i+1])
{
System.out.println(arr[i]);
}
}

}
}