class Encap1//Student
{
private String name;
private int age;
 
 public void setName(String name)
 {
	 this.name=name;
 }
 public String getName()
 {
	 return name;
 }
 
 public void setAge(int age)
 {
	 if(age>0)
	 {
	 this.age=age;
	 }
 }
 public int getAge()
 {
	 return age;
 }

public static void main(String[] args)
{
	Encap1 e=new Encap1();
	e.setName("jesi");
	System.out.println(e.getName());
	e.setAge(22);
	System.out.println(e.getAge());
}
}
