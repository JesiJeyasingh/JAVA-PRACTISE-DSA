/*=========================single inheriance====

class Programing{
	void run()
	{
		System.out.println("programming");
	}
}
class Java extends Programing
{
	void code()
	{
		System.out.println("cding");
	}
}
class Inherit1{
	public static void main(String[] args)
	{
		Java j=new Java();
		j.code();
		j.run();
	}
}

*/

//==========================MULTI LEVEL INGEITANCE=======
/*class Animal{//extends object class &they have object cons
	Animal()  //cons with parameters
	{
		System.out.println("Animal COns");
	}
	void eat()
	{
		System.out.println("eats");
	}
}
class Dog extends Animal{
	Dog()
	{ 
	     super();//by default when cons created it also inserted by compiler
		System.out.println("dog cons");
	}
	void sound()
	{
		System.out.println("barks");
	}
	
}
class Inherit1{
	public static void main(String[] args)
	{
		Dog d=new Dog();
	      d.sound();
d.eat();		  
	}
}*/


//==========HIERARICHAL INHERITANCE=========
/*class Animal{
	void eat()
	{
		System.out.println("animal eats");
	}
}
class Dog extends Animal
{
	void sound()
	{
		System.out.println("dog barks");
	}
}
class Tiger extends Animal{
	void speed()
	{
		System.out.println("tiger runss fast");
	}
}
class Inherit1{
	public static void main(String[] args)
	{
		Tiger t=new Tiger();
		t.speed();
		t.eat();
		Dog d=new Dog();
		d.eat();
		d.sound();
	}
}
*/

//=================HYBRID INHERTIANCE
/*class Animal
{
	void run()
	{
		System.out.println("runss");
	}
}
class Dog extends Animal
{
	void sound()
	{
		System.out.println("barks");
	}
}
class Tiger extends Animal{
	void speed()
	{
		System.out.println("runss");
	}
}
class Cheetah extends Tiger{
	void color()
	{
		System.out.println("brown");
	}
}
class Inherit1{
	public static void main(String[] args)
	{
		Cheetah c=new Cheetah();
		c.color();
		c.speed();
		Tiger t=new Tiger();
		t.speed();
		t.run();
		Dog d=new Dog();
		d.sound();
		d.run();
	}
}
*/

//------------------MULTIPLE INHERITANCE(INTERFACE)


 /*interface A
 {
	 void play();
	 
 }
 interface B
 {
	 void play();
	 
 }
 class C implements A,B{
	 
	 public void play()
	 {
		 System.out.println("c implementation");
	 }
 }
 class Inherit1
 {
	 public static void main(String[] args)
	 {
		 C c=new C();
		 c.play();
	 }
 }
 */
 
 
 interface A
 {
	  default void play(){
		  System.out.println("A implementation");
	  }
	  
	 
 }
 interface B
 {
	 default void play()
	 {
		 System.out.println("B implementation");
	 }
	 
 }
 class C implements A,B{
	 
	public void play()
	{
		A.super.play();
		B.super.play();
		System.out.println("c implementation");
	}
 
 }
 class Inherit1
 {
	 public static void main(String[] args)
	 {
		 C c=new C();
		 c.play();
	 }
 }
 
	 

	



