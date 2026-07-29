class Math
{
public void add(int a)
{
System.out.println("add"+" "+a);
}
public void add(int a,int b)
{
	System.out.println("add"+" "+a+b);
}
public void add(double a,double b)
{
	System.out.println("add"+" "+a+b);
}
}
class Math1 extends Math{
	@Override
	public void add(int a,int b)
	{
		System.out.println("add 2 nos"+a+b);
	}
	@Override
	public void add(double a,double b)
	{
		System.out.println("double of 2 nos"+a+b);
	}
    public void add(int a,int b,int c)
	{
		System.out.println("add"+a+b+c);
	}
}
class Poly5
{
	public static void main(String[] args)
	{
		Math m=new Math1();
		m.add(1,2);
		m.add(23.1,23.2);
		m.add(1);
		//m.add(1,2,3);
	}
}
