class Shape
{
public void draw()
{
System.out.println("draw1");
}
public void draw(int a)
{
System.out.println("draw2");
}
public void draw(String name)
{
System.out.println("draw3");
}
}
class Circle extends Shape{
	@Override
	public void draw(int a)
	{
		System.out.println("draw"+a);
	}
	@Override
	public void draw(String name)
	{
		System.out.println("draw"+name);
	}
	public void call()
	{
		System.out.println("call");
	}
	
}
class Poly2
{
	public static void main(String[] args)
	{
		Shape s=new Circle();
		s.draw(33);
		s.draw("jesi");
		s.draw();//it runs as it present in oarent class
		s.call();
	}
}

