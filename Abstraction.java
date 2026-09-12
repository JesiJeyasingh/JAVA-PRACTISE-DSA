abstract class Employee
{
void calculateSalary();
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
		Tester t=new Tester();
	}
}