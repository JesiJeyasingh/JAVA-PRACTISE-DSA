class Employee
{
public void calculatesal(int basicsal)
{
	System.out.println("baisc sal");
}
public void calculatesal(int basicsal,int bonus)
{
	System.out.println("sal+bonus");
}
}
class Manager extends Employee
{
	@Override
	public void calculatesal(int basicsal)
	{
		System.out.println("basic sal"+basicsal);
	}
	@Override
	public void calculatesal(int basicsal,int bonus)
	{
		System.out.println("basicsal"+basicsal+"bonus"+bonus);
	}
}
class Poly1
{
	public static void main(String[] args)
	{
		Employee e=new Manager();
		e.calculatesal(20000);
		//e.calculatesal(2000000,203.34);
		e.calculatesal(2000000,3000);
	}
}
