class BankAccount
{
private String accHolder;//data hiding
private double balance;

    //controlled access
	public void setaccHolder(String accHolder)
	{
		this.accHolder=accHolder;
	}
	
	public String getaccHolder()
	{
		return accHolder;
	}
	
    //deposit
	//validation & busness class
	public void deposit(double amount)
	{
		if(amount>0)
		{
		balance=balance+amount;
		System.out.println(amount +"amount deposited successfully");
		}
		else
		{
			System.out.println("invalid amount");
		}
	}
	
	public void withdraw(double amount)
	{
		if(amount<=0)
		{
			System.out.println("invalid amount");
		}
		else if(amount>balance)
		{
			System.out.println("insufficient balance");
		}
		else{
			balance=balance-amount;
			System.out.println(amount+" amount withdraw successfully");
		}
	}
     // data flexibiliy
	 //write only 
    public double  getBalance()
	{
		return balance;
	}
	


}
class BankAccountt
{
	public static void main(String[] args)
	{
		BankAccount b=new BankAccount();
		b.setaccHolder("jesi");
		System.out.println("accHolder name: "+b.getaccHolder());
		
		b.deposit(150000);
		b.withdraw(20000);
		
		System.out.println("remianing balance: "+b.getBalance());
	}
}
