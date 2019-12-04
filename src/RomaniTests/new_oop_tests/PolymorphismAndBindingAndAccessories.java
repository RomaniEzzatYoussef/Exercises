package RomaniTests.new_oop_tests;


public class PolymorphismAndBindingAndAccessories 
{
	public static void main(String[] args) 
	{
		new Person2().printPerson();
		new Student2().printPerson();
	}

}

class Student2 extends Person2 
{
	private String getInfo() 
	{
		return "Student";
	}

}

class Person2 
{
	private String getInfo() 
	{
		return "Person";
	}
	
	public void printPerson() 
	{
		System.out.println(getInfo());
	}
		
}