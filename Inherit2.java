 //===================CONSTRUCTOR ORDER==========
 
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

}
*/


//===============PARAMETERIZED CONSTRUCTOR

class Person
{
	Person(String name)
	{
		System.out.println("Parent cons"+name);
	}
}
class Student extends Person{
	
	Student()
	{
		super("jesi");
		System.out.println("Child cons");
	}
}
class Inherit2{
	public static void main(String[] args)
	{
		Student s=new Student();
	}
}