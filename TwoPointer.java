class TwoPointer{
public static void main(String[] args)
{
	int arr[]={1,1,2,2,2,3,3};
	int res=twoPointer(arr);
	System.out.println("unique elements length"+res);//unique elemst length 
	
	for(int k=0;k<res;k++)//print the array elements
	{
		System.out.println(arr[k]+"");
	}
}
public static int twoPointer(int arr[])
{
int i=0;
for(int j=1;j<arr.length;j++)
{
	if(arr[j]!=arr[i])
	{
		arr[i+1]=arr[j];
		i++;
	}
}
return i+1;
}
	


}
/*
ONLY elements (not length)
int k = twoPointer(arr);

for(int i = 0; i < k; i++) {
    System.out.print(arr[i] + " ");
}

return array of unique elements
Modified Version (Return Array)
public static int[] uniqueElements(int arr[]) {
    int i = 0;

    for (int j = 1; j < arr.length; j++) {
        if (arr[j] != arr[i]) {
            arr[i + 1] = arr[j];
            i++;
        }
    }

    int[] result = new int[i + 1];

    for (int k = 0; k <= i; k++) {
        result[k] = arr[k];
    }

    return result;
}
*/

	
