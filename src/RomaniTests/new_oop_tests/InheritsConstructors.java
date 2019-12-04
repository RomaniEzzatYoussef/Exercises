package RomaniTests.new_oop_tests;

public class InheritsConstructors extends Faculty 
{
	public static void main(String[] args)
	{
		new InheritsConstructors();
	}
	
	InheritsConstructors()
	{
		this(4);
		System.out.println("14");
		System.out.println("The end of Inherits Constructors");
	}
	
	InheritsConstructors(int i)
	{
		System.out.println(i);
	}
}

class Faculty extends Employee
{
	Faculty()
	{
		this(3);
		System.out.println("13");
	}
	
	Faculty(int i)
	{
		System.out.println(i);
	}
}

class Employee extends Person
{
	Employee()
	{
		this(2);
		System.out.println("12");
	}
	
	Employee(int i)
	{
		System.out.println(i);
	}
}

class Person
{
	Person()
	{
		this(1);
		System.out.println("11");
	}
	
	Person(int i)
	{
		System.out.println(i);
	}
}

class Exercise_08 extends D
{
	public static void main(String[] args)
	{
		new Exercise_08(10);
	}
	
	Exercise_08()
	{
		System.out.println("Exercise_08 's No-arg constructor");
	}
	
	Exercise_08(int i)
	{
		System.out.println("Exercise_08 overloaded constructor");
		System.out.println(i);
	}
}

class D
{
	D()
	{
		System.out.println("This is D constructor");
	}
}
