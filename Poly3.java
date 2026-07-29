class Animal
{
public void sound(String name)
{
	System.out.println("anima sound");
}
public void sound()
{
	System.out.println("soundssss");
}
}
class Dog extends Animal{
	@Override
	public void sound()
	{
		System.out.println("barksssss");
	}
}
class Puppy extends Dog{
	@Override
	public void sound()
	{
		System.out.println("keow keow");
	}
}
class Poly3
{
	public static void main(String[] args)
	{
		Animal p=new Puppy();
		p.sound();
		p.sound("jero");
	}
}