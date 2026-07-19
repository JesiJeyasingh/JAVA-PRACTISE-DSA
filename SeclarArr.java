class SeclarArr{
public static void main(String[] args)
{
  int a[]={1,4,8,5,6};
  System.out.println(SecLargest(a));
}
public static int SecLargest(int a[])
{
	int largest=a[0];
	//int Slargest=-1;
	int Slargest=Integer.MIN_VALUE;
	for(int i=1;i<a.length;i++){
		if(a[i]>largest)
		{
			Slargest=largest;
			largest=a[i];
			
		}
		else if(a[i]<largest && a[i]!=Slargest)
		{
			Slargest=a[i];
		}
	}
	if(Slargest==Integer.MIN_VALUE)
	{
		return -1;
	}
	
	return Slargest;
}
}
			