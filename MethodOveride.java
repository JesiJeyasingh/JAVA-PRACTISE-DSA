/*class A
{
	public void play()
	{
		System.out.println("hii");
	}
}
class B extends A{ 
	
}

class C extends A
{
}

class D extends B,C
{
	public  void print()
	{
		System.out.println("heyy");
	}
}

class A10
{
public static void main(String[] args)
{
	B b=new B();
	b.play();
	//b.print();
	D d=new D();
	d.print();
}
}*/
/*interface A
{
	default void play()
	{
		System.out.println("A");
	}
	
}
interface B
{
	default void play()
	{
		System.out.println("B");
	}
	//void print();
}
class C implements A,B {
	   
	public void play()
	{
		 A.super.play();
		B.super.play();
		System.out.println("playy");
	}
	public void print()
	{
		System.out.println("printt");
	}
	public void draw()
	{
		System.out.println("draw");
	}
	
	
}

class A10 extends C{
	public static void main(String[] args)
	{
		C c =new C();
		c.play();
		
		c.print();
		c.draw();
	}
}
*/
/*class Add{
	
	public void add(int a,int b)
	{
		System.out.println(a+b);
	}
	
	public void add(int a,int b,int c)
	{
		System.out.println(a+b+c);
	}
	public static void main(String[] args)
	{
		Add a=new Add();
		a.add(10,20);
		a.add(1,2,3);
	}
}
	*/

class FaceBookV1
{
public void likes()
{
System.out.println("likes");
}
}
class FaceBookV2 extends FaceBookV1
{
public void likes()
{
System.out.println("thumbs up");
}
}

class MethodOveride{
public static void main(String[] args)
{
	FaceBookV1 v1=new FaceBookV1();
	v1.likes();
	FaceBookV1 v=new FaceBookV2();
	v.likes();
}
}



	
