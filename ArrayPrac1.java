import java.util.Arrays;
class ArrayPrac1
{
	public static void main(String[] args)
	{
		int arr[]={1,0,0,0,0,3,4,5,6,7,8};
		
		ArrayPrac1 a=new ArrayPrac1();
		System.out.println("flargest"+ a.fLargest(arr));
		System.out.println("slargest"+ a.sLargest(arr));
		System.out.println("sortedArray"+ a.sortedArr(arr));
		System.out.println("reverse"+ Arrays.toString(a.reverseArr(arr)));//here it will reverse 
		 
		int result[]=a.reverseArr(arr);//reversed array change inot original 
		System.out.println("revwersed array in loop:");
		for(int i=0;i<result.length;i++)
		{
			System.out.print(result[i]+" ");
	    }
		System.out.println("");
		
		System.out.println("moveZerotoend"+ Arrays.toString(a.moveZero(arr)));
		
		
		System.out.println("Number of duplicatearrrays"+a.removeDuplic(arr));
		
		
		System.out.println("duplicate array in loop:");
		int res=a.removeDuplic(arr);
		
		for(int k=0;k<res;k++)
		{
			System.out.print(arr[k]+" ");
		}
		System.out.println();
//System.out.println("duplicate arrays "+ Arrays.toString(a.removeDuplic(arr)));//not directly because we need length then only 

		System.out.println("firstOccurence"+ a.firstOccure(arr));

	}
	
	public int fLargest(int arr[])
	{
		int max=arr[0];
		for(int i=1;i<arr.length;i++)
		{
			if(arr[i]>max)
			{
				max=arr[i];
			}
			
		}
		return max;
	}
	
	public int sLargest(int arr[])
	{
		int largest=arr[0];
		int slargest=Integer.MIN_VALUE;
		for(int i=1;i<arr.length;i++)
		{
			if(arr[i]>largest)
			{
				slargest=largest;
				largest=arr[i];
			}
			else if(arr[i]>slargest&&arr[i]!=largest)
			{
				slargest=arr[i];
			}
			
		}
		if(slargest==Integer.MIN_VALUE)
			{
				return -1;
			}
		return slargest;
		
    }
	
     public boolean sortedArr(int arr[])
	 {
		 for(int i=1;i<arr.length;i++)
		 {
			 if(arr[i]>=arr[i-1])
			 {
			 }
			 else{
				 return false;
			 }
		 }
		 return true;
	 }
	 
	 public int[] reverseArr(int arr[])
	 {
		 int i=0;
		  int j=arr.length-1;
		 while(i<j)
		 {
			 int temp=arr[i];
			 arr[i]=arr[j];
			 arr[j]=temp;
			 
			 i++;
			 j--;
		 }
		 return arr;
				 
    }
	
	public int[] moveZero(int arr[])
	{
		int j=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]!=0)
			{
				int temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
				
				j++;
			}
		}
		return arr;
    }
	
	public int removeDuplic(int arr[])
	{
		int i=arr[0];
		for(int j=1;j<arr.length;j++)
		{
			if(arr[j]!=arr[i])
			{
			arr[i+1]=arr[j];
			i++;
			}
		}
		return i+1;//return no of uniqu elements for int,with the helpp of this only elements will be printed
		
		
	}
	
	public int firstOccure(int arr[])
	{
		int target=0;
		int low=0;
		int high=arr.length-1;
		int ans=-1;
		while(low<=high)
		{
			int mid=(low+high)/2;
			if(arr[mid]==target)
			{
			    ans=mid;
				high=mid-1;
			}
			else if(arr[mid]<target)
			{
				low=mid+1;
			}
			else{
				high=mid-1;
			}
		}
		return ans;
	}
	
				
	
	
}
