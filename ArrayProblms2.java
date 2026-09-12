class ArrayProblms2{
	
/*    copy array
public static void main(String[] args)
{
	int[] arr={1,2,3,4,5,6,88};
	int[] copy=new int[arr.length];
	for(int i=0;i<arr.length;i++)
	{
		copy[i]=arr[i];
	}
	for(int i=0;i<copy.length;i++)
	{
	System.out.println(copy[i]+" ");
	}
}
}
*/

/*      compare array   
public static void main(String[] args)
{
	int[] arr1={1,2,3,4,5};
	int[] arr2={1,2,3,4,5};
	
	boolean same=true;
	if(arr1.length==arr2.length)
	{
		for(int i=0;i<arr1.length;i++)
		{
			if(arr1[i]!=arr2[i])
			{
				same=false;
				break;
			}
			else
			{
				System.out.println("same");
			}
			
		}
		System.out.println("same");
	}
	else
	{
		System.out.println("not true");
	}
}
}
*/


/*
       merge arrays
public static void main(String[] args)
{
	int[] arr1={1,2,3,4,5};
	int[] arr2={6,7,8,9,0};
int[] arr3=new int[arr1.length+arr2.length] ;
	 
	
	 for(int i=0;i<arr1.length;i++)
	 {
		 arr3[i]=arr1[i];
	 }
	 for(int i=0;i<arr2.length;i++)
	{
	 arr3[arr1.length+i]=arr2[i];
	 }
	 for(int i=0;i<arr3.length;i++)
	 {
		 System.out.println(arr3[i]);
	 }
}
}

*/


/*
       swap specific two elements
public static void main(String[] args)
{
	int[] arr1={1,2,3};
	int findex=0;
	int sindex=arr1.length-1;
	
		int temp=arr1[findex];
		arr1[findex]=arr1[sindex];
		arr1[sindex]=temp;
		
	
	for(int i=0;i<arr1.length;i++)
	{
		System.out.println(arr1[i]);
	}
}
}
*/	

/*  
         count ps/neg/zero numbers
public static void main(String[] args)
{
	int[] arr1={1,-2,0,9,-45,1234};
	int p=0;
	int n=0;
	int z=0;
	for(int i=0;i<arr1.length;i++)
	{
		if(arr1[i]>0)
		{
			p++;
		}
		else if(arr1[i]<0)
		{
			n++;
		}
		else{
			z++;
		}
	}
	System.out.println("positive"+p+" "+"negative"+n+" "+"zero"+" "+z);
}
}

*/	
/*

           print pos/ned/zero
public static void main(String[] args)
{
	int[] arr={2,3,4,-2,-9,0};
	System.out.println("positive numbers: ");
	for(int i=0;i<arr.length;i++)
	{
		if(arr[i]>0)
		{
			System.out.println(arr[i]+" ");
		}
	}
	
	System.out.println("negative numbers: ");
	for(int i=0;i<arr.length;i++)
	{
		if(arr[i]<0)
		{
			System.out.println(arr[i]+" ");
		}
	}
	
	System.out.println("zeroez: ");
	for(int i=0;i<arr.length;i++)
	{
		if(arr[i]==0)
		{
			System.out.println(arr[i]+" ");
		}
	}
}
}
*/


/*
        print even/odd

 here it prints defaulrt values also 
public static void main(String[] args)
{
int[] arr={22,11,33,44,55};
  int[] even=new int[arr.length];
  int[] odd=new int[arr.length];
  
for(int i=0;i<arr.length;i++)
{
if(arr[i]%2==0)
{
   even[i]=arr[i];
}
else{
   odd[i]=arr[i];
}
}
for(int i=0;i<even.length;i++)
{
	System.out.println(even[i]);
}  
for(int i=0;i<odd.length;i++)
{
	System.out.println(odd[i]);
}  
}
}
 
*/



   //better approach
public static void main(String[] args)
{
int[] arr={22,11,33,44,55};
int even=0;
int odd=0;
  
  //count
for(int i=0;i<arr.length;i++)
{
if(arr[i]%2==0)
{
  even++;
}
else{
  odd++;
}
}

  int[] evenarr=new int[even];
  int[] oddarr=new int[odd];
  
  int evenIndex=0;
  int oddIndex=0;
  
for(int i=0;i<arr.length;i++)
{
  if(arr[i]%2==0)
  {
	  evenarr[evenIndex]=arr[i];
	  evenIndex++;
  }
  else{
	  oddarr[oddIndex]=arr[i];
	  oddIndex++;
  }
  
	  
} 
System.out.println("odd numbeers"); 
for(int i=0;i<oddarr.length;i++)
{
	System.out.println(oddarr[i]);
}  

System.out.println("even numbeers"); 
for(int i=0;i<evenarr.length;i++)
{
	System.out.println(evenarr[i]);
}  
}
}
 


/*
   public static void main(String[] args)
{
	int[] arr={1,2,3,4,5,67,90};
	
	System.out.println("evn numbers: ");
	for(int i=0;i<arr.length;i++)
	{
		if(arr%2==0)
		{
			System.out.println(arr[i]+" ");
		}
	}
	
	System.out.println("odd numbers: ");
	for(int i=0;i<arr.length;i++)
	{
		if(arr%2!=0)
		{
			System.out.println(arr[i]+" ");
		}
	}
}
}*/
	