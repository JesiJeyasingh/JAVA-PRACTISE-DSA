/*
//abstraction using abstract class
abstract class Employee
{
abstract void calculateSalary();

void id()
{
	System.out.println("they all should wear ids");
}

}
class Developer extends Employee{
	public void calculateSalary()
	{
		System.out.println("developer slaary was credited");
	}
}
class Tester extends Employee
{
	public void calculateSalary()
	{
		System.out.println("Teter slaary was credited");
	}
}
	
class AbstractionAbsCl
{
	public static void main(String[] args)
	{
		Developer d=new Developer();
		d.calculateSalary();
		d.id();
		
		Tester t=new Tester();
		t.id();
		t.calculateSalary();
	}
}
*/

interface Payment
{
	abstract void pay();
	
	default void user()
	{
		validate();
		System.out.println("users hello");
	}
	static void money()
	{
		System.out.println("hellllllooooo");
	}
	/*private void phone()
	{
		System.out.println("phone"); this ws not possibel ah
	}*/
	
	//private String  phone;//priavte varible ar enit allowed 
	private void validate()
	{
		System.out.println("validatiing");
	}
	/*public void setPhone(String phone)
	{
		this.phone=phone;
	}
	public String getPhone()
	{
		return phone;
	}*/
}
class Upi implements Payment{
	public void pay()
	{
		System.out.println("pay via upi");
	}
}

class Cash implements Payment{
	public void pay()
	{
		System.out.println("pay via cash");
	}
	
	
}


class AbstractionAbsCl
{
	public static void main(String[] args)
	{
		Upi u=new Upi();
		u.pay();
		u.user();
		//money();
		//u.setPhone("vivo");
		//System.out.println(u.phone());
		Cash c=new Cash();
		c.pay();
		Payment.money();
		
	}
}

