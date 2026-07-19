import java.util.Arrays;
class ArrayPrac
{
	public static void main(String[] args)
	{
	  int arr[]={1,2,3,4,5,6};
	  ArrayPrac a=new ArrayPrac();
	  System.out.println("firsst largest"+" "+a.fLargest(arr));
	  System.out.println("Second largest"+" "+a.sLargest(arr));
	  //System.out.println("Sorted array"+" "+
	  a.sortedArr(arr);
	  
	  System.out.println("sorted array"+" "+a.sortedArrAes(arr));
	  
	  System.out.println("sorted array"+" "+a.sortedArrDesc(arr));
	   
	   //print unique elements in two pointer 
	   //SORTED ARRAY
	   int k=a.twoPointer(arr);
			  for(int x=0;x<k;x++)
			  {
				  System.out.println("unique elemnets"+" "+arr[x]);
			  }
	  
	  System.out.println("twopiunter"+" "+a.twoPointer(arr));
	}
	  
	  
	  //===================================LARGEST
	  
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
	  
	  //=========================================SECOND LARGEST
	  
	  public int sLargest(int arr[])
	  {
		  int FLargest=arr[0];
		  int SLargest=Integer.MIN_VALUE;
		  for(int i=1;i<arr.length;i++)
		  {
			  if(arr[i]>FLargest)
			  {
				  SLargest=FLargest;
				  FLargest=arr[i];
			  }
			  else if(arr[i]<FLargest&&arr[i]!=SLargest)
			  {
				  SLargest=arr[i];
			  }
			  if(SLargest==Integer.MIN_VALUE)
			  {
				  return -1;
			  }
		  }
		  return SLargest;
	  }
	  
	  //==============================CHECK ARRAY IS SORTED ,ONLY CHECKS========================
	  
	  //--------------ASCENDING ORDER
	  
	   public boolean sortedArrDesc(int arr[])
	  {
		  
		  for(int i=1;i<arr.length;i++)
		  {
			  if(arr[i]<=arr[i-1])
			  {
			  }
			  else{
				  return false;
			  }
		  }
		  return true;
	  }
	  
	  //----------------DESCENDING ORDER
	  
	  public boolean sortedArrAes(int arr[])
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
	  
	  
	  //==================================SORTED ARRAY PRINT
	  
	  public void  sortedArr(int arr[])
	  {
		  Arrays.sort(arr);
		  for(int i=0;i<arr.length;i++)
		  {
			 System.out.println(arr[i]+" ");
		  }
	  }
		  
	  
	  
	  //----------------------------------SORTED TWO POINTER
	  
	  
	  //wo pointer is used when data is sorted or order matters,
       //   HashSet is used when data is unsorted and we need fast lookup.”
	   public int twoPointer(int arr[])
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
			  return i+1;//return number of unique elemnst 
			  
			 
			  

	  }
}
	  			  
					

				  
		  
	  

	  
		  


		
		
