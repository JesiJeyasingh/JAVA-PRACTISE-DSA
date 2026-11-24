class Arr{
public static void main(String[] args)
{
 int[] arr={1,3,2,4,3};
 for(int i=0;i<arr.length;i++)
 {
	 System.out.println(arr[i]+" ");
 }
 int max=arr[0];
 int secMax=Integer.MIN_VALUE;
 for(int i=1;i<arr.length;i++)
 {
 if(arr[i]>max)
 {
	 max=arr[i];
 }
 //System.out.println("max-array"+max);
 }
 System.out.println("max-array "+max);
 System.out.println("-------------------");
 
 for(int i=1;i<arr.length;i++)
 {
	 if(arr[i]>max)
	 {
		 secMax=max;
		 max=arr[i];
	 }
	 else if(arr[i]!=max&&arr[i]>secMax)
	 {
		 secMax=arr[i];
	 }
	 else if(secMax==arr[i])//it tells 2 elemnets are same 
	 {
		 System.out.println(-1);
	 }
	 
 }
 System.out.println("second maximun "+secMax);
 
 System.out.println("-------------------------");
 for(int i=1;i<arr.length;i++)
 {
	 if(arr[i]>=arr[i-1])
	 {
	 }
	 else{
		 System.out.println("false");
	 }
	 
 }
 System.out.println("sorted");
 
 
}
}
