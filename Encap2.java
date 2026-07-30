class BankAcc{
private int accno;
private double accbal;

public void setAccno(int accno)
{
	this.accno=accno;
}
public int getAccno()
{
	return accno;
}
public void setAccBal(double accbal)
{
	if(accbal>0)
	{
	this.accbal=accbal;
	}
	else
	{
		System.out.println("invalid balance");
	}
}
public double getAccBal()
{
	return accbal;
}
}
class Encap2 extends BankAcc{
	public static void main(String[] args)
	{
		//BankAcc b=new BankAcc(); here no inheritance happeninng
		Encap2 e=new Encap2();
		e.setAccBal(300000);
		System.out.println(e.getAccBal());
		e.setAccno(34);
		System.out.println(e.getAccno());
	}
}