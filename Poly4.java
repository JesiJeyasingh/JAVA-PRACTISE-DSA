class Bank
{
public void interestrate()
{
System.out.println("interets rate ");
}
public void compundinteret()
{
	System.out.println("compounding");
}
}
class Sbi extends Bank{
	@Override
	public void interestrate()
	{
		System.out.println("SBI interets");
	}
}
class Icici extends Bank{
	@Override
	public void interestrate()
	{
		System.out.println("Icici bank");
	}
}
class Poly4
{
	public static void main(String[] args)
	{
		 Bank b1=new Sbi();
		 Bank b2=new Icici();
		 b1.interestrate();
		 b2.interestrate();
	}
}
