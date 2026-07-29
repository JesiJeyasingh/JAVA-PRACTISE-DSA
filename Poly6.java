class Country{
public void addCoun(String name)
{
System.out.println("country name:"+name);
}
}
class India extends Country{
	@Override
	public void addCoun(String name)
{
System.out.println("country name:"+name);
}
}
class America extends Country{
	@Override
	public void addCoun(String name)
{
System.out.println("country name:"+name);
}
}
class Africa extends Country{
	@Override
	public void addCoun(String name)
{
System.out.println("country name:"+name);
}
}
class Argentina extends Country{
	@Override
	public void addCoun(String name)
{
System.out.println("country name:"+name);
}
}
class Poly6
{
	public static void main(String[] args)
	{
		Country c1=new India();
		Country c2=new America();
		Country c3=new Africa();
		Country c4=new Argentina();
		c1.addCoun("inida");
		c2.addCoun("america");
		c3.addCoun("africa");
		c4.addCoun("argentina");
	}
}
		
	